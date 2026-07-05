public class ReverseString {
    public static void main(String[] args) {
        String str = "Karan Chaudhari";

        String reverse = "";
        int n = str.length();
        for(int i=n-1; i>=0; i--){
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }
        System.out.println(reverse);
    }
}
