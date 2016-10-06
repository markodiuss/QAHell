package homeWork3;

/**
 * Created by Markodius on 06.10.2016.
 * Вывести на экран (с помощью циклов) таблицу умножения 10*10
 */
public class MultiplicationTable {

    public static void main(String[] args) {

        int i = 1, j = 1;

        while (i <= 10) {

            j = 1;

            while (j <= 10) {

                System.out.print((i * j) + " ");
                j++;
            }

            System.out.println("");
            i++;
        }

    }

}
