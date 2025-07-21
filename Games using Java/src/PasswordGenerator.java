import java.util.*;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random random= new Random();

        String lower= "abcdefghijklmnopqrstuvwxyz";
        String upper= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String sp_character= "@!#$&*";
        String nums= "0123456789";
        String combination= lower+upper+sp_character+nums;

        System.out.println("Enter the length of password: ");
        int len= sc.nextInt();
        char[] password= new char[len];

        for(int i=0;i<len;i++){
            password[i]= combination.charAt(random.nextInt(combination.length()));
        }
        System.out.println("Generated password: "+ new String(password));
    }
}
