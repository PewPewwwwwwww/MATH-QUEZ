import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int score;
        score = 0;

        //MAO NI ANG SINOGDANAN
        System.out.print("WELCOME TO THE MATH GAME ");
        System.out.print("THIS IS A MATH GAME SO YOU CHOOISE WHAT IS THE CORRECT ANSWER. EASY TO DIFFICULT GOODLUCK :) ");
        System.out.print("ANSWER THE FOLLOWING QUSTION ");
 
        //QUESTION NUMBER ONE EASY 
        System.out.println("WHAT IS THE RESULT OF 18 / 2 + 5 X 3 - (6 - 2)? SO ANSWER IT :) ");
        System.out.println(" a) 20");
        System.out.println(" b) 21");
        System.out.println(" c) 22");
        System.out.println(" b) 23");
        System.out.print("PUT YOUR ANSWER HERE : ");
        String question1 = sc.nextLine();

        if(question1.equalsIgnoreCase("a")){
            System.out.println("VERY GOOD SO THAT IS CORRECT ");
            score++;
        } else {
            System.out.print("YOU ARE SO VERY CLOSE BETTER LUCK NEXT TIME ");
        }
        

        //PROCCED TO THE NEXT QUESTION
    System.out.print("\nSO LET'S PROCEED TO THE NEXT QUESTION. \n\nPRESS ENTER TO CONTINUE");
        sc.nextLine();


        //QUESTION NUMBER TOW NORMAL
        System.out.println("\nWHAT IS THE RESULT OF 856 / 4 + 62 X 7 (35 + 15) :) ");
        System.out.println(" a) 792");
        System.out.println(" b) 824");
        System.out.println(" c) 598");
        System.out.println(" d) 874");
        System.out.print("ENTER YOUR ANSWER HERE : ");
        String question2 = sc.nextLine();

        if(question2.equalsIgnoreCase("c")) {
            System.out.print("YOU ARE CORRECT VERY GOOD ");
            score++;
        } else {
            System.out.print("YOU ARE SO CLOSE AGIN BETTER LUCK NEXT TIME ");
        }

         //PROCCED TO THE NEXT QUESTION
    System.out.print("\nSO LET'S PROCEED TO THE NEXT QUESTION. \n\nPRESS ENTER TO CONTINUE");
    sc.nextLine();

    //QUESTION NUMBER THREE HARD
    System.out.println("\n825 / 5 + 92 X 6 - (36 + 12) WHAT IS THE ANSWER OF IT");
    System.out.println(" a) 945");
    System.out.println(" b) 920");
    System.out.println(" c) 918");
    System.out.println(" d) 669");
    System.out.print("ENTER YOUR ANSWER HERE : ");
    String question3 = sc.nextLine();

    if(question3.equalsIgnoreCase("d")) {
        System.out.print("YOU ARE CORREST VERY GOOD ");
        score++;
    } else {
        System.out.print("YOU ARE SO VERY CLOSE AGIN BETTER LUCK NEXT TIME ");
    }

    //PROCCED TO THE NEXT QUESTION
    System.out.print("\nSO LET'S PROCEED TO THE LAST QUESTION GET READY . \n\nPRESS ENTER TO CONTINUE");
    sc.nextLine();
    
    //QUESTION NUMBER FOUR DIFFICULT
    System.out.println("WHAT IS THE RESULT OF 876 / 4 + 135 X 5 (79 + 18)? ");
    System.out.println(" a) 804");
    System.out.println(" b) 1074");
    System.out.println(" c) 1092");
    System.out.println(" d) 1104");
    System.out.print("ENTER YOUR ANSWER HERE : ");
    String question4 = sc.nextLine();

    if(question4.equalsIgnoreCase("a")) {
        System.out.print("YOU ARE COREECT VERY GOOD YOU ANSER THE DIFFICULT QUESTION ");
        score++;
    } else {
        System.out.print("YOU ARE SO VERY COLSE AGIN BETTER LUCK NEXT TIME ");
    }

    //PROCCED TO THE RESULT OF THE SCORE
    System.out.print("\nSO LET'S PROCEED TO THE RESULT OF THE SCORE GET READY . \n\nPRESS ENTER TO CONTINUE");
    sc.nextLine();

    //RESULT OF THE SCORE
    System.out.print("\nYOU SCORE " + score + " OUT OF FOUR ");
    
    if(score == 4) {
      System.out.print("EXCELLENT WORK!. YOU ARE SO VERY GOOD AT MATH ");
    } else if (score == 3) {
        System.out.print("EXCELLENT GOOD JOB!");
    } else if (score == 2) {
        System.out.print("NOT BAD");
    } else {
        System.out.print("BETTER LUCK NEXT TIME ");
    }
    
    }

    
}
