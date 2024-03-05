import java.util.*;

import java.text.SimpleDateFormat;

public class Enrolment {
    private ArrayList<Student> enrolStudents;
    private ArrayList<Course> enrolCourses;
    private ArrayList<String> enrolDate;


public Enrolment(){
    enrolStudents = new ArrayList<Student>();
    enrolCourses = new ArrayList<Course>();
    enrolDate = new ArrayList<String>();
    
}

public String dateStr(){

return java.time.LocalDate.now().toString();
} 
  

public void addenrollment(Student student, Course course) {
    enrolStudents.add(student);
    enrolCourses.add(course);
    enrolDate.add(dateStr());
    System.out.println("Enrollment added successfully for Student ID: " + student.getStudentNumber() + " on the Course: " + course.getCourseId() + "on the date: " + dateStr());
}

public void printEnrollments() {
    System.out.println("List of Enrollments:");
    for (int i = 0; i < enrolStudents.size(); i++) {
        System.out.println("Student ID: " + enrolStudents.get(i).getStudentNumber() + " | Student Name: " + enrolStudents.get(i).getFistName() + " | Course ID: " + enrolCourses.get(i).getCourseId() + " | Course Name: " + enrolCourses.get(i).getCourseTitle() + " | Enrolment Date: " + enrolDate.get(i));
    }
}

public void printEnrollmentsBetweenDates(Date startDate, Date endDate) {
    System.out.println("List of Enrollments between " + startDate + " and " + endDate + ":");
    for (int i = 0; i < enrolStudents.size(); i++) {
        Date currentDate = convertStringToDate(enrolDate.get(i));
        if (currentDate.compareTo(startDate) >= 0 && currentDate.compareTo(endDate) <= 0) {
            System.out.println("Student ID: " + enrolStudents.get(i).getStudentNumber() + " | Student Name: " + enrolStudents.get(i).getFistName() + " | Course ID: " + enrolCourses.get(i).getCourseId() + " | Course Name: " + enrolCourses.get(i).getCourseTitle() + " | Enrolment Date: " + enrolDate.get(i));
        }
    }
}
private Date convertStringToDate(String dateStr) {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    try {
        Date date = dateFormat.parse(dateStr);
        return date;
    } catch (Exception ex) {
        System.out.println("Error parsing date: " + ex.getMessage());
        return null;
    }
}




}
 