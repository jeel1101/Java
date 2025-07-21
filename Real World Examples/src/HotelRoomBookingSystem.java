import java.util.*;

public class HotelRoomBookingSystem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int standard= 5000;
        int deluxe= 2500;
        int normal= 1000;

        System.out.print("1. Standard room-S (2 members)\n2. Deluxe room-D (3 members)\n3. Normal room-N (4 members)");
        System.out.println("\n\nEnter the room type which you want: ");
        char room= sc.next().charAt(0);

        if(room=='S'){
            System.out.println("Enter the number of nights: ");
            int night= sc.nextInt();
            int price= night*standard;
            System.out.println("Total amount is "+price);
        }
        else if(room=='D'){
            System.out.println("Enter the number of nights: ");
            int night= sc.nextInt();
            int price= night*deluxe;
            System.out.println("Total amount is "+price);
        }
        else if(room=='N'){
            System.out.println("Enter the number of nights: ");
            int night= sc.nextInt();
            int price= night*normal;
            System.out.println("Total amount is "+price);
        }
        else{
            System.out.println("Something went wrong please try again");
        }
    }
}
