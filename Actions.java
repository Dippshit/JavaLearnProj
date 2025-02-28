package Dados;


import java.util.Scanner;

public class Actions {

    public static void  NinjaRegistration(String input) {
        Scanner scan = new Scanner(System.in);
        int numNinja = Integer.parseInt(input);
        for (int i = 0; i < numNinja; i++) {
            System.out.println("Digite o nome do " + (i + 1) + "° ninja");
            String name = scan.nextLine();
            System.out.println("Digite a idade:");
            int age = scan.nextInt();
            scan.nextLine();
            System.out.println("Digite a Missão atribuida:");
            String assignedMission = scan.nextLine();
            System.out.println("Digite a dificuldade da missão (A, B, C ou D:");
            char difficulty = scan.nextLine().charAt(0);
            Ninja novoninja = new Ninja(name, age, assignedMission, difficulty);
            Main.ninjasData.add(novoninja);
        }
    }

        public void ShowRegistered() {
        System.out.println("Ninjas cadastrados:");
        for (int i = 0; i < Main.ninjasData.size() ; i++) {
            Ninja showNinja = Main.ninjasData.get(i);
            System.out.println((i + 1) + "° Ninja: " + showNinja.name);
            System.out.println("Idade: " + showNinja.age);
            System.out.println("Missão Atribuida: " + showNinja.assignedMission);
            System.out.println("Dificuldade da Missão: " + Character.toUpperCase(showNinja.difficulty));
        }

        }
    }


