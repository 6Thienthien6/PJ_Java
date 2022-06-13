package test;

public class TestReturnGradeMethod {
    public static void main(String[] args) {
        System.out.println("the Grade is: " + getGrade(70.5));
        System.out.println("the Grade is: " + getGrade(59.5));
    }

    public static char getGrade(double score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';

        } else if (score >= 60) {
            return 'D';
        } else if (score >= 50) {
            return 'E';
        } else {
            return 'F';
        }
    }
}
