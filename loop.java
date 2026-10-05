
import java.util.Scanner;
class loop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int amount;
        int total = 0;
        int count = 0;


        System.out.print("Enter an amount (0 to stop): ");
        amount = input.nextInt();

        while (amount != 0) {

            total += amount;
            count++;

            System.out.print("Enter an amount (0 to stop): ");
            amount = input.nextInt();
        }

            System.out.println("Total Amount = " + "PhP " + total);
            System.out.println("Number of items = " + count);

            input.close();
        }
    }
