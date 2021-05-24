package epam.Fundamentals;

import java.util.Arrays;
import java.util.Scanner;

/*
Задание. Ввести n чисел с консоли.
1.Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
2.Вывести числа в порядке возрастания (убывания) значений их длины.
3.Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
4.Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.
5.Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.
6.Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.
7.Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
 */

public class OptionalTask1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String line = scan.nextLine();
            int longNum ;
            int shortNum ;
            for (int s : line.split()) {
                if (s.length() > longNum.length()) longNum = s;
                if (s.length() < shortNum.length()) shortNum = s;
            }
            System.out.println("Самое длинное слово: '" + longNum + "'");
            System.out.println("Длина: " + longNum.length());
            System.out.println("Самое короткое слово: '" + shortNum + "'");
            System.out.println("Длина: " + shortNum.length());
        }
    }
