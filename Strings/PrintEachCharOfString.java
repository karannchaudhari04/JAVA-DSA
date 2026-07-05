public class PrintEachCharOfString {
    public static void main(String[] args) {
        String str = "Karan Chaudhari";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }
}
