import java.util.*;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random random= new Random();

        System.out.println("I am guessing the number between 1 to 100, can you guess that number?");

        int num=0,attempt=0;

        int comp_guess_num= random.nextInt(100)+1;

        while(num != comp_guess_num){
            System.out.print("Enter tha number: ");
            num= sc.nextInt();
            attempt++;

            if(num<comp_guess_num){
                System.out.println("\nToo low. Try again");
            }
            else if(num>comp_guess_num){
                System.out.println("\nToo high. Try again");
            }
            else{
                System.out.println("\nYour guess is correct in "+attempt+" attempts.");
            }
        }
    }
}
