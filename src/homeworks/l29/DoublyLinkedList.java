package homeworks.l29;

public class DoublyLinkedList implements IntList {
    DoubleNode head;// начало списка
    DoubleNode tail;// конец списка
    int size;// размер списка

    public DoublyLinkedList() {
//        this.head = null;
//        this.tail = null;
//        this.size = 0;
    }

    @Override
    public int get(int index) {// метод для получения значения по индексу
        DoubleNode current = head;
        if (current == null) { // если список нулевой
            System.out.println("The list is empty.");
        //    System.exit(-1); // ???
        } else if (index < 0 || index > tail.index) { // если неверный индекс
            System.out.println("False index. There is no such an element in the list.");
        //    System.exit(-1); // ???
        } else if (current == tail || index == 0) { // если в списке 1 элемент или индекс 0
            return current.value;
        } else if (index == tail.index) { // если запрашивается индекс последнего элемента
            return tail.value;
        } else
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        return current.value;
    }

    @Override
    public void add(int value) { // добавление элемента в начало списка ??? то же самое, что и addFirst
        DoubleNode newNode = new DoubleNode(value);
        if (head == null) { // если список пустой
            head = newNode;
            tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;

//            this.tail.next = newNode; // или в конец списка
//            newNode.prev = this.tail;
//            this.tail = newNode;
        }

        size++;

    }

    @Override
    public void add(int value, int index) { // добавление элемента в список по индексу
        DoubleNode newNode = new DoubleNode(value, index);
        if (index < 0 || index > tail.index + 1 || (head == null && index != 0)) { // если неверный индекс
            System.out.println("False index.");
            System.exit(-1); // ???
        } else if (head == null) { // если список пустой
            head = newNode;
            tail = newNode;
        } else if (index == tail.index + 1) {
            tail.next = newNode;
            newNode.prev = tail;
            newNode = tail;
        } else {
            DoubleNode current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            newNode.prev = current.prev;
            current.prev.next = newNode;
            newNode.next = current;
            current.prev = newNode;
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
            tail.next = newNode;
            newNode.prev = tail;
            newNode = tail;
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
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    @Override
    public void remove(int index) { //удаление элемента по индексу
        DoubleNode current = head;

        if (current == null) { // если список пустой
            System.out.println("There is nothing to remove. The list is empty.");
        //    System.exit(-1); // ???
        } else if (index < 0 || index > tail.index) {  // если неверный индекс
            System.out.println("False index. There is no such an element in the list.");
        //    System.exit(-1); // ???
        } else if (current == tail) { // если в списке 1 элемент
            current = null;
            size = 0;
        } else if (index == 0) { // если удаляем первый элемент ???
            DoubleNode next = head.next;
            current = null;
//            current.prev = null;
//            current.next = null;
            next = head;
            size--;
        } else if (index == tail.index) { // если удаляем последний элемент
            DoubleNode prev = tail.prev;
            tail = null;
            prev = tail;
            size--;
        } else {
            while (current.index != index) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            current = null;
            size--;
        }
    }

    @Override
    public int size() { // получение размера списка
        return size;
    }

    @Override
    public void clear() {  // очистка списка
        if (head == null) {
            System.out.println("The list is empty.");
    //        System.exit(-1);
        } else if (head == tail) {
            head = null;
            size = 0;
            System.out.println("The list was cleared");
        } else {
            while (size > 1) {
                for (int i = size; i > 0; i--) {
                    DoubleNode prev = tail.prev;
                    tail = null;
                    prev = tail;
                    size--;
                }
                tail = null;
                size = 0;
                System.out.println("The list was cleared");
            }
        }
    }

    @Override
    public String toString() {
        return "DoublyLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }
}
