package main.lesson3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vova_1 on 03.10.2016.
 */
public class ListExample {

    public static void main(String[] args) {

        List<String> names = new ArrayList<String>();
        names.add("Petya");
        names.add("Kolya");

        for (String name: names) {

            System.out.println(name);

        }

    }

}
