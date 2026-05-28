import java.util.*;
public class Swiggyorder {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String item,adderess;
        int quantity;
        System.out.println("Enter food item:");
        item=sc.nextLine();
        System.out.println("Enter quantity:");
        quantity=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter delivery address:");
        adderess=sc.nextLine();
        System.out.println("order placed!");
    }
    
}
