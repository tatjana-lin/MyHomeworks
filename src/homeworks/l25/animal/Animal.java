package homeworks.l25.animal;

    public class Animal {
    public int weight;
    public String name;
    public String animalType;

    public Animal(int weight,String name, String animalType){
        this.weight = weight;
        this.name = name;
        this.animalType = animalType;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj)// объект равен сам себе - истина
            return true;
        if (obj == null || getClass() != obj.getClass())//проверка на равенство объекта нулю и в одном ли классе объекты
            return false;
        Animal animal = (Animal) obj;// преобразование типов
        return weight == animal.weight && (
                name == null ? animal.name == null : name.equals(animal.name) &&
                animalType == null ? animal.animalType == null : animalType.equals(animal.animalType)
        );
    }
    @Override
    public int hashCode(){
        int result = name != null ? name.hashCode() : 0;
        int result1 = animalType != null ? animalType.hashCode() : 0;
        result = 31 * result + 29 * result1 + weight;
        return result;
    }
    public void printWhoAmI(){
        System.out.println("I'm an animal");
    }
}
