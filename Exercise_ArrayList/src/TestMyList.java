import java.util.ArrayList;
import java.util.Arrays;

public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> arrNum = new MyList<Integer>(10);
        arrNum.add(12);
        arrNum.add(5);
        arrNum.add(15);
        arrNum.add(2);
        arrNum.add(2, 18);
        arrNum.add(7, 21);
        arrNum.getAll();
        //System.out.println(arrNum.indexOf(2));
        //arrNum.clear();
        //arrNum.remove(0);
        //arrNum.getAll();
    }
}
