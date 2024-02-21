package homeworks.l27;

public interface ICalculator { //методы расчета периметра и площади фигур вынесены в интерфейс
    public static final double PI = 3.141592653589793; // константа
    double getPerimeter();
    double getArea();

    /*default void roundingPerimeter(){ // хотелось приделать округление, но не вышло им воспользоваться((
       System.out.format("%.2f", getPerimeter());
   }
    default void roundingArea(){
        System.out.format("%.2f", getArea());
    }*/
}
