package classworks.l32;

import java.util.Scanner;

enum MoonPhase {
    NEW_MOON("\uD83C\uDF11"),
    WAXING_CRESCENT("\uD83C\uDF12"),
    FIRST_QUARTER("\uD83C\uDF13"),
    WAXING_GIBBOUS("\uD83C\uDF14"),
    FULL_MOON("\uD83C\uDF15"),
    WANING_GIBBOUS("\uD83C\uDF16"),
    LAST_QUARTER("\uD83C\uDF17"),
    WANING_CRESCENT("\uD83C\uDF18");

    private final String description;

    MoonPhase(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

    class Main5 {
    public static void main(String[] args) {
        for (MoonPhase moonPhase : MoonPhase.values()) { //вывод всех значений Enum
            System.out.println(moonPhase + ": " + moonPhase.getDescription());
        }

    }

}

class Main6 {
    public static void main(String[] args) {
        // вывод всех доступных значений енама (.values())
        // String moonPhaseName = scanner.nextLine()
        // MoonPhase moonPhase = MoonPhase.valueOf(moonPhaseName)

        for (MoonPhase moonPhase : MoonPhase.values()) {
            System.out.println(moonPhase);
        }
        System.out.println("Выберите лунную фазу: ");
        Scanner scanner = new Scanner(System.in);
        String moonPhaseName = scanner.nextLine();
        MoonPhase moonPhase = MoonPhase.valueOf(moonPhaseName);
        //метод .valueOf() возвращает объект Enum, соответствующий переданному имени


        switch (moonPhase) {
            case NEW_MOON:
                System.out.println("Ура, новолуние! " + moonPhase);
                break;
            case FULL_MOON:
                System.out.println("Ура, полнолуние! " + moonPhase);
                break;
            default:
                System.out.println(moonPhase);
        }

    }

}



