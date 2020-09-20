package Student;


public class ClassSchedule {
    public String Course1, Course2,Course3,Course4,Course5;
    public String cousreSection1, cousreSection2, cousreSection3,cousreSection4,cousreSection5;
    public String Cs1Time,Cs2Time,Cs3Time, Cs4Time, Cs5Time;

    public ClassSchedule() {
    }

    public ClassSchedule(String Course1, String Course2, String Course3, String Course4, String Course5, String cousreSection1, String cousreSection2, String cousreSection3, String cousreSection4, String cousreSection5, String Cs1Time, String Cs2Time, String Cs3Time, String Cs4Time, String Cs5Time) {
        this.Course1 = Course1;
        this.Course2 = Course2;
        this.Course3 = Course3;
        this.Course4 = Course4;
        this.Course5 = Course5;
        this.cousreSection1 = cousreSection1;
        this.cousreSection2 = cousreSection2;
        this.cousreSection3 = cousreSection3;
        this.cousreSection4 = cousreSection4;
        this.cousreSection5 = cousreSection5;
        this.Cs1Time = Cs1Time;
        this.Cs2Time = Cs2Time;
        this.Cs3Time = Cs3Time;
        this.Cs4Time = Cs4Time;
        this.Cs5Time = Cs5Time;
    }

   
    public void showSchedule() {
        
        System.out.println("|-------------------------------------------------\n");
        System.out.println("|"+Course1 + " [" + cousreSection1 + "]");
        System.out.println("|Time " + Cs1Time);
        System.out.println("|-------------------------------------------------|");
        System.out.println("|"+Course2 + " [" + cousreSection2 + "]");
        System.out.println("|Time " + Cs2Time);
        System.out.println("|-------------------------------------------------|");
        System.out.println("|"+Course3 + " [" + cousreSection3 + "]");
        System.out.println("|Time " + Cs3Time);
        System.out.println("|-------------------------------------------------|");
        System.out.println("|"+Course4 + " [" + cousreSection4 + "]");
        System.out.println("|Time " + Cs4Time);
        System.out.println("|-------------------------------------------------|");
        System.out.println("|"+Course5 + " [" + cousreSection5 + "]");
        System.out.println("|Time " + Cs5Time);
        System.out.println("|-------------------------------------------------|");
    }
    
}
