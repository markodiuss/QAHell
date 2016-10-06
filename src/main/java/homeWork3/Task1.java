package homeWork3;

import java.util.Scanner;

/**
 * Created by Markodius on 04.10.2016.
 */
public class Task1 {

    public static void main(String[] args) {

        Scanner scanInt = new Scanner(System.in);

        System.out.println("Если нужно решение через if введите - 1, если нужно решение через while введите - 2 ");
        int task = scanInt.nextInt();



        if (task == 1) {

            System.out.println("Минимально число = " +comparison(4,3,1,4)+ "" +
                    " Сумма максимальных чисел = " +sumFromComparisonWithIf(4,3,1,4));

        } else if (task == 2) {

            System.out.println("Минимально число = " +comparisonWithWhile(1,2,3,4)+
                    " Сумма максимальных чисел = " +sumFromComparisonWithWhile(1,2,3,4));

        } else if ( task > 2) {

            System.out.println("Error, Please Try again later");
        }



    }

    public static int comparison(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {


        int min = firstNumber;

        if (secondNumber <= min && secondNumber <= thirdNumber && secondNumber <= fourthNumber) {

            min = secondNumber;

        } else if (thirdNumber <= min && thirdNumber <= fourthNumber) {

            min = thirdNumber;

        } else if (fourthNumber <= min) {

            min = fourthNumber;
        }

        return min;
    }

    public static int comparisonWithWhile (int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {

        int min = firstNumber;

        while (secondNumber < min && secondNumber < thirdNumber && secondNumber < fourthNumber) {

            min = secondNumber;
        }

        while (thirdNumber < min && thirdNumber < fourthNumber) {

            min = thirdNumber;
        }

        while (fourthNumber < min) {

            min = fourthNumber;
        }

        return min;

    }

    public static int sumFromComparisonWithIf (int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {

        int min = firstNumber;
        int sum = 0;



        if (secondNumber <= min && secondNumber <= thirdNumber && secondNumber <= fourthNumber) {

            sum = firstNumber + thirdNumber + fourthNumber;

        } else if (thirdNumber <= min && thirdNumber <= fourthNumber) {

            sum = firstNumber + secondNumber + fourthNumber;

        } else if (fourthNumber <= min) {

            sum = firstNumber + secondNumber + fourthNumber;

        } else if (min < secondNumber && min < thirdNumber && min < fourthNumber) {

            sum = secondNumber + thirdNumber + fourthNumber;
        }


        return sum;
    }

    public static int sumFromComparisonWithWhile (int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {

        int min = firstNumber;
        int sum = 0;

        while (secondNumber < min && secondNumber < thirdNumber && secondNumber < fourthNumber) {

            sum = firstNumber + thirdNumber + fourthNumber;
            break;
        }

        while (thirdNumber < min && thirdNumber < fourthNumber) {

            sum = firstNumber + secondNumber + fourthNumber;
            break;
        }

        while (fourthNumber < min) {

            sum = firstNumber + secondNumber + thirdNumber;
            break;
        }

        while (firstNumber < secondNumber && firstNumber < thirdNumber && firstNumber < fourthNumber) {

            sum = secondNumber + thirdNumber + fourthNumber;
            break;
        }

        return sum;
    }

}
