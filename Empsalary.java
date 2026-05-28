import java.util.Scanner;
public class Empsalary {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        String name;
        double salary;
        System.out.println("Enter employee name:");
        name=sc.nextLine();
        System.out.println("Enter total salary:");
        salary=sc.nextDouble();
        System.out.println("Employee Name: " + name);
        System.out.println("Total Salary: " + salary);
    }

    
}
