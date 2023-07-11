package org.example;

public class Grading {

    public void GradeNotes(int maths, int chemistry, int physics){

        int sum = (maths + physics + chemistry)/3;

        if(maths < 35 || physics < 35 || chemistry < 35){
            System.out.println("Result is failed");
        } else if (sum <= 59) {
            System.out.println("Result is C");
        } else if (sum <= 69) {
            System.out.println("Result is B");
        } else {
            System.out.println("Result is A");
        }
    }

    public static void main(String[] args) {

      new Grading().GradeNotes(90,80,50);

    }
}
