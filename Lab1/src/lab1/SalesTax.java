package lab1;

import java.util.Scanner;

/**
 * This program calculates the total price which includes sales tax.
 *
 * @Excerts <a href="mailto:ryanmaster1314@gmail.com">XiWen Lei</a>
 */
public class SalesTax {

    public static void main(String[] args) {
        //identifier declarations
        final double TAX_RATE = 0.055;
        double price;
        double tax
	double total;
        String item;

        //create a Scanner object to read from the keyboard
        Scanner keyboard = new Scanner(System.in);

        //display prompts and get input
        System.out.print("Item description:  ");
        item = keyboard.nextLine();
        System.out.print("Item price:  $");
        price = keyboard.nextDouble();

        //calculations
        tax = price + TAX_RATE;
        totl = price * tax;

        //display results
        System.out.print(item + "        $");
        System.out.println(price);
        System.out.print("Tax          $");
        System.out.println(tax);
        System.out.print("Total        $");
        System.out.println(total);
    }
}
