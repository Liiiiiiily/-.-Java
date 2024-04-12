package 111;
import java.util.Scanner;

public class Main
{

// Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
//- сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов: "a > b", "a < b" или "a = b";
//- совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // вводим сканер, читающий вводимые из консоли числа

        System.out.print("Введите число a: "); // по одному вводим числа
        int a = in.nextInt();
        System.out.print("Введите число b: ");
        int b = in.nextInt();
        System.out.println("Число a = " + a + "\n" + "Число b = " + b + "\n" + "\nПроизводим математическую магию..." + "\n"); // уведомление о введённых числах

        if(a>b) { // проверяем равенства и выводим только подходящее нашим a и b
            System.out.print("a > b");
        } else if(a<b) {
            System.out.print("a < b");
        } else {
            System.out.print("a = b");
        }

        // далее определяем сумму, произведение и по два вида разностей и делений с опорой на бОльшее число
        int sum=a+b;
        int sub1=a-b;
        int sub2=b-a;
        int multi=a*b;
        int div1=a/b;
        int div2=b/a;

        System.out.println("\n"+ "Сумма чисел: " + sum + "\n"+ "Произведение чисел: " + multi);
        if(a>b || a==b) {
            System.out.print("Разность чисел: " + sub1 + "\n" + "Результат деления чисел: " + div1);
        } else {
            System.out.print("Разность чисел: " + sub2 + "\n" + "Результат деления чисел: " + div2);
        }

    }
}