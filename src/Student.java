public class Student implements Comparable<Student> {

    private String Name;
    private int RNo;

    public Student(String name, int RNo) {
        this.Name = name;
        this.RNo = RNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRNo() {
        return RNo;
    }

    public void setRNo(int RNo) {
        this.RNo = RNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", RNo=" + RNo +
                '}';
    }

    //sorting logic for ROLL NO.
//    @Override
//    public int compareTo(Student o) {
//        if(RNo < o.RNo){
//            return -1;//1 means more
//        }
//        else{
//            if(RNo > o.RNo){
//                return 1;//-1 means less
//            }
//        }
//        return 0;//0 means equal
//    }

//logic for sorting string
    @Override
    public int compareTo(Student o) {
        return Name.compareTo(o.getName());//this the direct List<String> class method which is directly calling the sort method of string which we write while we sort list in string
                                  // For eg: List<String> str = List.of("Ronak","vijay","ajay");
                                  // str.sort(Comparator.naturalOrder()); this will sort the string list.. same we will here directly call the string compareTo() method.

    }
}
