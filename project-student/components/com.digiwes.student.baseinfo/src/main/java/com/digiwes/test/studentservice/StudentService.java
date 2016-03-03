package com.digiwes.test.studentservice;


import com.digiwes.test.sudentmodel.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by dongwh on 2016-3-1.
 */
public class StudentService {

    private static final Logger LOG = LoggerFactory.getLogger(StudentService.class);

    public Student getStudentInfo(){

        LOG.info("Student bundle StudentService getStudentInfo start ");
        System.out.println("Student bundle StudentService getStudentInfo start");

        String name = "student_dongwh";
        String age = "18";
        return new Student(name, age);
    }

    
}

