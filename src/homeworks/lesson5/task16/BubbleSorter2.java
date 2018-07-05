package homeworks.lesson5.task16;

public class BubbleSorter2 {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean isBreak = true;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] < array[j]) {
                    isBreak = false;
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
            if (isBreak) break;
        }
    }
}