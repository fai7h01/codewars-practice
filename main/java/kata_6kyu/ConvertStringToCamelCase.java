package kata_6kyu;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertStringToCamelCase {
    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));
        System.out.println(toCamelCase("The_Stealth-Warrior"));

    }

    private static String toCamelCase(String s) {
        if (s.isEmpty() || s == null) return "";

        s = s.replaceAll("-", " ").replaceAll("_", " ");
        String firstWord = s.substring(0, s.indexOf(" "));
        return firstWord += Arrays.stream(s.split(" "))
                .skip(1).map(str -> str.substring(0, 1).toUpperCase() + str.substring(1))
                .collect(Collectors.joining());

    }
}
/*
Complete the method/function so that it converts dash/underscore delimited words into camel casing.
The first word within the output should be capitalized only if the original word was capitalized
(known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.

"the-stealth-warrior" gets converted to "theStealthWarrior"
"the-stealth-warrior" gets converted to "theStealthWarrior"
"The_Stealth-Warrior" gets converted to "TheStealthWarrior"
 */