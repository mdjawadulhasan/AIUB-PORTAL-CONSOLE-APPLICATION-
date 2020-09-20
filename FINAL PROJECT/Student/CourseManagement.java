package Student;

import java.io.*;
import java.util.Scanner;

public class CourseManagement implements IRegestration {

    private File file;
    private FileWriter writer;

    int code, regcredit;
    int arSize = 10;
    String registerdCourse[] = new String[arSize];
    int registeredCredit = 0;
    int registerdCourseCode[] = new int[arSize];
    String AvailableCourseName[] = new String[]{"DISCRETE MATHEMATICS", "ALGORITHMS ", "COMPILER DESIGN ", "ARTIFICIAL INTELLIGENCE AND EXPERT SYSTEM", "COMPUTER GRAPHICS", "COMPUTER NETWORKS", "DATA STRUCTURE", "INTRODUCTION TO COMPUTER STUDIE", "INTRODUCTION TO DATABASE", "OBJECT ORIENTED PROGRAMMING 1"};
    int CourseCode[] = new int[]{909, 232, 121, 234, 564, 342, 755, 230, 572, 978};
    int credit[] = new int[]{3, 3, 1, 3, 3, 3, 1, 1, 3, 3};

    public CourseManagement() {
    }

    @Override
    public void ShowAvailableSujects() {
        System.out.println("Offered Courses are ");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.println("Course Code :" + CourseCode[i] + " Credit :" + credit[i] + " Course Name :" + AvailableCourseName[i]);
        }
    }

    @Override
    public void Regestration() {
        System.out.print("\nHow Many Courses Do You Want To Take :");
        Scanner a = new Scanner(System.in);
        try {
               arSize = a.nextInt();
            } catch (Exception e) {
                System.out.print("\nYour selection can only be Integer"
                        + "\nYou have entered a wrong value");
              arSize=0;
            }
        

        for (int i = 0; i < arSize; i++) {
            System.out.print("Enter Course Code :");
            Scanner C = new Scanner(System.in);
            try {
                code = C.nextInt();
            } catch (Exception e) {
                System.out.print("\nYour selection can only be Integer!"
                        + "\nYou have entered a wrong value\n");
              break;
            }
        
           
            for (int j = 0; j < 10; j++) {
                if (code == CourseCode[j]) {
                    registerdCourse[i] = AvailableCourseName[j];
                    registerdCourseCode[i] = CourseCode[j];
                    registeredCredit = registeredCredit + credit[j];
                }
            }

        }
    }

    @Override
    public void CheckRegestration() {
        if (registeredCredit >= 12 && registeredCredit <= 18) {
            System.out.println("\n|************************************************|");
            System.out.println("|Success!!  Registretion Complete                  |");
            System.out.println("|Your Registered Credit is :" + registeredCredit+" |");
            System.out.println("|**************************************************|");
            System.out.println("Registered Courses are :\n");
            for (int i = 0; i < arSize; i++) {

                System.out.println(registerdCourseCode[i] + "     " + registerdCourse[i]);
                System.out.println("-----------------------------------------------------|");
            }

            try {
                file = new File("Registered Courses.txt");
                file.createNewFile();
                writer = new FileWriter(file);
                for (int i = 0; i < arSize ; i++) {
                    writer.write(registerdCourseCode[i] + "     " + registerdCourse[i] + "\r" + "\n");
                }
                
                writer.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }

        } else {
            System.out.println("\n|===============================================================|");
            System.out.println("|Your Registered Credit is :" + registeredCredit+"                |");
            System.out.println("|Registration is Not Completed.                                   |");
            System.out.println("|You Can not register less that 12 credit  or more than 18 credit.|");
            System.out.println("\n|===============================================================|");
        }

    }
}
