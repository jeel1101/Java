import java.util.*;

public class BusTicketSystem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your age and travel distance (KM): ");
        int age= sc.nextInt();
        float dist= sc.nextFloat();

        float total_price= dist * 5f;

        if(age<12 || age>60){
            float final_price= (50f/100f) * total_price;
            if(age<12){
                System.out.println();
                System.out.println("You are a child");
                System.out.println("So, total price with 50% discount is "+ final_price);
            }
            if(age>60){
                System.out.println();
                System.out.println("You are a senior citizen");
                System.out.println("So, total price with 50% discount is "+ final_price);
            }
        }
        else{
            System.out.println();
            System.out.println("Your total price is "+ total_price);
        }
    }
}
