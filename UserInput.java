import java.util.Scanner;

public class UserInput {
  public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the number: ");
    int a= sc.nextInt();
    System.out.println("\nYou entered "+a);
  }
}