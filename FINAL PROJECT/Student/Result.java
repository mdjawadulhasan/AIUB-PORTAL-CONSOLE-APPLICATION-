
package Student;

import java.util.Scanner;

public class Result extends CalculatingGrade {

    public int size = 10;
    float MARKS[] = new float[size];
    float CREDIT[] = new float[size];
    float GRADE_POINT[] = new float[size];

    public Result() {
    }

    public Result(float CGPA, float TOTAL_CREDIT) {
        super(CGPA, TOTAL_CREDIT);
    }

    public Result(float TOTAL_GRADE_POINT, float CGPA, float TOTAL_CREDIT) {
        super(TOTAL_GRADE_POINT, CGPA, TOTAL_CREDIT);

    }

    public void takeInput() {
        System.out.print("Enter The Number Of Courses You Want To Calculte The Result :");
        Scanner isize = new Scanner(System.in);
        try {
                 size = isize.nextInt();
            } catch (Exception e) {
                System.out.println("\nYou have entered a wrong value!");
                System.out.print("Your selection can only be Integer!\n");
               size=0;
            }
       

        System.out.println("\n----------------------------------------------------");
        for (int i = 0; i < size; i++) {

            System.out.print("Enter Your MARKS            :");
            Scanner Fmarks = new Scanner(System.in);
            float fl;

            try {
                MARKS[i] = Fmarks.nextFloat();
            } catch (Exception e) {
                System.out.print("\nYour selection can only be float!"
                        + "\n you have entered a wrong value\n");
                break;
            }

            System.out.print("Enter Your Subjects Credit  :");
            Scanner Fcredit = new Scanner(System.in);
            float f2;
            try {
                CREDIT[i] = Fcredit.nextFloat();
            } catch (Exception e) {
                System.out.print("\nYour selection can only be float!"
                        + "\n you have entered a wrong value\n");
                break;
            }
            

            TOTAL_CREDIT = TOTAL_CREDIT + CREDIT[i];
            System.out.println("\n......................................................");
        }

    }

    @Override
    public void CalculateResult() {
        for (int i = 0; i < size; i++) {
            if (MARKS[i] <= 100 && MARKS[i] >= 90) {
                GRADE_POINT[i] = 4.00f;
            } else if (MARKS[i] < 90 && MARKS[i] >= 85) {
                GRADE_POINT[i] = 3.75f;
            } else if (MARKS[i] < 85 && MARKS[i] >= 80) {
                GRADE_POINT[i] = 3.50f;
            } else if (MARKS[i] < 80 && MARKS[i] >= 75) {
                GRADE_POINT[i] = 3.25f;
            } else if (MARKS[i] < 75 && MARKS[i] >= 70) {
                GRADE_POINT[i] = 3.00f;
            } else if (MARKS[i] < 70 && MARKS[i] >= 65) {
                GRADE_POINT[i] = 2.75f;
            } else if (MARKS[i] < 65 && MARKS[i] >= 60) {
                GRADE_POINT[i] = 2.50f;
            } else if (MARKS[i] < 60 && MARKS[i] >= 50) {
                GRADE_POINT[i] = 2.25f;
            } else if (MARKS[i] < 50 && MARKS[i] >= 0) {
                GRADE_POINT[i] = 0.00f;
            }

            TOTAL_GRADE_POINT = TOTAL_GRADE_POINT + (GRADE_POINT[i] * CREDIT[i]);

        }
        CGPA = TOTAL_GRADE_POINT / TOTAL_CREDIT;

    }

}
