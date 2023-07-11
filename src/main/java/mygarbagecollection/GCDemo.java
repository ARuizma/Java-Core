package mygarbagecollection;

public class GCDemo {

    int objID;

    GCDemo(int objID){
        this.objID = objID;
        System.out.println("Created" + this.objID);
    }
    public static void main(String[] args) {
        new GCDemo(1);
        new GCDemo(2);
        for (int i = 0; i <= 100 ; i++) {
            System.gc();
        }
    }

    @Override
    protected void finalize(){
        System.out.println("finalized" + objID);
    }
}
