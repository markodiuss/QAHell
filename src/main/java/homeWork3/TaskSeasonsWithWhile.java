package homeWork3;

import java.util.Scanner;

/**
 * Created by Markodius on 06.10.2016.
 * Дано число месяца (тип int). Необходимо определить время года (зима, весна, лето, осень) и вывести на консоль.
 * Решение через While
 */
public class TaskSeasonsWithWhile {

    public static void main(String[] args) {

        Scanner scMonth = new Scanner(System.in);

        System.out.println("Введите номер месяца и нажмите Enter: ");
        int monthNumber = scMonth.nextInt();

        while (monthNumber == 12 || monthNumber == 1 || monthNumber <= 2) {

            System.out.println("Время года - Зима");
            break;
        }

        while (monthNumber >= 3 && monthNumber <= 5) {

            System.out.println("Время года - Весна");
            break;
        }

        while (monthNumber >= 6 && monthNumber <= 8) {

            System.out.println("Время года - Лето");
            break;
        }

        while (monthNumber >= 9 && monthNumber <= 11) {

            System.out.println("Время года - Осень");
            break;
        }

        while (monthNumber < 1 || monthNumber > 12) {

            System.out.println("В году только 12 месяцей");
            break;
        }

    }

}
