package ex10_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(-2);
        lista.add(-1);
        lista.add(0);
        lista.add(1);
        lista.add(2);

        System.out.println(positive(lista));

    }
    public static List<Integer> positive (List <Integer> numbers){

        return numbers.stream().filter(value -> value > 0).collect(Collectors.toList());

    }
}