import java.util.Scanner;

public class Q2
{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int basePrice = 0;
        String pizzaSize;
        String wantsPepperoniStr;
        String wantsExtraCheeseStr;

        System.out.print("Enter pizza size (small/medium/large): ");
        pizzaSize = scanner.nextLine().toLowerCase();

        System.out.print("Do you want pepperoni? (yes/no): ");
        wantsPepperoniStr = scanner.nextLine().toLowerCase();

        System.out.print("Do you want extra cheese? (yes/no): ");
        wantsExtraCheeseStr = scanner.nextLine().toLowerCase();

        // 1. Determine Base Price
        switch (pizzaSize) {
            case "small":
                basePrice = 100;
                break;
            case "medium":
                basePrice = 200;
                break;
            case "large":
                basePrice = 300;
                break;
            default:
                System.out.println("\nInvalid pizza size. Using default price of 0.");
                basePrice = 0;
                break;
        }

        int finalBill = basePrice;

        // 2. Add Pepperoni Cost
        boolean wantsPepperoni = wantsPepperoniStr.equals("yes");
        if (wantsPepperoni) {
            if (pizzaSize.equals("small")) {
                finalBill += 30;
            } else if (pizzaSize.equals("medium") || pizzaSize.equals("large")) {
                finalBill += 50;
            }
        }

        // 3. Add Extra Cheese Cost
        boolean wantsExtraCheese = wantsExtraCheeseStr.equals("yes");
        if (wantsExtraCheese) {
            finalBill += 20;
        }

        System.out.println("\nYour final bill is: " + finalBill + " rupees");

        scanner.close();
    }
}