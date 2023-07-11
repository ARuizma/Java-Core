package inheritance;

public class ConstructorChainingChild extends ConstructorChainingParent{

    ConstructorChainingChild(){
        this(10);
        System.out.println("No Arg Child Constructor");
    }

    ConstructorChainingChild(int x){
        super(x);
        System.out.println("Arg Child Constructor");
    }

    public static void main(String[] args) {
        ConstructorChainingChild c = new ConstructorChainingChild();
    }
}
