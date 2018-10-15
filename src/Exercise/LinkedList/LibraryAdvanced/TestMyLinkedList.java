package Exercise.LinkedList.LibraryAdvanced;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> data = new MyLinkedList<Integer>(12);
        data.add(2,14);
        data.addFirs(5);
        data.addLast(19);
        data.addFirs(6);
        System.out.println(data.get(0));
        System.out.println("Đã xóa "+data.remove(0));
//        data.printList();
//        System.out.println("Hiển thị "+data.getFirst());
//        System.out.println("Vị trí của phần tử là "+data.indexOf(12));
//        System.out.println("Có số 10 ko ? "+data.contains(11));
//        //data.clear();
//        System.out.println(data.getFirst());
        data.printList();
    }
}
