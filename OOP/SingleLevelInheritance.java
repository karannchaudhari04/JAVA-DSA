package OOP;

public class SingleLevelInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.breathe();
        d.eat();
        System.out.println(d.color = "Brown");
        System.out.println(d.legs = 4);
    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("Breathes");
    }
}

class Dog extends Animal{
    int legs;

    void bark(){
        System.out.println("Bhow.. Bhow..");
    }
}