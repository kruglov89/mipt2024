import java.util.Scanner;

public class Speed
{
    public static void main(String[] args) {
        int speedNoAlertValue = 60;
        int speedAlertValue = 79;
        int speedPenaltyValue = 80;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите вашу скорость: ");
        int speedValue = Integer.parseInt(in.nextLine());

        if (speedValue <= speedNoAlertValue) {
            System.out.println("Вы не преысили скорость! Так держать!");
        } else if (speedValue <= speedAlertValue) {
            System.out.println("Вы превысили скорость менее чем на 20 км/ч ! Вам предупреждение  !!!");
        } else if(speedValue >= speedPenaltyValue) {
            System.out.println("Вы превысили скорость более чем на 20 км/ч ! Вам штраф  !!!");
        }
    }
}