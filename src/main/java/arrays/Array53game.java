package arrays;

import java.util.Arrays;

public class Array53game {

    public static void main(String[] args) {

        int[] arr = {2,3,8,5,3,5,5};
        int[] arr2 = new int[arr.length];

        boolean mod = false;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]==3){
                arr2[i] = arr[i];
                mod = true;
            } else if(arr[i]==5 && mod){
                arr2[i] = 0;
                mod = false;
            } else {
                arr2[i] = arr[i];
                mod = false;
            }

        }
        System.out.println(Arrays.toString(arr2));

    }

}
