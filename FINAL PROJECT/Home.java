import Faculty.*;
import Student.*;
import University.*;
import java.util.Scanner;

public class Home {

    public static void main(String[] args) {

        SecurityManagement SM = new SecurityManagement("2020", "2019", "2018");

        for (int l = 0; l < 10; l++) {
            int count = 0;
            int lo = 0;

            for (int i = 0; i < 5; i++) {
                System.out.println("                    +\n"
                        + "	        +       +\n"
                        + "              +           +\n"
                        + "             +     AIUB    +\n"
                        + "             +    PORTAL   +\n"
                        + "              +           +\n"
                        + "                +       +\n"
                        + "                    +");

                System.out.print("Enter Your ID  :");
                Scanner so = new Scanner(System.in);
                String id = so.nextLine();
                System.out.print("Enter Your Password  :");
                Scanner po = new Scanner(System.in);
                String pass = po.nextLine();

                if (id.equals(SM.getADID()) && pass.equals(SM.getUpass())) {

                    System.out.println("  =====================================");
                    System.out.println("|           Welcome to AIUB Portal      |");
                    System.out.println("   =====================================");
                    for (int j = 0; j < 10; j++) {
                        Scanner sc = new Scanner(System.in);
                        System.out.println("|------------------------------|");
                        System.out.println("|   1.Student Information      |");
                        System.out.println("|------------------------------|");
                        System.out.println("|   2.Faculty Information      |");
                        System.out.println("|------------------------------|");
                        System.out.println("|   3.About University         |");
                        System.out.println("|------------------------------|");
                        System.out.println("|   4.Log out                  |");
                        System.out.println("|==============================|\n");

                        System.out.print("Press Any Of The Menu No. To Go Next :");
                        int select = 0;
                        try {
                            select = sc.nextInt();

                        } catch (Exception e) {
                            System.out.print("Your selection can only be an integer!");
                        }
                        switch (select) {
                            case 1:
                                Student s1 = new Student("MD.Ishan Islam", "20-41950-1", "A+", "CSE", "20-1", "19-11-2019", "ishan@gmail.com", 20, 4.00f);
                                Student s2 = new Student("MD.Jawadul Hasan", "19-45950-2", "AB+", "CSE", "19-2", "19-5-2019", "jawad@gmail.com", 21, 4.00f);
                                Student s3 = new Student("Tasnova Ahmed", "19-34550-1", "O-", "CSE", "19-1", "10-11-2018", "tasnova@gmail.com", 21, 4.00f);
                                Student s4 = new Student("MD.Jahid Rahman", "19-34950-2", "B+", "EEE", "19-2", "17-5-2019", "jahid@gmail.com", 21, 3.97f);
                                Student s5 = new Student("MD.Riyad Karim", "18-34550-1", "O+", "EEE", "18-1", "10-11-2017", "riyad@gmail.com", 22, 3.95f);
                                University A = new University(s1, s2, s3, s4, s5);
                                A.showTopStudentsInfo();
                                break;
                            case 2:
                                Faculty f1 = new Faculty("Dr.Rahim Islam", "1719-1099-1", "AB+", "cse", "Senior Assistant Professor", "17-10-17", "drrahim@gmail.com", 40);
                                Faculty f2 = new Faculty("Dr.Abid Islam", "1619-1109-2", "A+", "cse", "Senior Assistant Professor", "11-10-16", "drabid@gmail.com", 42);
                                Faculty f3 = new Faculty("Dr.Asma Akter", "1519-1209-1", "0+", "cse", "Senior Assistant Professor", "4-7-15", "drakter@gmail.com", 35);
                                Faculty f4 = new Faculty("Dr.Rahman Islam", "1119-1109-3", "B+", "EEE", "Associate Professor", "1-5-11", "drrahmna@gmail.com", 30);
                                Faculty f5 = new Faculty("Dr.Jabbar Haque", "1819-2102-2", "0+", "English", "Assistant Professor", "19-8-18", "drjabbar@gmail.com", 37);
                                University B = new University(f1, f2, f3, f4, f5);
                                B.showTopFaculties();

                                break;
                            case 3:
                                University U = new University();
                                U.showAboutUniversity();
                                break;
                            case 4:
                                lo = select;
                                break;
                            default:
                                System.out.println(" You have entered a wrong Value");
                        }
                        j--;
                        if (lo == 4) {
                            break;
                        }
                    }
                    break;
                } else if (id.equals(SM.getFID()) && pass.equals(SM.getFpass())) {
                    System.out.println("  =====================================");
                    System.out.println("|           Welcome to AIUB Portal      |");
                    System.out.println("   =====================================\n");
                    for (int j = 0; j < 10; j++) {

                        Scanner sc = new Scanner(System.in);
                        System.out.println("|------------------------------|");
                        System.out.println("|   1.My Info                  |");
                        System.out.println("|------------------------------|");
                        System.out.println("|   2.Class Schedule           |");
                        System.out.println("|------------------------------|");
                        System.out.println("|   3.Student Information      |");
                        System.out.println("|------------------------------|");
                        System.out.println("|   4.Assign Exam Grade        |");
                        System.out.println("|------------------------------|");
                        System.out.println("|   5.Log out                  |");
                        System.out.println("|==============================|\n");

                        System.out.print("Press Any Of The Menu No. To Go Next :");

                        int select = 0;
                        try {
                            select = sc.nextInt();
                        } catch (Exception e) {
                            System.out.print("Your selection can only be an integer!");

                        }
                        switch (select) {
                            case 1:
                                Faculty f1 = new Faculty("Dr.Rahim Islam", "1719-1099-1", "AB+", "cse", "Senior Assistant Professor", "17-10-17", "drrahim@gmail.com", 40);
                                f1.showFacultyInfo();
                                break;

                            case 2:
                                SectionInfoAndTime sectionInfoAndTime = new SectionInfoAndTime("OBJECT ORIENTED PROGRAMMING 1 (JAVA)", "INTRODUCTION TO PROGRAMMING", "OBJECT ORIENTED PROGRAMMING 1 (JAVA)", "O", "B3", "A", "Sun 2:0 PM - Sun 5:0 PM ", "Tue 2:0 PM - Tue 4:0 PM", "Mon 2:0 PM - Sun 5:0 PM", "Wed Tue 2:0 PM - Tue 4:0 PM", "Wed 8:0 AM - Sun 11:0 AM", "Mon 8:0 AM - Sun 10:00AM");
                                sectionInfoAndTime.showSchedule();
                                break;
                            case 3:
                                System.out.println("|------------------------------|");
                                System.out.println("|   1.Section 1                |");
                                System.out.println("|------------------------------|");
                                System.out.println("|   2.Section 2                |");
                                System.out.println("|------------------------------|");
                                System.out.println("|   3.Section 3                |");
                                System.out.println("|------------------------------|");
                                System.out.print("Press Any Of The Menu No. To Go Next :");
                                int menu_no = 0;
                                try {
                                    menu_no = sc.nextInt();
                                } catch (Exception e) {
                                    System.out.print("Your selection can only be an integer!");

                                }
                                switch (menu_no) {
                                    case 1:
                                        SectionInfoAndTime s1 = new Section1Info("OBJECT ORIENTED PROGRAMMING 1 (JAVA)", "O");
                                        s1.showStudentInfo();
                                        break;
                                    case 2:
                                        SectionInfoAndTime s2 = new Section2Info("INTRODUCTION TO PROGRAMMING", "B3");
                                        s2.showStudentInfo();
                                        break;
                                    case 3:
                                        SectionInfoAndTime s3 = new Section3Info("OBJECT ORIENTED PROGRAMMING 1 (JAVA)", "A");
                                        s3.showStudentInfo();
                                        break;

                                    default:
                                        System.out.println(" You have entered a wrong Value");

                                }
                                break;

                            case 4:
                                Section3Info students = new Section3Info();
                                Faculty F = new Faculty(students);
                                F.AssignGrade();
                                System.out.println("\n...............Showing Result----------------------------\n");
                                F.viewResult();
                                break;
                            case 5:
                                lo = select;
                                break;
                            default:
                                System.out.println(" You have entered a wrong  Value");
                        }
                        if (lo == 5) {
                            break;
                        }
                        j--;
                    }
                    break;

                } else if (id.equals(SM.getSDID()) && pass.equals(SM.getSpass())) {
                    System.out.println("  =====================================");
                    System.out.println("|           Welcome to AIUB Portal      |");
                    System.out.println("   =====================================\n");
                    for (int p = 0; p < 10; p++) {

                        Scanner sc = new Scanner(System.in);
                        System.out.println("|------------------------------|");
                        System.out.println("|   1.My Info                  |");
                        System.out.println("|------------------------------|");
                        System.out.println("|   2.View Result              |");
                        System.out.println("|------------------------------|");
                        System.out.println("|   3.Class Schedule           |");
                        System.out.println("|------------------------------|");
                        System.out.println("|   4.Registration             |");
                        System.out.println("|------------------------------|");
                        System.out.println("|   5.Log out                  |");
                        System.out.println("|==============================|\n");
                        System.out.print("Press Any Of The Menu No. To Go Next :");
                        int select = 0;
                        try {
                            select = sc.nextInt();
                        } catch (Exception e) {
                            System.out.print("Your selection can only be an integer!");

                        }
                        switch (select) {
                            case 1:
                                Student s1 = new Student("MD.Ishan Islam", "20-41958-1", "A+", "CSE", "20-1", "19-11-2019", "ishan@gmail.com", 20, 4.00f);
                                s1.showStudentInfo();
                                break;

                            case 2:
                                System.out.println("|------------------------------|");
                                System.out.println("|   1.Academic Result          |");
                                System.out.println("|------------------------------|");
                                System.out.println("|   2.Calculate Result         |");
                                System.out.println("|------------------------------|");

                                System.out.print("\nPress Any Of The Menu No. To Go Next :");
                                int menu_n = 0;
                                try {
                                    menu_n = sc.nextInt();
                                } catch (Exception e) {
                                    System.out.print("Your selection can only be an integer!");

                                }
                                switch (menu_n) {
                                    case 1:
                                        AcademiResult A = new AcademiResult(4.00f, 15.00f, 7);
                                        A.showResult();
                                        break;
                                    case 2:
                                        Result s = new Result(0, 0, 0);
                                        s.takeInput();
                                        s.CalculateResult();
                                        System.out.println("Your Cgpa is :" + s.getCGPA()+"\n");

                                        break;

                                    default:
                                        System.out.println(" You have entered a wrong Value");

                                }
                                break;
                            case 3:

                                ClassSchedule ch = new ClassSchedule("OBJECT ORIENTED PROGRAMMING 1 (JAVA)", "INTRODUCTION TO PROGRAMMING", "DATA STRUCTURE", "ALGORITHMS", "MACHINE LEARNING", "O", "B3", "A", "D", "F", "Sun 2:0 PM - Sun 5:0 PM ", "Tue 2:0 PM - Tue 4:0 PM", "Mon 2:0 PM - Sun 5:0 PM", "Wed Tue 2:0 PM - Tue 4:0 PM", "Wed 8:0 AM - Sun 11:0 AM");
                                ch.showSchedule();
                                break;
                            case 4:
                                CourseManagement cs = new CourseManagement();
                                cs.ShowAvailableSujects();
                                cs.Regestration();
                                cs.CheckRegestration();

                                break;
                            case 5:
                                lo = select;
                                break;
                            default:
                                System.out.println(" You have entered a wrong  Value");
                        }
                        if (lo == 5) {
                            break;
                        }
                        p--;
                    }
                    break;

                } else {
                    System.out.println("\n|-------------------------------------------|");
                    System.out.println("|YOUR ID AND PASSWORD DIDNT MATCHED         |");
                    System.out.println("|Please try Again                           |");
                    
                    count++;
                    if (count > 2) {
                        System.out.println("\n|*********************************************|");
                        System.out.println("|Your Account is Locked Contact with VUES OFFICE|");
                        System.out.println("|*********************************************|");
                        break;

                    }

                }

            }
            if (count > 2) {

                break;
            }
        }

    }
}
