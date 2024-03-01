package homeworks.l33;

// написать свой Box и реализовать в нем нестатические методы: T get(), void set(T data),
//boolean isValueEqual(Object value), static boolean isEqual(box1, box2)
public class Box<T> { // обобщенный класс Box с типом-парметром Т
    private T content; // поле content типа Т

    public T getContent() { // метод для получения значения поля content1
        return content;
    }

    public void setContent(T content) { // метод для присвоения значения полю content
        this.content = content;
    }

    public boolean isValueEqual(Object value) { // метод сравнения объекта типа Вох<> с объектом типа Object
        if (value != null) ;
        return getContent().equals(value);
    }

    public static <T> boolean isEqual(Box<T> box1, Box<T> box2) { //обобщённый метод сравнения объектов класса Вох
        if (box1 != null && box2 != null) ;
        return box1.getContent().equals(box2.getContent());
    }
}

class MainBox {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>(); // создание объектов String
        Box<String> box2 = new Box<>();

        box1.setContent("I'm box1!"); // присвоение значений
        box2.setContent("I'm box2!");

        boolean result = Box.<String>isEqual(box1, box2); // сравнение объектов String

        System.out.println("Box1 :  " + box1.getContent());
        System.out.println("Box2 :  " + box2.getContent());
        System.out.println("Box1 is equal Box2 : " + result);
// =============================================================

        Box<Character> charBox = new Box<>(); //создание объекта char
        charBox.setContent('V'); // присвоение значения
        System.out.println("charBox : " + charBox.getContent());

        boolean result1 = charBox.isValueEqual('V');// сравнение объектов char и Object

        System.out.println("charBox is equal value : " + result1);
    }
}
