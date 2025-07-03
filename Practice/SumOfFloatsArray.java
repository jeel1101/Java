package Practice;

public class SumOfFloatsArray {
    public static void main(String[] args) {
        float[] nums = {24.5f,10.7f,19.67f,45.7f,200.96f};
        float sum=0;
        for(float i: nums){
            sum= sum+i;
        }
        System.out.println("Sum is "+sum);
    }
}
