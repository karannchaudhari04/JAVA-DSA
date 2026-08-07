public class NumberOfEmployeesWhoMetTarget {
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target){
        int total = 0;
        for(int i=0; i<hours.length; i++){
            if(hours[i]>=target){
                total++;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        int[] hours = {0,1,2,3,4,5};
        int target = 2;
        System.out.println(numberOfEmployeesWhoMetTarget(hours, target));
    }
}
