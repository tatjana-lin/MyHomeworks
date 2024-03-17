package homeworks.l29;

public class DoublyLinkedList implements IntList {
    private DoubleNode head;// начало списка
    private DoubleNode tail;// конец списка
    private int size;// размер списка

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public int get(int index) {// получаем значение по индексу ???? дописать варианты
        DoubleNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getValue();
    }

    @Override
    public void add(int value) { // добавление элемента в начало списка ??? то же самое, что и addFirst
        DoubleNode newNode = new DoubleNode(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            head.setPrev(newNode);
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }

    @Override
    public void add(int value, int index) { // добавление элемента в список по индексу
        DoubleNode newNode = new DoubleNode(value, index);
        if (index == 0) {
            head = newNode;
            tail = newNode;

        } else {

            DoubleNode current = head;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }

            newNode.setNext(current);
            current.setPrev(newNode);
            newNode.setPrev(current.getPrev());
            (current.getPrev()).setNext(newNode);
        }
        size++;
    }

    @Override
    public void addLast(int value) { // добавление элемента в конец списка
        DoubleNode newNode = new DoubleNode(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setPrev(tail);
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    @Override
    public void addFirst(int value) { // добавление элемента в начало списка
        DoubleNode newNode = new DoubleNode(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            head.setPrev(newNode);
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }

    @Override
    public void remove(int index) { //удаление элемента по индексу
        DoubleNode current = head;
        if (current == null) {
            System.out.println("There is nothing to remove. The list is empty.");
            System.exit(-1); // ???
        } else if (index > tail.getIndex()){
            System.out.println("False index. There is no such an element in the list.");
            System.exit(-1); // ???
        } else if (current == tail) {
            current = null;
            size = 0;
        } else if (index == 0 && current.getNext() != null) {
            DoubleNode next = head.getNext();
            current = null;
            next = head;
            size--;
        } else if (index == tail.getIndex()){
          DoubleNode prev = tail.getPrev();
          tail = null;
          prev = tail;
          size--;
        } else {
            while (current.getIndex() != index) { //  && current.getNext() != null  ???
                current = current.getNext();
            }
            (current.getPrev()).setNext(current.getNext());
            (current.getNext()).setPrev(current.getPrev());
            current = null;
            size--;
        }
    }

    @Override
    public int size() { // дописать
        return tail.getIndex() - 1;
    }

    @Override
    public void clear() {  // дописать
        for (int i = tail.getIndex(); i > 0; i--) {
            DoubleNode prev = tail.getPrev();
            tail = null;
            size--;
        }
    }

}
