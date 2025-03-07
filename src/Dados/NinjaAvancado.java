package Dados;


public class NinjaAvancado extends Ninja{

public abilities skill;

    NinjaAvancado(String name, int age,String assignedMission, char difficulty, abilities skill){
         super(name, age, assignedMission, difficulty);
         this.skill = skill;
    }

    @Override
    public void Presentation(){
        System.out.println("Meu nome é "+name+" Minha habilidade é " + skill+ " e um dia serei um Grande Ninja" );
    }

    @Override
    public int SpecialAttack(abilities skill, int hp) {
        this.skill =skill;

        switch (skill){

            case KATON:
                System.out.println("Ataque especial: Assoprar Chamas");
                hp=hp-2;
                break;
            case NINJUTSU:
                System.out.println("Ataque especial: Selo de explosão");
                hp= hp-2;
                break;
            case TAIJUTSU:
                System.out.println("Ataque especial : Ataque furtivo");
                hp =hp-2;
                break;
            case GENJUTSU:
                System.out.println("Ataque especial : Dano ao Sistema Nervoso");
                hp =hp-3;
                break;
            case RINNENGAN:
                System.out.println("Ataque especial : Ataque Multi-elemental");
                hp =hp-3;

        }
        return hp;
    }



}
