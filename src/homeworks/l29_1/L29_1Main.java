package homeworks.l29_1;

public class L29Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        list.add(10,3);
        System.out.println(list);

        list.addFirst(15);
        System.out.println(list);

        list.addLast(20);
        System.out.println(list);

        list.get(1);
        System.out.println(list);
    }
}
