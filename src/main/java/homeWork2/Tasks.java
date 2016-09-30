package homeWork2;

import java.util.Scanner;

/**
 * Created by Markodius on 30.09.2016.
 */
public class Tasks {

    public static void main(String[] args) {

        Scanner scanInt = new Scanner(System.in);

        System.out.println("Please enter number from, keyboard");
        int firstVariable = scanInt.nextInt();
        int secondVariable = scanInt.nextInt();

        // код для вычесления результата деления с остатком
        int wholeNumber = firstVariable/secondVariable;
        int remainderNumber = firstVariable%secondVariable;
        System.out.println("Результат деления: " +wholeNumber+ " целое число, и " +remainderNumber+ " остача");

    }

}
