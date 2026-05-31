import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password;

        do {
            System.out.print("Enter Password: ");
            password = sc.nextLine();

            if (!password.equals("java123"))
                System.out.println("Incorrect Password");

        } while (!password.equals("java123"));

        System.out.println("Access Granted");
    }
}
