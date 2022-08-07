package practiceOOP;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;

/** UniversityTest contains test methods for class University */
public class UniversityTest {

    @Test
    public void testAddStudent() {
        University uni = new University("Mumbai University");
        uni.addStudent("Pooja Garg", 103513);
        String expected = "Mumbai University" + System.lineSeparator() + "Pooja Garg," + 103513;
        assertEquals("testAddStudent fails. ", expected, uni.toString());
    }

    @Test
    public void testFindStudent1() {
        University uni = new University("University of San Francisco");
        uni.addStudent("Pooja Garg", 103513);
        uni.addStudent("Larry Li", 102567);
        uni.addStudent("Carlos Hernandez", 101343);

        boolean expected = true;
        assertEquals("testFindStudent1 fails. ", expected, uni.findStudent("Carlos Hernandez"));
    }

    @Test
    public void testFindStudent2() {
        University uni = new University("University of San Francisco");
        uni.addStudent("Pooja Garg", 103513);
        uni.addStudent("Larry Li", 102567);
        uni.addStudent("Carlos Hernandez", 101343);

        boolean expected = false;
        assertEquals("testFindStudent2 fails. ", expected, uni.findStudent("Amir Khan"));
    }

    @Test
    public void testSort1() {
        University uni = new University("University of San Francisco");
        uni.addStudent("Larry Li", 102567);
        uni.addStudent("Abbie Cains", 103513);
        uni.addStudent("Carlos Hernandez", 101343);
        uni.sort();
        String expected = "University of San Francisco" + System.lineSeparator() + "Abbie Cains,103513" + System.lineSeparator() + "Carlos Hernandez,101343" +
                System.lineSeparator() + "Larry Li,102567";
        assertEquals("testSort1 fails. ", expected, uni.toString());

    }

    @Test
    public void testLoadFromFile() throws FileNotFoundException {
        University uni = new University("Jilin");
        uni.loadStudentDataFromFile(Paths.get("src/main/java/practiceOOP/students.csv"));
        String expected = "Jilin" + System.lineSeparator() + "Elizabeth Chen,102112" + System.lineSeparator()
                + "John Smith,103851" + System.lineSeparator() +
                "Priya Singh,104447" + System.lineSeparator() +
                "Carlos Hernandez,101353" + System.lineSeparator() +
                "Veronica Mars,1035564";
        assertEquals("testLoadFromFile fails. ", expected, uni.toString());
    }
}
