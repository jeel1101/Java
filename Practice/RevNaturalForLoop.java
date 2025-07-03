package Practice;

import java.util.Scanner;

public class RevNaturalForLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any integer: ");
        int n= sc.nextInt();

        for(int i=n;i>=1;i--){
            System.out.println(i);
        }
    }
}
