package Dados;


import java.util.Scanner;
import static Dados.Main.ninjasData;

public class Actions {

    public static void  RegisterNinja(String input, Scanner scan) {
       // Scanner scan = new Scanner(System.in);
        abilities skill = abilities.BASICA;
        Ninja newninja;
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
            System.out.println("Digite o Nivel do ninja B-Básico ou A-Avançado");
            String nivelNinja = String.valueOf(scan.nextLine().charAt(0)).toUpperCase();
            while (!nivelNinja.matches(".*[A|B].*"))/*Impede o erro de input de letras */ {
                System.out.println("Tente novamente, Digite qual o nivel do Ninja \n A para Avançado \n B para Básico:");
                nivelNinja = String.valueOf(scan.nextLine().charAt(0)).toUpperCase();
            }
            switch (nivelNinja){
                case "A":
                    System.out.println("Você escolheu Ninja Avançado");
                    System.out.println("Digite a Habilidade do Ninja:");
                    System.out.println("1-TAIJUTSU \n 2-NINJUTSU \n 3-GENJUTSU \n 4-KATON \n 5-RINNENGAN");
                    int skillChoice = scan.nextInt();
                    scan.nextLine();
                    while ((skillChoice<1 || skillChoice>5)){
                        System.out.println("Tente Novamente :");
                        System.out.println("1-TAIJUTSU \n 2-NINJUTSU \n 3-GENJUTSU \n 4-KATON \n 5-RINNENGAN");
                        skillChoice = scan.nextInt();
                        scan.nextLine();
                    }

                    switch (skillChoice){
                        case 1:
                             skill = abilities.TAIJUTSU;
                             newninja= new NinjaAvancado(name, age, assignedMission, difficulty, skill);
                            ninjasData.add(newninja);
                            break;

                        case 2:
                             skill = abilities.NINJUTSU;
                            newninja = new NinjaAvancado(name, age, assignedMission, difficulty, skill);
                            ninjasData.add(newninja);
                            break;

                        case 3:
                            skill = abilities.GENJUTSU;
                            newninja = new NinjaAvancado(name, age, assignedMission, difficulty, skill);
                            ninjasData.add(newninja);
                            break;

                        case 4:
                            skill = abilities.KATON;
                            newninja = new NinjaAvancado(name, age, assignedMission, difficulty, skill);
                            ninjasData.add(newninja);
                            break;

                        case 5:
                            skill = abilities.RINNENGAN;
                            newninja = new NinjaAvancado(name, age, assignedMission, difficulty, skill);
                            ninjasData.add(newninja);
                            break;

                    }

                    System.out.println("Ninja Avançado Registrado!");
                    break;

                case "B":
                    System.out.println("Você escolheu Ninja Básico!");
                     newninja = new NinjaBasico(name, age, assignedMission, difficulty, skill);
                    ninjasData.add(newninja);
                    System.out.println("Ninja Básico Registrado!");
                    break;

            }


        }
    }

        public static void ShowRegistered() {
            System.out.println("Ninjas cadastrados:");

            Ninja showNinja;
            for (int i = 0; i < ninjasData.size(); i++) {

                //Nin   ja showNinja = ninjasData.get(i);
                showNinja = ninjasData.get(i);

                 if (showNinja instanceof NinjaAvancado infoNinja) {
                     System.out.println((i + 1) + "° Ninja: " +infoNinja.name );
                     System.out.println("Idade: " + infoNinja.age);
                     System.out.println("Missão Atribuida: " + infoNinja.assignedMission);
                     System.out.println("Dificuldade da Missão: " + String.valueOf(infoNinja.difficulty).toUpperCase());
                     System.out.println(("Tipo de Habilidade do Ninja:" +infoNinja.skill));
                     infoNinja.Presentation();
                 }
            else{
              if(showNinja instanceof NinjaBasico infoNinja) {
                  System.out.println((i + 1) + "° Ninja: " +infoNinja.name );
                  System.out.println("Idade: " + infoNinja.age);
                  System.out.println("Missão Atribuida: " + infoNinja.assignedMission);
                  System.out.println("Dificuldade da Missão: " + String.valueOf(infoNinja.difficulty).toUpperCase());
                  System.out.println(("Tipo de Habilidade do Ninja:" +infoNinja.skill));
                  infoNinja.Presentation();}

              }}


        }
        }








