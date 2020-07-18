public class Driver
{
     public static void main (String [] args)
     { 
          CuriousBunny bunny = new CuriousBunny("Bunny","Grey");
          AngryDuck duck = new AngryDuck ("Duck","White");
          LoudGoose goose = new LoudGoose ("Goose","Black");
          LoudGoose goose2 = new LoudGoose ("Goose2","Black");
          HappyPig pig = new HappyPig ("Pig","Pink");
          
          System.out.println("Testing Teleporter: ");
          System.out.println("Initial Position of "+bunny.getName()+": "+bunny.getPosition());
          bunny.teleport();
          System.out.println("New position: "+bunny.getPosition());
          System.out.println();
          System.out.println("Initial Position of "+duck. getName()+": "+duck.getPosition());
          duck.teleport();
          System.out.println("New position: "+duck.getPosition());
          System.out.println();
          
          System.out.println("Testing Attacker: ");
          
          System.out.println("Helath of "+pig.getName()+" is "+pig.getHealth()+".");          
          duck.attack(pig);
          duck.attack(pig);
          duck.attack(pig); 
          
          System.out.println(); 
          
          System.out.println("Goose trying to hit another goose");          
          goose.attack(goose2);
          
          System.out.println();
          
          System.out.println("DucK attacking goose");
          duck.attack(goose);
          duck.attack(goose);
          duck.attack(goose);
          System.out.println();
          
          System.out.println("Kill count of "+duck.getName()+"is "+duck.getKillCount());
          
          System.out.println();
          
          System.out.println("Died goose trying to attack bunny ");          
          goose.attack(bunny);
          
          System.out.println();
          
          System.out.println("Duck trying to attack died pig");
          duck.attack(pig);       
     }
}

