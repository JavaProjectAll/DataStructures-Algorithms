package Exercise.LinkedList.LibraryAdvanced;

import java.util.LinkedList;

public class MyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail = null;
    private int numNode = 0;

    class Node<E> {
        private Node<E> next;
        private E data;

        public Node(E data) {
            this.data = data;
            numNode++;
        }

        public E getData() {
            return this.data;
        }
    }

    public MyLinkedList() {
    }

    public MyLinkedList(E data) {
        this.head = new Node<E>(data);
    }

    public void add(int index, E data) {
        Node holder;
        Node temp = head;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node<E>(data);
        temp.next.next = holder;
    }

    public void addFirs(E data) {
        Node<E> temp = head;
        head = new Node<E>(data);
        head.next = temp;
    }

    public void addLast(E data) {
        Node<E> temp = new Node<E>(data);
        for (int i = 0; i<numNode; i++){

        }
    }

    public E remove(int index) {
        if (numNode < 0 && index > numNode) {
            return null;
        } else {
            Node<E> previous = head;
            for (int i = 0; i < index; i++) {
                previous = previous.next;
            }
            Node<E> current = previous.next;
            previous.next = current.next;
            numNode--;
            return current.data;
        }
    }

    public boolean remove(Object object) {
        return false;
    }

    public boolean contains(E data) {
        Node<E> temp = head;
        for (int i = 0; i < numNode; i++) {
            if (temp.data.equals(data)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E data) {
        Node<E> temp = head;
        for (int i = 0; i < numNode; i++) {
            if (temp.data.equals(data)) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public int size() {
        return numNode;
    }

    public E get(int index) {
        Node<E> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public E getFirst() {
        return head.data;
    }

    public E getLast() {
        Node<E> temp = head;
        for (int i = 0; i < numNode - 1; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public void clear() {
        Node<E> temp = head;
        for (int i = 0; i < numNode; i++) {
            temp = temp.next;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("Có tổng cộng " + numNode + " phần tử");
    }
}
