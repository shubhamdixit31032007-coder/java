import java.util.Scanner;

public class WeatherCondition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int temperature;

        System.out.print("Enter Temperature: ");
        temperature = sc.nextInt();

        if (temperature > 35) {
            System.out.println("Very Hot");
        }
        else if (temperature > 25) {
            System.out.println("Pleasant Weather");
        }
        else if (temperature > 15) {
            System.out.println("Cool Weather");
        }
        else {
            System.out.println("Very Cold");
        }
    }
}
