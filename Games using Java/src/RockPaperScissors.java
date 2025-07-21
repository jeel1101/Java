import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int userwin=0;
        int user2win=0;
        for(int i=1;i<=5;i++){
            System.out.println("\nFor "+i+" time:");
            System.out.println("Enter 1 for rock, 2 for paper or 3 for scissor by Person 1: ");
            int p1= sc.nextInt();
            System.out.println("Enter 1 for rock, 2 for paper or 3 for scissor by Person 2: ");
            int p2= sc.nextInt();

            if(p1>3 || p2>3){
                System.out.println("Invalid input. Please try again.\n");
            }
            else if(p1==p2){
                System.out.println("It's tie...\n");
            }
            else if(p1==1 && p2==2){
                System.out.println("Congo, Person 2 is win.\n");
                user2win++;
            }
            else if(p1==1 && p2==3){
                System.out.println("Congo, Person 1 is win.\n");
                userwin++;
            }
            else if(p1==2 && p2==1){
                System.out.println("Congo, Person 1 is win.\n");
                userwin++;
            }
            else if(p1==2 && p2==3){
                System.out.println("Congo, Person 2 is win.\n");
                user2win++;
            }
            else if(p1==3 && p2==1){
                System.out.println("Congo, Person 2 is win.\n");
                user2win++;
            }
            else if(p1==3 && p2==2){
                System.out.println("Congo, Person 1 is win.\n");
                userwin++;
            }
        }
        System.out.print("-------------------------------------------\n");
        if(userwin>3){
            System.out.println("Person 1 won by "+userwin+" winnings.");
        }
        else if(user2win>3){
            System.out.println("Person 2 won by "+user2win+" winnings.");
        }
        else{
            System.out.println("No one wins.");
        }
    }
}
