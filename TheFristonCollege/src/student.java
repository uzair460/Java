/*@author Uzair Anjum
 * 
 * 
 * 
 * 
 * 
 */
import java.util.*;
class Student {
    private  String fistName;
    private String lastName;
    private int phoneNumber;
    private static int lastid=0;
    private int studentNumber;

 public Student(String fistName, String lastName, int phoneNumber) {
        lastid++;
        this.fistName = fistName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.studentNumber= lastid;
        
    }

public String getFistName() {
    return fistName;
}

public void setFistName(String fistName) {
    this.fistName = fistName;
}

public String getLastName() {
    return lastName;
}

public void setLastName(String lastName) {
    this.lastName = lastName;
}

public int getPhoneNumber() {
    return phoneNumber;
}

public void setPhoneNumber(int phoneNumber) {
    this.phoneNumber = phoneNumber;
}

public int getStudentNumber() {
    return studentNumber;
}

public void setStudentNumber() {
    Random rand = new Random();
    int min = 100000; // minimum value for the random number
    int max = 999999; // maximum value for the random number
    int randomNum = rand.nextInt((max - min) + 1) + min; // generate random number between min and max (inclusive)
    this.studentNumber = randomNum;
}


public void printStudentInfo(){
System.out.println("student id "+studentNumber+" name: "+fistName+" surname: "+lastName+" phone number: "+phoneNumber);

}

}
