package com.digiwes.test.teacherservice;

import com.digiwes.test.studentservice.StudentService;
import com.digiwes.test.sudentmodel.Student;

/**
 * Created by dongwh on 2016-3-1.
 */
public class TeacherService {
    public Student getStudentInfo(){
        StudentService studentService = new StudentService();
        return studentService.getStudentInfo();
    }
}
