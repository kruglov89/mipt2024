import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        enum Season { WINTER, SPRING, SUMMER, AUTUMN }

        Season season = Season.WINTER;
        if (season == Season.WINTER)
            season =  Season.SPRING;
        System.out.println(season.name());
    }
}