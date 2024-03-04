package homeworks.l35;
import java.util.Comparator;
public class NameComparator implements Comparator<Beaver> {

    @Override
    public int compare(Beaver o1, Beaver o2) {// сравнение объектов по именам
        return o1.name.compareTo(o2.name);
    }
}
