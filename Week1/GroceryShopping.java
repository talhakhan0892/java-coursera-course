import java.util.Scanner;

public class GroceryShopping {
    public static void main(String[] args) {

        String[] items = { "Eggs", "Bread", "Butter", "Cheese", "Ham", "Jam", "Sausages", "Sugar", "Milk", "Noodles" };
        float[] unitPrices = {
                2.99f, 1.49f, 3.25f, 4.10f, 2.80f,
                2.50f, 5.00f, 1.20f, 1.75f, 2.10f
        };

        Scanner input = new Scanner(System.in);

        // while (true) {

        // String text = input.nextLine();
        // if (text.equalsIgnoreCase("exit")) {
        // System.out.println("Thanks girlie for shopping with us!!");
        // break;
        // }

        // }
        double totalBill = 0;
        while (true) {

            String text = input.nextLine();
            if (text.equalsIgnoreCase("Finish")) {
                System.out.println("Thank you for shopping with us");
                break;
            }

            boolean isAvailable = false;
            int index = -1;

            for (int i = 0; i < items.length; i++) {
                if (text.equalsIgnoreCase(items[i])) {
                    isAvailable = true;
                    index = i;
                    totalBill += unitPrices[i];
                }
            }
            String msg = isAvailable ? "Your item is at index " + index
                    : "Item is not available";

            System.out.println(msg);

        }
        System.out.println("Your total bill is " + totalBill);

    }
}