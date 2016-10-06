package homeWork3;

import java.util.Scanner;

/**
 * Created by Markodius on 06.10.2016.
 * Даны имена 2х человек (тип String). Если имена равны, то вывести сообщение о том, что люди являются тезками
 */
public class Task3 {

    public static void main(String[] args) {

        Scanner scNames = new Scanner(System.in);
        Scanner scTask = new Scanner(System.in);

        System.out.println("Сравнение имен через if - введите 1 и нажмите Enter, сравнение имен через While - введите 2 и нажмите Enter:");
        int taskNumber = scTask.nextInt();



        if (taskNumber == 1) {

            System.out.println("Введите имена: ");
            String firstName = scNames.nextLine();
            String secondName = scNames.nextLine();

            System.out.println(firstName+" и "+secondName+comprasionNamesWithIf(firstName, secondName));

        } else if (taskNumber == 2) {

            System.out.println("Введите имена: ");
            String firstName = scNames.nextLine();
            String secondName = scNames.nextLine();

            System.out.println(firstName+ " и "+secondName+comporasionNamesWithWhile(firstName, secondName));

        } else {

            System.out.println("Error, try again");
        }

    }

    public static String comprasionNamesWithIf (String firstName, String secondName) {


        String answer = "";

        if (firstName.equalsIgnoreCase(secondName)) {

            answer = " Это тезки!";
        } else {

            answer = " Не тезки";
        }

        return answer;
    }

    public static String comporasionNamesWithWhile (String firstName, String secondName) {

        String answer = " Не тезки";

        while (firstName.equalsIgnoreCase(secondName)) {

            answer = " Это тезки!";
            break;
        }

        return answer;
    }

}
