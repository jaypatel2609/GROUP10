public abstract class WaterFowl extends Animal
{
     private boolean flystatus=false;
     
     public WaterFowl()
     {
          
     }
     
     public  WaterFowl(String name, String color)
     {
        super (name, color); 
     }
     
     public void fly()
     {
          if (health>0)
          {
               System.out.println(this.name+" is flying!!!..");
               flystatus=true;
          }
           else
               System.out.println(this.name+" died.");
     
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
               System.out.println(this.name+" died.");
     }
     
     public boolean getflystatus()
     {
          return(flystatus);
     }
     
     
     
}