package model;

/**
 * Created by Жека on 02.06.2014.
 */
public class Student {

    private String studentID;
    private String name;
    private String address;

    public Student(String studentID, String name, String address) {
        this.studentID = studentID;
        this.name = name;
        this.address = address;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
