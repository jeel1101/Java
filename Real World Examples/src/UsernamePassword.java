import java.util.*;

public class UsernamePassword {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String userN= "";
        String password= "";


        System.out.println("Enter new username: ");
        userN= sc.nextLine();
        System.out.println("Create the password: ");
        password= sc.nextLine();
        System.out.println("Account Created");
        System.out.println("----------Login---------");
        System.out.println("Username: ");
        String userN_1= sc.nextLine();
        System.out.println("\nPassword: ");
        String pass_2= sc.nextLine();
        if(pass_2.equals(password) && userN_1.equals(userN)){
            System.out.println("Login successfully");
        }
        else{
            System.out.println("Incorrect username or password.");
        }
    }
}
