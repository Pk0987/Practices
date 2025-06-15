package org.example.practices.Stream;

import java.util.Arrays;
import java.util.List;

public class average {

    public static void main() {
    List<Integer> numbers = Arrays.asList(1, 3, 6, 8, 10, 18, 36);
        double average = numbers.stream()
                        .mapToDouble(Integer::doubleValue)
                                .average()
                                        .orElse(0.0);
        System.out.println(average);
    }

}
