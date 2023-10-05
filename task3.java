// 📌 Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
// максимальное количество подряд идущих 1.

public class task3  {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 1, 0, 0, 1, 0, 1, 1, 1 };

        System.out.println(getMaxCount(arr));
    }

    private static int getMaxCount(int[] arr) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                // maxCount = count > maxCount ? count : maxCount;
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        return count > maxCount ? count : maxCount;
    }
}