import java.util.Scanner;

public class Main
{

// Написать программу, которая принимает на вход две строки (a и b) и сравнивает их. В результате сравнения
// в консоль должно быть выведено одно из сообщений: "Строки неидентичны" или "Строки идентичны"

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in); // вводим сканер, читающий вводимые из консоли строки

        System.out.println("Введите строку a: ");
        String a = scanner.nextLine();
        System.out.println("Введите строку b: ");
        String b = scanner.nextLine();

        System.out.println("Итого мы имеем строку " + a + " и строку " + b + "\n");

        //теперь сравниваем строки
        if(a.equals(b)) {
            System.out.println("Строки идентивны");
        } else {
            System.out.println("Строки неидентивны");
        }
    }
}
