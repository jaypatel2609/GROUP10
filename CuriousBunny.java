import java.util.Random;
public class CuriousBunny extends Animal implements Teleporter
{
     private Random rand = new Random();
     private int x = 0;
     private int y = 0;
     public CuriousBunny()
     {
          
     }
     
     public CuriousBunny(String name, String color)
     {
          super(name,color);
               
     }
     
     public void hop()
     {
          if(health>0)
          {
               System.out.println("I am "+this.name+" and I am hopping.");
               
          }
          else
               System.out.println(this.name+ " died.");
     }
     public void teleport()
     {
          this.x = rand.nextInt(1000) + 1;
          this.y = rand.nextInt(500) + 1;
          System.out.println(this.name + " Teleported");
     }
     public String getPosition()
     {
          return("(" + this.x + ", "  + this.y +  " )");
     }
}
     