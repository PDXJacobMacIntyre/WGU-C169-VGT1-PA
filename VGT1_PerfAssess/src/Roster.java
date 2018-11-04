
import java.util.ArrayList;

/*Jacob MacIntyre
* This is the Roster class of VGT1 project for WGU C169, Perf. Assess.
*/

public class Roster 
{

    static ArrayList<Student> studRoster = new ArrayList<>();

    public static void main(String[] args) 
    {
        // For an add method: Roster.add(studentID, firstName, lastName, emailAddress, age, grade1, grade2, grade3)
        // Adds student data
        Roster.add("1", "John", "Smith", "John1989@gmail.com", 20, 88, 79, 59);
        add("2", "Suzan", "Erickson", "Erickson_1990@gmailcom", 19, 91, 72, 85);
        add("3", "Jack", "Napoli", "The_lawyer99yahoo.com", 19, 85, 84, 87);
        add("4", "Erin", "Black", "Erin.black@comcast.net", 22, 91, 98, 82);
        add("5", "Jacob", "MacIntyre", "jmacin1@wgu.edu", 43, 95, 95, 95);

        // Prints the list of all students
        print_All();

        // Prints invalid e-mail addresses
        for (Student e : studRoster)
            print_Invalid_Email(e.getEmailAddress());

        // Prints average grade for each student ID
        for (Student s : studRoster)
            print_Average_Grade(s.getStudentID());

        // Removes a student by Student ID. Results in "Student ID: 3 is not found" message
        remove("3");
        remove("3");
    }

    // Add method
    public static void add(String studentID, String firstName, String lastName, String emailAddress, int age,
        double grade1, double grade2, double grade3) 
    {
        // Should be the same order as the constructor in Student class
        double[] grades = { grade1, grade2, grade3};
        Student newStudent = new Student(studentID, firstName, lastName, emailAddress, age, grades);
        // Creates a new student
        studRoster.add(newStudent);
    }

    public static void print_All() 
    {
        // Loop through the ArrayList called studRoster
        for (int i = 0; i < studRoster.size(); i++) 
        { 
            // Get each student and call the print method
            studRoster.get(i).print();
        }
    }

    public static void print_Invalid_Email(String emailAddress) 
    {
        // System.out.println("Invalid Email Address: ");
        for(Student e : studRoster)
        {
            // String invalidAddress = e.getEmailAddress();
            if (!emailAddress.contains("@") || !emailAddress.contains(".") || emailAddress.contains(" "))
            {
                System.out.println(emailAddress + " is an invalid e-mail address");
                return;
            }
        }
    }

    public static void print_Average_Grade(String studentID) 
    {
        // Loop through the ArrayList called studRoster enhanced for loop
        for (Student s : studRoster) 
        {
            if(s.getStudentID().equals(studentID)) 
            {
            // Calculate the avg.
            double average = ( s.getGrades()[0] + s.getGrades()[1] + s.getGrades()[2]) / 3.0;
            System.out.println("Student ID:\t" + s.getStudentID() + "\tAvg Grade: " + average);
            return;
            }
        }
    }

    // Remove a student from the roster by student ID
    public static void remove(String studentID)
    {
        for (int i = 0; i < studRoster.size(); i++)
        {
            String verifyID = studRoster.get(i).getStudentID();
            if (verifyID.equals(studentID))
            {
                studRoster.remove(i);
                System.out.printf("Student ID: %s is not found.\n", studentID);
                return;
            }
        }
    }

    /*
    * Performance Assessment Requirements:
    * print_all();
    * print_invalid_emails();
    * loop through the ArrayList and for each element:
    * print_average_grade (current_loop_student);
    * remove ("3");
    * remove ("3");
    * expected: this should print a message saying such a student with this ID was not found
    */
}



