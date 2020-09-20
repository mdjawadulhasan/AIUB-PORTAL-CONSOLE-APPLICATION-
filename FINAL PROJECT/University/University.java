package University;

import Faculty.Faculty;
import Student.Student;
import java.io.*;

public class University {

    public Student student[] = new Student[5];
    public Faculty facultie[] = new Faculty[5];
    SecurityManagement securityManagement;
    private File file2;
    private FileReader reader;
    private BufferedReader bfr;

    public University() {
    }

    public University(SecurityManagement securityManagement) {
        this.securityManagement = securityManagement;
    }

    public University(Student s1, Student s2, Student s3, Student s4, Student s5, Faculty f1, Faculty f2, Faculty f3, Faculty f4, Faculty f5) {

        this.student[0] = s1;
        this.student[1] = s2;
        this.student[2] = s3;
        this.student[3] = s4;
        this.student[4] = s5;
        this.facultie[0] = f1;
        this.facultie[1] = f2;
        this.facultie[2] = f3;
        this.facultie[3] = f4;
        this.facultie[4] = f5;

    }

    public University(Student s1, Student s2, Student s3, Student s4, Student s5) {

        this.student[0] = s1;
        this.student[1] = s2;
        this.student[2] = s3;
        this.student[3] = s4;
        this.student[4] = s5;

    }

    public University(Faculty f1, Faculty f2, Faculty f3, Faculty f4, Faculty f5) {

        this.facultie[0] = f1;
        this.facultie[1] = f2;
        this.facultie[2] = f3;
        this.facultie[3] = f4;
        this.facultie[4] = f5;

    }

    public void showTopStudentsInfo() {
        System.out.println("\n-------------Showing Top Students Information-----------------------\n");
        for (int i = 0; i < 5; i++) {
            System.out.println("Name           :" + student[i].Name);
            System.out.println("ID             :" + student[i].Id);
            System.out.println("Blood Group    :" + student[i].Blood_Group);
            System.out.println("Department     :" + student[i].Department);
            System.out.println("Admission Date :" + student[i].getAdmission_Date());
            System.out.println("E-mail ID      :" + student[i].getE_mail());
            System.out.println("Age            :" + student[i].getAge());
            System.out.println("Cgpa           :" + student[i].getCgpa() + "\n\n ");

        }

    }

    public void showTopFaculties() {
        System.out.println("\n-------------Showing Top Faculties Information-----------------------\n");
        for (int j = 0; j < 5; j++) {
            System.out.println("Name           :" + facultie[j].Name);
            System.out.println("ID             :" + facultie[j].Id);
            System.out.println("Blood Group    :" + facultie[j].Blood_Group);
            System.out.println("Department     :" + facultie[j].Department);
            System.out.println("Position       :" + facultie[j].position);
            System.out.println("Joinig Date    :" + facultie[j].getJoiningDate());
            System.out.println("E-mail ID      :" + facultie[j].getE_mail());
            System.out.println("Age            :" + facultie[j].getAge() + "\n\n ");
        }
    }

    public void showAboutUniversity() {
            System.out.println("\n");
        try {
            file2 = new File("About.txt");
            reader = new FileReader(file2);
            bfr = new BufferedReader(reader);
            String text = "", temp;

            while ((temp = bfr.readLine()) != null) {
                text = text + temp + "\n" + "\r";
            }

            System.out.print(text);
            reader.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
         System.out.println("\n");
    }

}
