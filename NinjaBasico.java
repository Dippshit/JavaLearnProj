package Dados;

public class NinjaBasico extends Ninja{

    public habilidades skill;

     NinjaBasico(String name, int age, String assignedMission, char difficulty, habilidades skill){
        super(name, age, assignedMission, difficulty);
       this.skill = skill;

}}
