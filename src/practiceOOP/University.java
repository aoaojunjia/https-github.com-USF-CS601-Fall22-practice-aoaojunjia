package practiceOOP;

import java.io.*;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;


/** A class that represents a University */
public class University {
    // Instance variables
    private String name; // name of the university (like University of San Francisco)
    private List<Student> students; // list of students at this university
    // Feel free to add another data structure, for instance a HashMap that maps names to students

    /**
     * Constructor for class University.
     * Takes the name of university as a parameter
     * @param name name of university
     */
    public University(String name) {
        // TODO: initialize instance variable name
        this.name = name;
        // TODO: Create an ArrayList and assign a reference to it to instance variable students
        students = new ArrayList<Student>();

    }

    /**
     * Create a student a student with this name and id and
     * add the student to the list of students
     * @param studentName name of the student
     * @param studentId id of the student
     */
    public void addStudent(String studentName, int studentId) {
        // TODO: create a student with this name and id
        Student  person = new Student(studentName, studentId);
        students.add(person);
    }

    /** Return true if a person with the given name is a student at this university,
     * and false otherwise.
     * For the purpose of this exercise we assume that names are unique.
     * @param name name of the person
     * @return true if this person is a student at this university
     */
    public boolean findStudent(String name) {
        // TODO: check if the student with this name is in the ArrayList
        for(Student i : students){
            if(i.getName().equals(name)) return  true;
        }
        return false;
    }

    /**
     * Return a string representation of the university
     * @return a string that contains the name of the university on the first line, and
     * then includes students: one student (name, id) on each line
     */
    public String toString() {
        // TODO: return a string representation of the university - see description above
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append("\r\n");

        for(int i = 0; i < students.size(); i++){
            sb.append( students.get(i).getName() +  "," + students.get(i).getId());
            if(i != students.size() - 1) sb.append("\r\n");
        }

        return sb.toString(); // remember to change this
    }

    /**
     * Sorts the ArrayList of students by name in increasing order.
     */

    public void sort() {
        // TODO: sort students.
        // Note: implement compareTo method in class Student first
        Collections.sort(students);

    }

    /** Load information about students from the csv file.
     *  Each line of the file contains the name of the student and the id, separated by comma
     *
     * @param filePath Path to the input file
     */
    public void loadStudentDataFromFile(Path filePath) throws FileNotFoundException {
        // TODO: read from the file, create student objects and add them to the list of students
        // HINT: Consider using function split from class String
        // Integer.parseInt method takes a String representation of an integer like "123" and returns an integer
        String line = "";

        FileReader br = new FileReader(filePath.toString());

        Scanner scan = new Scanner(br);
        while(scan.hasNextLine()){
                line = scan.nextLine();
                String[] my_arr = line.split(",");
                students.add(new Student(my_arr[0], Integer.parseInt(my_arr[1])));
        }

    }
}
