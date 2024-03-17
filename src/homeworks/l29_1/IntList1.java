package homeworks.l29;

public interface IntList {
    int get(int index);

    void add(int value);
    void add(int value, int index);

    void addLast(int value);
    void addFirst(int value);

    void remove(int index);
    int size();
    void clear();
}
