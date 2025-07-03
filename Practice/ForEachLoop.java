package Practice;

import java.util.Scanner;

public class ForEachLoop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int[] e_nums= new int[5];

        System.out.println("Enter elements: ");
        for(int i=0;i<e_nums.length;i++){
            e_nums[i]= sc.nextInt();
        }

        //for-each loop
        for(int elements: e_nums){
            System.out.print(elements+" ");
        }
    }
}
