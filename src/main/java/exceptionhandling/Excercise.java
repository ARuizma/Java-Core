package exceptionhandling;

public class Excercise {

    public static void main(String[] args){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new MyThreadException("This is my own exception");
        }
    }

}
