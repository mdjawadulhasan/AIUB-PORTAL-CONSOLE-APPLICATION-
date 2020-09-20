
package Faculty;


public class Section3Info extends SectionInfoAndTime {
    
    String Namearr[] = new String[]{"MD.Rifat Hasan", "Tisha Ahmed", "MD.Nir Islam", "MD.Abdul jaid", "Sakib Karim", "Nasif Hasan", "Jiaul Rahman", "Rain Rahman", "Hasan Haq", "Maisha Khan"};
    String Idarr[] = new String[]{"19-45449-3", "20-34345-1", "19-35232-2", "19-54532-3", "20-41090-3", "18-40029-2", "19-41979-2", "20-41279-2", "17-42239-3", "20-41968-2"};
    String Gradearr[] = new String[]{"B+", "A", "A", "A", "A+", "B+", "A+", "B+", "D", "C"};

    public Section3Info() {
    }

    
    public Section3Info(String Course3Name, String cousreSection3) {
        this.Course3Name = Course3Name;
        this.cousreSection3 = cousreSection3;

    }

    
    public void showStudentInfo() {
        System.out.println("\nCourse Name  :" + Course3Name);
        System.out.println("Section Name :" + cousreSection3);
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println("Student ID    :" + Idarr[i]+" Student Name  :" + Namearr[i]);
            System.out.println("Student grade :" + Gradearr[i]+"\n");
            
        }

    }
}
