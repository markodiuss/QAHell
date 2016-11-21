package homeWork4;

/**
 * Created by Markodius on 20.10.2016.
 */
public class Task3 {

    public static void main(String[] args) {

        int [] myArray = {25, 52, 5, 5, 52};
        int temp = myArray[0];



        for (int i = 0; i < myArray.length; i++) {

            if (myArray[i] > temp) {

                temp = myArray[i];

            }


        }

        for (int i = 0; i < myArray.length; i++) {

            if (myArray[i] == temp) {

                System.out.println("Min element('s) = " +temp);

            }

        }

    }

}
