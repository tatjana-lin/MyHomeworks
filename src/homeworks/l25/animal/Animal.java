package homeworks.l24.animal;

    public class Animal {
    public int weight;
    public String name;

    public Animal(int weight,String name){
        this.weight = weight;
        this.name = name;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj)// объект равен сам себе - истина
            return true;
        if (obj == null || getClass() != obj.getClass())//проверка на равенство объекта нулю и в одном ли классе объекты
            return false;
        Animal animal = (Animal) obj;// ??? непонятное выражение
        return weight == animal.weight && (
                name == null ? animal.name == null : name.equals(animal.name)
                );
    }
    @Override
    public int hashCode(){
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + weight;
        return result;
    }

    public void printWhoAmI(){
        System.out.println("I'm an animal");
    }
}
