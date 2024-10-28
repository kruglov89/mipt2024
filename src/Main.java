import java.util.Scanner;

public class Main {
    static boolean canBuy = false;

    public static void main(String[] args) {

        System.out.println("Введите количество денег:");
        int moneySum = new Scanner(System.in).nextInt();

        int[] prices = {89, 85, 50, 789, 135};
        String[] products = {"Сникерс", "Баунти", "Кола", "Стейк", "Круасан"};
        double[] weight = {90, 85, 500, 300, 100};

        int length = Math.min(Math.min(prices.length, products.length), weight.length);
        for(int i = 0; i < length; i++) {
            if (moneySum >= prices[i]) {
                System.out.println(products[i] + " (" + weight[i] + " г) - доступно для покупки");
                canBuy = true;
            }
        }

        if (!canBuy) {
            System.out.println("Внесите ещё денег, пока ни на что не хватает");
        }
    }
}