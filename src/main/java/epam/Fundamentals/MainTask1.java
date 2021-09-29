package epam.Fundamentals;

import java.util.Scanner;
/*
Приветствовать любого пользователя при вводе его имени через командную строку.
 */

public class MainTask1 {
    public static void main(String[] args) {
        System.out.print("Введите имя:");
        Scanner enterName = new Scanner(System.in);
        System.out.println("Привет " + enterName.nextLine());
    }
}
