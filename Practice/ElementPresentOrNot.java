package Practice;

import java.util.Scanner;

public class ElementPresentOrNot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int[] num= new int[6];

        System.out.println("Enter the elements: ");
        for(int i= 0;i<num.length;i++){
            num[i]= sc.nextInt();
        }
        System.out.println("Enter the any integer: ");
        int n= sc.nextInt();
        boolean found= false;

        for(int i=0;i<num.length;i++){
            if(num[i]==n){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println(n+" is present");
        }
        else{
            System.out.println(n+" is not present");
        }
    }
}
