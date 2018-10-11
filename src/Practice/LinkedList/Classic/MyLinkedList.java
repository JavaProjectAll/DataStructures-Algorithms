package Practice.LinkedList.Classic;

public class MyLinkedList {
    private Note head;
    private int numNodes ;

    public MyLinkedList() {
    }

    public MyLinkedList(Object data) {
        this.head = new Note(data);
    }

    private class Note {
        private Note next;
        private Object data;

        public Note(Object data) {
            this.data = data;
            numNodes++;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, Object data) {
        Note holder;
        Note temp = head;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Note(data);
        temp.next.next = holder;
    }

    public void addFirst(Object data) {
        Note temp = head;
        head = new Note(data);
        head.next = temp;
    }

    public Note get(int index) {
        Note temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void printList() {
        Note temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("Số bản note là "+numNodes);
    }
}
