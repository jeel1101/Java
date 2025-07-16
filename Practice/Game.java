import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        // System.out.println("Enter 1 for rock, 2 for paper, 3 for scissors by Person 1: ");
        // int p1= sc.nextInt();
        
        // System.out.println("Enter 1 for rock, 2 for paper, 3 for scissors by Person 1: ");
        // int p2= sc.nextInt();
        int userwin= 0;
        int user2win=0;
        int userloss= 0;
        
        for(int i=1;i<=5;i++){
            System.out.println("\n"+i+" time :");
            System.out.println("Enter 1 for rock, 2 for paper, 3 for scissors by Person 1: ");
            int p1= sc.nextInt();
        
            System.out.println("Enter 1 for rock, 2 for paper, 3 for scissors by Person 1: ");
            int p2= sc.nextInt();
            
            if(p1>3 || p2>3){
                System.out.println("Invalid input.\n");
            }
            else if(p1==p2){
                System.out.println("It's tie..!\n");
            }
            else if(p1==1 && p2==2){
                System.out.println("Congo, Person 2 is win.\n");
                user2win++;
            }
            else if(p1==1 && p2==3){
                System.out.println("Congo, Person 2 is win.\n");
                user2win++;
            }
            else if(p1==2 && p2==1){
                System.out.println("Congo, Person 1 is win.\n");
                userwin++;
            }
            else if(p1==2 && p2==3){
                System.out.println("Congo, Person 1 is win.\n");
                userwin++;
            }
            else if(p1==3 && p2==1){
                System.out.println("Congo, Person 1 is win.\n");
                userwin++;
            }
            else if(p1==3 && p2==2){
                System.out.println("Congo, Person 1 is win.\n");
                userwin++;
            }
        }
        
        if(userwin>2){
            System.out.println("\n\nPerson 1 win");
        }
        else if(user2win>2){
            System.out.println("\n\nPerson 2 win");
        }
        else{
            System.out.println("\n\nNo winner");
        }
    }
}
