import java.util.Scanner;

public class SuperMarketCheckoutSystem{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of products that you have purchased: ");
        int n= sc.nextInt();

        float result=0;

        float[] Pprice= new float[n];

        System.out.println("Enter the price of each product: ");
        for(int i=0;i<Pprice.length;i++){
            Pprice[i]= sc.nextFloat();
        }
        for(int i=0;i<Pprice.length;i++){
            result += Pprice[i];
        }
        float total= (5f/100f) * (result);
        if(result>1000){
            System.out.println();
            System.out.println("You got 5% discount");
            System.out.println("Original Price is "+result+"/-");
            System.out.println("But You have to pay "+total+" with discount");
        }
        else{
            System.out.println();
            System.out.println("You have to pay "+result+"/-");
        }
    }
}