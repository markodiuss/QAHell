package main.lesson2;

/**
 * Created by Vova_1 on 30.09.2016.
 */
public class SomeTypes {

    public static void main(String[] args) {


        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;

        float f = 3.4e+38f;
        double d = 3.4e+38f;

        //correct conversion 64>32>16>8
        l = i = s = b;

        //correct conversion 64>32;
        d = f;
        System.out.println("Bla bla = " + l);
        System.out.println("Bla bla = " + i);
        System.out.println("Bla bla = " + s);
        System.out.println("Bla bla = " + b);
        System.out.println("Bla bla = " + d);
        System.out.println("Bla bla = " + f);

        System.out.println("----------------------------");

        int i1 = 456543;
        long lo = i1;
        short s1 = (short) lo;

        System.out.println(s);

        char ch ='J';
        int intCh = (int) ch;

        System.out.println(" J corresponds with " +intCh);

    }
}
