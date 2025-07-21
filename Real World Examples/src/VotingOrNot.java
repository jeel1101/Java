import java.util.Scanner;

public class VotingOrNot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your nationality (indian or other): ");
        String nationality= sc.nextLine();

        if(age>=18 && (nationality.equals("indian") || nationality.equals("Indian"))){
            System.out.println("Your age is "+ age + " , you can vote");
        }
        else{
            System.out.println("You cannot vote");
        }
    }
}
