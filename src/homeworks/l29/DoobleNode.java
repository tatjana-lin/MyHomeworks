package homeworks.l29;

public class Node {
    private Node next;// ссылка на следующий узел
    private Node prev;// ссылка на предыдущий узел
    private int value;

    public Node(int value){
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
