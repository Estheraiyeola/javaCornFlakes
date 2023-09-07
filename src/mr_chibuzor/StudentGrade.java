package mr_chibuzor;

import java.util.Scanner;

public class StudentGrade {
    private int[][] workSheet = new int[][]{};
    private double[] averageStorage = new double[]{};
    private double[] averageStorageForSubject = new double[]{};
    private final Scanner input = new Scanner(System.in);
    private int[] totalForEachSubjectStorage = new int[]{};
    private int numberOfStudents;
    private int numberOfSubjects;

    public void setNumberOfStudents(int numberOfStudents){
        this.numberOfStudents = numberOfStudents;
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    }

    public void setNumberOfSubjects(int numberOfSubjects){
        this.numberOfSubjects = numberOfSubjects;
    }

    public int getNumberOfSubjects(){
        return numberOfSubjects;
    }
    public void collectInput(){
        System.out.println("How many students do you have? ");
        numberOfStudents = input.nextInt();
        setNumberOfStudents(numberOfStudents);
        System.out.println("How many subjects do they offer? ");
        numberOfSubjects = input.nextInt();
        setNumberOfSubjects(numberOfSubjects);
        System.out.println("Saving  >>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved successfully");
    }

    public void collectingScoresForEachStudentAndSubject(){
        workSheet = new int[numberOfStudents][numberOfSubjects + 2];
        for (int index = 1; index <= numberOfStudents;index++) {
            for (int idx = 1; idx <= numberOfSubjects; idx++) {
                System.out.printf("Entering score for student %d\n", index);
                System.out.printf("Enter score for subject %d\n", idx);
                int userInput = input.nextInt();
                if (userInput >= 0 && userInput <= 100){
                    workSheet[index - 1][idx - 1] = userInput;
                    System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                    System.out.println("Saved successfully");
                }
                else {
                    System.out.println("Invalid number");
                    System.out.println("Start again");
                    collectingScoresForEachStudentAndSubject();
                }
            }
        }
    }

    public void calculatingTotalForEachStudent(){
        int total = 0;
        for (int index = 0; index < numberOfStudents; index++) {
            for (int idx = 0; idx < numberOfSubjects; idx++) {
                total += workSheet[index][idx];
                workSheet[index][numberOfSubjects] = total;
            }
            total = 0;
        }
    }
    public void calculatingTotalForEachSubject(){
        totalForEachSubjectStorage = new int[numberOfSubjects];
        int total = 0;
        for (int index = 0; index < numberOfSubjects; index++) {
            for (int idx = 0; idx < numberOfStudents; idx++) {
                total += workSheet[idx][index];
                totalForEachSubjectStorage[index] = total;
            }
            total = 0;
        }

    }

    public void calculatingAverageForEachStudent(){
        double average;
        averageStorage = new double[numberOfStudents];
        for (int index = 0; index < averageStorage.length; index++) {
            for (int idx = 0; idx < numberOfStudents; idx++) {
                average = (double)workSheet[index][numberOfSubjects] / numberOfSubjects;
                averageStorage[index] = average;
            }
            average = 0;
        }

    }
    public void  calculatingAverageForEachSubject(){
        averageStorageForSubject = new double[numberOfSubjects];
        for (int index = 0; index < totalForEachSubjectStorage.length; index++) {
            averageStorageForSubject[index] = (double) totalForEachSubjectStorage[index] / numberOfStudents;
        }
    }

    public void determinePositionOfStudents(){
        double[] copy = new double[numberOfStudents];
        double temp = 0;
        System.arraycopy(averageStorage, 0, copy, 0, averageStorage.length);
        for (int index = 0; index < averageStorage.length; index++) {
            for (int idx = index + 1; idx < copy.length; idx++) {
                if (copy[index] < copy[idx]){
                    temp = copy[index];
                    copy[index] = copy[idx];
                    copy[idx] = temp;
                }
            }
        }
        for (int index = 0; index < averageStorage.length; index++) {
            for (int idx = 0; idx < copy.length; idx++) {
                if (averageStorage[idx] == copy[index]){
                    workSheet[idx][numberOfSubjects + 1] = index + 1;
                }
            }
        }
    }

    public void displayTable(){
        String character = "=";
        System.out.println(character.repeat(30 * numberOfSubjects));
        System.out.print("STUDENT\t\t\t");
        for (int index = 1; index <= numberOfSubjects; index++) {
            System.out.printf("SUB%d\t", index);
        }
        System.out.print("TOT\t\t");
        System.out.print("AVE\t\t");
        System.out.println("POS\t\t");
        System.out.println(character.repeat(30 * numberOfSubjects));
        for (int index = 0; index < numberOfStudents; index++) {
            System.out.printf("Student %d\t\t", index + 1);
            for (int idx = 0; idx < numberOfSubjects; idx++) {
                System.out.printf("%d\t\t", workSheet[index][idx]);
            }
            System.out.printf("%d\t\t", workSheet[index][numberOfSubjects]);
            System.out.printf("%.2f\t", averageStorage[index]);
            System.out.printf("%d\n", workSheet[index][numberOfSubjects + 1]);
        }
        System.out.println(character.repeat(30 * numberOfSubjects));
        System.out.println(character.repeat(30 * numberOfSubjects));

    }
    public void highestAndLowestScoringStudent(){
        int[] passesStorage = new int[numberOfSubjects];
        int[] failureStorage = new int[numberOfSubjects];
        int[] highestScoringStudentStorage = new int[numberOfSubjects];
        int[] lowestScoringStudentStorage = new int[numberOfSubjects];
        int hardest = 0;
        int indexOfHardest = 0;
        int easiest = 0;
        int indexOfEasiest = 0;
        for (int index = 0; index < numberOfSubjects; index++) {
            int highest = 0;
            int lowest = 0;
            int indexOfHighest = 0;
            int indexOfLowest = 0;
            highest = workSheet[index][0];
            for (int idx = 0; idx < numberOfStudents; idx++) {
                if (workSheet[idx][index] > highest){
                    highest = workSheet[idx][index];
                    indexOfHighest = idx + 1;

                }
            }
            lowest = workSheet[index][0];
            for (int idx = 0; idx < numberOfStudents; idx++) {
                if (workSheet[idx][index] < lowest){
                    lowest = workSheet[idx][index];
                    indexOfLowest = idx + 1;

                }
            }
            highestScoringStudentStorage[index] = highest;
            lowestScoringStudentStorage[index] = lowest;
            System.out.println("SUBJECT SUMMARY");
            System.out.printf("Subject %d\n", index + 1);
            System.out.printf("Highest scoring student is: Student %d scoring %d\n", indexOfHighest + 1, highestScoringStudentStorage[index]);
            System.out.printf("Lowest scoring student is: Student %d scoring %d\n", indexOfLowest + 1, lowestScoringStudentStorage[index]);
            System.out.printf("Total score is: %d\n", totalForEachSubjectStorage[index]);
            System.out.printf("Average score is: %.2f\n", averageStorageForSubject[index]);
            int passCounter = 0;
            int failCounter = 0;
            for (int idx = 0; idx < numberOfStudents; idx++) {
                if (workSheet[idx][index] < 50){
                    failCounter++;
                }
                if (workSheet[idx][index] > 50) {
                    passCounter++;
                }
            }
            passesStorage[index] = passCounter;
            failureStorage[index] = failCounter;
            System.out.printf("Number of passes: %d\n", passCounter);
            System.out.printf("Number of fails: %d\n", failCounter);
            System.out.println();
            System.out.println();
            for (int idx = 0; idx < numberOfStudents; idx++) {
                hardest = failureStorage[0];
                if (failureStorage[index] > hardest){
                    hardest = failureStorage[index];
                }
                indexOfHardest = index ;
            }
            for (int idx = 0; idx < numberOfStudents; idx++) {
                easiest = passesStorage[0];
                if (passesStorage[index] > easiest){
                    easiest = passesStorage[index];
                }
                indexOfEasiest = idx;
            }
        }
        System.out.printf("The hardest subject is Subject %d with %d failures\n", indexOfHardest, hardest);
        System.out.printf("The easiest subject is Subject %d with %d passes\n", indexOfEasiest, easiest);
        int highestScore = workSheet[0][0];
        int indexOfHighestScore = 0;
        int idxofHighestScore = 0;
        int lowestScore = workSheet[0][0];
        int indexOfLowestScore = 0;
        int idxOfLowestScore = 0;
        for (int index = 0; index < workSheet.length; index++) {
            for (int idx = 0; idx < numberOfSubjects; idx++) {
                if (workSheet[index][idx] >= highestScore){
                    highestScore = workSheet[index][idx];
                    indexOfHighestScore = index + 1;
                    idxofHighestScore = idx + 1;
                }
            }
            for (int idx = 0; idx < numberOfSubjects; idx++) {
                if (workSheet[index][idx] <= lowestScore){
                    lowestScore = workSheet[index][idx];
                    indexOfLowestScore = index + 1;
                    idxOfLowestScore = idx + 1;
                }
            }
        }
        System.out.printf("The overall Highest score is scored by Student %d in subject %d scoring %d\n", indexOfHighestScore, idxofHighestScore, highestScore);

        System.out.printf("The overall Lowest score is scored by Student %d in subject %d scoring %d\n", indexOfLowestScore, idxOfLowestScore, lowestScore);
        String character = "=";
        System.out.println(character.repeat(30 * numberOfSubjects));
        System.out.println();
        System.out.println();
    }

    public void classSummary(){
        System.out.println("CLASS SUMMARY");
        String character = "=";
        System.out.println(character.repeat(30 * numberOfSubjects));
        int bestGraduatingScore = workSheet[0][numberOfSubjects];
        int indexOfBestGraduatingScore = 0;
        int worstGraduatingScore = workSheet[0][numberOfSubjects];
        int indexOfWorstGraduatingScore = 0;
        for (int index = 0; index < numberOfStudents; index++) {
            for (int idx = 0; idx < numberOfSubjects; idx++) {
                if (workSheet[idx][index] >= bestGraduatingScore){
                    bestGraduatingScore = workSheet[idx][index];
                    indexOfBestGraduatingScore = index + 1;
                }
            }
            for (int idx = 0; idx < numberOfSubjects; idx++) {
                if (workSheet[index][numberOfSubjects] < worstGraduatingScore){
                    worstGraduatingScore = workSheet[index][numberOfSubjects];
                    indexOfWorstGraduatingScore = index + 1;
                }
            }
        }
        System.out.printf("Best Graduating Student is: Student %d scoring %d\n", indexOfBestGraduatingScore, bestGraduatingScore );
        System.out.println(character.repeat(30 * numberOfSubjects));
        System.out.println();
        System.out.println();
        System.out.println("!".repeat(30 * numberOfSubjects));
        System.out.printf("Worst Graduating Student is: Student %d scoring %d\n", indexOfWorstGraduatingScore, worstGraduatingScore );
        System.out.println("!".repeat(30 * numberOfSubjects));
        System.out.println();
        System.out.println();
        System.out.println(character.repeat(30 * numberOfSubjects));
        int classTotal = 0;
        double classAverage = 0.00;
        for (int index = 0; index < numberOfStudents; index++) {
            for (int idx = 0; idx < numberOfSubjects; idx++) {
                classTotal += workSheet[index][idx];
            }
            classAverage += averageStorage[index];
        }
        System.out.printf("Class total score is: %d\n", classTotal);
        System.out.printf("Class Average score is: %.2f\n", classAverage / numberOfStudents);
    }

}
