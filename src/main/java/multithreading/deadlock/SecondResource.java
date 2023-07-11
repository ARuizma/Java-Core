package multithreading.deadlock;

public class SecondResource {

    public synchronized void method1(FirstResource fr){
        System.out.println("Inside metho1 of SR");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Invoking method2 of FR");
        fr.method2();

    }
    public synchronized void method2(){
        System.out.println("Inside mtehod2 of SR");
    }
}
