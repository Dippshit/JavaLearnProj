package Dados;

 public abstract class Ninja implements NinjaActions {
     String name;
    int age;
    String assignedMission;
    char difficulty;





 Ninja (String name, int age,String assignedMission, char difficulty){

     this.name = name;
     this.age = age;
     this.assignedMission = assignedMission;
     this.difficulty = difficulty;

 }

 public  void Presentation(){
  System.out.println("Meu nome é "+name+ "e um dia serei um Grande Ninja" );
 }

     @Override
     public int IncreaseAttack() {
         return 0;
     }


     public int SpecialAttack(abilities skill, int hp){

     return hp;
     }

     @Override
     public int MeleeAttack(int hp) {

         return hp;
     }

     @Override
     public int IncreaseDeffense(int deffense) {

         return deffense++;
     }
 }

