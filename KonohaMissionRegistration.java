package Dados;
import java.util.Scanner;
public class KonohaMissionRegistration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] ninjasName = new String[3];

        int[] ninjasAge = new int[3];

        String[] MissionName = new String[3];

        char[] MissionDifficulty = new char[3];

        int NumNinja= 0; //index of the registered ninja

        for (;NumNinja<3;NumNinja++){
            System.out.printf("Registre o %d° Ninja da Vila da folha\n",NumNinja+1);
                 System.out.print("Digite o nome: ");
                     ninjasName[NumNinja] = scan.nextLine();

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
}


    }
}
