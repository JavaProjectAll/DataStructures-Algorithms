import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    static final int DEFAUL_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAUL_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E data) {
        do {
            ensureCapacity();
        } while (index > elements.length);
        elements[index] = data;
        if (index > size) size = index + 1;
    }

    //    public void add(E data) {
//        if (size == elements.length) {
//            ensureCapacity();
//        }
//        elements[size++] = data;
//    }
    public boolean add(E data) {
        if (size == elements.length) ensureCapacity();
        for (int i = 0; i < size; i++) {
            if (elements[i] == null){
                elements[i] = data;
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    public E get(int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        return (E) elements[index];
    }

    public void getAll() {
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    public boolean contains(E data) {
        for (Object element : elements) {
            if (element.equals(data)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E data) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public E remove(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Not found index: " + index + " while size: " + size);
        }
        Object oldElement = elements[index];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (i != index) {
                elements[j] = elements[i];
                j++;
            }
        }
        size--;
        return (E) oldElement;
    }

    public E clone(){

        return (E) "";
    }
}
