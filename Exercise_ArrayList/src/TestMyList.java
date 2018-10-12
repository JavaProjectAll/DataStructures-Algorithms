public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> arrNum = new MyList<Integer>();
        arrNum.add(12);
        arrNum.add(5);
        arrNum.add(15);
        arrNum.add(2);
        arrNum.add(7,18);
        arrNum.getAll();
        System.out.println(arrNum.indexOf(2));
        //arrNum.clear();
        arrNum.remove(0);
        arrNum.getAll();
    }
}
