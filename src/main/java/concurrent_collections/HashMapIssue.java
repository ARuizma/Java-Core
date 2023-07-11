package concurrent_collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class HashMapIssue extends Thread {

    static ConcurrentHashMap<String, String> courses2 = new ConcurrentHashMap<>();
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        courses2.put("Node", "4.1");
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

        HashMapIssue hashMapIssue = new HashMapIssue();
        hashMapIssue.start();
        courses2.put("Java", "21.0");
        courses2.put("Python", "3.10");
        courses2.put("AWS", "7.89");
        courses2.put("Docker", "5.12");

        Iterator<String> iterator2 = courses2.keySet().iterator();

        while(iterator2.hasNext()){
            Thread.sleep(2000);
            System.out.println(iterator2.next());
        }
        System.out.println(courses2);
    }
}
