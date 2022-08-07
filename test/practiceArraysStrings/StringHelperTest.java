package practiceArraysStrings;

import org.junit.Test;
import static org.junit.Assert.*;

/** StringHelperTest class contains tests for class StringHelper */
public class StringHelperTest {

    @Test
    public void testCountVowels1() {
        String s = "apple sauce";
        int expected = 5;
        assertEquals("countVowels fails for input: " + s, expected, StringHelper.countVowels(s));
    }

    @Test
    public void testCountVowels2() {
        String s = "klmnpr";
        int expected = 0;
        assertEquals("countVowels fails for input: " + s, expected, StringHelper.countVowels(s));
    }

    @Test
    public void testEncrypt1() {
        String input = "abcdefghijklmnopqrstuvwxyz";
        String expected = "bcdefghijklmnopqrstuvwxyza";
        assertEquals("encrypt fails for input " + input + " shift 1", expected, StringHelper.encrypt(input, 1));
    }


    @Test
    public void testEncrypt2() {
        String input = "a*b*";
        String expected = null;
        assertEquals("encrypt fails for input " + input + " shift 1", expected, StringHelper.encrypt(input, 1));
    }

}
