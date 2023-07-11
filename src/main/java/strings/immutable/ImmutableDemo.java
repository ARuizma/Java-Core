package strings.immutable;

public class ImmutableDemo {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "World";

        System.out.println(s1+"asdf"+s2);

        s1 = s1.concat(s2);

        System.out.println(s1 + "asdf"+s2);
    }
}
