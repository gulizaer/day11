import java.util.Scanner;

public class TipCalculater {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Split or No split? (yes/no): ");
        String yesORno = input.next().toLowerCase();

        System.out.println("Enter the number of people: ");
        int numberOFpeople =input.nextInt();

        System.out.println("Enter the check amount: ");
        double amount = input.nextDouble();

        System.out.println("How was the service quality? (Excellnt/Great/Good/Fair/Poor):");
        String service = input.next().toLowerCase();

        double tipRate = (service.equals("excellent"))? 0.25 : (service.equals("great")) ? 0.2 :
                (service.equals("good"))? 0.15 : (service.equals("fair")) ? 0.1: 0.05;

        double totalTip = amount * tipRate;

        System.out.println("Number of people entered: " + numberOFpeople);
        System.out.println("Total to pay: " + amount);
        System.out.println("Total tip: " + totalTip);

        if (yesORno.equals("yes")){
            System.out.println("Total per preson: "+ (amount/numberOFpeople));
            System.out.println("Tip per person: " + (totalTip/numberOFpeople));
        }
         input.close();



        /*
        Create a class called TipCalculator, and write a program for a tip calculator.
    There will be different service quality benchmarks that will determine the tip given.
    There will also the ability to calculate based on the number of people in the party
    and if there is a split of the bill or not.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

    The program should ask the user to enter:
            - Split or No split (Yes or No),
             - Enter the number of people (number)
             - Enter the check amount (number)
             - Service Quality (String)

    And then it should display:
             Number of people entered
             Total to pay
             Total tip
             Total per person
             Tip per person:

        Ex:
            Split or No split (Yes or No)?
            YeS
            Enter the number of people
            4
            Enter the check amount:
            476
            How was the service quality? (Excellent/Great/Good/Fair/Poor)
            ExCElLeNt

            output:
                Number of people entered: 4
                Total to pay: 595.0
                Total tip: 119.0
                Total per person: 148.75
                Tip per person: 29.75
         */
    }
}
