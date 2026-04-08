package OOP;

public class GetSet {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Karan");
        System.out.println(p.getName());
        p.setRollNo(10);
        System.out.println(p.getRollNo());
    }
}

class Person{
    private String name;
    private int RollNo;

    String getName(){
        return this.name;
    }

    int getRollNo(){
        return this.RollNo;
    }

    void setName(String newName){
        name = newName;
    }

    void setRollNo(int newRollNo){
        RollNo = newRollNo;
    }
}
