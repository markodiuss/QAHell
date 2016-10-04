package lesson3;

/**
 * Created by Vova_1 on 03.10.2016.
 */
public class BreakExample {

    public static void main(String[] args) {

        for (int i = 1; i <=10; i++) {

            if (i == 5) {

                break;

            }
            System.out.println(i+ "");
        }
        System.out.println("End");
    }

}
