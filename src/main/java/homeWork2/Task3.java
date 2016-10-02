package homeWork2;

import java.util.Scanner;

/**
 * Created by Markodius on 02.10.2016.
 */
public class Task3 {

    public static void main(String[] args) {

        Scanner scDouble = new Scanner(System.in);

        System.out.println("Введите дробное число, через запятую: ");
        double number = scDouble.nextDouble();

        int roundNumber = (int)(number + 0.5);
        System.out.println("Ближайшее целое число = " +roundNumber);

    }

}
