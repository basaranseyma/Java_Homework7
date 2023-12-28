import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double pear = 2.14;
        double apple = 3.67;
        double tomato = 1.11;
        double banana = 0.95;
        double aubergine = 5.00;

        System.out.print("How many kilograms of pears? ");
        double pearKilo = scan.nextDouble();

        System.out.print("How many kilograms of apples? ");
        double appleKilo = scan.nextDouble();

        System.out.print("How many kilograms of tomatoes? ");
        double tomatoKilo = scan.nextDouble();

        System.out.print("How many kilograms of bananas? ");
        double bananaKilo = scan.nextDouble();

        System.out.print("How many kilograms of aubergines? ");
        double aubergineKilo = scan.nextDouble();

        double total;
        total = (pear * pearKilo);
        total += (apple * appleKilo);
        total += (tomato * tomatoKilo);
        total += (banana * bananaKilo);
        total += (aubergine * aubergineKilo);

        System.out.println("Total amount: " + total);
    }
}