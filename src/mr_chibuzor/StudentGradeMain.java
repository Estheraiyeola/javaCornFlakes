package mr_chibuzor;



public class StudentGradeMain {
    public static void main(String[] args) {
       StudentGrade activity = new StudentGrade();
       activity.collectInput();
       activity.collectingScoresForEachStudentAndSubject();
       activity.calculatingTotalForEachStudent();
       activity.calculatingTotalForEachSubject();
       activity.calculatingAverageForEachStudent();
       activity.calculatingAverageForEachSubject();
       activity.determinePositionOfStudents();
       activity.displayTable();
       activity.highestAndLowestScoringStudent();
       activity.classSummary();
    }
}
