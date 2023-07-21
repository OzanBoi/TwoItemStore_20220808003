import java.util.Scanner;
/** @author Ozan Ege Çalışır @since 11.11.2022 **/
public class TwoItemStore_20220808003 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("****** Store Inventory ******");
        String product1;
        int amount1;
        double price1;
        String product2;
        int amount2;
        double price2;
        System.out.print("Enter the name of your first product: ");
        product1 = scan.nextLine();
        product1 = product1.substring(0, 1).toUpperCase() + product1.substring(1).toLowerCase();

        System.out.print("Enter the number of " + product1 + " we have: ");
        amount1 = scan.nextInt();
        if(amount1>=0){

        System.out.print("Enter the cost of " + product1 + " : ");
        price1 = scan.nextDouble();
        if(price1>=0){

        System.out.print("Enter the name of your second product: ");
        product2 = scan.next();
        product2 = product2.substring(0, 1).toUpperCase() + product2.substring(1).toLowerCase();

        System.out.print("Enter the number of " + product2 + " we have: ");
        amount2 = scan.nextInt();
        if(amount2>=0){

        System.out.print("Enter the cost of " + product2 + " : ");
        price2 = scan.nextDouble();
        if(price2>=0){

        System.out.println("****** Customer User Interface ******");
        int choice;
        int chosen1;
        int chosen2;
        int sum1 = 0;
        int sum2 = 0;
        int remaining1 = amount1;
        int remaining2 = amount2;
        do {
            System.out.println("Welcome to our store. We have the following. Please enter what you would like: ");
            System.out.println("1 - " + product1 + "\n2 - " + product2 + "\n0 - to checkout");
            choice = scan.nextInt();
            if (choice == 1) {
                System.out.print("How many " + product1 + " would you like: ");
                chosen1 = scan.nextInt();
                if (remaining1 >= chosen1 && chosen1>0) {
                    sum1 += chosen1;
                    remaining1 = amount1 - sum1;
                }else if (chosen1 <= 0)
                    System.out.println("Invalid requested amount. ");
                else if (chosen1 > remaining1)
                    System.out.print("We do not have that many remaining. ");
            }
            if (choice == 2) {
                System.out.println("How many " + product2 + " would you like: ");
                chosen2 = scan.nextInt();
                if (remaining2 >= chosen2 && chosen2>0) {
                    sum2 += chosen2;
                    remaining2 = amount2 - sum2;
                }else if (chosen2 <= 0 )
                    System.out.print("Invalid requested amount. ");
                else if (chosen2 > remaining2)
                System.out.print("We do not have that many remaining. ");
            }
            if (choice > 2 || choice < 0 )
                System.out.println("Invalid menu option.");
        }
            while (choice != 0);
            System.out.println("****** Customer Total ******");
            System.out.println(product1 + " - " + sum1 + " X " + price1 + " = " + sum1 * price1);
            System.out.println(product2 + " - " + sum2 + " X " + price2 + " = " + sum2 * price2);
            System.out.println("---------------------------");
            System.out.println("Total due - " + ((sum1 * price1) + (sum2 * price2)));
            System.out.println("****** Final Report *******\nWe now have the remaining amount of products: ");
            System.out.print(product1 + " - " + remaining1 + "\n" + product2 + " - " + remaining2 );
        }
        else
            System.out.print("Value cannot be negative. Exiting! ");}
        else
            System.out.print("Value cannot be negative. Exiting! ");}
        else
            System.out.print("Value cannot be negative. Exiting! ");}
        else
            System.out.print("Value cannot be negative. Exiting! ");





} }











