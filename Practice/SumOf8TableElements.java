package Practice;

import java.util.Scanner;

public class SumOf8TableElements {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int sum=0;
        System.out.println("Enter the number of position where you want to go to: ");
        int n= sc.nextInt();

        for(int i=1;i<=n;i++){
            if(i%8==0){
                sum+=i;
            }
        }
        System.out.println("Sum is "+sum);
    }
}
