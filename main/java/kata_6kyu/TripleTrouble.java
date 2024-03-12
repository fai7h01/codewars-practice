package kata_6kyu;

public class TripleTrouble {
    public static void main(String[] args) {

        System.out.println(tripleDouble(451999277, 477722899));
        System.out.println(tripleDouble(12345, 12345));
        System.out.println(tripleDouble(666789, 12345667));
    }

    private static int tripleDouble(long num1, long num2){

        String str1 = String.valueOf(num1);
        String str2 = String.valueOf(num2);

        for (int i = 0; i < 10; i++){
            String n = String.valueOf(i);
            if (str1.contains(n+n+n) && str2.contains(n+n)){
                return 1;
            }
        }
        return 0;

    }
}
/*
Write a function

TripleDouble(long num1, long num2)
which takes numbers num1 and num2 and returns 1 if there is a straight triple of a number at any place in num1 and also a straight double of the same number in num2.

If this isn't the case, return 0

TripleDouble(451999277, 41177722899) == 1
TripleDouble(12345, 12345) == 0
TripleDouble(666789, 12345667) == 1
 */