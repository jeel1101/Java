import java.util.*;

public class DailyTemperatureLogger {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sum= 0;
        float[] temp = new float[7];
        String[] day= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        System.out.println("Enter the temperature in the Celsius(0-100): ");
        for(int i=0;i<temp.length;i++){
            temp[i]= sc.nextFloat();
        }
        for(int i=0;i<temp.length;i++){
            sum+=temp[i];
        }

        float avg= sum/7f;
        System.out.println("Average of temperature of 7 days is "+avg);

        float max= temp[0];
        int maxIdx= 0;
        for(int i=1;i<temp.length;i++){
            if(temp[i]>max){
                max= temp[i];
                maxIdx=i;
            }
        }
        System.out.println("Highest temperature is on "+day[maxIdx]+" :"+" "+max);
    }
}
