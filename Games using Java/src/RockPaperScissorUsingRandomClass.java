import java.util.*;

public class RockPaperScissorUsingRandomClass {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random random = new Random();
        String[] choice= {"rock","paper","scissor"};

        System.out.println("Enter 0 for rock, 1 for paper or 2 for scissor: ");
        int op= sc.nextInt();

        if(op<0 || op>2){
            System.out.println("Invalid Input.");
        }

        int computer_choice= random.nextInt(3);
        System.out.println("User input: "+choice[op]);
        System.out.println("Computer choose "+ choice[computer_choice]);


        if(op==computer_choice){
            System.out.println("It's tie...!!");
        }
        else if((op==0 && computer_choice==2) || (op==1 && computer_choice==0) || (op==2 && computer_choice==1)){
            System.out.println("\nCongo, you win.");
        }
        else{
            System.out.println("\nComputer win.");
        }
    }
}
