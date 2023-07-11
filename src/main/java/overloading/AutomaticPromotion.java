package overloading;

public class AutomaticPromotion {

    public void print(long i){
        System.out.println("Int Vers "+i);
    }

    public void print (float f){
        System.out.println("Float Vers "+f);
    }

//    public void print(String s){
//        System.out.println("String version "+s);
//    }

    public void print(Object z){
        System.out.println("Object version "+z);
    }

    public static void main(String[] args) {
        AutomaticPromotion ap = new AutomaticPromotion();
        ap.print(123);
        ap.print(10f);
        ap.print("Hello");
    }
}
