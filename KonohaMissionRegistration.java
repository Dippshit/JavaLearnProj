package Dados;
import java.util.Scanner;

public class KonohaMissionRegistration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        Actions acoes = new Actions();
        String[] ninjasName = new String[1];//Array Inicializado
        int choice=-1;


        while (choice!=0){//Menu Recorrente
            Menu.PrintMenu();
            choice = scan.nextInt();
            scan.nextLine();//Para Limpar o \n do buffer

        switch(choice) {

            //Realiza o Cadastro da quantidade de Ninjas solicitado
            case 1:
                System.out.println("Digite S caso queira sair\n" + "Digite quantos Ninjas quer cadastrar:");
                String input = scan.nextLine();
                if(input.equalsIgnoreCase("S")){break;}//Retorna para o Menu Principal


                while (input.matches(".*[a-zA-Z].*"))/*Impede o erro de input de letras */
                {
                System.out.println("Tente novamente, Digite quantos Ninjas quer cadastrar:");
                 input = scan.nextLine();
                }
                acoes.Registration(input);
                ninjasName = acoes.ninjasName;

            break;


                case 2: //Mostra ao usuário os Ninjas já Cadastrados
                    System.out.println("Ninjas Cadastrados:");
                    if(ninjasName[0]==null && ninjasName.length<2){
                        System.out.println("Não há ninjas cadastrados");
                       try{
                       System.out.println("retornando ao Menu inicial...");
                       Thread.sleep(4000);}
                       catch (InterruptedException e) {
                           System.out.println("erro");
                       }
                    }
                    else
                        for (int i = 0; i < ninjasName.length; i++) {
                        System.out.println(i+1+"° "+ninjasName[i]);
                    }
                    System.out.println();
                    break;


                case 3: //Remove Ninjas cadastrados
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
                        remove = scan.nextInt();//posição do array que será removida
                    }

                    ninjasName[remove-1]=null;
                    break;


            case 0: //encerra a Aplicação
                scan.close();
                System.exit(0);


            default:
                System.out.println("Tente novamente");

                }
        }
    }
}
