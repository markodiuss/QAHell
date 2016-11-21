package homeWork4;

/**
 * Created by Markodius on 20.10.2016.
 * Создайте массив, содержащий 10 первых нечетных чисел. Выведете элементы массива на консоль в одну строку, разделяя запятой.
 */
public class Task1 {

    public static void main(String[] args) {

        int [] myArray = new int[10];

        for (int i = 0; i < myArray.length; i++) {



                myArray[i] = 2*i + 1;


            System.out.print(myArray[i] + " , ");

        }
        System.out.println();

    }

}
