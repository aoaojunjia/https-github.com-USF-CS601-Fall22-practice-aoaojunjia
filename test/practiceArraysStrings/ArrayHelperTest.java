package practiceArraysStrings;

import org.junit.*;
import practiceArraysStrings.ArrayHelper;
import java.util.Arrays;
import static org.junit.Assert.*;

/** ArrayHelperTest class contains tests for class ArrayHelper */
public class ArrayHelperTest {

    @Test
    public void testFind1() {
        int[] arr = {5, 1, 9, 4, 8, 10, 2};
        boolean expected = true;
        assertEquals("find fails for input: " + Arrays.toString(arr), expected, ArrayHelper.find(arr, 10));
    }

    @Test
    public void testFind2() {
        int[] arr = {5, 1, 9, 4, 8, 10, 2};
        boolean expected = false;
        assertEquals("find fails for input: " + Arrays.toString(arr), expected, ArrayHelper.find(arr, 12));
    }

    @Test
    public void testSum() {
        int[] arr = {5, 1, 9, 4, 8, 10, -2};
        int expected = 35;
        assertEquals("sum fails for input: " + Arrays.toString(arr), expected, ArrayHelper.sum(arr));
    }

    @Test
    public void testThreshold1() {
        int[] arr = {5, 1, 9, 4, 8, 10, -2};
        boolean expected = true;
        assertEquals("threshold fails for input: " + Arrays.toString(arr), expected, ArrayHelper.threshold(arr, 11));
    }


    @Test
    public void testThreshold2() {
        int[] arr = {4, 1, 6, -2, -10, 0};
        boolean expected = false;
        assertEquals("threshold fails for input: " + Arrays.toString(arr), expected, ArrayHelper.threshold(arr, 5));
    }

    @Test
    public void testCountOccurrences1() {
        int[] arr = {4, 1, 6, -2, 1, 0};
        int expected = 2;
        assertEquals("countOccurrences fails for input: " + Arrays.toString(arr), expected, ArrayHelper.countOccurrences(arr, 1));

    }

    @Test
    public void testCountOccurrences2() {
        int[] arr = {4, 1, 6, -2, 1, 0};
        int expected = 0;
        assertEquals("countOccurrences fails for input: " + Arrays.toString(arr), expected, ArrayHelper.countOccurrences(arr, 7));

    }

    @Test
    public void testDuplicates1() {
        int[] arr = {4, 1, 6, -2, -10, 6, 7, 0};
        boolean expected = true;
        assertEquals("hasDuplicates fails for input: " + Arrays.toString(arr), expected, ArrayHelper.hasDuplicates(arr));
    }

    @Test
    public void testDuplicates2() {
        int[] arr = {4, 1, 6, -2, -10, 3, 7, 0};
        boolean expected = false;
        assertEquals("hasDuplicates fails for input: " + Arrays.toString(arr), expected, ArrayHelper.hasDuplicates(arr));
    }
}
