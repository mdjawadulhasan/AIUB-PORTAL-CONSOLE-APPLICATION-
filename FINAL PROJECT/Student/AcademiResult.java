
package Student;


public class AcademiResult extends Result{

    int NoOfCousreComplete;
    public AcademiResult() {
    }

    public AcademiResult(float CGPA, float TOTAL_CREDIT,int NoOfCousreComplete) {
        super(CGPA, TOTAL_CREDIT);
        this.NoOfCousreComplete=NoOfCousreComplete;
    }

    public String SubArr[]=new String[]{"INTRODUCTION TO PROGRAMMING","INTRODUCTION TO PROGRAMMING LAB","NTRODUCTION TO COMPUTER STUDIES","DIFF CALCULUS AND COORDINATE GEOMETRY","ENGLISH READING SKILLS & PUBLIC SPEAKING","PHYSICS 1","PHYSICS 1 LAB"};
   
   public void showResult()
   {
       System.out.print("--------------------------------------------\n");
       System.out.println("Credit(s) Completed :"+TOTAL_CREDIT);
       System.out.println("Course(s) Completed :"+NoOfCousreComplete);
       System.out.println("Cgpa                :"+CGPA);
       System.out.println("Completed Courses are :.................\n");
       for (int i = 0; i < SubArr.length; i++) {
           System.out.println((i+1)+". "+SubArr[i]); 
       }
       
       
       
   }
    
}
