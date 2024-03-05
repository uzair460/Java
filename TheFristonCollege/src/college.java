import java.util.*;

public class college {
    private ArrayList<Student> listStudent;
    private ArrayList<Course> listCourses;
    
    

    public college() {
        listStudent = new ArrayList<Student>();
        listCourses = new ArrayList<Course>();

    }

    public void addStudent(Student student) {
        listStudent.add(student);
    }

    public Student getStudentByID(int studentID) {
        for(Student student : listStudent) {
            if(student.getStudentNumber() == studentID) {
                return student;
            }
        }
        System.out.println("Student with ID " + studentID + " not found.");
        return null;
    }

    public void printStudentsBySurname(String searchStr) {
        boolean found = false;
        for(Student student : listStudent) {
            if(student.getLastName().contains(searchStr)) {
                System.out.println(student.getFistName()+" "+student.getLastName());
                found = true;
            }
        }
        if(!found) {
            System.out.println("No students found with surname containing \"" + searchStr + "\"");
        }
    }

    public void removeStudent(int studentID) {
        boolean removed = false;
        Iterator<Student> iterator = listStudent.iterator();
        while(iterator.hasNext()) {
            Student student = iterator.next();
            if(student.getStudentNumber() == studentID) {
                iterator.remove();
                System.out.println("Student with ID " + studentID + " removed.");
                removed = true;
                break;
            }
        }
        if(!removed) {
            System.out.println("Student with ID " + studentID + " not found.");
        }
    }

    public void addCourse(Course course) {
        listCourses.add(course);
    }

    public Course getCourseByID(int courseID) {
        for(Course course : listCourses) {
            if(course.getCourseId() == courseID) {
                return course;
            }
        }
        System.out.println("Course with ID " + courseID + " not found.");
        return null;
    }

    public void printCoursesByTitle(String searchStr) {
        boolean found = false;
        for(Course course : listCourses) {
            if(course.getCourseTitle().contains(searchStr)) {
                System.out.println(course.getCourseTitle());
                found = true;
            }
        }
        if(!found) {
            System.out.println("No courses found with title containing \"" + searchStr + "\"");
        }
    }

    public void removeCourse(int courseID) {
        boolean removed = false;
        Iterator<Course> iterator = listCourses.iterator();
        while(iterator.hasNext()) {
            Course course = iterator.next();
            if(course.getCourseId() == courseID) {
                iterator.remove();
                System.out.println("Course with ID " + courseID + " removed.");
                removed = true;
                break;
            }
        }
        if(!removed) {
            System.out.println("Course with ID " + courseID + " not found.");
        }
    }

}