package practiceOOP;

import java.io.FileNotFoundException;
import java.nio.file.*;

/** The Driver class for the Student and University example.
 *  You do not need to change this class. */
public class Driver {
    public static void main(String[] args) throws FileNotFoundException {
        // The first command line argument should be the path to the csv file
        if (args.length < 1) {
            System.out.println("No input file provided");
            return;
        }

        Path file = Paths.get(args[0]); //args[0] is the first command line argument
        University uni = new University("University of San Francisco");
        uni.loadStudentDataFromFile(file);
        System.out.println(uni.toString());

    }
}
