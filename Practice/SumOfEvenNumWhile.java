package Practice;

import java.util.Scanner;

public class SumOfEvenNumWhile {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int i= 1,sum=0;
        System.out.println("Enter an integer: ");
        int n= sc.nextInt();

        while(i<=n){
            i++;
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("Sum is even nums is "+sum);
    }
}
