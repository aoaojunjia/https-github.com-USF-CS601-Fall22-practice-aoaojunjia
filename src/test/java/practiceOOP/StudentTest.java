package practiceOOP;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/** StudentTest class contains tests for class Student */
public class StudentTest {

    @Test
    public void testConstructorName() {
        Student st  = new Student("Jason Bui", 104567);
        String expected = "Jason Bui";
        assertEquals("testConstructorName fails; name is wrong. ", expected, st.getName());
    }


    @Test
    public void testConstructorId() {
        Student st  = new Student("Jason Bui", 104567);
        int expectedId = 104567;
        assertEquals("testConstructorId fails; id is wrong. ", expectedId, st.getId());
    }

    @Test
    public void testToString() {
        Student st  = new Student("Jason Bui", 104567);
        String expected = "Jason Bui,104567";
        assertEquals("testToString fails. ", expected, st.toString());
    }

    @Test
    public void testCompareTo1() {
        Student st1  = new Student("B", 1);
        Student st2  = new Student("A", 2);
        boolean expected = true;
        assertEquals("testCompareTo1 fails. ", expected, st1.compareTo(st2) > 0);
    }

    @Test
    public void testCompareTo2() {
        Student st1  = new Student("Jones", 2);
        Student st2  = new Student("Zonk", 1);
        boolean expected = true;
        assertEquals("testCompareTo2 fails. ", expected, st1.compareTo(st2) < 0);
    }

    @Test
    public void testCompareTo3() {
        Student st1  = new Student("Jay Kumar", 1);
        Student st2  = new Student("Jay Kumar", 2);
        boolean expected = true;
        assertEquals("testCompareTo1 fails. ", expected, st1.compareTo(st2) < 0);
    }

}

