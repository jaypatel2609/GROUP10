public abstract class Animal 
{
     protected String name;
     protected String color;
     protected int health = 0;
     private static int count = 0;
     
     public Animal()
     {
     }
     
     public  Animal (String name, String color)
     {
          count++;
          setHealth(3);
          this.name=name;
          this.color=color;
     }
     
     public void setName(String name)
     {
          this.name=name;
     }
     
     public void setColor(String color)
     {
          this.color=color;
     }
     
     public void setHealth(int health)
     {
          this.health=health;
     }
     
     public String getName()
     {
          return(name);
     }
     
     public String getColor()
     {
          return(color);
     }
     
     public int getHealth()
     {
          return (health);
     }
     
     public static int getCount()
     {
          return (count);
     }
     
     public void hit()
          
     {
          if(this.health==1)
          {
               health--;
               count--;
          }
          
          else
          {
               health--;
          }
     }
     
     public  String toString()
     {
          
          String str="";
          
          if(health>0)
          {
               str += "My name is "+this.name+". My Color is "+this.color+"."+" My health is "+this.health;
          }
          
          else 
               str+=this.name+" is dead, because its health is 0";
          
          return (str);
     }
     
     
}