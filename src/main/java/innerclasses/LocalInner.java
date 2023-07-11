package innerclasses;

public class LocalInner {

    void f1(){
        System.out.println("Inside outers f1()");
        class LocalInner2{
            void f2(){
                System.out.println("Inside LocalInners f2()");
            }
        }
        LocalInner2 inner = new LocalInner2();
        inner.f2();
    }
    public static void main(String[] args) {

        LocalInner localInner = new LocalInner();
        localInner.f1();

    }
}
