package pack1;

import java.util.Scanner;

public class ArraySearch {
    public static void arraySearch(int[] sortedArray) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите произвольное число для поиска в массиве: ");

        int number = sc.nextInt();

        for (int inx = 0; inx < sortedArray.length - 1; inx++) {
            if (number == sortedArray[inx]) {
                System.out.println("Индекс числа в массиве: " + inx);
            }
        }
    }
    public static void arrayBinSearch(int[] sortedArray) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите произвольное число для поиска в массиве алгоритмом бинарного поиска ");
        int num = sc.nextInt();
        int firstIndex = 0;
        int lastIndex = sortedArray.length - 1;
        int index = -1;

        while (firstIndex <= lastIndex) {
            int mid = (firstIndex + lastIndex) / 2;
            if (sortedArray[mid] < num) {
                firstIndex = mid + 1;
            } else if (sortedArray[mid] > num) {
                lastIndex = mid - 1;
            } else if (sortedArray[mid] == num) {
                index = mid;
                break;
            }
        }
        if (index == -1) {
            for (int inx = 0; inx < sortedArray.length - 1; inx++) {
                if (num > sortedArray[inx] & num < sortedArray[inx + 1]) {
                    index = inx + 1;
                }
            }
        }
        System.out.println("Индекс числа в массиве: " + index);
    }
}