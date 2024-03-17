package homeworks.l29;

import java.util.Objects;

public class DoubleNode {
    private DoubleNode next;// ссылка на следующий узел
    private DoubleNode prev;// ссылка на предыдущий узел
    private int value;
    private int index;

    public DoubleNode(int value){
        this.value = value;
        //this.prev = null;// По умолчанию предыдущий узел не задан
       // this.next = null;// По умолчанию следующий узел не задан

    }
    public DoubleNode(int value, int index){
        this.value = value;
        this.index = index;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public DoubleNode getPrev() {
        return prev;
    }

    public void setPrev(DoubleNode prev) {
        this.prev = prev;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "DoubleNode{" +
                "next=" + next +
                ", prev=" + prev +
                ", value=" + value +
                ", index=" + index +
                '}';
    }
}
