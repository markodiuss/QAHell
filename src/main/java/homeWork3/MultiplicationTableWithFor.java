package homeWork3;

/**
 * Created by Markodius on 06.10.2016.
 * Вывести на экран (с помощью циклов) таблицу умножения 10*10
 */
public class MultiplicationTableWithFor {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {

                System.out.print((i * j)+ " ");
            }
            System.out.println("");
        }

    }

}
