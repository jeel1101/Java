import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter signal red, yellow or green: ");
        String light= sc.nextLine();

        switch (light){
            case "red":
                System.out.println("Light is red, stop your vehicle");break;
            case "yellow":
                System.out.println("Light is yellow, start your vehicle");break;
            case "green":
                System.out.println("Light is green, go");
            default:
                System.out.println("Invalid input");
        }
    }
}
