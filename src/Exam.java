import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {

        int minAge = 16;
        int maxAge = 90;
        int minBudgetValue = 13;
        int minPayedValue = 10;
        int secondChanceValue = 8;
        int minValue = 1;
        int maxValue = 5;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите свой возраст: ");
        int age = in.nextInt();

        boolean ageIsMoreThanMinimal = age >= minAge;
        boolean ageIsLessThanMaximal = age <= maxAge;

        if (!ageIsMoreThanMinimal || !ageIsLessThanMaximal) {
            System.out.println("Вы не подходите по возрасту");
            return;
        }

        System.out.print("Введите оценку по математике: ");
        int mathValue = in.nextInt();

        while(mathValue < minValue || mathValue > maxValue) {
            System.out.println("Вы ввели недопустимое значение. Оценка может быть от 1 до 5");
            if (mathValue < minValue || mathValue > maxValue) {
                System.out.println("Введите оценку по математике: ");
                mathValue = new Scanner(System.in).nextInt();
            }
        }

        System.out.print("Введите оценку по биологии: ");
        int biologyValue = in.nextInt();

        while(biologyValue < minValue || biologyValue > maxValue) {
            System.out.println("Вы ввели недопустимое значение. Оценка может быть от 1 до 5");
            if (biologyValue < minValue || biologyValue > maxValue) {
                System.out.println("Введите оценку по биологии: ");
                biologyValue = new Scanner(System.in).nextInt();
            }
        }

        System.out.print("Введите оценку по русскому языку: ");
        int russianValue = in.nextInt();

        while(russianValue < minValue || russianValue > maxValue) {
            System.out.println("Вы ввели недопустимое значение. Оценка может быть от 1 до 5");
            if (russianValue < minValue || russianValue > maxValue) {
                System.out.println("Введите оценку по русскому языку: ");
                russianValue = new Scanner(System.in).nextInt();
            }
        }

        int sum = mathValue + biologyValue + russianValue;

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