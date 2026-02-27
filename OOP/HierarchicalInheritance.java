package OOP;

public class HierarchicalInheritance {
    public static void main(String[] args) {
       Cat c = new Cat();
       c.breathe();
       c.eat();
       c.walk();
    }
}

class Animal {
    void eat(){
        System.out.println("Eats...");
    }
    void breathe(){
        System.out.println("Breathes...");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("Swims...");
    }
}

class Cat extends Animal{
    void walk(){
        System.out.println("Walk...");
    }
}