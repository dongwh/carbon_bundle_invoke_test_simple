package com.digiwes.test.sudentmodel;


/**
 * Created by dongwh on 2016-3-1.
 */
public class Student {
    //Logger LOG = LoggerFactory.getLogger(Student.class);

    private String studentName;
    private String studentAge;

    public Student(String studentName, String studentAge) {
        System.out.println("student bundle Student Constructor ");
        this.studentName = studentName;
        this.studentAge = studentAge;
    }


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(String studentAge) {
        this.studentAge = studentAge;
    }
}
