package testPrograms;

import java.util.Random;
import java.util.Scanner;

public abstract class learnProgram {

    Random randomGenerator = new Random();
    Scanner scanner = new Scanner(System.in);
    String spacer = "----------------------------------------------------";
    boolean notFinished;


    public void mainProgram(){
        System.out.println(spacer);
        System.out.println("To quit type quit");

        notFinished = true;
        while (notFinished) {
            programLogic();
        }
    }

    protected abstract void programLogic();
}
