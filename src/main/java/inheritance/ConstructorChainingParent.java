package inheritance;

public class ConstructorChainingParent {

    int x;

    public ConstructorChainingParent(){
        System.out.println("No Arg Constructor");
    }

    public ConstructorChainingParent(int x){
        this();
        this.x=x;
        System.out.println("One Arg Constructor");
    }
}
