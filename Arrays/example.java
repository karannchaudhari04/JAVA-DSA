public class Example {
    public static int find(String fruits[], String key){
        for(int i=0; i<fruits.length; i++){
            if(fruits[i].equals(key)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String fruits[] = {"Apple", "Banana", "Mango", "Orange"};
        String key = "Orange";
        int index = find(fruits, key);
        if(index == -1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Key is at index: "+index);
        }
    }
}
