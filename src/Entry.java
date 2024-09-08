import java.util.*;

public class Entry {
    public static void main(String[] args) {
        Student student1 = new Student("Tanu",108);
        Student student2 = new Student("Kinu",208);
        Student student3 = new Student("Ira",350);
        Student student4 = new Student("Kiara",200);
        Student student5 = new Student("Chia",600);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        //FOR COMPARABLE SORTING (ONE PARAMETER ONLY)

        //students.sort(Comparator.naturalOrder());
        Collections.sort(students);//on the basis of collection we can do sorting. And there are also many ways we can do sorting.

        for(Student student : students){
            System.out.println(student);
        }
        System.out.println("*".repeat(25));//for seperation

        //FOR COMPARATOR SORTING (MULTIPLE PARAMETERS CAN BE USED FOR SORTING)
        Collections.sort(students,new RollNoComparator());//on the basis of collection we can do sorting. And there are also many ways we can do sorting.
        for(Student student : students){
            System.out.println(student);
        }
    }
}
