package ex10_16;

public class Person {

    private String name;
    private Education degree;

    public Person(String name, Education degree) {
        this.name = name;
        this.degree = degree;
    }

    public Education getEducation(){
        return this.degree;
    }

    public String toString(){
        return this.name + ", " + getEducation();
    }
}
