package io.coderpad.think;

import java.util.Collections;
import java.util.List;

public class LargeNumber {

    /*
     * Implement the method findLargest(numbers), so it returns the largest number from the list numbers.
     * Notes:
     * - numbers contains only integers.
     * - numbers always contains at least one element, and never contains more than 10 elements.
     * - The integers are ranged from -2^31 to +2^31-1 (they always fit in a 32-bit signed integer)
     * Parameters: numbers (List<Integer>)
     * Return value: (int) The largest value among the numbers given in parameters
     * Example:
     * [ 42, 10, 75, 3 ] should return 75
     */

    public static int findLargest(List<Integer> numbers) {

        int aux = 0;
        for ( int number : numbers ) {
            if (number > aux ) aux = number;
        }
        return aux;

    }

    public static int findLargestTwo(List<Integer> numbers) {

        return Collections.max(numbers);

    }

}
