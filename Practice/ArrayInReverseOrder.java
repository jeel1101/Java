package Practice;

import java.util.Scanner;

public class ArrayInReverseOrder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] e_nums= new int[10];

        System.out.println("Enter elements: ");
        for(int i=0;i<e_nums.length;i++){
            e_nums[i]= sc.nextInt();
        }

        System.out.print("Reversed elements: ");
        for(int i=e_nums.length-1;i>0;i--){
            if(e_nums[i]%2==0){
                System.out.print(e_nums[i]+" ");
            }
        }
    }
}
