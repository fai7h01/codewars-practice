package kata_6kyu;

import java.util.Arrays;

public class CamelCase {
    public static void main(String[] args) {

        System.out.println(camelCase("hello  case"));
        System.out.println(camelCase2("hello  case"));
    }

    private static String camelCase(String str){

        String[] arr = str.split(" ");
        String result = "";
        for (String s : arr) {
            if(!s.isBlank()) {
                s = s.trim();
                s = s.substring(0, 1).toUpperCase() + s.substring(1);
                result += s;
            }
        }
        return result;
    }

    private static String camelCase2(String str){

        return str == null || str.isEmpty()? "" : Arrays.stream(str.split(" "))
                .filter(s -> !s.isBlank() || !s.isEmpty())
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .reduce(String::concat).get();
    }

}
/*
Write a method (or function, depending on the language) that converts a string to camelCase,
that is, all words must have their first letter capitalized and spaces must be removed.
 */