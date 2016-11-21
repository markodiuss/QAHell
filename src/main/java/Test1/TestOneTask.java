package Test1;

import java.util.Scanner;

/**
 * Created by Markodius on 21.10.2016.
 * С консоли вводится математичское выражени любой длины типа String, написать программу которая вычситает
 * результат этого выражения с учетом всех математических правил.
 */
public class TestOneTask {

    public static void main(String[] args) {

        Scanner scString = new Scanner(System.in);

        String calcString = scString.nextLine();

        System.out.println(calcChars(calcString));

    }

    public static String calcChars(String calcString) {

        String result = "";
        int tmpInt = 0;
        int size = calcString.length();
        int tempShift = 2;

        String arrayString = calcString.replace(" ","");
        System.out.println(arrayString);
        char [] charArray = arrayString.toCharArray();
        char tmpChar = charArray[0];

        for (int i = 0; i < charArray.length; i++) {

            if (charArray[i] == '*') {

                tmpInt = Character.getNumericValue(charArray[i - 1]) *
                        Character.getNumericValue(charArray[i + 1]);


                for (i = 0; i < tempShift; ++i) {

                    int tmpFirstElement = charArray[0];


                }

                break;

            }


            result = Integer.toString(tmpInt);

        }

        System.out.println(charArray);


        return result;
    }

}
