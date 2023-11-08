package org.example;

public class RemoveSpaces {
    public static String removeSpaces(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isWhitespace(input.charAt(i))) {
                result.append(input.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Hello, World! This is a test.";
        String stringWithoutSpaces = removeSpaces(input);
        System.out.println("String without spaces: " + stringWithoutSpaces);
    }
}
