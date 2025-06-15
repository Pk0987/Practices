package org.example.practices.Stream;

import java.util.*;

public class FindMaxMin {
    public static void main() {
        List<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(100));
        }
        System.out.println(numbers);

        Integer MaxValue = numbers.stream()
                        .max(Integer::compare)
                                .orElse(null);
        System.out.println(MaxValue);

        Integer MinValue = numbers.stream()
                .min(Integer::compare)
                .orElse(null);
        System.out.println(MinValue);
    }
}
