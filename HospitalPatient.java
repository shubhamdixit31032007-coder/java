import java.util.Scanner;



public class HospitalPatient {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name, bloodGroup;
        double weight;

        System.out.print("Enter Patient Name: ");
        name = sc.nextLine();

        System.out.print("Enter Blood Group: ");
        bloodGroup = sc.nextLine();

        System.out.print("Enter Weight: ");
        weight = sc.nextDouble();

        System.out.println("Patient Registered!");
    }
 
    
}
