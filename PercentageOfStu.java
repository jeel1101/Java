import java.util.Scanner;

public class PercentageOfStu{
  public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the marks of maths: ");
    int m= sc.nextInt();
    System.out.print("Enter the marks of science: ");
    int s= sc.nextInt();
    System.out.print("Enter the marks of english: ");
    int e= sc.nextInt();
    System.out.print("Enter the marks of gujarati: ");
    int g= sc.nextInt();
    System.out.print("Enter the marks of hindi: ");
    int h= sc.nextInt();
    
    float per= (m+s+e+g+h)/5;
    System.out.println("\nPercentage is: "+per+"%");
  }
}