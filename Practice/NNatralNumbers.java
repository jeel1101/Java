package Practice;

import java.util.Scanner;

public class NNatralNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i=1;
        System.out.println("Enter any positive number:");
        int n= sc.nextInt();

        do{
            System.out.println(i);
            i++;
        }while(i<=n);
    }
}
