package org.example.practices.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(10) );
        }

        System.out.println(numbers);
        int odd = numbers.stream()
                .filter(n->n%2==1)
                .mapToInt(Integer::intValue)
                        .sum();
        System.out.println("Odd sum is: "+odd);


        int even = numbers.stream()
                .filter(n->n%2==0)
                .sorted()
                .reduce(0,(c,e)->c+e);
        System.out.println("Even sum is "+even);

    }
}
