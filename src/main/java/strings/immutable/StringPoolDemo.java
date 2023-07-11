package strings.immutable;

public class StringPoolDemo {
    public static void main(String[] args) {
        User user = new User(1, "abc");

        User user2 = new User(2, "cdf");

        System.out.println(user);
        System.out.println(user2);

        String s1 = "fff";
        String s2 = "fff";

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
