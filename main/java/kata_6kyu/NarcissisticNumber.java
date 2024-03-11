package kata_6kyu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class NarcissisticNumber {
    public static void main(String[] args) {

        System.out.println(isNarcissistic(1634));

    }

    private static boolean isNarcissistic(int number){ // O(n);
        int temp = number;
        ArrayList<Integer> digits = new ArrayList<>();
        while(temp > 0){
            int digit = temp % 10;
            digits.add(digit);
            temp = temp / 10;
        }
        int result = 0;
        for (Integer digit : digits) {
            result += Math.pow(digit, digits.size());
        }
        return result == number;

    }

}
