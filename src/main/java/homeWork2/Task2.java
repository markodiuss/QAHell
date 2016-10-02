package homeWork2;

import java.util.Scanner;

/**
 * Created by Markodius on 02.10.2016.
 */
public class Task2 {

    public static void main(String[] args) {

        Scanner scInt = new Scanner(System.in);

        System.out.println("Please input two-digit number and press Enter: ");
        int twoDigitNumber = scInt.nextInt();

        int unitsNumber = twoDigitNumber%10;
        int tensNumber = twoDigitNumber/10;
        int summNumbers = unitsNumber + tensNumber;
        System.out.println("Сумма 2х чисел = " +summNumbers);


    }

}
