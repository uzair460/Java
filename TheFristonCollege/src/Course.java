/**
 * Represents a course with a unique ID, a title, and a fee.
 */
public class Course{
    private int courseId;
    private String courseTitle;
    private int courseFee;

    /**
     * Constructs a new Course object with the specified ID, title, and fee.
     * @param courseId the unique identifier for the course
     * @param courseTitle the title of the course
     * @param courseFee the fee for the course
     */
    public Course(int courseId, String courseTitle, int courseFee) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.courseFee = courseFee;
    }

    /**
     * Returns the unique identifier for the course.
     * @return the course ID
     */
    public int getCourseId() {
        return courseId;
    }

    /**
     * Sets the unique identifier for the course.
     * @param courseId the course ID to set
     */
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    /**
     * Returns the title of the course.
     * @return the course title
     */
    public String getCourseTitle() {
        return courseTitle;
    }

    /**
     * Sets the title of the course.
     * @param courseTitle the course title to set
     */
    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    /**
     * Returns the fee for the course.
     * @return the course fee
     */
    public int getCourseFee() {
        return courseFee;
    }

    /**
     * Sets the fee for the course.
     * @param courseFee the course fee to set
     */
    public void setCourseFee(int courseFee) {
        this.courseFee = courseFee;
    }

    /**
     * Prints the course information to the console.
     */
    public void printCourseInfo(){
        System.out.println("course id: "+courseId+" title: "+courseTitle+" fee: "+courseFee);
    }
}
