package Faculty;
import java.util.Scanner;

public class Faculty implements IExamGradeAssign {

    public String Name, Id, Blood_Group, Department, position;
    private String JoiningDate, E_mail;
    private int Age;
	
    public SectionInfoAndTime sectionInfoAndTime;
    public Section3Info students;
	public Section2Info students2;
	public Section1Info students1;

   
    public Faculty() {
    }

    public Faculty(Section3Info students) {
        this.students = students;
    }
	
	public Faculty(Section2Info students2) {
        this.students2 = students2;
    }
	public Faculty(Section1Info students1) {
        this.students1 = students1;
    }

    public Faculty(String Name, String Id, String Blood_Group, String Department, String position, String JoiningDate, String E_mail, int Age) {
        this.Name = Name;
        this.Id = Id;
        this.Blood_Group = Blood_Group;
        this.Department = Department;
        this.position = position;
        this.JoiningDate = JoiningDate;
        this.E_mail = E_mail;
        this.Age = Age;
    }

    public Faculty(String Name, String Id, String Blood_Group, String Department, String position, String JoiningDate, String E_mail, int Age, SectionInfoAndTime sectionInfoAndTime) {
        this.Name = Name;
        this.Id = Id;
        this.Blood_Group = Blood_Group;
        this.Department = Department;
        this.position = position;
        this.JoiningDate = JoiningDate;
        this.E_mail = E_mail;
        this.Age = Age;
        this.sectionInfoAndTime = sectionInfoAndTime;
    }

    public void setJoiningDate(String JoinigDate) {
        this.JoiningDate = JoinigDate;
    }

    public void setE_mail(String E_mail) {
        this.E_mail = E_mail;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

 
    public String getJoiningDate() {
        return JoiningDate;
    }

    public String getE_mail() {
        return E_mail;
    }

    public int getAge() {
        return Age;
    }

 
    public void showFacultyInfo() {
        System.out.println("|-------------------------------------------------|\n");
         System.out.println("Name           :" + Name);
         System.out.println("ID             :" + Id);
         System.out.println("Blood Group    :" + Blood_Group);
         System.out.println("Department     :" + Department);
         System.out.println("Position       :" + position);
         System.out.println("Joinig Date    :" + JoiningDate);
         System.out.println("E-mail ID      :" + E_mail);
         System.out.println("Age            :" + Age);
        System.out.println("|-------------------------------------------------|\n");

    }

    
    public void AssignGrade() {
		
        for (int i = 0; i < 10; i++) {
            System.out.println("\nStudent ID   :" + students.Idarr[i]);
            System.out.println("Student Name :" + students.Namearr[i]);
            System.out.print("Give grade :");
            Scanner sc = new Scanner(System.in);
            String s;
            s = sc.nextLine();
            students.Gradearr[i] = s;
            System.out.println("-----------------------------");
        }
    }

    
    public void viewResult() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Student ID    :" + students.Idarr[i]+" Student Name  :" + students.Namearr[i]);
            System.out.println("Student grade :" + students.Gradearr[i]+"\n");
            
        }
    }

}
