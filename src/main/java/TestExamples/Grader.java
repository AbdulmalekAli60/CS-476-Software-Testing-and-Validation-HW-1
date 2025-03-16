package TestExamples;

public class Grader {

    public char determineGradeLetter(int gradeNumber){
        if(gradeNumber < 0 || gradeNumber > 100 ){
           throw new IllegalArgumentException("Wrong grade range");
        }
         if (gradeNumber < 60) {
            return 'F';
        }
         if (gradeNumber < 70) {
            return 'D';
        }
         if (gradeNumber < 80) {
            return 'C';
        }
        if (gradeNumber < 90) {
            return 'B';
        }
        else {
            return 'A';
        }
    }
}

