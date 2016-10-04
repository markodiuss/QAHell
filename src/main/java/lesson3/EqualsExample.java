package main.lesson3;

/**
 * Created by Vova_1 on 03.10.2016.
 */
public class EqualsExample {

    public static void main(String[] args) {

        String str1 = new String("hello");
        String str2 = new String("hello");
        String nameStr = str1;

        boolean b1 = str1 == str2;
        boolean b2 = str1.equals(str2);
        boolean b3 = str1 == nameStr;



    }

}
