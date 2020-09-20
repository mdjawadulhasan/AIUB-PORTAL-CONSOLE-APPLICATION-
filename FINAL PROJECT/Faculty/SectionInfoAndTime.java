package Faculty;


public class SectionInfoAndTime {
    
    public String Course1Name, Course2Name, Course3Name;
    public String cousreSection1, cousreSection2, cousreSection3;
    public String Cs1LabTime, Cs1TheoryTime, Cs2LabTime, Cs2TheoryTime, Cs3LabTime, Cs3TheoryTime;

    public SectionInfoAndTime() {
    }

    public SectionInfoAndTime(String Course1Name, String cousreSection1) {
        this.Course1Name = Course1Name;
        this.cousreSection1 = cousreSection1;
    }

    
    public SectionInfoAndTime(String Course1Name, String Course2Name, String Course3Name, String cousreSection1, String cousreSection2, String cousreSection3, String Cs1Lab1Time, String Cs1TheoryTime, String Cs2Lab1Time, String Cs2TheoryTime, String C3Lab1Time, String Cs3TheoryTime) {
        this.Course1Name = Course1Name;
        this.Course2Name = Course2Name;
        this.Course3Name = Course3Name;
        this.cousreSection1 = cousreSection1;
        this.cousreSection2 = cousreSection2;
        this.cousreSection3 = cousreSection3;
        this.Cs1LabTime = Cs1Lab1Time;
        this.Cs1TheoryTime = Cs1TheoryTime;
        this.Cs2LabTime = Cs2Lab1Time;
        this.Cs2TheoryTime = Cs2TheoryTime;
        this.Cs3LabTime = C3Lab1Time;
        this.Cs3TheoryTime = Cs3TheoryTime;
    }

    public void showSchedule() {
        
        System.out.println("|-------------------------------------------------|");
        System.out.println("|"+Course1Name + " [" + cousreSection1 + "]");
        System.out.println("|Lab: " + Cs1LabTime);
        System.out.println("|Thory :" + Cs1TheoryTime);
        System.out.println("|\n-----------------------------------------------|");
        System.out.println("|"+Course2Name + " [" + cousreSection2 + "]");
        System.out.println("|Lab: " + Cs2LabTime);
        System.out.println("|Thory :" + Cs2TheoryTime);
        System.out.println("|\n-----------------------------------------------|");
        System.out.println("|"+Course3Name + " [" + cousreSection3 + "]");
        System.out.println("|Lab: " + Cs3LabTime);
        System.out.println("|Thory :" + Cs3TheoryTime);
        System.out.println("|-------------------------------------------------|\n");
    }

    public void showStudentInfo() {
        System.out.println("Student Infromation");
    }
}

