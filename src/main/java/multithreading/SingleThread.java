package multithreading;

public class SingleThread {

    public static void main(String[] args) {

        SingleThread st = new SingleThread();
        st.printNumbers();

        for(int j = 1; j<=200; j++){
            System.out.println("j: " + j + "\t");
        }

    }

    void printNumbers(){
        for(int i = 1; i<=200; i++){
            System.out.println("i: " + i + "\t");
        }
    }
}
