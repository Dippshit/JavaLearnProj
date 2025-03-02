package Dados;


public class NinjaAvancado extends Ninja {

public habilidades skill;

    NinjaAvancado(String name, int age,String assignedMission, char difficulty, habilidades skill){
         super(name, age, assignedMission, difficulty);
         this.skill = skill;
    }



}
