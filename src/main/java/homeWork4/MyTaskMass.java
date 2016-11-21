package homeWork4;

import java.util.Random;

/**
 * Created by Markodius on 21.10.2016.
 */
public class MyTaskMass {

    static void shifting(int[] _mas, int _temp){

        for(int i = 0; i < _temp; ++i){                             //сдвигаем заданное количество элементов
            int val = _mas[0];                                  //сохраняем первый элемент
            _mas[0] = _mas[_mas.length - 1];                    //первый равен последнему
            for(int j = 0; j < _mas.length - 1; ++j){
                int _val = _mas[j + 1];                         //сохраняем второй
                _mas[j + 1] = val;                              //второй равен первому
                val = _val;                                     //сохраняем значение второго
                //продолжаем сдвигать
            }
        }
    }

    static void show(int[] _mas, String str){                   //функция (метод) вывода массива на консоль
        //тут все понятно
        System.out.print(str + ": ");
        for(int x : _mas)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int size = 10;                                  //размер массива
        int temp = 2;                                   //на сколько сдвигаем

        Random generator = new Random();                //для генерации случайных чисел

        int[] mas = new int[size];                      //объявляем массив
        for(int i = 0; i < mas.length; ++i)
            mas[i] = generator.nextInt(size);           //инициализируем его

        show(mas, "Before");                            //вызываем функцию вывода массива

        shifting(mas, temp);                            //вызываем функцию циклического сдвига массива

        show(mas, "After");                             //вызываем функцию вывода массива
    }


}
