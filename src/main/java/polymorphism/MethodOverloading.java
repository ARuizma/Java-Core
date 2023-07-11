package polymorphism;

public class MethodOverloading {

    void add (int a, int b){
        int result = a+b;

        System.out.println(result);
    }

    void add(float a, float b){
        float result = a+b;
        System.out.println(result);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

        obj.add(2,3);
        obj.add(2f,2f);
    }
}
