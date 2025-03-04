package Dados;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static ArrayList<Ninja> ninjasData = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Actions make = new Actions();


        int choice = -1;


        while (choice != 0) {//Menu Recorrente
            Menu.PrintMenu();
            choice = scan.nextInt();
            scan.nextLine();//Para Limpar o \n do buffer

            switch (choice) {


                //Realiza o Cadastro da quantidade de Ninjas solicitado
                case 1:
                    System.out.println("Digite S caso queira sair\n" + "Digite quantos Ninjas quer cadastrar:");
                    String input = scan.nextLine();
                    if (input.equalsIgnoreCase("S")) {
                        break;
                    }//Retorna para o Menu Principal


                    while (input.matches(".*[a-zA-Z]. *"))/*Impede o erro de input de letras */ {
                        System.out.println("Tente novamente, Digite quantos Ninjas quer cadastrar:");
                        input = scan.nextLine();
                    }

                    Actions.RegisterNinja(input, scan);

                    try {
                        System.out.println("retornando ao Menu inicial...");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("erro");
                    }

                    break;


                case 2: //Mostra ao usuário os Ninjas já Cadastrados


                        if (ninjasData.isEmpty() || ninjasData.getFirst()==null) {
                            System.out.println("Não há ninjas cadastrados");
                        } else
                            make.ShowRegistered();



                    try {
                        System.out.println("retornando ao Menu inicial...");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("erro");
                    }
                    break;


                case 3: //Remove Ninjas cadastrados
                    try {
                        if (ninjasData.isEmpty() || ninjasData.getFirst()==null) {
                            System.out.println("Não há ninjas cadastrados");
                            try {
                                System.out.println("retornando ao Menu inicial...");
                                Thread.sleep(1000);
                                break;

                            } catch (InterruptedException e) {
                                System.out.println("erro");
                            }
                        } else {
                            make.ShowRegistered();
                        }
                    } catch (NullPointerException e) {
                        System.out.println("Não há ninjas cadastrados");
                    }




                System.out.println("Qual Ninja deseja retirar?:");
                for (int i = 0; i < ninjasData.size(); i++) {
                    System.out.println(i + 1 + "- " + ninjasData.get(i).name);
                }

                int remove = scan.nextInt();

                while (remove > ninjasData.size()) {
                    System.out.println("Tente Novamente");
                    remove = scan.nextInt();//posição do array que será removida +1
                }

                    ninjasData.remove(remove - 1);

                try {
                    System.out.println("retornando ao Menu inicial...");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Pressione Enter para continuar");
                    scan.nextLine();
                }
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
