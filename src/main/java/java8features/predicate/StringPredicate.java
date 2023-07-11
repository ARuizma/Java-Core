package java8features.predicate;

import java.util.function.Predicate;

public class StringPredicate {
    public static void main(String[] args) {
        Predicate<String> s = i -> (i.length()>5);

        System.out.println(s.test("asdfgasdfg"));
        System.out.println(s.test("aaa"));
    }
}
