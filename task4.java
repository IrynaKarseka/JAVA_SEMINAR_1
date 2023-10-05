// 📌 Дан массив nums = [3,2,2,3] и число val = 3.
// 📌 Если в массиве есть числа, равные заданному, нужно перенести
// эти элементы в конец массива.
// 📌 Таким образом, первые несколько (или все) элементов массива
// должны быть отличны от заданного, а остальные - равны ему.

import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 2, 2, 3, 1, 2, 3 };
        swapNamber(arr);

        // printArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void swapNamber(int[] arr) {
        int val = 3;
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] == val) {
                arr[i] = arr[j];
                arr[j] = val;
                j--;
            } else {
                i++;
            }
        }
    }

    private static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}