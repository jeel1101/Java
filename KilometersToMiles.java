import java.util.Scanner;

public class KilometersToMiles{
  public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter distance in kilometer: ");
    double km= sc.nextDouble();
    double miles= km*0.62;
    
    System.out.println("\nDistance in miles: "+String.format("%.2f",miles));
  }
}