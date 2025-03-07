package Dados;

public class NinjaBasico extends Ninja{

    public abilities skill;

     NinjaBasico(String name, int age, String assignedMission, char difficulty, abilities skill){
        super(name, age, assignedMission, difficulty);
       this.skill = skill;


}


    @Override
    public void Presentation(){
        System.out.println("Meu nome é "+name+" Minha habilidade é " + skill+ " mas um dia serei um Grande Ninja" );
    }}
