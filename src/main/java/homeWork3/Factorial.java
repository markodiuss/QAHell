package homeWork3;

import java.util.Scanner;

/**
 * Created by Markodius on 06.10.2016.
 * Дано число n при помощи цикла for посчитать факториал n!
 */
public class Factorial {

    public static void main(String[] args) {

        Scanner scFact = new Scanner(System.in);
        int factNumber = scFact.nextInt();
        int factRes = 1;

        for (int i = 1; i <= factNumber; i++) {

            factRes = factRes * i;
        }
        System.out.println("I = " +factRes);
    }

}
