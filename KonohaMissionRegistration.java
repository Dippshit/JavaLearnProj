package Dados;
import java.util.Scanner;

public class KonohaMissionRegistration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Menu menu = new Menu();

        //Array Inicializado
        String[] ninjasName = new String[1];

        int choice=-1;

        //Menu Recorrente
        while (choice!=0){

            menu.ImprimeMenu();

        choice = scan.nextInt();

        //Para Limpar o \n do buffer
        scan.nextLine();

        switch(choice) {

            //Realiza o Cadastro da quantidade de Ninjas solicitado
            case 1:
                System.out.println("Digite S caso queira sair\n" + "Digite quantos Ninjas quer cadastrar:");
                String input = scan.nextLine();
                //Retorna para o Menu Principal
                if(input.equalsIgnoreCase("S")){break;}
                //Impede o erro de input de letras
                while (input.matches(".*[a-zA-Z].*")) {
                System.out.println("Tente novamente, Digite quantos Ninjas quer cadastrar:");
                 input = scan.nextLine();
                }

                //Numero de ninjas a ser cadastrado
            int numNinja = Integer.parseInt(input);

                ninjasName = new String[numNinja];
                for (int i=0;i<ninjasName.length;i++) {
                    System.out.printf("Registre o %d° Ninja da Vila da folha\n", i + 1);
                    System.out.print("Digite o nome: ");
                    ninjasName[i] = scan.nextLine();
                }
                break;

                //Mostra ao usuário os Ninjas já Cadastrados
                case 2:
                    System.out.println("Ninjas Cadastrados:");
                    if(ninjasName[0]==null && ninjasName.length<2){
                        System.out.println("Não há ninjas cadastrados");
                    }
                    else
                        for (int i = 0; i < ninjasName.length; i++) {
                        System.out.println(i+1+"° "+ninjasName[i]);
                    }
                    System.out.println();
                    break;

                //Remove Ninjas cadastrados
                case 3:
                    if(ninjasName[0]==null && ninjasName.length<2){
                        System.out.println("Não há ninjas cadastrados");
                        break;
                    }

                    System.out.println("Qual Ninja deseja retirar?:");
                    for (int i = 0; i < ninjasName.length; i++) {
                        System.out.println(i+1+"- "+ninjasName[i]);}

                    int remove = scan.nextInt();

                    while (remove>ninjasName.length){
                        System.out.println("Tente Novamente");
                        remove = scan.nextInt();
                    }

                    ninjasName[remove-1]=null;
                    break;

            //encerra a Aplicação
            case 0:
                scan.close();
                System.exit(0);


            default:
                System.out.println("Tente novamente");

                }
        }
    }
}
