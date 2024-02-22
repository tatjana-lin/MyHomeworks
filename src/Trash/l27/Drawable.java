package Trash.l27;

public interface Drawable {
    void draw ();
}
class Circle implements Drawable{
    @Override
    public void draw(){
        System.out.println("Draw Circle");
    }
    public static class Main {
        public static void main(String[] args) {
            Circle circle = new Circle();
            circle.draw();

        }
    }
}
