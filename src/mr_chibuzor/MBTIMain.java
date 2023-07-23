package mr_chibuzor;
import mr_chibuzor.MBTI;
public class MBTIMain {
    public static void main(String[] args) {
        MBTI activity = new MBTI();
        String name = "Esther Aiyeola Oluwatobiloba";
        activity.responseStorage = new String[5][4];
        activity.questions = new String[20][2];
        activity.personality = new String[4];
        activity.questions();
        activity.nameMethod(name);
        System.out.println(activity.getNameMethod());
        activity.questionOne();
        activity.questionTwo();
        activity.questionThree();
        activity.questionFour();
        activity.questionFive();
        activity.questionSix();
        activity.questionSeven();
        activity.questionEight();
        activity.questionNine();
        activity.questionTen();
        activity.questionEleven();
        activity.questionTwelve();
        activity.questionThirteen();
        activity.questionFourteen();
        activity.questionFifteen();
        activity.questionSixteen();
        activity.questionSeventeen();
        activity.questionEighteen();
        activity.questionNineteen();
        activity.questionTwenty();
        activity.displayResultsMethod();
        activity.collectLettersToMakeUpPersonality(activity.personality);
    }
}
