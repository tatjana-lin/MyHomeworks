package myProjects.flatCollection;

public class House {
    private String name; // Поле не может быть null
    private Integer year; // Максимальное значение поля: 2030
    // Значение поля должно быть больше 0

    public House(String name, Integer year) {
        this.name = name;
        this.year = year;
    }


}
