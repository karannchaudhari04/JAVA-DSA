package OOP;
public class Constructor {
    public static void main(String[] args) {
        Emp e = new Emp("Karan");
        System.out.println(e.name);
    }
}

class Emp{
    String name;
    int roll;

    Emp(String name){
        this.name = name;
    }
}
