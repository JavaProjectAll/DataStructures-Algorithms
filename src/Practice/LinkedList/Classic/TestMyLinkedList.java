package Practice.LinkedList.Classic;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("____________TEST____________");
        MyLinkedList object1 = new MyLinkedList(10);
        object1.addFirst(4);
        object1.addFirst(5);
        object1.addFirst(8);
        object1.add(4,9);
        object1.add(1,6);
        object1.printList();
        System.out.println(object1.get(4));
    }
}
