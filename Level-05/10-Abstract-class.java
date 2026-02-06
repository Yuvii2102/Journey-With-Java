abstract class Animal 
{

    abstract void sound(); // abstract method

    void eat() 
   {
        System.out.println("Animal is eating");
   }
}


class Dog extends Animal 
{
   void sound() 
 {
        System.out.println("Dog barks");
  }
}


public class Main 
{
    public static void main(String[] args) 
  {

        Dog d = new Dog();

        d.sound();
        d.eat();
  }
}



// abstract Method -> no body
// Child class must define iy

// Parent says : child must define this behavior  
