package pao.biblioteca;
import java.util.Comparator;

public class NameComparator implements Comparator<Reader> {




    public int compare(Reader o1, Reader o2){
        return o1.getName().compareTo(o2.getName());
    }
}