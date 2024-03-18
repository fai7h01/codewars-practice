package kata_5kyu;

import java.util.Arrays;

import java.util.stream.Collectors;

public class PigLatin {
    public static void main(String[] args) {

        String str = "Pig latin is cool";
        System.out.println(pigIt(str));
        System.out.println(pigIt2(str));

    }
    private static String pigIt(String str){

        String[] arr = str.split(" ");
        String result = "";
        for (String each : arr) {
            if (Character.isLetter(each.charAt(0))){
                result += each.substring(1) + each.charAt(0) + "ay" + " ";
            }else{
                result+= each;
            }
        }
        return result.trim();

    }

    // OR

    private static String pigIt2(String str){

        return Arrays.stream(str.split(" "))
                .map(PigLatin::pigify)
                .collect(Collectors.joining(" "));

    }

    private static String pigify(String word){

        return Character.isLetter(word.charAt(0)) ? word.substring(1 ) + word.charAt(0) + "ay" : word;

    }
}
