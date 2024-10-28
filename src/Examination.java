import java.util.Scanner;

public class Examination {
    public static void main(String[] args) {

        var minAge = 16;
        int maxAge = 90;
        int minBudgetValue = 13;
        int minPayedValue = 10;
        int secondChanceValue = 8;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите свой возраст: ");
        int age = in.nextInt();

        boolean ageIsMoreThanMinimal = age >= minAge;
        boolean ageIsLessThanMaximal = age <= maxAge;

        if (!ageIsMoreThanMinimal || !ageIsLessThanMaximal) {
            System.out.println("Вы не подходите по возрасту");
        }

        in = new Scanner(System.in);
        System.out.print("Введите оценку по математике: ");
        int mathValue = in.nextInt();

        System.out.print("Введите оценку по биологии: ");
        int biologyValue = in.nextInt();

        System.out.print("Введите оценку по русскому языку: ");
        int russianValue = in.nextInt();

        int sum = mathValue + biologyValue + russianValue;

        if (ageIsMoreThanMinimal && ageIsLessThanMaximal) {
            if (sum >= minBudgetValue) {
                System.out.println("Вы поступили на бюджет!");
            } else if (sum >= minPayedValue) {
                System.out.println("У Вас есть возможность обучаться платно!");
            } else if (sum >= secondChanceValue) {
                System.out.println("Вы не поступили, но у Вас есть второй шанс");
            } else {
                System.out.println("Вы не поступили :(");
            }
        }
    }
}