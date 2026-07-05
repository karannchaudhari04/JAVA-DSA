import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Provide string content: ");
        String str = sc.nextLine();
        System.out.println("String value of nextLine(): "+str);

        System.out.print("Provide string content: ");
        String str2 = sc.next();
        System.out.println("String valueof next(): "+str2);

    }
}
