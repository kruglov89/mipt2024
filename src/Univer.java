public class Univer
{
    public static void main(String[] args) {
        int minBudgetValue = 13;
        int minPayedValue = 10;
        int secondChanceValue = 8;

        int mathValue = 0;
        int biologyValue = 4;
        int russianValue = 3;

        int sum = mathValue + biologyValue + russianValue;

        if (sum >= minBudgetValue) {
            System.out.println("Вы поступили на бюджет!");
        } else if (sum >= minPayedValue) {
            System.out.println("У Вас есть возможность обучаться платно!");
        } else if(sum >= secondChanceValue) {
            System.out.println("Вы не поступили, но у Вас есть второй шанс");
        } else {
            System.out.println("Вы не поступили :(");
        }
    }
}