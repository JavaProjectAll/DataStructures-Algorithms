public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> arrNum = new MyList<Integer>();
        arrNum.add(12);
        arrNum.add(5);
        arrNum.add(7,18);
        arrNum.getAll();
        //arrNum.clear();
        arrNum.remove(0);
        arrNum.getAll();
    }
}
