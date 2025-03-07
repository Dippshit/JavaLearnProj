package Dados;


import java.util.Scanner;

public class Battle {
private Battle(){}
    public static void StartBattle(int ninjaEscolhido, Scanner scan) {
        int hp = 10;
        Ninja chosen;
        chosen= Main.ninjasData.get(ninjaEscolhido-1);
while (hp>0){
        System.out.println("Inimigo hp:"+ hp);
        System.out.println("Escolha o que fazer" +
                "1- Ataque comum \n"  +
                "2- Ataque especial");
        int escolha = scan.nextInt();

        switch (escolha) {

            case 1:
                System.out.println("Em andamento");
                break;

                case 2:
                    if (chosen instanceof NinjaAvancado chosenA) {
                     hp=chosenA.SpecialAttack(chosenA.skill, hp);}
                    else if (chosen instanceof NinjaBasico chosenB) {
                        chosenB.SpecialAttack(chosenB.skill, hp);
                    }
                    break;

        }
        }
    }

    }

