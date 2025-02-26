package Dados;

import java.util.Scanner;


public class Actions{
    String[] ninjasName = new String[1];
    Scanner scan = new Scanner(System.in);


    public String[] Registration(String input) {
        int numNinja = Integer.parseInt(input); //numero de ninjas a serem cadastrados
        ninjasName = new String[numNinja];

        for (int i=0;i<ninjasName.length;i++) {
            System.out.printf("Registre o %d° Ninja da Vila da folha\n", i + 1);
            System.out.print("Digite o nome: ");
            ninjasName[i] = scan.nextLine();
            }
            return ninjasName;

         }

    }
