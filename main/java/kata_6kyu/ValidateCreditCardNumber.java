package kata_6kyu;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ValidateCreditCardNumber {

    public static void main(String[] args) {

        System.out.println(validate("91"));
        System.out.println(validate("123"));
        System.out.println(validate("2121"));
        System.out.println(validate("26"));
        System.out.println(validate("8675309"));

    }

    private static boolean validate(String n){ // O(n)

        List<Integer> digits = Arrays.stream(n.split(""))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        int i = 1;
        if (digits.size() % 2 == 0){
            i = 0;
        }
        for (; i < digits.size(); i+=2){
            digits.set(i, digits.get(i) * 2);
        }
        for (int j = 0; j < digits.size(); j++) {
            if (digits.get(j) > 9){
                digits.set(j, (digits.get(j) % 10) +1);
            }
        }
        int result = digits.stream().reduce(Integer::sum).get();
        return result % 10 == 0;

    }
 }

/*
In this Kata, you will implement the Luhn Algorithm, which is used to help validate credit card numbers.

Given a positive integer of up to 16 digits, return true if it is a valid credit card number, and false if it is not.

Here is the algorithm:

Double every other digit, scanning from right to left, starting from the second digit (from the right).

Another way to think about it is: if there are an even number of digits, double every other digit starting with the first; if there are an odd number of digits, double every other digit starting with the second:

If a resulting number is greater than 9, replace it with the sum of its own digits (which is the same as subtracting 9 from it):

Finally, take that sum and divide it by 10. If the remainder equals zero, the original credit card number is valid.
 */