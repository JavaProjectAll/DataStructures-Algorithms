import java.util.LinkedList;

public class TestMyList {
    public static void main(String[] args) {
        MyList<Object> myList = new MyList<Object>();
        myList.addFirst(12);
        myList.addFirst("Xin chào");
        myList.removeLast();
        myList.addLast("Việt nam");
        myList.addFirst(35);
        myList.addFirst("Test");
        myList.addLast("PHP");
        myList.addLast("PHP1");
        myList.addLast("PHP2");
        myList.addLast("PHP3");
        myList.removeFirst();
        myList.addLast("PHP6");
        myList.add(1,"Java");
        myList.printList();
        System.out.println("--" + myList.get(4));
        myList.clear();

        myList.printList();
        System.out.println(myList.contains(1));



        LinkedList<Object> a = new LinkedList<Object>();
        a.addFirst(123);
        a.removeLast();
    }
}
