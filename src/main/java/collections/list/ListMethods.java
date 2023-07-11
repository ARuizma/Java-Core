package collections.list;

        import java.util.ArrayList;
        import java.util.List;

public class ListMethods {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 10; i<=100; i = i+10){
            list.add(i);
        }
        System.out.println("List "+ list);

        list.add(2, 123);

        System.out.println(list);

        list.set(3, 123);

        System.out.println(list);

        List<Integer> secondList = new ArrayList<>();
        secondList.add(111);
        secondList.add(222);
        secondList.add(444);
        System.out.println(secondList);

        list.addAll(4, secondList);

        System.out.println(list);

        if(list.contains(222)){
            System.out.println("List has value");
        }

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        list.remove(7);

    }

}
