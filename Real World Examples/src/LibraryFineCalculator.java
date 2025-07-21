import java.util.*;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        final int allowdays= 14;
        final int fineperday= 2;

        System.out.println("Enter the days of borrowed: ");
        int borrowdays= sc.nextInt();

        int fine= 0;
        if(borrowdays>allowdays){
            int extradays= borrowdays-allowdays;
            fine= extradays*fineperday;
            System.out.println();
            System.out.println("Extra days: "+extradays);
            System.out.println("You have to pay fine: "+fine);
        }
        else{
            System.out.println("Book returns on time, No fine");
        }
    }
}
