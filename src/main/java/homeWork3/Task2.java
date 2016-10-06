package homeWork3;

import java.util.Scanner;

/**
 * Created by Markodius on 04.10.2016.
 * Даны 5 чисел (тип int). Вывести вначале наименьшее, а затем наибольшее из данных чисел.
 */
public class Task2 {

    public static void main(String[] args) {

        Scanner scTask = new Scanner(System.in);

        System.out.println("Решение через if - введите 1 и нажмите Enter, решение через While - введите 2 и нажмите Enter");
        int taskNumber = scTask.nextInt();

        if (taskNumber == 1) {

            System.out.println("Минимальное число = " +comprasionMinWithIf(4, 3, 2, 1, 5)+ " Максимальное число = "
                    +comprasionMaxWithIf(4, 3 , 2, 1, 5));

        } else if ( taskNumber == 2) {

            System.out.println("Минимальное число = " +comprasionMinWithWhile(50, 30, 40, 20, 10) + " Максимальное число = "
             +comprasionMaxWithWhile(50, 30, 40, 20, 10));
        } else {

            System.out.println("Попробуйте снова: ");
        }



    }

    public static int comprasionMinWithIf (int firstNumber, int secondNumber, int thirdNumber, int fourthNumber, int fifthNumber) {

        int minNumber = fifthNumber;

        if (secondNumber < minNumber && secondNumber < thirdNumber && secondNumber < fourthNumber && secondNumber < fifthNumber) {

            minNumber = secondNumber;

        } else if ( thirdNumber < minNumber && thirdNumber < fourthNumber && thirdNumber < fifthNumber) {

            minNumber = thirdNumber;

        } else if (fourthNumber < minNumber && fourthNumber < fifthNumber) {

            minNumber = fourthNumber;

        } else if (fifthNumber < minNumber) {

            minNumber = fifthNumber;
        }

        return minNumber;
    }

    public static int comprasionMaxWithIf (int firstNumber, int secondNumber, int thirdNumber, int fourthNumber, int fifthNumber) {

        int maxNumber = firstNumber;

        if (secondNumber > maxNumber && secondNumber > thirdNumber && secondNumber > fourthNumber && secondNumber > fifthNumber) {

            maxNumber = secondNumber;

        } else if ( thirdNumber > maxNumber && thirdNumber > fourthNumber && thirdNumber > fifthNumber) {

            maxNumber = thirdNumber;

        } else if (fourthNumber > maxNumber && fourthNumber > fifthNumber) {

            maxNumber = fourthNumber;

        } else if (fifthNumber > maxNumber) {

            maxNumber = fifthNumber;
        }

        return maxNumber;
    }

    public static int comprasionMinWithWhile (int firstNumber, int secondNumber, int thirdNumber, int fourthNumber, int fifthNumber) {

        int minNumber = firstNumber;

        while (secondNumber < minNumber && secondNumber < thirdNumber && secondNumber < fourthNumber && secondNumber < fifthNumber) {

            minNumber = secondNumber;
            break;
        }

        while (thirdNumber < minNumber && thirdNumber < fourthNumber && thirdNumber < fifthNumber) {

            minNumber = thirdNumber;
            break;
        }

        while (fourthNumber < minNumber && fourthNumber < fifthNumber) {

            minNumber = fourthNumber;
            break;
        }

        while (fifthNumber < minNumber) {

            minNumber = fifthNumber;
            break;
        }

        return minNumber;
    }

    public static int comprasionMaxWithWhile (int firstNumber, int secondNumber, int thirdNumber, int fourthNumber, int fifthNumber) {

        int maxNumber = firstNumber;

        while (secondNumber > maxNumber && secondNumber > thirdNumber && secondNumber > fourthNumber && secondNumber > fifthNumber) {

            maxNumber = secondNumber;
            break;
        }

        while (thirdNumber > maxNumber && thirdNumber > fourthNumber && thirdNumber > fifthNumber) {

            maxNumber = thirdNumber;
            break;
        }

        while (fourthNumber > maxNumber && fourthNumber > fifthNumber) {

            maxNumber = fourthNumber;
            break;
        }

        while (fifthNumber > maxNumber) {

            maxNumber = fifthNumber;
            break;
        }

        return maxNumber;
    }
}
