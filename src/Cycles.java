import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {
//        for(int i = 1; i < 10; i = i + 1) {
//            System.out.println("Лошадь " + i);
//        }

//        int number = 0;
//        while(number != 745) {
//            System.out.println("Введите число:");
//            number = new Scanner(System.in).nextInt();
//        }
//
//        System.out.println("Ура! Вы угадали!");

//        int pinCode = 5423;
//        while(true) {
//            System.out.println("Введите пин-код:");
//            int userCode = new Scanner(System.in).nextInt();
//            if (userCode != pinCode) {
//                System.out.println("Не угадали :(");
//            } else {
//                System.out.println("Ура! Верно!");
//            }
//        }

        int pinCode = 7777;
        int userCode = 0;

        int trialCount = 0;
        int maxTrialsCount = 2;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();

        while(userCode != pinCode) {
            System.out.println("Введите пин-код:");
            userCode = new Scanner(System.in).nextInt();
            if (userCode != pinCode) {
                System.out.println("Неверный пин-код");
                trialCount = trialCount + 1;
            }

            if (trialCount > maxTrialsCount) {
                System.out.println("Извините, попыток больше не осталось");
                return;
            }
        }
        System.out.println("Добрый день, " + name + " !");
    }
}
