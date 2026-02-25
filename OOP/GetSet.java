package OOP;

public class GetSet {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Karan");
        System.out.println(s.getName());
        s.setRollNo(10);
        System.out.println(s.getRollNo());
    }
}

class Student{
    private String s_name;
    private int RollNo;

    String getName(){
        return this.s_name;
    }

    int getRollNo(){
        return this.RollNo;
    }

    void setName(String newName){
        s_name = newName;
    }

    void setRollNo(int newRollNo){
        RollNo = newRollNo;
    }
}
