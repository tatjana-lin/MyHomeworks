package homeworks.l24.people;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PeopleTest {
private People person1;
private People person2;
private People person3;

    @BeforeEach //запускается перед каждым тест кейсом, нестатический, имеет доступ к this
    public void setUp(){
        this.person1 = new People("Peter", 88);
        this.person2 = new People("Peter", 88);
        this.person3 = new People("Peter", 88);

    }
    @Test //Рефлексивность: объект должен быть равен самому себе (x.equals(x) всегда true)
    public void testReflexivity() { //методы теста д.быть public void, начинаться со слова test
        Assertions.assertEquals(true, person1.equals(person1));
    }
    @Test //Симметричность: если x.equals(y) true, то и y.equals(x) должен быть true
    public void testSymmetry() {
       Assertions.assertEquals(true, (person1.equals(person2))&&(person2.equals(person1)));
    }
    @Test
    public void testTransitivity(){
    //Транзитивность: если x.equals(y) и y.equals(z)оба true, то и x.equals(z) должен быть true
       Assertions.assertEquals(true,person1.equals(person2) && person2.equals(person3)
               && person1.equals(person3));
    }
    @Test
    public void testCoherency(){
    //Согласованность: если информация, используемая в сравнении объектов, не изменяется
    // то многократные вызовы x.equals(y) должны возвращать одинаковый результат
        Assertions.assertEquals(true, person1.equals(person2));
        Assertions.assertEquals(true, person1.equals(person2));
        Assertions.assertEquals(true, person1.equals(person2));
    }
    @Test
    public void testNotNull(){
    //Ненулевая ссылка: для любого ненулевого значения x, x.equals(null) должен быть false.
    Assertions.assertEquals(false, person1.equals(null));
    }
    @Test
    public void testHash(){
        //если два объекта равны согласно методу equals, то вызов метода hashCode для этих объектов должен
        //возвращать одинаковое целочисленное значение
        Assertions.assertEquals(true, person1.hashCode() == person2.hashCode());
    }
}
