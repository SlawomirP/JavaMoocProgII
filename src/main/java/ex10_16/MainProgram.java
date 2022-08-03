package ex10_16;

import org.w3c.dom.ls.LSOutput;

public class MainProgram {
    public static void main(String[] args) {

        Employees university = new Employees();
        university.add(new Person("Petrus", Education.PHD));
        university.add(new Person("Arto", Education.HS));
        university.add(new Person("Elina", Education.PHD));

        university.print(Education.PHD);

//        university.fire(Education.HS);
//
//        System.out.println("==");
//
//        university.print();
    }




}
