import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double gallons;
        double fuelEfficiencyMilesPerGal;
        double gasPricePerGal;
        boolean allInputs = false;

        do {
            for (int i = 0; i < 3; i++) {
                scan.nextLine();
                if (i == 1) {
                    System.out.println("Please input the number of gallons you hold in your gas tank.");
                    if (scan.hasNextDouble() && scan.nextDouble() >= 0) {
                        gallons = scan.nextDouble();
                    } else {
                        System.out.println("You have inputted an invalid response. Please try again.");
                    }
                } else if (i == 2) {
                    System.out.println("Please input your car's fuel efficiency in miles per gallon.");
                    if (scan.hasNextDouble() && scan.nextDouble() > 0) {
                        fuelEfficiencyMilesPerGal = scan.nextDouble();
                    } else {
                        System.out.println("You have inputted an invalid response. Please try again.");
                    }
                } else {
                    System.out.println("Please input the price per gallon of gas.");
                    if (scan.hasNextDouble() && scan.nextDouble() > 0) {
                        gasPricePerGal = scan.nextDouble();
                    } else {
                        System.out.println("You have inputted an invalid response. Please try again.");
                    }
                }
            }
            allInputs = true;
        } while (!allInputs);

    }
}