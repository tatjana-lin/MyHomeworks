package classworks.l32;

enum Day { // пример класса enum (перечня)
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

class DayNames { // сравниваем - если реализовать список дней недели через класс, код намного сложнее
    public static final DayNames MONDAY = new DayNames("MONDAY");
    public static final DayNames TUESDAY = new DayNames("TUESDAY");
    public static final DayNames WEDNESDAY = new DayNames("WEDNESDAY");
    public static final DayNames THURSDAY = new DayNames("THURSDAY");
    public static final DayNames FRIDAY = new DayNames("FRIDAY");
    public static final DayNames SATURDAY = new DayNames("SATURDAY");
    public static final DayNames SUNDAY = new DayNames("SUNDAY");

    // --------

    private final String dayName;

    DayNames(String dayName) {
        this.dayName = dayName;
    }

    @Override
    public String toString() {
        return this.dayName;
    }
}

class Main0 {
    public static void main(String[] args) {
        System.out.println(Day.MONDAY);
        System.out.println(DayNames.THURSDAY);
        System.out.println(DayNames.THURSDAY == DayNames.THURSDAY);
    }
}


enum Season { // перечень времён года с описанием (класс enum может иметь переменные, конструкторы, методы)
    WINTER("Cold"),
    SPRING("Warm"),
    SUMMER("Hot"),
    AUTUMN("Cool");

    private final String description;

    Season(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}


class MySeason { // реализация перечня сезонов через обычный класс
    public static final MySeason WINTER = new MySeason("WINTER", "Cold");
    public static final MySeason SPRING = new MySeason("SPRING", "Warm");
    public static final MySeason SUMMER = new MySeason("SUMMER", "Hot");
    public static final MySeason AUTUMN = new MySeason("AUTUMN", "Cool");

    private final String name;
    private final String description;

    MySeason(String name, String description) {
        this.name = name;
        this.description = description;
    }
}


class Main {
    public static void main(String[] args) {
        handleDay(Day.MONDAY); //обращение к константам enum через "имя класса.константа"
        handleDay(Day.THURSDAY);
        handleDay(Day.SUNDAY);
    }

    public static void handleDay(Day day) { // применение класса enum в switch
        switch (day) {
            case MONDAY:
                System.out.println("Понедельник - начало недели.");
                break;
            case FRIDAY:
                System.out.println("Пятница - почти выходные!");
                break;
            case SUNDAY:
                System.out.println("Воскресенье - выходной день.");
                break;
            default:
                System.out.println("Средина недели.");
        }
    }
}


class Main2 {
    public static void main(String[] args) {
        // Season[] values() - это статический метод енама,
        // он возвращает все элементы этого енама в
        // том эе порядке в котором мы их указывали
        // (возвращает массив из всех хранящихся в Enum значений)
        Season[] seasons = Season.values();

        for (Season season : seasons) {
            System.out.println(season + ": " + season.getDescription());
        }

        // Season valueOf(String name) - это статический метод енама,
        // который возвращает тот или иной элемент енама по названию
        Season winter = Season.valueOf("WINTER");

        if (winter == Season.WINTER) {
            System.out.println(
                    "ДА"
            );
        }

        // int compareTo(Season other) - это метод енама,
        // который возвращает результат сравнения порядкого номера енамов (показывает, выше/ниже в списке
        // находятся элементы по отношению друг ко другу, как далеко друг от друга). Может быть положит.или отр.числом.
        int comparingValue = Season.WINTER.compareTo(Season.SUMMER);
        System.out.println(comparingValue);

        Season.WINTER.name();

        Season.WINTER.ordinal();//возвращает порядковый номер константы. Отсчет начинается с нуля

        Season.WINTER.getDeclaringClass();
    }
}


