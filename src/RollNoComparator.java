import java.util.Comparator;

public class RollNoComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getRNo() < o2.getRNo())
            return -1;
        else if(o1.getRNo() > o2.getRNo())
            return 1;
        return 0;
    }
}
