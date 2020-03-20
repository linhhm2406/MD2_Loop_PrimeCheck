import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);

        System.out.print("Input number to check : ");
        int number = inputNumber.nextInt();

        boolean check = true;

        if (number < 2) {
            check = false;
        } else {
            int i = 2;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
        }

        if (check) {
            System.out.println(number + " is a prime");
        } else {
            System.out.println(number + " is not a prime");
        }
    }
}
