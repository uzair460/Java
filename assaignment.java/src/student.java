class student {
    private  String fistName;
    private String lastName;
    private int phoneNumber;
    private int studentNumber;

 public student(String fistName, String lastName, int phoneNumber, int studentNumber) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.studentNumber = studentNumber;
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

public void setStudentNumber(int studentNumber) {
    this.studentNumber = studentNumber;
}

}
