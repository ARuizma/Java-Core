package innerclasses;

public class StaticInnerOuter {

    static void f1(){
        System.out.println("Outers static method");
    }
    static class Inner {

        static void f2() {
            System.out.println("Inners static method");
        }

        void f3() {
            System.out.println("Non Static method inside the inner class");
        }
    }

    public static void main(String[] args) {
        StaticInnerOuter.f1();
        StaticInnerOuter.Inner.f2();

        StaticInnerOuter.Inner inner = new StaticInnerOuter.Inner();

        inner.f3();
    }

}
