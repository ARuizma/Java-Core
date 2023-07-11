package innerclasses;

import org.example.NonStatic;

public class NonStaticInner {

    private static int x = 50;
    private int y;

    NonStaticInner(int y){
        this.y = y;
    }

    void f1(){
        System.out.println("Outer classes non static method");
    }

    class Inner{
        private int y;

        Inner(int y){
            this.y = y;
        }
       private void f2(){
            System.out.println("Outer classes x " + NonStaticInner.x);
            System.out.println("Outer classes y " + NonStaticInner.this.y);
           System.out.println("Inner classes y " + this.y);
        }
    }

    public static void main(String[] args) {

        NonStaticInner outer = new NonStaticInner(80);
        outer.f1();

        NonStaticInner.Inner inner = outer.new Inner(30);

        inner.f2();
        System.out.println(inner.y);
        }
}
