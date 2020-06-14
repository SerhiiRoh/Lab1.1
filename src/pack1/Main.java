package pack1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите число элементов массива: ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] numberArray = new int[length];
        System.out.println("Введите " + length + " чисел");

        for (int i = 0; i < length; i++) {
            numberArray[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(numberArray));

        BubbleSort bs = new BubbleSort();
        int[] sortedArray = bs.bubbleSort(numberArray);
        System.out.println(Arrays.toString(sortedArray));

        ArraySearch as = new ArraySearch();
        as.arraySearch(sortedArray);
        as.arrayBinSearch(sortedArray);

        System.out.println("Введите число строк для вставки в массив: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int lengthstr = sc.nextInt();

        String[] strArray = new String[lengthstr];
        System.out.println("Введите " + lengthstr + " произвольных слова/строки");

        for (int i = 0; i < lengthstr; i++) {
            strArray[i] = reader.readLine();
        }
        System.out.println(Arrays.toString(strArray));
        Arrays.sort(strArray);
        System.out.println(Arrays.toString(strArray));
    }

}