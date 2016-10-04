package main.lesson3;

import java.util.Scanner;

/**
 * Created by Vova_1 on 03.10.2016.
 */
public class SwithCaseExample {

    public static void main(String[] args) {

        Scanner scNumber = new Scanner(System.in);

        System.out.println("Enter number: ");
        int examNumber = scNumber.nextInt();

        switch (examNumber) {

            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Субота");
                break;
            case 7:
                System.out.println("Воскресение");
                break;

            default:
                System.out.println("HAHA");

        }


    }

}
