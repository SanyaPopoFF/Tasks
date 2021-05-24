package epam.Fundamentals;

import java.util.Scanner;

/*
Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
 */
public class MainTask4 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        for (int i = 0; true; i++) {
            int x = vvod.nextInt();
            int y = vvod.nextInt();

            System.out.println("Сумма = " + (x + y));
            System.out.println("Произведение = " + (x * y));
        }
    }
}
