package 111;

public class Main
{

// Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10].
// Необходимо написать программу, которая выведет в консоль все чётные числа.

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //текущий массив целых чисел

        for (int i=0; i < array.length; i++)  //перебираем все числа массива по индексу
            if(array[i]%2==0){
                System.out.print(array[i] + " ");
            }
    }
}
