package org.example;

public class Prime {

    public static void main(String[] args) {

        String input = args[0];
        int num = Integer.parseInt(input);
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println("Prime No");
        else
            System.out.println("Not a prime No");
    }
}