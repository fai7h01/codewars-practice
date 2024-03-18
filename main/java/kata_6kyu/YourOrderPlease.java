package kata_6kyu;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class YourOrderPlease {
    public static void main(String[] args) {

        String s = "is2 Thi1s T4est 3a";
        System.out.println(order(s));

    }


    private static String order(String words){

        String[] arr = words.split(" ");
        Arrays.sort(arr,Comparator.comparingInt(YourOrderPlease::getNumber));
        return String.join(" ", arr);

    }

    private static int getNumber(String s){

        int[] numbers = {1,2,3,4,5,6,7,8,9};
        int result = -1;
        for (int number : numbers) {
            if (s.contains(String.valueOf(number))){
                result = number;
                break;
            }
        }
        return result;
    }

}
