class Animal
{
  void sound()
  {
    System.out.println("Animal makes sound");
  }
}


class Dog extends Animal
{
  void sound()                                         // Override
  {
    System.out.println("Dog barks");
  }
}


public class Main
{
  public static void main(String args[])
  {
    Dog d = new Dog();
    d.sound();
  }
}





//This happens when a child class redefines a parent method
   Parent has a method -> sound()
   Child overrides it -> sound()
   Child version runs & executes
