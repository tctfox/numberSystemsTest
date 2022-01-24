package testPrograms;

import java.util.Random;
import java.util.Scanner;

public abstract class learnProgram {

    public static final String ANSI_RESET = "";
    public static final String ANSI_RED = "";
    public static final String ANSI_GREEN = "";
    public static final String ANSI_CYAN = "";

    //public static final String ANSI_RESET = "\u001B[0m";
    //public static final String ANSI_RED = "\u001B[31m";
    //public static final String ANSI_GREEN = "\u001B[32m";
    //public static final String ANSI_CYAN = "\u001B[36m";


    Random randomGenerator = new Random();
    Scanner scanner = new Scanner(System.in);
    String spacer = "----------------------------------------------------";
    boolean notFinished;


    public void mainProgram(){
        System.out.println(spacer);
        System.out.println(ANSI_CYAN + "To quit type \"quit\"" + ANSI_RESET);

        notFinished = true;
        while (notFinished) {
            programLogic();
        }
    }

    protected abstract void programLogic();
}
