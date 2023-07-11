package java8features.functionalinterface;

public class Test {

    public static void main(String[] args) {

        A a = () -> System.out.println("Inside My Method"   );
        a.myMethod();
    }
}
