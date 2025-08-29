/* 
QUESTION: 
Define a class TravelAgency with the suitable details, a different value has base fare per day (upto 12 hours). 
2 wheeler = rs 500 and 4 wheeler = rs 1000 and and additional extending hours fare is applicablr per km as 2 wheeler = rs 20 adn 4 wheeler = rs 50. 
write a function to display travelbill() with total charges including base fare and total fare of dist travelled.
*/

import java.util.Scanner;

class Travel {

    public void travelBill() {
        Scanner sc = new Scanner(System.in);
        int baseFare, kmRate;
        System.out.print("Enter vehicle type (2w/4w): ");
        String vehicleType = sc.nextLine();

        System.out.print("Enter distance travelled (km): ");
        int distance = sc.nextInt();


        if (vehicleType.equalsIgnoreCase("2w")) {
            baseFare = 500;
            kmRate = 20;
        } else if (vehicleType.equalsIgnoreCase("4w")) {
            baseFare = 1000;
            kmRate = 50;
        } else {
            System.out.println("Invalid vehicle type!");
            return;
        }

        int extraFare = 0;
        int totalFare= 0;
        if (distance > 12) {
            extraFare = distance * kmRate;
        } else {
            totalFare = baseFare + extraFare;
        }

        System.out.println("Extra Fare   : Rs " + extraFare);
        System.out.println("Total Fare   : Rs " + totalFare);
    }
}

public class TravelAgency {
    public static void main(String[] args) {
        Travel ta = new Travel();
        ta.travelBill();
    }
}
