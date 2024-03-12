package kata_6kyu;

import java.util.Arrays;

public class AreTheySame {
    public static void main(String[] args) {

        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
        System.out.println(comp(a, b));


    }

    private static boolean comp(int[] a, int[] b){

        if (a == null || b == null) return false;

        int[] squared = Arrays.stream(a).map(n -> n * n).toArray();

        Arrays.sort(squared);
        Arrays.sort(b);

        return Arrays.compare(squared, b) == 0;
    }
}
/*Given two arrays a and b write a function comp(a, b) (orcompSame(a, b))
that checks whether the two arrays have the "same" elements,
with the same multiplicities (the multiplicity of a member is the number of times it appears).
"Same" means, here, that the elements in b are the elements in a squared, regardless of the order.

a = [121, 144, 19, 161, 19, 144, 19, 11]
b = [121, 14641, 20736, 361, 25921, 361, 20736, 361]
 */