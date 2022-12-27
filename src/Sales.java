import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        int number = 0;
        double price1 = 2.98;
        double price2 = 4.5;
        double price3 = 9.98;
        double price4 = 4.49;
        double price5 = 6.87;
        double result1 = 0.0;
        double result2 = 0.0;
        double result3 = 0.0;
        double result4 = 0.0;
        double result5 = 0.0;
        double sum = 0.0;
        System.out.print("Enter your option: ");
        int enter = input.nextInt();
        if (enter == -1) {
            System.out.print("Thank you for your Patronage,we hope to see you other time");
        } else {
            System.out.println("Welcome to Balmart Restaurant");
        }

        while (enter != -1) {
            total = total + price1 + price2 + price3 + price4 + price5;
            ++number;
            System.out.println("Enter the product Number you want to buy : ");
            int product = input.nextInt();
            if (product > 5) {
                break;
            }

            System.out.print(" ");
            switch (product) {
                case 1:
                    System.out.println("You just purchase product 1, Enter units to purchase: ");
                    int quantity = input.nextInt();
                    double unit1 = (double) quantity * price1;
                    result1 += unit1;
                    System.out.printf("%n%d \nis The quantity of product purchased,\n\n%.2f%n is the price per unit of the product,\n\n%.2f%n is the total amounts of the products purchased", quantity, price1, result1);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("You just purchase product 2, Enter units to purchase: ");
                    int quantity2 = input.nextInt();
                    double unit2 = (double) quantity2 * price2;
                    result2 += unit2;
                    System.out.printf("%n%d \nis The quantity of product purchased,\n\n%.2f%n is the price per unit of the product,\n\n%.2f%n is the total amounts of the products purchased", quantity2, price2, result2);
                    break;
                case 3:
                    System.out.println("You just purchase product 3, Enter units to purchase: ");
                    int quantity3 = input.nextInt();
                    double unit3 = (double) quantity3 * price3;
                    result3 += unit3;
                    System.out.printf("%n%d \nis The quantity of product purchased,\n\n%.2f%n is the price per unit of the product,\n\n%.2f%n is the total amounts of the products purchased", quantity3, price3, result3);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("You just purchase product 4, Enter units to purchase: ");
                    int quantity4 = input.nextInt();
                    double unit4 = (double) quantity4 * price4;
                    result4 += unit4;
                    System.out.printf("%n%d \nis The quantity of product purchased,\n\n%.2f%n is the price per unit of the product,\n\n%.2f%n is the total amounts of the products purchased", quantity4, price4, result4);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("You just purchase product 5, Enter units to purchase: ");
                    int quantity5 = input.nextInt();
                    double unit5 = (double) quantity5 * price5;
                    result5 += unit5;
                    System.out.printf("%n%d \nis The quantity of product purchased,\n\n%.2f%n is the price per unit of the product,\n\n%.2f%n is the total amounts of the products purchased", quantity5, price5, result5);
                    System.out.println();
            }

            sum = result1 + result2 + result3 + result4 + result5;
            System.out.printf("the total sum of the product bought is %.2f%n", sum);
        }

    }
}
