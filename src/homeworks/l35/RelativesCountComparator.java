package homeworks.l35;
import java.util.Comparator;

public class RelativesCountComparator implements Comparator<Beaver> {

    @Override
    public int compare(Beaver o1, Beaver o2) { //// сравнение объектов по числу родственников
        return Integer.compare(o1.relativesCount, o2.relativesCount); //используем обёрточный класс, т.к.метод compare не работает с примитивами
    }
}
