package io.coderpad.think;

public class LearnAddition {

    /*

    My daughter is currently learning addition at school. She sometimes gets things wrongs when summing up two digits.
    Given two initial numbers and her calculated result, you have to check if it is correct.
    - If yes, output the string "ok"
    - If no, return the digit index on where she got it wrong (converted to a string).
      Unit digit has the index "0", tens digits has the index "1", etc.
    My daughter is not so bad, she gets at most only one digit wrong.
    She just began to learn addition, so there is no carry in any digit of all the numbers she has to sum up.
    All the numbers have a maximum of 5 digits, but the two initial numbers and the result may not have the same numbers
    of digits.

    Example:
    The two initial values are 123 and 672. her calculated result is 785.
    - Unit digit check: 3+2=5 ok
    - Tens digit check: 2+7=9, but my daughter wrote 8. it is wrong.
    - Hundreds digit check: 1+6=7 ok
    You must output "1", which is the index of the tens digit.

    Implement the method compute.
    Parameters:
     - valOne: (int) The first operand of the addition. Positive or zero.
     - valTwo: (int) The second operand of the addition. Positive or zero.
     - calcResult: (int) The addition result calculated by my daughter (may be wrong).
     Output: (String) the text 'ok' if the result is correct. The index digit where the error is, if the result is not correct.
     Constraints:
     0 <= valOne <= 99.999
     0 <= valTwo <= 99.999
     0 <= calcResult <= 99.999

     */

    public static String compute(int valOne, int valTwo, int calcResult) {

        String one = new StringBuilder(String.valueOf(valOne)).reverse().toString();
        String two = new StringBuilder(String.valueOf(valTwo)).reverse().toString();
        String result = new StringBuilder(String.valueOf(calcResult)).reverse().toString();

        int limit = Math.max(Math.max(one.length(), two.length()), result.length());

        for ( int i = 0; i < limit; i++ ) {

            int a = i < one.length() ? Character.getNumericValue(one.charAt(i)) : 0;
            int b = i < two.length() ? Character.getNumericValue(two.charAt(i)) : 0;
            int c = i < result.length() ? Character.getNumericValue(result.charAt(i)) : 0;

            boolean isOk = a + b == c;
            if ( !isOk ) return String.valueOf(i);
        }

        return "ok";

    }


}
