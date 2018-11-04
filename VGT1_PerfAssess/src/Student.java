
/*Jacob MacIntyre
* This is the Student class of VGT1 project for WGU C169, Perf. Assess.
*/

public class Student 
{

    // Instance variables

    private String studentID;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private int age;
    private double[] grades;

    // Constructor

    public Student(String studentID, String firstName, String lastName, String emailAddress, int age, double[] grades) 
    {
        setStudentID(studentID);
        setFirstName(firstName);
        setLastName(lastName);
        setEmailAddress(emailAddress);
        setAge(age);
        setGrades(grades);
    }

    // Accessors - get methods

    public String getStudentID() 
    {
        return studentID;
    }

    public String getFirstName() 
    {
        return firstName;
    }

    public String getLastName() 
    {
        return lastName;
    }

    public String getEmailAddress() 
    {
        return emailAddress;
    }

    public int getAge() 
    {
        return age;
    }

    public double[] getGrades() 
    {
        return grades;
    }

    // Mutators - set methods

    public void setStudentID(String studentID) 
    {
        this.studentID = studentID;
    }

    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }

    public void setEmailAddress(String emailAddress) 
    {
        this.emailAddress = emailAddress;
    }

    public void setAge(int age) 
    {
        this.age = age;
    }

    public void setGrades(double[] grades) 
    {
        this.grades = grades;
    }

    // Print function

    public void print() 
    {
        System.out.println("Student ID:\t" + getStudentID() + "\tFirst Name:\t" + getFirstName()
                + "\tLast Name:\t" + getLastName() + "\tE-mail:\t" + getEmailAddress() + "\tAge:\t" + getAge()
                + "\t" + getGrades()[0] + "\t" + getGrades()[1] + "\t" + getGrades()[2]);
    }

}
