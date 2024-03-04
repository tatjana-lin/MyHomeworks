package homeworks.l29;

public class DoubleNode {
    DoubleNode next;// ссылка на следующий узел
    DoubleNode prev;// ссылка на предыдущий узел
    int value;
    int index;

    public DoubleNode(int value){ // конструктор
        this.value = value;
        this.prev = null;// По умолчанию предыдущий узел не задан
        this.next = null;// По умолчанию следующий узел не задан

    }
    public DoubleNode(int value, int index){ //отдельный конструктор для метода add(int value, int index)
        this.value = value;
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
