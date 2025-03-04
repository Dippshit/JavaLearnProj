package Dados;


public class NinjaAvancado extends Ninja {

public habilidades skill;

    NinjaAvancado(String name, int age,String assignedMission, char difficulty, habilidades skill){
         super(name, age, assignedMission, difficulty);
         this.skill = skill;
    }

    public void Apresentacao(){
        System.out.println("Meu nome é "+name+" Minha habilidade é " + skill+ " e um dia serei um Grande Ninja" );
    }

}
