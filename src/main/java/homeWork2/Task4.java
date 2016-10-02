package homeWork2;

import java.util.Scanner;

/**
 * Created by Markodius on 02.10.2016.
 */
public class Task4 {

    public static void main(String[] args) {

        Scanner scThreeDigitNumber = new Scanner(System.in);

        System.out.println("Введите 3х значное число и нажмите Enter: ");
        int threeDigitNumber = scThreeDigitNumber.nextInt();

        int firsNumber = threeDigitNumber/100;
        int secondNumber = (threeDigitNumber/10)%10;
        int thirdNumber = (threeDigitNumber%100)%10;
        System.out.println("Сумма чисел числа N = " +(firsNumber + secondNumber + thirdNumber));


    }
}
