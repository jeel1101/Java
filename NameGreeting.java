import java.util.Scanner;

public class NameGreeting{
  public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name= sc.next();
    
    System.out.println("Hello "+name+",have a good day");
  }
}