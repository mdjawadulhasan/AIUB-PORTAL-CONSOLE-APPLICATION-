package Student;

public class Student {

    public String Name, Id, Blood_Group, Department, Batch;
    private String Admission_Date, E_mail;
    private int Age;
    private float cgpa;
    public Result result;
	public CourseManagement courseManagement;
    public ClassSchedule classSchedule;
    public Student() {
    }

    public Student(ClassSchedule classSchedule) {
        this.classSchedule = classSchedule;
    }

    public Student(Result result) {
        this.result = result;
    }

    public Student(CourseManagement courseManagement) {
        this.courseManagement = courseManagement;
    }

    public Student(String Name, String Id, String Blood_Group, String Department, String Batch, String Admission_Date, String E_mail, int Age, float cgpa) {
        this.Name = Name;
        this.Id = Id;
        this.Blood_Group = Blood_Group;
        this.Department = Department;
        this.Batch = Batch;
        this.Admission_Date = Admission_Date;
        this.E_mail = E_mail;
        this.Age = Age;
        this.cgpa = cgpa;
    }

   

    public void setAdmission_Date(String Admission_Date) {
        this.Admission_Date = Admission_Date;
    }

    public void setE_mail(String E_mail) {
        this.E_mail = E_mail;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getAdmission_Date() {
        return Admission_Date;
    }

    public String getE_mail() {
        return E_mail;
    }

    public int getAge() {
        return Age;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public float getCgpa() {
        return cgpa;
    }
    
    public void showStudentInfo()
    {
        System.out.println("|-------------------------------------------------|\n");
        System.out.println("Name           :" + Name);
        System.out.println("ID             :" + Id);
        System.out.println("Blood Group    :" + Blood_Group);
        System.out.println("Department     :" + Department);
        System.out.println("Batch          :" + Batch);
        System.out.println("Admission Date :" + Admission_Date);
        System.out.println("E-mail ID      :" + E_mail);
        System.out.println("Age            :" + Age);
        System.out.println("CGPA           :" +cgpa);
        System.out.println("|-------------------------------------------------|\n");
    }
    
}
