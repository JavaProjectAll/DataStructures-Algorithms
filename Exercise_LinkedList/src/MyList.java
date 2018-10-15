public class MyList<E> {
    private int size = 0;
    private Note<E> first = null;
    private Note<E> last = null;

    public class Note<E> {
        private Note<E> next;
        private Object data;

        public Note(Object data) {
            this.data = data;
            size++;
        }

        public Object getData() {
            return data;
        }
    }

    public MyList() {
    }

    public MyList(Object data) {
        first = new Note<E>(data);
    }

    public void addFirst(E data) {
        Note<E> temp = first;
        first = new Note<E>(data);
        first.next = temp;
        if (last == null) {
            last = first.next;
        }
    }

    public void addLast(E data) {
        Note<E> newNote = new Note<E>(data);
        if (last == null) {
            last = newNote;
        } else {
            last.next = newNote;
            last = last.next;
        }
    }

    public void add(int index, E data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Not found index: "
                    + index + ", while size :" + size);
        } else if (index == 0) addFirst(data);
        else if (index == size) addLast(data);
        else {
            Note<E> temp = first;
            Note<E> holder;
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            temp.next = new Note<E>(data);
            temp.next.next = holder;
        }
    }

    public int size() {
        return size;
    }

    public E removeFirst() {
        Note<E> temp = first;
        first = first.next;
        size--;
        return (E) temp.getData();
    }

    public E removeLast() {
        Note<E> temp = first;
        Note<E> holder;
        for (int i = 0; i < size - 1; i++) {
            temp = temp.next;
        }
        holder = temp;
        temp = null;
        size--;
        return (E) holder.getData();
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            first.next = null;
        }
        size = 0;
    }

    public E clone() {
        return (E) first;
    }

    public boolean contains(E data) {
        Note<E> temp = first;
        for (int i = 0; i < size; i++) {
            if (first.data.equals(data)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E data) {
        Note<E> temp = first;
        for (int i = 0; i < size; i++) {
            if (first.data.equals(data)) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Not found index: "
                    + index + ", while size :" + size);
        }
        Note<E> temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.getData();
    }

    public void printList() {
        Note<E> temp = first;
        System.out.println("Có tổng cộng " + size + " phần tử trong Linklist");
        for (int i = 0; i < size; i++) {
            System.out.println(i + " - " + temp.getData());
            temp = temp.next;
        }
    }
}
