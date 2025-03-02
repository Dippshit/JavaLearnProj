package Dados;

public class Ninjabasico extends Ninja{

    public habilidades skill;

     Ninjabasico(String name, int age,String assignedMission, char difficulty, habilidades skill){
        super(name, age, assignedMission, difficulty);
       this.skill = skill;

}}
