package epam.Fundamentals;

import java.util.*;
import java.util.Scanner;

/*
Задание: Ввести с консоли n - размерность матрицы a [n] [n].
Задать значения элементов матрицы в интервале значений от -M до M с помощью генератора случайных чисел (класс Random).

1.Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).
 */

public class OptionalTask2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размерность матрицы:");

        int MatrixSize = in.nextInt();
        int[][] matrix = new int[MatrixSize][MatrixSize];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int random_number = (int) (Math.random()*(18+1)) - 9;

                matrix [i][j] = random_number;
            }
        }

        //Сортировка
        for (int i = 0; i < matrix.length; i++) Arrays.sort(matrix[i]);
        
        //Вывод
        for (int i = 0; i < MatrixSize; i++) {
            for (int j = 0; j < MatrixSize; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
