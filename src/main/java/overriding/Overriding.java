package overriding;

public class Overriding {

    public static void main(String[] args) {
        Parent pt = new Parent();
        pt.doSomething();
        Child ch = new Child();
        ch.doSomething();
        System.out.println(pt.s);
        System.out.println(ch.s);

        Parent ch2 = new Child();
        System.out.println(ch2.s);
    }
}
