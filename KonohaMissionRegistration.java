package Dados;
import java.util.Scanner;
public class KonohaMissionRegistration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] ninjasName = new String[1];
       while (true){
            System.out.println("-----------------------------------------------");
            System.out.println("Sistema de Cadastro De Ninjas da Vila da Folha");
            System.out.println("Escolha uma opção:");
            System.out.println("1-Cadastro de Ninjas\n" + "2-Consulta de Ninjas Cadastrados\n" +
                "3-Remoção de Ninjas do Sistema\n" + "0-Encerrar o Sistema\n");
        int choice = scan.nextInt();
        scan.nextLine();


        switch(choice) {

            case 1:
                System.out.println("Digite S caso queira sair\n" + "Digite quantos Ninjas quer cadastrar:");
                String input = scan.nextLine();
                if(input.equalsIgnoreCase("S")){break;}
                while (input.matches(".*[a-zA-Z].*")){
                System.out.println("Tente novamente, Digite quantos Ninjas quer cadastrar:");
                 input = scan.nextLine();}
            int numNinja = Integer.parseInt(input);
                 ninjasName = new String[numNinja];
                for (int i=0;i<ninjasName.length;i++) {
                    System.out.printf("Registre o %d° Ninja da Vila da folha\n", i + 1);
                    System.out.print("Digite o nome: ");
                    ninjasName[i] = scan.nextLine();
                }
                break;


                case 2:
                    System.out.println("Ninjas Cadastrados:");
                    for (int i = 0; i < ninjasName.length; i++) {
                        System.out.println(i+1+"° "+ninjasName[i]);
                    }
                    System.out.println();
                    break;


                case 0:
                        scan.close();
                        System.exit(0);


                case 3:
                    System.out.println("Qual Ninja deseja retirar?:");
                    for (int i = 0; i < ninjasName.length; i++) {
                        System.out.println(i+1+"- "+ninjasName[i]);}
                    int remove = scan.nextInt();
                    while (remove>ninjasName.length){
                        System.out.println("Tente Novamente");
                        remove = scan.nextInt();}
                    ninjasName[remove-1]=null;


            default:
                System.out.println("Tente novamente");;


                }
        }


       /* int[] ninjasAge = new int[3];

        String[] MissionName = new String[3];

        char[] MissionDifficulty = new char[3];

         //index of the registered ninja



            System.out.print("Digite a Idade: ");
                    ninjasAge[NumNinja] = scan.nextInt();
                    scan.nextLine();

            System.out.print("Digite a Missão atribuída: ");
                    MissionName[NumNinja] = scan.nextLine();

            System.out.print("E o Nivel de Dificuldade (A, B, C ou D):  ");
                    MissionDifficulty[NumNinja] = scan.next().charAt(0);
                    scan.nextLine();



        }






for(int i=0;i<3;i++){
    System.out.printf("Registro do Ninja N°%d\n",i+1);
    System.out.println("Nome: " + ninjasName[i]);
    System.out.println("Idade: " + ninjasAge[i]);
    System.out.println("Nome da Missão: " + MissionName[i]);
    System.out.println("Dificuldade Da Missão: " + MissionDifficulty[i]);
   if (ninjasAge[i]>=15) {
       System.out.println("Status da Missão: Concluida");
   } else if (Character.toUpperCase(MissionDifficulty[i])==('C') || Character.toUpperCase(MissionDifficulty[i])==('D')) {
       System.out.println("Status da Missão: Concluida");
   }else {
       System.out.println("Status da Missão: Impossivel de Concluir, idade insuficiente");
   }
}*/


    }
}
