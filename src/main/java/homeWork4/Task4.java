package homeWork4;

/**
 * Created by Markodius on 20.10.2016.
 * Поменять наибольший и наименьший элементы массива местами. Пример: дан массив {4, -5, 0, 6, 8}.  После замены будет выглядеть {4, 8, 0, 6, -5}.
 */
public class Task4 {

    public static void main(String[] args) {

        int [] myArray = {4, -5, 0, 6, 8};
        int maxElement = myArray[0];
        int minElement = myArray[0];

        System.out.print("Before sort: ");

        for (int i = 0; i < myArray.length; i++) {

            if (maxElement > myArray[i]) {

                maxElement = myArray[i];

            }

            if (minElement < myArray[i]) {

                minElement = myArray[i];

            }

            System.out.print(myArray[i]+ " ");

        }

        System.out.println();

        for (int i = 0; i < myArray.length; i++) {

            if (myArray[i] == maxElement) {

                myArray[i] = minElement;

            } else

            if (myArray[i] == minElement) {

                myArray[i] = maxElement;

            }

        }

        System.out.print("After sort: ");

        for (int i = 0; i < myArray.length; i++) {

            System.out.print(myArray[i] + " ");

        }

        System.out.println();


    }

}
