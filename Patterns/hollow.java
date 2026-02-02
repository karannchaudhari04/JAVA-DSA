package Patterns;

public class hollow {
    public static void hollow_Rectangle(int rows, int column){
        //Outer Loop - rows 
        for(int i=1; i<=rows; i++){
            //inner loop - columns
            for(int j = 1; j<=column; j++){
                //cell - (i,j)
                if(i == 1 || i == rows || j == 1 || j == column){
                    // boundry cells
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_Rectangle(5,8);
    }
}
