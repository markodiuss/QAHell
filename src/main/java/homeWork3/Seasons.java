package homeWork3;

import java.util.Scanner;

/**
 * Created by Markodius on 06.10.2016.
 * Дано число месяца (тип int). Необходимо определить время года (зима, весна, лето, осень) и вывести на консоль.
 */
public class Seasons {

    public static void main(String[] args) {

        Scanner scMonth = new Scanner(System.in);

        int monthNumber = scMonth.nextInt();

        switch (monthNumber) {

            case 12:case 1:case 2:
                System.out.println("12, 1, 2-й месяцы это Зима ");
                break;

            case 3:case 4:case 5:
                System.out.println("3, 4, 5й - это Весна ");
                break;

            case 6:case 7:case 8:
                System.out.println("6, 7, 8й - это Лето ");
                break;

            case 9:case 10:case 11:
                System.out.println("9, 10, 11й - это Осень");
                break;

            default:
                System.out.println("В году только 12 месяцей ");
        }


    }

}
