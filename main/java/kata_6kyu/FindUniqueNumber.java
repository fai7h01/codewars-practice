package kata_6kyu;

import java.util.Arrays;

public class FindUniqueNumber {

    private static double findUniq(double arr[]){

        Arrays.sort(arr);
        return arr[0] == arr[1]? arr[arr.length-1] : arr[0];

    }

}
/*
There is an array with some numbers. All numbers are equal except for one. Try to find it!
 */