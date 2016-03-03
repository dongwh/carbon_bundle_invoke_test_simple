package com.digiwes.test.activator;

import com.digiwes.test.sudentmodel.Student;
import com.digiwes.test.teacherservice.TeacherService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * Created by dongwh on 2016-3-1.
 */
public class MainActivator implements BundleActivator  {
    public void start(BundleContext context) throws Exception {
        try {

            System.out.println("school start  ##############################################################################################timePeriod");

            TeacherService teacherService = new TeacherService();
            Student student = teacherService.getStudentInfo();
            System.out.println(student.getStudentName());
            System.out.println(student.getStudentAge());

            System.out.println("school end  ##############################################################################################timePeriod");



        } catch (Exception ex) {
            //Logger.getLogger(MainActivator.class.getName()).log(Level.SEVERE, null, ex);
            throw new Exception(ex);
        }
    }

    public void stop(BundleContext context) throws Exception {

    }
    public static void main(String args[]) throws Exception {
        BundleActivator mainActivator = new MainActivator();
        //mainActivator.start(null);
        TeacherService teacherService = new TeacherService();
        Student student = teacherService.getStudentInfo();
        System.out.println(student.getStudentName());
        System.out.println(student.getStudentAge());
        //System.in.read();
        mainActivator.stop(null);
    }
}
