public class MyListTest {
    public static void main(String[] args) {
        Mylist<String> arrStr = new Mylist<String>();
        arrStr.add("Hello");
        arrStr.add("Việt");
        arrStr.add("Nam");
        System.out.println(arrStr.get(2));
        System.out.println(arrStr.get(5));
    }
}
