package exceptionhandling;

public class ArrayIndexOOB {

    public static void main(String[] args) {
        int[] arr = {10,20,30};
        System.out.println("Elements of the array are: ");
        for(int i = 0; i <=arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

    void method1(){
        System.out.println("Method1");
    }
}
