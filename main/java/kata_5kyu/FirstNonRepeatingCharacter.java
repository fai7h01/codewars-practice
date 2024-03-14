package kata_5kyu;

import java.util.*;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        System.out.println(firstNonRepeatingCharacter("stress"));
        System.out.println(firstNonRepeatingCharacter2("stress"));

    }

    private static String firstNonRepeatingCharacter(String s){

        String[] list = s.split("");

        for (String eachCharacter : list) {
            int count = 0;
            for (String each : list) {
                if (each.equalsIgnoreCase(eachCharacter)){
                    count++;
                }
            }
            if (count == 1){
                return eachCharacter;
            }
        }
        return "";

    }

    private static String firstNonRepeatingCharacter2(String s){

        Map<String,Integer> map = new LinkedHashMap<>();
        String[] arr = s.split("");
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (map.containsKey(arr[i])){
                map.replace(arr[i],map.get(arr[i]) + 1);
            }else{
                map.put(arr[i],count);
            }
        }
        for (String string : map.keySet()) {
            if (map.get(string) == 1){
                return string;
            }
        }
        return "";

    }
}
