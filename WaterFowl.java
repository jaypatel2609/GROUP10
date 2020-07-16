public abstract class WaterFowl extends Animal implements Attacker
{
     private boolean flystatus=false;
     private int killCount = 0;
     
     public WaterFowl()
     {    
     }
     public  WaterFowl(String name, String color)
     {
        super (name, color); 
     }
     public void attack(Animal animal)
     {
          if(this.getClass() == animal.getClass())
          {
               System.out.println(this.name + " can't attack " + animal.name + ".");
          }
          else
          {
               if(this.health > 0)
               {
                    if(animal.health == 1)
                    {
                         animal.hit();
                         this.killCount++;
                         System.out.println(animal.name + " was killed by " + this.name);
                    }
                    else
                    {
                         animal.hit();
                    }     
               }
               else
               {
                    System.out.println(this.name + " can't attack it died.");
               }
          }
     }
     public int getKillCount()
     {
          return killCount;
     }
     public void fly()
     {
          if (health>0)
          {
               System.out.println(this.name+" is flying!!!..");
               flystatus=true;
          }
           else
           {
               System.out.println(this.name+" died.");
           }
     }
     
     public void land()
     {
          flystatus=false;
     }
     public void swim()
     {
          if (health>0)
          {
               System.out.println(this.name+" is Swiming!!!..");
          }
          else
          {
               System.out.println(this.name+" died.");
          }
     }
     public boolean getflystatus()
     {
          return(flystatus);
     }    
}