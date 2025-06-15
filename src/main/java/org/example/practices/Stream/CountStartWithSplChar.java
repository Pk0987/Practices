package org.example.practices.Stream;

import java.util.Arrays;
import java.util.List;

public class CountStartWithSplChar {
    public static void main() {
        List<String> names = Arrays.asList("Apple","Banana","Ace","Jack","Black","Orange");
       long count = names.stream()
               .map(String::toLowerCase)
                .filter(name->name.startsWith("j"))
               .count();
        System.out.println(count);
    }
}
