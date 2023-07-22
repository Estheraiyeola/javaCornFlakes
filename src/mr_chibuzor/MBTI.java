package mr_chibuzor;


import java.util.Objects;

public class MBTI {
    private String name;
    private final String[][] responseStorage = new String[4][5];
    private String[] responsesExtrovertVsIntrovert = new String[5];

    private String[][] questions = new String[20][2];
    private String[] personality = new String[4];
    public void displayMethod() {
        nameMethod(name);
    }

    public void nameMethod(String name) {
        System.out.println("What is your name? ");
        this.name = name;
    }

    public String getNameMethod() {
        return name;
    }

    public void questionOne(String response) {
        System.out.println("""
                A. Expend energy, enjoy groups.  B. Conserve energy, one-on-one
                """);
        responseOne(response);

    }
    public void questions(){
        questions[0][0] = "A. Expend energy, enjoy groups.";
        questions[0][1] = "B. Conserve energy, one-on-one";
        questions[1][0] = "A. Interpret literally";
        questions[1][1] = "B. Look for meaning and possibilities";
        questions[2][0] = "A. Logical, thinking, questioning.";
        questions[2][1] = "B. Empathetic, feeling, accommodating";
        questions[3][0] = "A. Organized, orderly.";
        questions[3][1] = "B. Flexible, adaptable";
        questions[4][0] = "A. More outgoing, think out loud.";
        questions[4][1] = "B. More reserved, think to yourself.";
        questions[5][0] = "A. Practical, realistic, experiential.";
        questions[5][1] = "B. Imagination, innovative, theoretical.";
        questions[6][0] = "A. Candid, straight forward, frank.";
        questions[6][1] = "B. Tactful, kind, encouraging.";
        questions[7][0] = "A. Plan, schedule.";
        questions[7][1] = "B. Unplanned, spontaneous";
        questions[8][0] = "A. seek many tasks, public activities, interaction with others";
        questions[8][1] = "B. seek private, solitary activities with quiet to concentrate.";
        questions[9][0] = "A. standard, usual, conventional.";
        questions[9][1] = "B. different, novel, unique.";
        questions[10][0] = "A. firm, tend to criticize, hold the line.";
        questions[10][1] = "B. gentle, tend to appreciate, conciliate.";
        questions[11][0] = "A.regulated, structured.";
        questions[11][1] = "B. easygoing, live  and let live";
        questions[12][0] = "A. external, communicative, express yourself.";
        questions[12][1] = "B. internal, reticent, keep to yourself";
        questions[13][0] = "A. focus on here-and-now.";
        questions[13][1] = "B. look to the future, global perspective, \\\"big picture\\\"";
        questions[14][0] = "A. tough minded, just.";
        questions[14][1] = "B. tender-hearted, merciful";
        questions[15][0] = "A. preparation, plan ahead.";
        questions[15][1] = "B. go with the flow, adapt as you go.";
        questions[16][0] = "A. active, initiate.";
        questions[16][1] = "B. reflective, deliberate";
        questions[17][0] = "A. facts, things, \\\"what is\\\"";
        questions[17][1] = "B. ideas, dreams, 'what could be', philosophical";
        questions[18][0] = "A. matter of fact, issue oriented";
        questions[18][1] = "B. sensitive, people-oriented, compassionate";
        questions[19][0] = "A. control, govern.";
        questions[19][1] = "B. latitude, freedom.";
    }
    public void responseOne(String response) {
        responseStorage[0][0] = response;
    }

    public void questionTwo(String response) {
        System.out.println("""
                A. Interpret literally.    B. Look for meaning and possibilities
                """);
        responseTwo(response);
    }

    private void responseTwo(String response) {
        responseStorage[0][1] = response;
    }

    public void questionThree(String response) {
        System.out.println("""
                A. Logical, thinking, questioning.   B. Empathetic, feeling, accommodating
                """);
        responseThree(response);
    }

    private void responseThree(String response) {
        responseStorage[0][2] = response;
    }

    public void questionFour(String response) {
        System.out.println("""
                A. Organized, orderly.   B. Flexible, adaptable
                """);
        responseFour(response);
    }

    private void responseFour(String response) {
        responseStorage[0][3] = response;
    }

    public void questionFive(String response) {
        System.out.println("""
                A. More outgoing, think out loud.    B. More reserved, think to yourself.
                """);
        responseFive(response);
    }

    private void responseFive(String response) {
        responseStorage[1][0] = response;
    }

    public void questionSix(String response) {
        System.out.println("""
                A. Practical, realistic, experiential.    B. Imagination, innovative, theoretical.
                """);
        responseSix(response);
    }

    private void responseSix(String response) {
        responseStorage[1][1] = response;
    }

    public void questionSeven(String response) {
        System.out.println("""
                A. Candid, straight forward, frank.   B. Tactful, kind, encouraging.
                """);
        responseSeven(response);
    }

    private void responseSeven(String response) {
        responseStorage[1][2] = response;
    }

    public void questionEight(String response) {
        System.out.println("""
                A. Plan, schedule.   B. Unplanned, spontaneous
                """);
        responseEight(response);
    }

    private void responseEight(String response) {
        responseStorage[1][3] = response;
    }

    public void questionNine(String response) {
        System.out.println("""
                A. seek many tasks, public activities, interaction with others      
                B. seek private, solitary activities with quiet to concentrate.
                """);
        responseNine(response);
    }

    private void responseNine(String response) {
        responseStorage[2][0] = response;
    }

    public void questionTen(String response) {
        System.out.println("""
                A. standard, usual, conventional.    B. different, novel, unique.
                """);
        responseTen(response);
    }

    private void responseTen(String response) {
        responseStorage[2][1] = response;
    }

    public void questionEleven(String response) {
        System.out.println("""
                A. firm, tend to criticize, hold the line.", "B. gentle, tend to appreciate, conciliate.
                """);
        responseEleven(response);
    }

    private void responseEleven(String response) {
        responseStorage[2][2] = response;
    }

    public void questionTwelve(String response) {
        System.out.println("""
                A.regulated, structured.    B. easygoing, live  and let live"
                """);
        responseTwelve(response);
    }

    private void responseTwelve(String response) {
        responseStorage[2][3] = response;
    }

    public void questionThirteen(String response) {
        System.out.println("""
                A. external, communicative, express yourself.    B. internal, reticent, keep to yourself.
                """);
        responseThirteen(response);
    }

    private void responseThirteen(String response) {
        responseStorage[3][0] = response;
    }

    public void questionFourteen(String response) {
        System.out.println("""
                A. focus on here-and-now.    B. look to the future, global perspective, \\"big picture\\""
                """);
        responseFourteen(response);
    }

    private void responseFourteen(String response) {
        responseStorage[3][1] = response;
    }

    public void questionFifteen(String response) {
        System.out.println("""
                A. tough minded, just.    B. tender-hearted, merciful
                """);
        responseFifteen(response);
    }

    private void responseFifteen(String response) {
        responseStorage[3][2] = response;
    }

    public void questionSixteen(String response) {
        System.out.println("""
                A. preparation, plan ahead.    B. go with the flow, adapt as you go.
                """);
        responseSixteen(response);
    }

    private void responseSixteen(String response) {
        responseStorage[3][3] = response;
    }

    public void questionSeventeen(String response) {
        System.out.println("""
                A. active, initiate.     B. reflective, deliberate
                 """);
        responseSeventeen(response);
    }

    private void responseSeventeen(String response) {
        responseStorage[4][0] = response;
    }

    public void questionEighteen(String response) {
        System.out.println("""
                A. facts, things, \\"what is\\"      B. ideas, dreams, 'what could be', philosophical
                """);
        responseEighteen(response);
    }

    private void responseEighteen(String response) {
        responseStorage[4][1] = response;
    }

    public void questionNineteen(String response) {
        System.out.println("""
                A. matter of fact, issue oriented     B. sensitive, people-oriented, compassionate
                 """);
        responseNineteen(response);
    }

    private void responseNineteen(String response) {
        responseStorage[4][2] = response;
    }

    public void questionTwenty(String response) {
        System.out.println("""
                A. control, govern    B. latitude, freedom
                """);
        responseTwenty(response);
    }

    private void responseTwenty(String response) {
        responseStorage[4][3] = response;
    }


    public void extrovertAndIntrovert() {
        String[] extrovertVsIntrovert = new String[5];
        extrovertVsIntrovert[0] = responseStorage[0][0];
        extrovertVsIntrovert[1] = responseStorage[1][0];
        extrovertVsIntrovert[2] = responseStorage[2][0];
        extrovertVsIntrovert[3] = responseStorage[3][0];
        extrovertVsIntrovert[4] = responseStorage[4][0];
        int aCounter = 0;
        int bCounter = 0;
        for (int index = 0; index < extrovertVsIntrovert.length;index++){
            if (Objects.equals(extrovertVsIntrovert[index], "A")){
                aCounter++;
            }
            if (Objects.equals(extrovertVsIntrovert[index], "B")){
                bCounter++;
            }
        }
        displayExtrovertVsIntrovert();
        System.out.printf("Number of A selected is: %d",aCounter);
        System.out.printf("Number of B selected is: %d",bCounter);
    }
    private String determinantForExtrovertAndIntrovert(int aCounter, int bCounter) {
        String letter = "";
        if (aCounter < bCounter){
            letter = "I";
        }
        if (aCounter > bCounter){
            letter = "E";
        }
        return personality[0] = letter;
    }
    public void displayExtrovertVsIntrovert(){
        if (Objects.equals(responseStorage[0][0], "A")) System.out.println(questions[0][0]);
        if (Objects.equals(responseStorage[0][0], "B")) System.out.println(questions[0][1]);
        if (Objects.equals(responseStorage[1][0], "A")) System.out.println(questions[4][0]);
        if (Objects.equals(responseStorage[1][0], "B")) System.out.println(questions[4][1]);
        if (Objects.equals(responseStorage[2][0], "A")) System.out.println(questions[8][0]);
        if (Objects.equals(responseStorage[2][0], "B")) System.out.println(questions[8][1]);
        if (Objects.equals(responseStorage[3][0], "A")) System.out.println(questions[12][0]);
        if (Objects.equals(responseStorage[3][0], "B")) System.out.println(questions[12][1]);
        if (Objects.equals(responseStorage[4][0], "A")) System.out.println(questions[16][0]);
        if (Objects.equals(responseStorage[4][0], "A")) System.out.println(questions[16][1]);

    }
    public void sensingAndIntuitive(){
        String[] sensingVsIntuitive = new String[5];
        sensingVsIntuitive = new String[]{responseStorage[0][1], responseStorage[1][1], responseStorage[2][1], responseStorage[3][1], responseStorage[4][1]};
        int aCounter = 0;
        int bCounter = 0;

        for (int index = 0; index < sensingVsIntuitive.length; index++) {
            if (sensingVsIntuitive[index] == "A"){
                aCounter++;
            }
            if (sensingVsIntuitive[index] == "B"){
                bCounter++;
            }
            displaySensingVsIntuitive();
            System.out.printf("Number of A selected is: %d",aCounter);
            System.out.printf("Number of B selected is: %d",bCounter);
        }
    }
    private String determinantForSensingAndIntuitive(int aCounter, int bCounter) {
        String letter = "";
        if (aCounter < bCounter){
            letter = "N";
        }
        if (aCounter > bCounter){
            letter = "S";
        }
        return personality[1] = letter;
    }

    private void displaySensingVsIntuitive() {
        if (Objects.equals(responseStorage[0][1], "A")) System.out.println(questions[1][0]);
        if (Objects.equals(responseStorage[0][1], "B")) System.out.println(questions[1][1]);
        if (Objects.equals(responseStorage[1][1], "A")) System.out.println(questions[5][0]);
        if (Objects.equals(responseStorage[1][1], "B")) System.out.println(questions[5][1]);
        if (Objects.equals(responseStorage[2][1], "A")) System.out.println(questions[9][0]);
        if (Objects.equals(responseStorage[2][1], "B")) System.out.println(questions[9][1]);
        if (Objects.equals(responseStorage[3][1], "A")) System.out.println(questions[13][0]);
        if (Objects.equals(responseStorage[3][1], "B")) System.out.println(questions[13][1]);
        if (Objects.equals(responseStorage[4][1], "A")) System.out.println(questions[17][0]);
        if (Objects.equals(responseStorage[4][1], "A")) System.out.println(questions[17][1]);
    }
    private void thinkingAndFeeling(){
        String[] thinkingVsFeeling = new String[5];
        thinkingVsFeeling= new String[]{responseStorage[0][2], responseStorage[1][2], responseStorage[2][2], responseStorage[3][2], responseStorage[4][2]};
        int aCounter = 0;
        int bCounter = 0;

        for (int index = 0; index < thinkingVsFeeling.length; index++) {
            if (thinkingVsFeeling[index] == "A"){
                aCounter++;
            }
            if (thinkingVsFeeling[index] == "B"){
                bCounter++;
            }
            displayThinkingVsFeeling();
            System.out.printf("Number of A selected is: %d",aCounter);
            System.out.printf("Number of B selected is: %d",bCounter);
        }
    }
    private String determinantForThinkingAndFeeling(int aCounter, int bCounter) {
        String letter = "";
        if (aCounter < bCounter){
            letter = "F";
        }
        if (aCounter > bCounter){
            letter = "T";
        }
        return personality[2] = letter;
    }

    private void displayThinkingVsFeeling() {
        if (Objects.equals(responseStorage[0][2], "A")) System.out.println(questions[2][0]);
        if (Objects.equals(responseStorage[0][2], "B")) System.out.println(questions[2][1]);
        if (Objects.equals(responseStorage[1][2], "A")) System.out.println(questions[6][0]);
        if (Objects.equals(responseStorage[1][2], "B")) System.out.println(questions[6][1]);
        if (Objects.equals(responseStorage[2][2], "A")) System.out.println(questions[10][0]);
        if (Objects.equals(responseStorage[2][2], "B")) System.out.println(questions[10][1]);
        if (Objects.equals(responseStorage[3][2], "A")) System.out.println(questions[14][0]);
        if (Objects.equals(responseStorage[3][2], "B")) System.out.println(questions[14][1]);
        if (Objects.equals(responseStorage[4][2], "A")) System.out.println(questions[18][0]);
        if (Objects.equals(responseStorage[4][2], "A")) System.out.println(questions[18][1]);
    }
    private void judgingAndPerspective(){
        String[] judgingVsPerspective = new String[5];
        judgingVsPerspective = new String[]{responseStorage[0][3], responseStorage[1][3], responseStorage[2][3], responseStorage[3][3], responseStorage[4][3]};
        int aCounter = 0;
        int bCounter = 0;

        for (int index = 0; index < judgingVsPerspective.length; index++) {
            if (judgingVsPerspective[index] == "A"){
                aCounter++;
            }
            if (judgingVsPerspective[index] == "B"){
                bCounter++;
            }
            displayJudgingVsPerspective();
            System.out.printf("Number of A selected is: %d",aCounter);
            System.out.printf("Number of B selected is: %d",bCounter);
        }
    }

    private String determinantForJudgingAndPerspective(int aCounter, int bCounter) {
        String letter = "";
        if (aCounter < bCounter){
            letter = "P";
        }
        if (aCounter > bCounter){
            letter = "J";
        }
        return personality[3] = letter;
    }

    public void displayJudgingVsPerspective() {
        if (Objects.equals(responseStorage[0][3], "A")) System.out.println(questions[3][0]);
        if (Objects.equals(responseStorage[0][3], "B")) System.out.println(questions[3][1]);
        if (Objects.equals(responseStorage[1][3], "A")) System.out.println(questions[7][0]);
        if (Objects.equals(responseStorage[1][3], "B")) System.out.println(questions[7][1]);
        if (Objects.equals(responseStorage[2][3], "A")) System.out.println(questions[11][0]);
        if (Objects.equals(responseStorage[2][3], "B")) System.out.println(questions[11][1]);
        if (Objects.equals(responseStorage[3][3], "A")) System.out.println(questions[15][0]);
        if (Objects.equals(responseStorage[3][3], "B")) System.out.println(questions[15][1]);
        if (Objects.equals(responseStorage[4][3], "A")) System.out.println(questions[19][0]);
        if (Objects.equals(responseStorage[4][3], "B")) System.out.println(questions[19][1]);
    }
    public String collectLettersToMakeUpPersonality(String[] personality){
        String personalityToString = "";
        for (int index = 0; index < personality.length; index++) {
            personalityToString += "" + personality[index];
        }
        if (personalityToString.equals("INTJ")) personalityINTJ();
        if (personalityToString.equals("INTP")) personalityINTP();
        if (personalityToString.equals("ENTJ")) personalityENTJ();
        if (personalityToString.equals("ENTP")) personalityENTP();
        if (personalityToString.equals("INFJ")) personalityINFJ();
        if (personalityToString.equals("INFP")) personalityINFP();
        if (personalityToString.equals("ENFJ")) personalityENFJ();
        if (personalityToString.equals("ENFP")) personalityENFP();
        if (personalityToString.equals("ISTJ")) personalityISTJ();
        if (personalityToString.equals("ISFJ")) personalityISFJ();
        if (personalityToString.equals("ESTJ")) personalityESTJ();
        if (personalityToString.equals("ESFJ")) personalityESFJ();
        if (personalityToString.equals("ISTP")) personalityISTP();
        if (personalityToString.equals("ISFP")) personalityISFP();
        if (personalityToString.equals("ESTP")) personalityESTP();
        if (personalityToString.equals("ESFP")) personalityESFP();
        return personalityToString;
    }

    private void personalityESFP() {
        System.out.println("Entertainer");
    }

    private void personalityESTP() {
        System.out.println("Entrpreneur");
    }

    private void personalityISFP() {
        System.out.println("Adventurer");
    }

    private void personalityISTP() {
        System.out.println("Virtuoso");
    }

    private void personalityESFJ() {
        System.out.println("Consul");
    }

    private void personalityESTJ() {
        System.out.println("Executive");
    }

    private void personalityISFJ() {
        System.out.println("Defender");
    }

    private void personalityISTJ() {
        System.out.println("Logistician");
    }

    private void personalityENFP() {
        System.out.println("Campaigner");
    }

    private void personalityENFJ() {
        System.out.println("Protagonist");
    }

    private void personalityINFP() {
        System.out.println("Mediator");
    }

    private void personalityINFJ() {
        System.out.println("Advocate");
    }

    private void personalityENTP() {
        System.out.println("Debater");
    }

    private void personalityENTJ() {
        System.out.println("Commander");
    }

    private void personalityINTP() {
        System.out.println("Logician");
    }

    private void personalityINTJ() {
        System.out.println("Architect");
    }


}