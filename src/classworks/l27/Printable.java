package Trash.l27;

public interface Printable {
    void print();
}
class Ellips implements Printable {
    @Override
    public void print(){
        System.out.println("Print Ellipse");
    }
}
    class Main {
        public static void main(String[] args) {
            Ellips ellips = new Ellips();
            ellips.print();
        }
}