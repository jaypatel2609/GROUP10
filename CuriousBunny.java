public class CuriousBunny extends Animal
{
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
}
     