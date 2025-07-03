package Practice;

import java.util.Scanner;

public class StudentMarksheet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of Maths from 100: ");
        float marks1= sc.nextFloat();
        System.out.println("Enter the marks of Science from 100: ");
        float marks2= sc.nextFloat();
        System.out.println("Enter the marks of Java from 100: ");
        float marks3= sc.nextFloat();

        float per = ((marks1+marks2+marks3) * 100) / 300;
        System.out.printf("Your Percentage is: %.2f%%",per);
        System.out.println();

        if(per<=100 && per>85){
            System.out.println("You got O grade (Outstanding)");
        }
        else if(per<=85 && per>75){
            System.out.println("You got A grade");
        }
        else if(per<=75 && per>65){
            System.out.println("You got B grade");
        }
        else if(per<=65 && per>55){
            System.out.println("You got C grade");
        }
        else if(per<=55 && per>45){
            System.out.println("You got D grade");
        }
        else if(per<=45 && per>35){
            System.out.println("You got E grade");
        }
        else{
            System.out.println("You are fail, better luck in next time");
        }
    }
}
