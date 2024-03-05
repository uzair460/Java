import java.util.*;
import java.text.SimpleDateFormat;
public class test {
    public static void main(String[] args) {
        // create some students
        Student s1 = new Student("John", "Doe", 123456789);
        Student s2 = new Student("Jane", "Smith", 987654321);
        Student s3 = new Student("mark", "spencer",923432212);
        s1.printStudentInfo();
        s2.printStudentInfo();
        s3.printStudentInfo();
        // create some courses
        Course c1 = new Course(1, "Introduction to Programming", 1000);
        Course c2 = new Course(2, "Data Structures and Algorithms", 1500);

        // create enrollment
        Enrolment e1 = new Enrolment();

        // create a college
        college c = new college();
        
        // add students and courses to the college
        c.addStudent(s1);
        c.addStudent(s2);
        c.addCourse(c1);
        c.addCourse(c2);

        //enroll students to cources
        e1.addenrollment(s1,c1);
        e1.addenrollment(s2,c2);
        e1.addenrollment(s3, c2);

        //print all enrollments
        e1.printEnrollments();

    

        
        //test getting a student by ID
        Student s = c.getStudentByID(1);
        System.out.println(s.getFistName() + " " + s.getLastName()); // should print "John Doe"
        
        // test printing students by surname
        c.printStudentsBySurname("Smith"); // should print "Jane Smith"
        
        // test removing a student
        c.removeStudent(2);
        c.printStudentsBySurname("Smith"); // should print "No students found with surname containing "Smith""
        
        // test getting a course by ID
        Course c3 = c.getCourseByID(1);
        System.out.println(c3.getCourseTitle()); // should print "Introduction to Programming"
        
        // test printing courses by title
        c.printCoursesByTitle("Data"); // should print "Data Structures and Algorithms"
        
        // test removing a course
        c.removeCourse(2);
        c.printCoursesByTitle("Data"); // should print "No courses found with title containing "Data""

        //test enrollment between 2 dates
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date startDate = dateFormat.parse("2023-05-01");
            Date endDate = dateFormat.parse("2023-05-01");
            e1.printEnrollmentsBetweenDates(startDate, endDate);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }}
    
    


