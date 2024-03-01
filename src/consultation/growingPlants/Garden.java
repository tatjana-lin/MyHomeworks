package myProjects.cons.cons2.growingPlants;

public class Garden {
    //выращиваем деревья и цветы в течение неск.лет. Пусть каждый из видов имеет:
    // имя, высоту, возраст
    // и каждый вид вырастает за сезон на разную высоту, одинаковую для каждого вида.
    // В течение каждого сезона(год начинается весной) виды ведут себя по-разному:
    // цветы: весной растут, зимой не растут, летом не растут, а цветут, осенью их срезают.
    // деревья: весной растут, зимой не растут, летом растут, осенью не растут.
    // в классе Garden нужно написать метод growPlants, в котором будет отражен процесс роста 2-4 растений
    // в течение нескольких лет (что происходит каждый сезон, какой размер в каждый сезон, какого размера
    // и возраста они будут в конце процесса.
    // Growing plants for 2 years:
    // Tulip has grown in spring 6 cm.
    // Tulip does not grow in summer, but it blooms, 6 cm.
    // Tulip is cut to zero in Autumn...

    public static void main(String[] args) {
    Plant tree = new Tree ("Pine", 100, 1);
    Plant flower = new Flower ("Tulip", 6, 1);

    Plant[] plants = {tree, flower};
    int years = 2;
    growPlants(plants, years);
    }
    public static void growPlants(Plant[] plants, int numberOfYears){
        System.out.println("Growing plants for " + numberOfYears + " years");
        for (int i = 0; i < numberOfYears; i++){
        for(Plant plant : plants){
            plant.doSpring();
            plant.doSummer();
            plant.doAutumn();
            plant.doWinter();
        }
    }
        for(Plant plant : plants){
            System.out.println("      " + plant.getDisplayName() + " has height: "
                    + plant.getHeight() + " and is " + plant.getAge() + " years old");
        }
    }
}
