package abstraction;

public class Test {

    public static void main(String[] args) {
        DellNotebook dn = new DellNotebook();

        dn.click();
        dn.scroll();

        HPNotebook hn = new HPNotebook();

        hn.click();
        hn.scroll();
    }
}
