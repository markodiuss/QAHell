package homeWork2;

import java.util.Scanner;

/**
 * Created by Markodius on 30.09.2016.
 */
public class ConvertVariables {

    public static void main(String[] args) {

        Scanner scanVar = new Scanner(System.in);

        System.out.println("Please enter your variable's");
        // reading number from keyboard
        int intVariable = scanVar.nextInt();
        float floatVariable = scanVar.nextFloat();
        float floatVariableToInt = scanVar.nextFloat();

        // convert int to char
        char charVariable = (char)intVariable;
        System.out.println(charVariable);

        // convert float to char
        char charVariableF = (char)floatVariable;
        System.out.println(charVariableF);

        //code for convert float -> char -> int
        char charVariableToInt = (char)floatVariableToInt;
        int intVarFromChar = (int)charVariableToInt;
        System.out.println(intVarFromChar);


    }

}
