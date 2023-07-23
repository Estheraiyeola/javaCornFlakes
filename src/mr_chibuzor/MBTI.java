package mr_chibuzor;


import java.util.Objects;
import java.util.Scanner;

public class MBTI {
    public Scanner input = new Scanner(System.in);
    public String name;
    public String[][] responseStorage = new String[5][4];

    public String[][] questions = new String[20][2];
    public String[] personality = new String[4];
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

    public void questionOne() {
        System.out.println("""
                A. Expend energy, enjoy groups.  B. Conserve energy, one-on-one
                """);
        String response = input.next();
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
        if (Objects.equals(response, "A") || Objects.equals(response, "B")){
            responseStorage[0][0] = response;
        }
        else {
            System.out.println("Expected A or B as a response");
            System.out.println("I know this is an Error. Please retry again");
            questionOne();
        }

    }

    public void questionTwo() {
        System.out.println("""
                A. Interpret literally.    B. Look for meaning and possibilities
                """);
        String response = input.next();
        responseTwo(response);
    }

    public void responseTwo(String response) {
        if (Objects.equals(response, "A") || Objects.equals(response, "B")){
            responseStorage[0][1] = response;
        }
        else {
            System.out.println("Expected A or B as a response");
            System.out.println("I know this is an Error. Please retry again");
            questionTwo();
        }
    }

    public void questionThree() {
        System.out.println("""
                A. Logical, thinking, questioning.   B. Empathetic, feeling, accommodating
                """);
        String response = input.next();
        responseThree(response);

    }

    public void responseThree(String response) {
        if (Objects.equals(response, "A") || Objects.equals(response, "B")) {
            responseStorage[0][2] = response;
        }
        else {
            System.out.println("Expected A or B as a response");
            System.out.println("I know this is an Error. Please retry again");
            questionThree();
        }
    }

    public void questionFour() {
        System.out.println("""
                A. Organized, orderly.   B. Flexible, adaptable
                """);
        String response = input.next();
        responseFour(response);

    }

    public void responseFour(String response) {
        if (Objects.equals(response, "A") || Objects.equals(response, "B")){
            responseStorage[0][3] = response;
        }
        else {
            System.out.println("Expected A or B as a response");
            System.out.println("I know this is an Error. Please retry again");
            questionFour();
        }
    }

    public void questionFive() {
        System.out.println("""
                A. More outgoing, think out loud.    B. More reserved, think to yourself.
                """);
        String response = input.next();
        responseFive(response);
    }

    public void responseFive(String response) {
        if (Objects.equals(response, "A") || Objects.equals(response, "B")){
            responseStorage[1][0] = response;
        }
        else {
            System.out.println("Expected A or B as a response");
            System.out.println("I know this is an Error. Please retry again");
            questionFive();
        }
    }

    public void questionSix() {
        System.out.println("""
                A. Practical, realistic, experiential.    B. Imagination, innovative, theoretical.
                """);
        String response = input.next();
        responseSix(response);
    }

    public void responseSix(String response) {
        if (Objects.equals(response, "A") || Objects.equals(response, "B")){
            responseStorage[1][1] = response;
        }
        else {
            System.out.println("Expected A or B as a response");
            System.out.println("I know this is an Error. Please retry again");
            questionSix();
        }
    }

    public void questionSeven() {
        System.out.println("""
                A. Candid, straight forward, frank.   B. Tactful, kind, encouraging.
                """);
        String response = input.next();
        responseSeven(response);
    }

    public void responseSeven(String response) {
        if (Objects.equals(response, "A") || Objects.equals(response, "B")) {
            responseStorage[1][2] = response;
        }
        else {
            System.out.println("Expected A or B as a response");
            System.out.println("I know this is an Error. Please retry again");
            questionSeven();
        }
    }

    public void questionEight() {
        System.out.println("""
                A. Plan, schedule.   B. Unplanned, spontaneous
                """);
        String response = input.next();
        responseEight(response);
    }

    public void responseEight(String response) {
        if (Objects.equals(response, "A") || Objects.equals(response, "B")) {
            responseStorage[1][3] = response;
        }
        else {
            System.out.println("Expected A or B as a response");
            System.out.println("I know this is an Error. Please retry again");
            questionEight();
        }
    }

    public void questionNine() {
        System.out.println("""
                A. seek many tasks, public activities, interaction with others      B. seek private, solitary activities with quiet to concentrate.
                """);
        String response = input.next();
        responseNine(response);
    }

    public void responseNine(String response) {
        if (Objects.equals(response, "A") || Objects.equals(response, "B")) {
            responseStorage[2][0] = response;
        }
        else {
            System.out.println("Expected A or B as a response");
            System.out.println("I know this is an Error. Please retry again");
            questionNine();
        }
    }

    public void questionTen() {
        System.out.println("""
                A. standard, usual, conventional.    B. different, novel, unique.
                """);
        String response = input.next();
        responseTen(response);
    }

    public void responseTen(String response) {
        if (Objects.equals(response, "A") || Objects.equals(response, "B")) {
            responseStorage[2][1] = response;
        }
        else {
            System.out.println("Expected A or B as a response");
            System.out.println("I know this is an Error. Please retry again");
            questionTen();
        }
    }

    public void questionEleven() {
        System.out.println("""
                A. firm, tend to criticize, hold the line.", "B. gentle, tend to appreciate, conciliate.
                """);
        String response = input.next();
        responseEleven(response);
    }

    public void responseEleven(String response) {
        if (Objects.equals(response, "A") || Objects.equals(response, "B")) {
            responseStorage[2][2] = response;
        }
        else {
            System.out.println("Expected A or B as a response");
            System.out.println("I know this is an Error. Please retry again");
            questionEleven();
        }
    }

    public void questionTwelve() {
        System.out.println("""
                A.regulated, structured.    B. easygoing, live  and let live"
                """);
        String response = input.next();
        responseTwelve(response);
    }

    public void responseTwelve(String response) {
        if (Objects.equals(response, "A") || Objects.equals(response, "B")) {
            responseStorage[2][3] = response;
        }
        else {
            System.out.println("Expected A or B as a response");
            System.out.println("I know this is an Error. Please retry again");
            questionTwelve();
        }
    }

    public void questionThirteen() {
        System.out.println("""
                A. external, communicative, express yourself.    B. internal, reticent, keep to yourself.
                """);
        String response = input.next();
        responseThirteen(response);
    }

    public void responseThirteen(String response) {
        if (Objects.equals(response, "A") || Objects.equals(response, "B")) {
            responseStorage[3][0] = response;
        }
        else {
            System.out.println("Expected A or B as a response");
            System.out.println("I know this is an Error. Please retry again");
            questionThirteen();
        }
    }

    public void questionFourteen() {
        System.out.println("""
                A. focus on here-and-now.    B. look to the future, global perspective, \\"big picture\\""
                """);
        String response = input.next();
        responseFourteen(response);
    }

    public void responseFourteen(String response) {
        if (Objects.equals(response, "A") || Objects.equals(response, "B")) {
            responseStorage[3][1] = response;
        }
        else {
            System.out.println("Expected A or B as a response");
            System.out.println("I know this is an Error. Please retry again");
            questionFourteen();
        }
    }

    public void questionFifteen() {
        System.out.println("""
                A. tough minded, just.    B. tender-hearted, merciful
                """);
        String response = input.next();
        responseFifteen(response);
    }

    public void responseFifteen(String response) {
        if (Objects.equals(response, "A") || Objects.equals(response, "B")) {
            responseStorage[3][2] = response;
        }
        else {
            System.out.println("Expected A or B as a response");
            System.out.println("I know this is an Error. Please retry again");
            questionFifteen();
        }
    }

    public void questionSixteen() {
        System.out.println("""
                A. preparation, plan ahead.    B. go with the flow, adapt as you go.
                """);
        String response = input.next();
        responseSixteen(response);
    }

    public void responseSixteen(String response) {
        if (Objects.equals(response, "A") || Objects.equals(response, "B")) {
            responseStorage[3][3] = response;
        }
        else {
            System.out.println("Expected A or B as a response");
            System.out.println("I know this is an Error. Please retry again");
            questionSixteen();
        }
    }
    public void questionSeventeen() {
        System.out.println("""
                A. active, initiate.     B. reflective, deliberate
                 """);
        String response = input.next();
        responseSeventeen(response);
    }

    public void responseSeventeen(String response) {
        if (Objects.equals(response, "A") || Objects.equals(response, "B")) {
            responseStorage[4][0] = response;
        }
        else {
            System.out.println("Expected A or B as a response");
            System.out.println("I know this is an Error. Please retry again");
            questionSeventeen();
        }
    }

    public void questionEighteen() {
        System.out.println("""
                A. facts, things, \\"what is\\"      B. ideas, dreams, 'what could be', philosophical
                """);
        String response = input.next();
        responseEighteen(response);
    }

    public void responseEighteen(String response) {
        if (Objects.equals(response, "A") || Objects.equals(response, "B")) {
            responseStorage[4][1] = response;
        }
        else {
            System.out.println("Expected A or B as a response");
            System.out.println("I know this is an Error. Please retry again");
            questionEighteen();
        }
    }

    public void questionNineteen() {
        System.out.println("""
                A. matter of fact, issue oriented     B. sensitive, people-oriented, compassionate
                 """);
        String response = input.next();
        responseNineteen(response);
    }

    public void responseNineteen(String response) {
        if (Objects.equals(response, "A") || Objects.equals(response, "B")) {
            responseStorage[4][2] = response;
        }
        else {
            System.out.println("Expected A or B as a response");
            System.out.println("I know this is an Error. Please retry again");
            questionNineteen();
        }
    }

    public void questionTwenty() {
        System.out.println("""
                A. control, govern    B. latitude, freedom
                """);
        String response = input.next();
        responseTwenty(response);
    }
    public void responseTwenty(String response) {
        if (Objects.equals(response, "A") || Objects.equals(response, "B")) {
            responseStorage[4][3] = response;
        }
        else {
            System.out.println("Expected A or B as a response");
            System.out.println("I know this is an Error. Please retry again");
            questionTwenty();
        }
    }

    public void displayResultsMethod() {
        System.out.printf("Hello %s You selected\n", name);
        displayExtrovertVsIntrovert();
        extrovertAndIntrovert();
        displaySensingVsIntuitive();
        sensingAndIntuitive();
        displayThinkingVsFeeling();
        thinkingAndFeeling();
        displayJudgingVsPerspective();
        judgingAndPerspective();


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
            else if (Objects.equals(extrovertVsIntrovert[index], "B")){
                bCounter++;
            }
        }
        displayExtrovertVsIntrovert();
        System.out.printf("Number of A selected is: %d\n",aCounter);
        System.out.printf("Number of B selected is: %d\n",bCounter);
        determinantForExtrovertAndIntrovert(aCounter, bCounter);
    }
    public void determinantForExtrovertAndIntrovert(int aCounter, int bCounter) {
        String letter = "";
        if (aCounter < bCounter){
            letter = "I";
        }
        if (aCounter > bCounter){
            letter = "E";
        }
        personality[0] = letter;

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
        if (Objects.equals(responseStorage[4][0], "B")) System.out.println(questions[16][1]);

    }
    public void sensingAndIntuitive(){
        String[] sensingVsIntuitive;
        sensingVsIntuitive = new String[]{responseStorage[0][1], responseStorage[1][1], responseStorage[2][1], responseStorage[3][1], responseStorage[4][1]};
        int aCounter = 0;
        int bCounter = 0;

        for (int index = 0; index < sensingVsIntuitive.length; index++) {
            if (Objects.equals(sensingVsIntuitive[index], "A")) {
                aCounter++;
            }
            else if (Objects.equals(sensingVsIntuitive[index], "B")) {
                bCounter++;
            }
        }
        displaySensingVsIntuitive();
        System.out.printf("Number of A selected is: %d\n",aCounter);
        System.out.printf("Number of B selected is: %d\n",bCounter);
        determinantForSensingAndIntuitive(aCounter, bCounter);
    }
    public void determinantForSensingAndIntuitive(int aCounter, int bCounter) {
        String letter = "";
        if (aCounter < bCounter){
            letter = "N";
        }
        if (aCounter > bCounter){
            letter = "S";
        }
        personality[1] = letter;
    }

    public void displaySensingVsIntuitive() {
        if (Objects.equals(responseStorage[0][1], "A")) System.out.println(questions[1][0]);
        if (Objects.equals(responseStorage[0][1], "B")) System.out.println(questions[1][1]);
        if (Objects.equals(responseStorage[1][1], "A")) System.out.println(questions[5][0]);
        if (Objects.equals(responseStorage[1][1], "B")) System.out.println(questions[5][1]);
        if (Objects.equals(responseStorage[2][1], "A")) System.out.println(questions[9][0]);
        if (Objects.equals(responseStorage[2][1], "B")) System.out.println(questions[9][1]);
        if (Objects.equals(responseStorage[3][1], "A")) System.out.println(questions[13][0]);
        if (Objects.equals(responseStorage[3][1], "B")) System.out.println(questions[13][1]);
        if (Objects.equals(responseStorage[4][1], "A")) System.out.println(questions[17][0]);
        if (Objects.equals(responseStorage[4][1], "B")) System.out.println(questions[17][1]);
    }
    public void thinkingAndFeeling(){
        String[] thinkingVsFeeling;
        thinkingVsFeeling= new String[]{responseStorage[0][2], responseStorage[1][2], responseStorage[2][2], responseStorage[3][2], responseStorage[4][2]};
        int aCounter = 0;
        int bCounter = 0;

        for (int index = 0; index < thinkingVsFeeling.length; index++) {
            if (Objects.equals(thinkingVsFeeling[index], "A")) {
                aCounter++;
            }
            else if (Objects.equals(thinkingVsFeeling[index], "B")) {
                bCounter++;
            }
        }
        displayThinkingVsFeeling();
        System.out.printf("Number of A selected is: %d\n",aCounter);
        System.out.printf("Number of B selected is: %d\n",bCounter);
        determinantForThinkingAndFeeling(aCounter, bCounter);
    }
    public void determinantForThinkingAndFeeling(int aCounter, int bCounter) {
        String letter = "";
        if (aCounter < bCounter){
            letter = "F";
        }
        if (aCounter > bCounter){
            letter = "T";
        }
        personality[2] = letter;
    }

    public void displayThinkingVsFeeling() {
        if (Objects.equals(responseStorage[0][2], "A")) System.out.println(questions[2][0]);
        if (Objects.equals(responseStorage[0][2], "B")) System.out.println(questions[2][1]);
        if (Objects.equals(responseStorage[1][2], "A")) System.out.println(questions[6][0]);
        if (Objects.equals(responseStorage[1][2], "B")) System.out.println(questions[6][1]);
        if (Objects.equals(responseStorage[2][2], "A")) System.out.println(questions[10][0]);
        if (Objects.equals(responseStorage[2][2], "B")) System.out.println(questions[10][1]);
        if (Objects.equals(responseStorage[3][2], "A")) System.out.println(questions[14][0]);
        if (Objects.equals(responseStorage[3][2], "B")) System.out.println(questions[14][1]);
        if (Objects.equals(responseStorage[4][2], "A")) System.out.println(questions[18][0]);
        if (Objects.equals(responseStorage[4][2], "B")) System.out.println(questions[18][1]);
    }
    public void judgingAndPerspective(){
        String[] judgingVsPerspective;
        judgingVsPerspective = new String[]{responseStorage[0][3], responseStorage[1][3], responseStorage[2][3], responseStorage[3][3], responseStorage[4][3]};
        int aCounter = 0;
        int bCounter = 0;

        for (int index = 0; index < judgingVsPerspective.length; index++) {
            if (Objects.equals(judgingVsPerspective[index], "A")) {
                aCounter++;
            }
            else if (Objects.equals(judgingVsPerspective[index], "B")) {
                bCounter++;
            }
        }
        displayJudgingVsPerspective();
        System.out.printf("Number of A selected is: %d\n",aCounter);
        System.out.printf("Number of B selected is: %d\n",bCounter);
        determinantForJudgingAndPerspective(aCounter, bCounter);

    }

    private void determinantForJudgingAndPerspective(int aCounter, int bCounter) {
        String letter = "";
        if (aCounter < bCounter){
            letter = "P";
        }
        if (aCounter > bCounter){
            letter = "J";
        }
        personality[3] = letter;
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

    public void personalityESFP() {
        System.out.println("Entertainer");
        System.out.println("""
                An Entertainer (ESFP) is a person with the Extraverted, Observant, Feeling, and Prospecting personality traits. 
                These people love vibrant experiences, engaging in life eagerly and taking pleasure in discovering the unknown. 
                They can be very social, often encouraging others into shared activities.
                If anyone is to be found spontaneously breaking into song and dance, it is the Entertainer personality type. 
                Entertainers get caught up in the excitement of the moment, and want everyone else to feel that way, too. 
                No other personality type is as generous with their time and energy as Entertainers when it comes to encouraging others, and no other personality type does it with such irresistible style.                
                """);
    }

    public void personalityESTP() {
        System.out.println("Entrpreneur");
        System.out.println("""
                An Entrepreneur (ESTP) is someone with the Extraverted, Observant, Thinking, and Prospecting personality traits. 
                They tend to be energetic and action-oriented, deftly navigating whatever is in front of them. 
                They love uncovering life’s opportunities, whether socializing with others or in more personal pursuits.
                Entrepreneurs always have an impact on their immediate surroundings – the best way to spot them at a party is to look for the whirling eddy of people flitting about them as they move from group to group. 
                Laughing and entertaining with a blunt and earthy humor, Entrepreneur personalities love to be the center of attention. 
                If an audience member is asked to come on stage, Entrepreneurs volunteer – or volunteer a shy friend.                
                Theory, abstract concepts and plodding discussions about global issues and their implications don’t keep Entrepreneurs interested for long. 
                Entrepreneurs keep their conversation energetic, with a good dose of intelligence, but they like to talk about what is – or better yet, to just go out and do it. 
                Entrepreneurs leap before they look, fixing their mistakes as they go, rather than sitting idle, preparing contingencies and escape clauses.
                                
                                
                                
                """);
    }

    public void personalityISFP() {
        System.out.println("Adventurer");
        System.out.println("""
                An Adventurer (ISFP) is a person with the Introverted, Observant, Feeling, and Prospecting personality traits. 
                They tend to have open minds, approaching life, new experiences, and people with grounded warmth. 
                Their ability to stay in the moment helps them uncover exciting potentials.
                Adventurers are true artists – although not necessarily in the conventional sense. 
                For this personality type, life itself is a canvas for self-expression. 
                From what they wear to how they spend their free time, Adventurers act in ways that vividly reflect who they are as unique individuals.                
                And every Adventurer is certainly unique. 
                Driven by curiosity and eager to try new things, people with this personality often have a fascinating array of passions and interests. 
                With their exploratory spirits and their ability to find joy in everyday life, Adventurers can be among the most interesting people you’ll ever meet. 
                The only irony? Unassuming and humble, Adventurers tend to see themselves as “just doing their own thing,” so they may not even realize how remarkable they really are.
                                
                                
                """);
    }

    public void personalityISTP() {
        System.out.println("Virtuoso");
        System.out.println("""
                A Virtuoso (ISTP) is someone with the Introverted, Observant, Thinking, and Prospecting personality traits. 
                They tend to have an individualistic mindset, pursuing goals without needing much external connection. 
                They engage in life with inquisitiveness and personal skill, varying their approach as needed.
                Virtuosos love to explore with their hands and their eyes, touching and examining the world around them with cool rationalism and spirited curiosity. 
                People with this personality type are natural Makers, moving from project to project, building the useful and the superfluous for the fun of it, and learning from their environment as they go. 
                Often mechanics and engineers, Virtuosos find no greater joy than in getting their hands dirty pulling things apart and putting them back together, just a little bit better than they were before.
                """);
    }

    public void personalityESFJ() {
        System.out.println("Consul");
        System.out.println("""
                A Consul (ESFJ) is a person with the Extroverted, Observant, Feeling, and Judging personality traits. 
                They are attentive and people-focused, and they enjoy taking part in their social community. 
                Their achievements are guided by decisive values, and they willingly offer guidance to others.
                For Consuls, life is sweetest when it’s shared with others. People with this personality type form the bedrock of many communities, opening their homes – and their hearts – to friends, loved ones, and neighbors.                
                This doesn’t mean that Consuls like everyone, or that they’re saints. But Consuls do believe in the power of hospitality and good manners, and they tend to feel a sense of duty to those around them. 
                Generous and reliable, people with this personality type often take it upon themselves – in ways both large and small – to hold their families and their communities together.                
                                
                """);
    }

    public void personalityESTJ() {
        System.out.println("Executive");
        System.out.println("""
                An Executive (ESTJ) is someone with the Extraverted, Observant, Thinking, and Judging personality traits. 
                They possess great fortitude, emphatically following their own sensible judgment. 
                They often serve as a stabilizing force among others, able to offer solid direction amid adversity.
                Executives are representatives of tradition and order, utilizing their understanding of what is right, wrong and socially acceptable to bring families and communities together. 
                Embracing the values of honesty, dedication and dignity, people with the Executive personality type are valued for their clear advice and guidance, and they happily lead the way on difficult paths. 
                Taking pride in bringing people together, Executives often take on roles as community organizers, working hard to bring everyone together in celebration of cherished local events, or in defense of the traditional values that hold families and communities together.              
                """);
    }

    public void personalityISFJ() {
        System.out.println("Defender");
        System.out.println("""
                A Defender (ISFJ) is someone with the Introverted, Observant, Feeling, and Judging personality traits. 
                These people tend to be warm and unassuming in their own steady way. 
                They’re efficient and responsible, giving careful attention to practical details in their daily lives.
                In their unassuming, understated way, Defenders help make the world go round. Hardworking and devoted, people with this personality type feel a deep sense of responsibility to those around them. 
                Defenders can be counted on to meet deadlines, remember birthdays and special occasions, uphold traditions, and shower their loved ones with gestures of care and support. 
                But they rarely demand recognition for all that they do, preferring instead to operate behind the scenes.
                This is a capable, can-do personality type, with a wealth of versatile gifts. 
                Though sensitive and caring, Defenders also have excellent analytical abilities and an eye for detail. 
                And despite their reserve, they tend to have well-developed people skills and robust social relationships. 
                Defenders are truly more than the sum of their parts, and their varied strengths shine in even the most ordinary aspects of their daily lives.
                                
                                
                                
                """);
    }

    public void personalityISTJ() {
        System.out.println("Logistician");
        System.out.println("""
                A Logistician (ISTJ) is someone with the Introverted, Observant, Thinking, and Judging personality traits. 
                These people tend to be reserved yet willful, with a rational outlook on life. 
                They compose their actions carefully and carry them out with methodical purpose.
                Logisticians pride themselves on their integrity. 
                People with this personality type mean what they say, and when they commit to doing something, they make sure to follow through.                
                This personality type makes up a good portion of the overall population, and while Logisticians may not be particularly flashy or attention-seeking, they do more than their share to keep society on a sturdy, stable foundation. 
                In their families and their communities, Logisticians often earn respect for their reliability, their practicality, and their ability to stay grounded and logical, even in the most stressful situations.                
                                
                """);
    }

    public void personalityENFP() {
        System.out.println("Campaigner");
        System.out.println("""
                A Campaigner (ENFP) is someone with the Extraverted, Intuitive, Feeling, and Prospecting personality traits. 
                These people tend to embrace big ideas and actions that reflect their sense of hope and goodwill toward others. 
                Their vibrant energy can flow in many directions.
                Campaigners (ENFPs) are true free spirits – outgoing, openhearted, and open-minded. 
                With their lively, upbeat approach to life, they stand out in any crowd. 
                But even though they can be the life of the party, Campaigners don’t just care about having a good time. 
                These personality types run deep – as does their longing for meaningful, emotional connections with other people  
                """);
    }

    public void personalityENFJ() {
        System.out.println("Protagonist");
        System.out.println("""
                A Protagonist (ENFJ) is a person with the Extraverted, Intuitive, Feeling, and Judging personality traits. 
                These warm, forthright types love helping others, and they tend to have strong ideas and values. 
                They back their perspective with the creative energy to achieve their goals.          
                Protagonists (ENFJs) feel called to serve a greater purpose in life. 
                Thoughtful and idealistic, these personality types strive to have a positive impact on other people and the world around them. 
                They rarely shy away from an opportunity to do the right thing, even when doing so is far from easy.
                Protagonists are born leaders, which explains why these personalities can be found among many notable politicians, coaches, and teachers. 
                Their passion and charisma allow them to inspire others not just in their careers but in every arena of their lives, including their relationships.
                 Few things bring Protagonists a deeper sense of joy and fulfillment than guiding friends and loved ones to grow into their best selves                
                                
                """);
    }

    public void personalityINFP() {
        System.out.println("Mediator");
        System.out.println("""
                A Mediator (INFP) is someone who possesses the Introverted, Intuitive, Feeling, and Prospecting personality traits. 
                These rare personality types tend to be quiet, open-minded, and imaginative, and they apply a caring and creative approach to everything they do.
                Although they may seem quiet or unassuming, Mediators (INFPs) have vibrant, passionate inner lives. 
                Creative and imaginative, they happily lose themselves in daydreams, inventing all sorts of stories and conversations in their minds. 
                These personalities are known for their sensitivity – Mediators can have profound emotional responses to music, art, nature, and the people around them.               
                Idealistic and empathetic, Mediators long for deep, soulful relationships, and they feel called to help others. 
                But because this personality type makes up such a small portion of the population, Mediators may sometimes feel lonely or invisible, adrift in a world that doesn’t seem to appreciate the traits that make them unique.               
                """);
    }

    public void personalityINFJ() {
        System.out.println("Advocate");
        System.out.println("""
                An Advocate (INFJ) is someone with the Introverted, Intuitive, Feeling, and Judging personality traits. 
                They tend to approach life with deep thoughtfulness and imagination. 
                Their inner vision, personal values, and a quiet, principled version of humanism guide them in all things.
                Advocates (INFJs) may be the rarest personality type of all, but they certainly leave their mark on the world. Idealistic and principled, they aren’t content to coast through life – they want to stand up and make a difference. 
                For Advocate personalities, success doesn’t come from money or status but from seeking fulfillment, helping others, and being a force for good in the world.
                                
                While they have lofty goals and ambitions, Advocates shouldn’t be mistaken for idle dreamers. 
                People with this personality type care about integrity, and they’re rarely satisfied until they’ve done what they know to be right. 
                Conscientious to the core, they move through life with a clear sense of their values, and they aim never to lose sight of what truly matters – not according to other people or society at large, but according to their own wisdom and intuition.
                                
                """);
    }

    public void personalityENTP() {
        System.out.println("Debater");
        System.out.println("""
                A Debater (ENTP) is a person with the Extraverted, Intuitive, Thinking, and Prospecting personality traits. 
                They tend to be bold and creative, deconstructing and rebuilding ideas with great mental agility. 
                They pursue their goals vigorously despite any resistance they might encounter.               
                Quick-witted and audacious, Debaters aren’t afraid to disagree with the status quo. 
                In fact, they’re not afraid to disagree with pretty much anything or anyone. 
                Few things light up people with this personality type more than a bit of verbal sparring – and if the conversation veers into controversial terrain, so much the better.     
                It would be a mistake, though, to think of Debaters as disagreeable or mean-spirited.
                Instead, people with this personality type are knowledgeable and curious, with a playful sense of humor, and they can be incredibly entertaining. 
                They simply have an offbeat, contrarian idea of fun – one that involves a healthy dose of spirited debate.    
                """);
    }

    public void personalityENTJ() {
        System.out.println("Commander");
        System.out.println("""
                A Commander (ENTJ) is someone with the Extraverted, Intuitive, Thinking, and Judging personality traits. 
                They are decisive people who love momentum and accomplishment. 
                They gather information to construct their creative visions but rarely hesitate for long before acting on them.
                Commanders are natural-born leaders. 
                People with this personality type embody the gifts of charisma and confidence, and project authority in a way that draws crowds together behind a common goal. However, Commanders are also characterized by an often ruthless level of rationality, using their drive, determination and sharp minds to achieve whatever end they’ve set for themselves. 
                Perhaps it is best that they make up only three percent of the population, lest they overwhelm the more timid and sensitive personality types that make up much of the rest of the world – but we have Commanders to thank for many of the businesses and institutions we take for granted every day.
                """);
    }

    public void personalityINTP() {
        System.out.println("Logician");
        System.out.println("""
                A Logician (INTP) is someone with the Introverted, Intuitive, Thinking, and Prospecting personality traits. 
                These flexible thinkers enjoy taking an unconventional approach to many aspects of life. 
                They often seek out unlikely paths, mixing willingness to experiment with personal creativity.
                From the outside, Logicians may seem to live in a never-ending daydream. 
                They have a reputation for being pensive, detached, and a bit reserved. 
                That is, until they try to train all of their mental energy on the moment or the person at hand, which can be a bit uncomfortable for everyone. 
                But regardless of which mode they’re in, Logicians are Introverts and tend to get tired out by extensive socializing. 
                After a long day, they crave time alone to consult their own thoughts.             
                But it would be a mistake to think that Logicians are unfriendly or uptight. When they connect with someone who can match their mental energy, these personalities absolutely light up, leaping from one thought to another. Few things energize them like the opportunity to swap ideas or enjoy a lively debate with another curious, inquiring soul.
                """);
    }

    public void personalityINTJ() {
        System.out.println("Architect");
        System.out.println("""
                An Architect (INTJ) is a person with the Introverted, Intuitive, Thinking, and Judging personality traits. 
                These thoughtful tacticians love perfecting the details of life, applying creativity and rationality to everything they do. 
                Their inner world is often a private, complex one.
                A Pioneering Spirit
                Architects question everything. 
                Many personality types trust the status quo, relying on conventional wisdom and other people’s expertise to guide their lives. 
                But ever-skeptical Architects prefer to make their own discoveries. In their quest to find better ways of doing things, they aren’t afraid to break the rules or risk disapproval – in fact, they rather enjoy it.               
                But as anyone with this personality type would tell you, a new idea isn’t worth anything unless it actually works. 
                Architects want to be successful, not just inventive. They bring a single-minded drive to their work, applying the full force of their insight, logic, and willpower. And heaven help anyone who tries to slow them down by enforcing pointless rules or offering poorly thought-out criticism.               
                """);
    }


}