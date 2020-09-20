
package Faculty;


public class Section1Info extends SectionInfoAndTime {
    
 String arr[][] = new String[][]{{"MD.Jawadul Hasan", "Tasnova Ahmed", "MD.Ishan Islam", "MD.Abid Hasan", "Said Karim", "Imran Hasan", "Rifat Rahman", "Rasha Rahman", "Junaed Siddiq", "Mehrin Khan"}, {"20-41979-1","20-4579-2","20-41979-1","20-42379-2","20-42323-3","19-42329-1","20-41979-1","20-41279-1","18-42179-2","20-41979-2"}, {"A+","A+","A","A","B+","B+","A+","B","B+","C"}};

    public Section1Info(String Course1Name, String cousreSection1) {
        super(Course1Name,cousreSection1);

    }

   
    public void showStudentInfo() {
        System.out.println("\nCourse Name  :" + Course1Name);
        System.out.println("Section Name :" + cousreSection1);
        System.out.println("-------------------------------------------------");

        for (int i = 0, j = 1, k = 2; i < 1 && j < 2 && k < 3; i++, j++, k++) {
            for (int p = 0; p < 10; p++) {

                System.out.println("Student ID    :" + arr[j][p]+"  Student Name  :" + arr[i][p]);
                System.out.println("Student grade :" + arr[k][p]+"\n");
              

            }

        }

    }
}


