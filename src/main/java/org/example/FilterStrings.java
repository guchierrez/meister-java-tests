package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStrings {
    public static List<String> filterStrings(List<String> inputList) {
        return inputList
                .stream()
                .filter(s -> s.startsWith("a") && s.length() == 3)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("phone", "banana", "catt", "app", "dog", "ann", "ape");
        List<String> filteredList = filterStrings(inputList);
        System.out.println("Filtered Strings: " + filteredList);
    }
}
