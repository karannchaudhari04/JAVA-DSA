public class Palindrome{
    public static void main(String args[]){
        String str = "noon";

        String reverse = "";
        int n = str.length();
        for(int i=n-1; i>=0; i--){
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }

        if(str.equals(reverse)){
            System.out.println(str+" is a palindrome String");
        }
        else{
            System.out.println(str+" is not a palindrome String");
        }
    }
}