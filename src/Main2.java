import java.util.Scanner;

public class Main2
{
    public static void main(String[] args) {
        System.out.println("Вендинговый автомат");

        Scanner in = new Scanner(System.in);
        System.out.print("Внесите сумму: ");
        int moneySum = in.nextInt();

        System.out.println("Внесено: " + moneySum + " руб.");

        int coffeePrice = 250;
        int colaPrice = 150;
        int nutsPrice = 100;
        int snackPrice = 100;
        int cookiesPrice = 200;
        int waterPrice = 150;

        if (moneySum >= coffeePrice) {
            System.out.println("Вы можете купить кофе");
        }

        if (moneySum >= colaPrice) {
            System.out.println("Вы можете купить колу");
        }

        if (moneySum >= nutsPrice) {
            System.out.println("Вы можете купить орешки");
        }

        if (moneySum >= snackPrice) {
            System.out.println("Вы можете купить батончик");
        }

        if (moneySum >= cookiesPrice) {
            System.out.println("Вы можете купить печенье");
        }

        if (moneySum >= waterPrice) {
            System.out.println("Вы можете купить воду");
        }
    }
}