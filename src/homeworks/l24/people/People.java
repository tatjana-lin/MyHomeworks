package homeworks.l24.people;

public class People {
    public String name;
    public int age;

    public People(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj)// объект равен сам себе - истина
            return true;
        if (obj == null || getClass() != obj.getClass())//проверка на равенство объекта нулю и в одном ли классе объекты
            return false;
        People person = (People) obj;// ??? непонятное выражение
        return age == person.age && (
                name == null ? person.name == null : name.equals(person.name)
        );
    }
    @Override
    public int hashCode(){
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
    public void printWhoAmI(){
        System.out.println("I'm a Human");
    }
}


