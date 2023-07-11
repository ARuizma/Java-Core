package concurrent_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListIssue extends Thread {

    static CopyOnWriteArrayList<String> courses2 = new CopyOnWriteArrayList<>();
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        courses2.add("Node");
    }

    public static void main(String[] args) throws InterruptedException {
//        ArrayList<String> courses = new ArrayList<String>();
//        courses.add("Java");
//        courses.add("Python");
//        courses.add("AWS");
//        courses.add("Docker");
//
//        Iterator<String> iterator = courses.iterator();
//
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//            courses.add("Node");
//        }

        ArrayListIssue arrayListIssue = new ArrayListIssue();
        arrayListIssue.start();
        courses2.add("Java");
        courses2.add("Python");
        courses2.add("AWS");
        courses2.add("Docker");

        Iterator<String> iterator2 = courses2.iterator();

        while(iterator2.hasNext()){
            Thread.sleep(2000);
            System.out.println(iterator2.next());
        }
        System.out.println(courses2);
    }
}
