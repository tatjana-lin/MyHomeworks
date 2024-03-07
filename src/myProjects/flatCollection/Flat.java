package myProjects.flatCollection;

public class Flat {
    private static int counter = 0;
    private long id; //Значение поля должно быть больше 0,
    //Значение этого поля должно быть уникальным,
    //Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Integer area; //Поле может быть null, Значение поля должно быть больше 0
    private Integer numberOfRooms; //Максимальное значение поля: 8,
    //Значение поля должно быть больше 0
    private boolean balcony;
    private Furnish furnish; //Поле может быть null
    private House house; //Поле не может быть null

    Flat[] defaultFlats; //массив квартир

    public Flat(long id, String name, Integer area, Integer numberOfRooms, boolean balcony, Furnish furnish, House house) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.numberOfRooms = numberOfRooms;
        this.balcony = balcony;
        this.furnish = furnish;
        this.house = house;
        Flat.counter++;
        this.id = 918291822 + Flat.counter;
    }


    @Override
    public String toString() {
        return "Flat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", numberOfRooms=" + numberOfRooms +
                ", balcony=" + balcony +
                ", furnish=" + furnish +
                ", house=" + house +
                '}';
    }
}
