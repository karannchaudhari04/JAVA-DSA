package OOP;

public class MultipleLevelInheritance {
    public static void main(String[] args) {
        Dept d = new Dept();
        d.d_name();
        d.students();
        d.c_name();
        d.u_name();
        d.city();
    }
}

class University{
    void u_name(){
        System.out.println("SPPU");
    }
    void city(){
        System.out.println("Pune");
    }
}

class College extends University{
    void c_name(){
        System.out.println("SITS");
    }
    void location(){
        System.out.println("Pune");
    }
}

class Dept extends College{
    void d_name(){
        System.out.println("IT");
    }
    void students(){
        System.out.println("80");
    }
}