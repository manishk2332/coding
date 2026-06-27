import java.util.ArrayList;

public class Arraylist{
    public static void main(String args[]){
        // java collection framework
        // className objectName= new className();
        ArrayList<Integer> list = new ArrayList<>();
        // add element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        //size in arraylist
        System.out.println(list.size());

        //get element

        int element = list.get(3);
        System.out.println(element);

        // remove
        list.remove(2);
        System.out.println(list);
        //set
        list.set(2,10);
        System.out.println(list);
        //contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
    }
}