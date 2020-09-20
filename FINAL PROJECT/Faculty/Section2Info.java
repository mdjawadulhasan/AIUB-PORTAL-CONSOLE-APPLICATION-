
package Faculty;


public class Section2Info extends SectionInfoAndTime {
    
    
String arr[][] = new String[][]{{"MD.Abid Hasan", "Tnaia Ahmed", "MD.Ishan Islam", "MD.Abdul Hasan", "Saidul Karim", "Imran Karim", "Jian Rahman", "Rais Rahman", "Junaed Haq", "Mehnin Khan"}, {"20-41979-3","20-4579-1","20-42339-1","19-42179-1","18-42323-3","17-40029-1","19-41979-2","20-41279-2","17-42239-3","20-41968-2"}, {"B+","A","A","A","A+","B+","A+","B+","D","C"}};

    public Section2Info(String Course2Name, String cousreSection2) {
        this.Course2Name = Course2Name;
        this.cousreSection2 = cousreSection2;

    }


    public void showStudentInfo() {
        System.out.println("\nCourse Name  :" + Course2Name);
        System.out.println("Section Name :" + cousreSection2);
        System.out.println("-------------------------------------------------");

        for (int i = 0, j = 1, k = 2; i < 1 && j < 2 && k < 3; i++, j++, k++) {
            for (int p = 0; p < 10; p++) {

               System.out.println("Student ID    :" + arr[j][p]+"  Student Name  :" + arr[i][p]);
                System.out.println("Student grade :" + arr[k][p]+"\n");

            }

        }

    }
}
