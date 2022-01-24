package testPrograms;

import java.util.Random;
import java.util.Scanner;

public abstract class learnProgram {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

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
