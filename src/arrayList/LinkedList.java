package arrayList;

import java.util.Arrays;

public class LinkedList {
    private int size;
    private Node head;
    private Node tail;
    private boolean isEmpty = true;

    public LinkedList(){
        this.size = 0;
    }

    public boolean isEmpty() {
        isEmpty = size <= 0;
        return isEmpty;
    }

    public void insertAtHead(String element) {
        Node node = new Node(element);
        node.next = head;
        head = node;
        if (tail == null) tail = head;
        size++;
    }

    public String displayList() {
        Node temp = head;
        String output = "";
        String element = "";
        while (temp != null){
            element = temp.value + "->";
            temp = temp.next;
            output = output + element;
        }

        return output + "END";
    }

    public void insertAtTail(String element) {
        Node node = new Node(element);
        if (tail == null)insertAtHead(element);
        else {
            tail.next = node;
            tail = node;

        }
        size++;
    }

    public void insertAtIndex(String element, int index) {
        if (index == 0){
            insertAtHead(element);
            return;
        }
        if (index == size){
            insertAtTail(element);
            return;
        }
        Node temp = head;
        for (int idx = 0; idx < index; idx++) {
            temp = temp.next;
        }
        Node node = new Node(element, temp.next);
        temp.next = node;
        size++;
    }

    public String deleteAtFirst() {
        String element = head.value;
        head = head.next;
        if (head == null){
            tail = null;
        }
        size--;
        return element;
    }

    public String deleteAtLast() {
        if (size <= 1) deleteAtFirst();
        Node previous = get(size - 2);
        String element = tail.value;
        tail = previous;
        tail.next = null;
        return element;
    }
    public Node get(int index){
        Node node = head;
        for (int idx = 0; idx < index; idx++) {
            node = node.next;
        }
        return node;
    }

    public String deleteAtIndex(int index) {
        if (index == 0) return deleteAtFirst();
        if (index == size - 1) return deleteAtLast();
        Node previous = get(index - 1);
        String element = previous.next.value;
        previous.next = previous.next.next;
        return  element;
    }

    public Node find(String element) {
        Node node = head;
        while (node != null){
            if (node.value.equals(element)) return node;
            node = node.next;
        }
        return node;
    }

    private class Node{
        private String value;
        private Node next;
        private Node previous;

        public Node(String value){
            this.value = value;
        }
        public Node(String value, Node next){
            this.value = value;
            this.next = next;
        }
        public Node(String value, Node next, Node previous){
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }
}
