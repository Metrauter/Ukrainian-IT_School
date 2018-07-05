package homeworks.lesson5.task15;

import java.util.Arrays;

import static homeworks.lesson5.task15.BubbleSorter.sort;


public class BubbleSorterTest {
    public static void main(String[] args) {
        int[][] data = {
                {},
                {1},
                {7, 4, 1, 2, 9},
        };
        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + " => ");
            sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}
