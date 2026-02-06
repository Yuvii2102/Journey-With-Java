1) Single Inheritance                              //  Dog gets eat() from Animal

class Animal                                       
{
  void eat()
  {
    System.out.println("Eating...");
  }
}

class Dog extends Animal {}




2) Multilevel Inheritance                          // Chain inheritance ( grandparent -> parent -> child ) Puppy gets both methods


class Animal
  {
    void eat() {}
  }
class Dog extends Animal
  {
    void bark() {}
  }
class Puppy extends dog {}


3) Hierarchical Inheritance                        // Dog & Cat share parent features                 


class Animal
  {
    void eat()
  }

class Dog extends Animal {}
class Cat extends Animal {}



Single -> 1 parent
Multilevel -> chain
Hierarchical -> 1 parent -> many children  
