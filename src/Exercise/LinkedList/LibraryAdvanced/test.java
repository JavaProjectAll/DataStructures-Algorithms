package Exercise.LinkedList.LibraryAdvanced;

import java.util.LinkedList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<Object>();
        list.add(12);
        list.addFirst(32);
        list.add(2,12);
        list.remove();
        list.remove(2);
        list.addLast(3);
        System.out.println(list.getFirst());
    }
}
