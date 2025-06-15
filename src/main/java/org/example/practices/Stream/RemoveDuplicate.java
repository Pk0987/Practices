package org.example.practices.Stream;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(23,45,23,54,23,46,765,45,2,56,54);
        number.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
