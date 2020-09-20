package Student;

public abstract class CalculatingGrade {
   public  float TOTAL_GRADE_POINT;
   protected float CGPA;
   public  float TOTAL_CREDIT;

    public CalculatingGrade() {
    }

    public CalculatingGrade(float CGPA, float TOTAL_CREDIT) {
        this.CGPA = CGPA;
        this.TOTAL_CREDIT = TOTAL_CREDIT;
    }
   
    public CalculatingGrade(float TOTAL_GRADE_POINT, float CGPA, float TOTAL_CREDIT) {
        this.TOTAL_GRADE_POINT = TOTAL_GRADE_POINT;
        this.CGPA = CGPA;
        this.TOTAL_CREDIT = TOTAL_CREDIT;
    }

  
    public void setCGPA(float CGPA) {
        this.CGPA = CGPA;
    }

    public float getCGPA() {
        return CGPA;
    }
   
   public abstract void CalculateResult();
    
}
