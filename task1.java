// 📌 Написать программу, которая запросит пользователя ввести
// <Имя> в консоли.
// 📌 Получит введенную строку и выведет в консоль сообщение
// “Привет, <Имя>!”

import java.util.Scanner;

public class task1 {

    public static void main (String [] args) {
        System.out.println("Введите имя");
        Scanner scanner = new Scanner(System.in,"ibm866");
        String name = scanner.nextLine();
        System.out.println("Привет," + " " + name + "!");
        scanner.close();
    }
}
