package org.example.practices.Stream;

import java.util.*;

public class SecondSmallAndLarge {
    public static void main() {
        List<Integer> values = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            values.add(rand.nextInt(100));
        }
        System.out.println(values);

        Optional<Integer> MaxValue = values.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println(MaxValue);

        Optional<Integer> MinValue = values.stream().sorted().skip(1).findFirst();
        System.out.println(MinValue);
    }
}
