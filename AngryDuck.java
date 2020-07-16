import java.util.Random;
public class AngryDuck extends WaterFowl implemnets Teleporter
{

     private int X = 0;
     private int Y = 501;
     private Random generator = new Random();
     
     public AngryDuck()
     {
          
     }
     
     public AngryDuck(String name, String color)
     {
          super(name,color);
     }
     
     public void teleport()
     {
          this.X = generator.nextInt(1000) + 1;
          this.Y = generator.nextInt(500) + 501; 
          System.out.println(this.name + " teleported.");
     }
     public String getPosition()
     {
          String pos = "";
          
          pos += "(" + this.X + ", " + this.Y + ")";
          
          return pos;
     }

}
