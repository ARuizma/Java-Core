package arrays;

import java.util.Arrays;

public class BullshitArrayQuestion {
    public static void main(String[] args) {
        int[] arr1 = {7,0,8,0,5};
        int[] arr2 = new int[5];

        int count = 0;

        for (int j : arr1) {
            if (j != 0) {
                arr2[count++] = j;
            }
        }

        System.out.println(Arrays.toString(arr2));


    }
}
