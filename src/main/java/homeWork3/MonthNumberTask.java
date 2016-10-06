package homeWork3;

import java.util.Scanner;

/**
 * Created by Markodius on 06.10.2016.
 * Написать программу: вводите в консоль название месяца на английском языке, а в ответ выводит числовое значение месяца.
 */
public class MonthNumberTask {

    public static void main(String[] args) {

        Scanner scName = new Scanner(System.in);
        System.out.println("Введите название месяца на кирилице и нажмите Enter: ");
        String monthName = scName.nextLine();

        switch (monthName){

            case "Январь":
                System.out.println("Номер месяца Январь - 1");
                break;
            case "Февраль":
                System.out.println("Номер месяца Февраль - 2");
                break;
            case "Март":
                System.out.println("Номер месяца Март - 3");
                break;
            case "Апрель":
                System.out.println("Номер месяца Апрель - 4");
                break;
            case "Май":
                System.out.println("Номер месяца Май - 5");
                break;
            case "Июнь":
                System.out.println("Номер месяца Июнь - 6");
                break;
            case "Июль":
                System.out.println("Номер месяца Июль - 7");
                break;
            case "Август":
                System.out.println("Номер месяца Август - 8");
                break;
            case "Сентябрь":
                System.out.println("Номер месяца Сентябрь - 9");
                break;
            case "Октябрь":
                System.out.println("Номер месяца Октябрь - 10");
                break;
            case "Ноябрь":
                System.out.println("Номер месяца Ноябрь - 11");
                break;
            case "Декабрь":
                System.out.println("Номер месяца Декабрь - 12");
                break;
            default:
                System.out.println("Такого месяца - НЕТ!!!!1111");
        }


    }

}
