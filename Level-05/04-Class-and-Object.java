class Student                                 // OOP'S Concept          
{
  String name;
  int age;
  
  void display()
  {
    System.out.println("Name:"+name);
    System.out.println("Age:"+age);
  }
}


public class Main
{
  public static void main(String args[])
  {
    Student s1 = new Student();                // Object creation 
    
    s1.name = "Yuva";
    s1.age = 19;
    
    s1.display();                              // Method call 
  } 
}








// Class = blueprint
// Object = real instance
// Assign values -> call method
