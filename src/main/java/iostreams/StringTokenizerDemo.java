package iostreams;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        String s = "You,are,things,or,not";
        StringTokenizer st = new StringTokenizer(s, ",", true);

        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }


    }
}
