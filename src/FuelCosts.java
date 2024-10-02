import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double gallons;
        double fuelEfficiencyMilesPerGal;
        double gasPricePerGal;
        boolean allInputs = false;

        do {

            for (int i = 1; i <= 3; i++) {
                if (i == 1) {
                    System.out.println("Please input the number of gallons you hold in your gas tank.");
                    if (scan.hasNextDouble()) {
                        gallons = scan.nextDouble();
                        if (gallons < 0) {
                            System.out.println("You have inputted an invalid response. Please try again.");
                            i--;
                        }
                    } else {
                        System.out.println("You have inputted an invalid response. Please try again.");
                        i--;
                    }
                    scan.nextLine();
                } else if (i == 2) {
                    System.out.println("Please input your car's fuel efficiency in miles per gallon.");
                    if (scan.hasNextDouble()) {
                        fuelEfficiencyMilesPerGal = scan.nextDouble();
                        if (fuelEfficiencyMilesPerGal <= 0) {
                            System.out.println("You have inputted an invalid response. Please try again.");
                            i--;
                        }
                    } else {
                        System.out.println("You have inputted an invalid response. Please try again.");
                        i--;
                    }
                    scan.nextLine();
                } else if (i==3) {
                    System.out.println("Please input the price per gallon of gas.");
                    if (scan.hasNextDouble()) {
                        gasPricePerGal = scan.nextDouble();
                        if (gasPricePerGal <= 0) {
                            System.out.println("You have inputted an invalid response. Please try again.");
                            i--;
                        }
                    } else {
                        System.out.println("You have inputted an invalid response. Please try again.");
                        i--;
                    }
                    scan.nextLine();
                }
                allInputs = true;
            }
        } while (!allInputs);

        /* put here the calculator for the cost per 100 miles in dolarras
        put here the distance left in miles */

}