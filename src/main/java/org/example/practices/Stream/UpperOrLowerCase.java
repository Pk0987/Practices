package org.example.practices.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperOrLowerCase {
    public static void main() {
        List<String> names = Arrays.asList("pk","jackFruit","Apple","BanaNA");

        List<String> uppercase = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(uppercase);
        List<String> lowercase = names.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println(lowercase);
    }
}
