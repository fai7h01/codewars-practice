package kata_6kyu;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Dashatize {

    public static void main(String[] args) {

        System.out.println(dashatize(274));
        System.out.println(dashatize(86320));
        System.out.println(dashatize(5311));

    }

    private static String dashatize(int num){
        return String.valueOf(num)
                .replaceAll("([13579])", "-$1-")
                .replaceAll("--", "-")
                .replaceAll("^-|-$", "");
    }

}
/*
Given an integer, return a string with dash '-' marks before and after each odd digit,
but do not begin or end the string with a dash mark.

EX:
274 -> '2-7-4'
6815 -> '68-1-5'
 */