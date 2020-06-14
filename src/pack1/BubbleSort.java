package pack1;


public class BubbleSort {
    public static int[] bubbleSort(int[] numberArray) {
        System.out.println("Сортировка массива 'пузырьком': ");
        boolean isSorted = false;

        while(!isSorted) {
            isSorted = true;

            for(int inx = 0; inx < numberArray.length - 1; ++inx) {
                if (numberArray[inx] > numberArray[inx + 1]) {
                    isSorted = false;
                    int tmp = numberArray[inx];
                    numberArray[inx] = numberArray[inx + 1];
                    numberArray[inx + 1] = tmp;
                }
            }
        }

        return numberArray;
    }

}
