public class HappyPig extends Animal
{
     public HappyPig()
     {
          
     }
     
     public HappyPig(String name, String color)
     {
          super(name,color);
     }
     
     public void sleep()
     {
          if (health>0)
          {
               System.out.println("I am "+this.name +" and I am sleeping");
          }
          else
               System.out.println(this.name +" is no more.");
     }
     
     
     public void roll()
     {
          if (health>0)
          {
               System.out.println("I am "+this.name +" and I am rolling");
          }
          else
               System.out.println(this.name +" cannot roll as it is no more.");
     }
     
}