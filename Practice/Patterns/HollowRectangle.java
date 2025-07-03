package Practice.Patterns;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows= sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols= sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i==0 || j==0 || i==(rows-1) || j==(cols-1)){
                    System.out.print(" * ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
