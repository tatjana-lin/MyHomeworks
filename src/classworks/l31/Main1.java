package homeworks.l31;

interface Greeting {
    void sayHello();

}

class Main1 {
    public static void main(String[] args) {

        Greeting greeting1 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Привет мз анонимного класса!");
            }
        };

        Greeting greeting2 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Досвидания!");
            }
        };
        Greeting greeting3 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Good Bye!");
            }
        };

        greeting1.sayHello();
        greeting2.sayHello();
        greeting3.sayHello();


    }

}