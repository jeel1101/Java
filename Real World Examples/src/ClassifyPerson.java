import java.util.*;

public class ClassifyPerson {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age= sc.nextInt();

        if(age>=0 && age<=12){
            System.out.println("You are the child.");
        }
        else if(age>=13 && age<=19){
            System.out.println("You are teen");
        }
        else if(age>=20 && age<=59){
            System.out.println("You are adult");
        }
        else{
            System.out.println("You are senior citizen");
        }
    }
}
