package java8features.predicate;
import java.util.function.Predicate;

public class PredictateJoins {

    public static void main(String[] args) {


        int[] x = {0, 10, 20, 30, 40, 50, 60, 70, 73};

        Predicate<Integer> p1 = i -> i > 10;
        System.out.println("Greater thatn 10:");
        method1(p1,x);
    }

    static void method1(Predicate<Integer>p, int[] x){
        for (int eachValue : x) {
            if(p.test(eachValue)){
                System.out.println(eachValue);
            }
            
        }
    }
}
