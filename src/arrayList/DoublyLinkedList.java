package arrayList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    public void insertAtHead(String element) {
        Node node = new Node(element);
        node.next = head;
        node.previous = null;
        if (head != null) head.previous = node;
        if (tail == null) tail = head;
        head = node;
    }

    public String display() {
        Node node = head;
        String output = "";
        String element = "";
        while (node!= null){
            element = node.element + "->";
            node = node.next;
            output = output + element;
        }
        return output + "END";
    }

    public void insertAtTail(String element) {
        Node node = new Node(element);
        if (tail == null){
            insertAtHead(element);
        }
        else {
            tail.next = node;
            node.next = null;
            node.previous = tail;
            tail = node;

        }
    }

    private class Node{
        private String element;
        private Node next;
        private Node previous;

        Node(String element){
            this.element = element;
        }
        Node(String element, Node next){
            this.element = element;
            this.next = next;
        }
        Node(String element, Node next, Node previous){
            this.element = element;
            this.next = next;
            this.previous = previous;

        }
    }
}
