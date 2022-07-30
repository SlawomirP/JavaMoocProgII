package ex10_12;

public class Student implements Comparable<Student> {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student compared) {
        if (this == compared){
            return 1;
        }
        else if (this.name.equals(compared.name)){
            return 1;
        }
        else {
            return -1;
        }
    }
}
