public class Basics {
    public static void main(String[] args) {
        String name = new String("Karan Chaudhari");
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(4));

        String name1 = "Karan";
        String name2 = "Karan";

        if(name1 == name2){
            System.out.println("Both are equals");
        }
        else{
            System.out.println("Both are not equals");
        }
    }
}