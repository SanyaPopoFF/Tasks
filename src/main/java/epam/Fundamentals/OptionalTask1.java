//package epam.Fundamentals;
//
///*
//Задание. Ввести n чисел с консоли.
//1.Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
//2.Вывести числа в порядке возрастания (убывания) значений их длины.
//3.Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
//4.Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.
//5.Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.
//6.Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.
//7.Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
// */
//
//public class OptionalTask1 {
//
//    public static void main(String[] args) {
//        int [] values = getIntFromString(args);
//        int[] numOfChars = getMassiveOfCharsFromIntMassive(values);
//
//        bubbleSort(values);
//        bubbleSort(numOfChars);
//
//        System.out.println("Find Max Min values from Array");
//        System.out.println("max value = " + values[values.length - 1] + " num of chars " + numOfChars[numOfChars.length - 1]);
//        System.out.println("min value = " + values[0] + " num of chars " + numOfChars[0]);
//
//        System.out.println("");
//        System.out.println("Point 1");
//        System.out.println("Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.");
//        findMaxMinLenghtValue(args);
//    }
//
//    public void bubbleSort(int[] values) // sort form min to max
//    {
//        int tmp = 0;
//        for (int i = values.length; i > 0 ; i--)
//        {
//            for (int j = 0; j < values.length - 1 ; j++)
//            {
//                if(values[j] > values[j + 1 ])
//                {
//                    tmp = values[j +1 ];
//                    values[j + 1] = values[j];
//                    values[j] = tmp;
//                }
//            }
//
//        }
//    }
//
//    protected static int[]  getIntFromString(String[] args)
//    {
//        int[] values = new int[args.length];
//        for (int i = 0; i < args.length; i++)
//        {
//            values[i]  = Integer.valueOf(args[i]);
//
//        }
//        return values;
//    }
//}
