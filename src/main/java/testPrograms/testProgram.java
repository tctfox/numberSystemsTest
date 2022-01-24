package testPrograms;

import testPrograms.*;

import java.util.Random;
import java.util.Scanner;

public class testProgram {

    Random randomGenerator = new Random();
    Scanner scanner = new Scanner(System.in);

    public void testProgramSwitch(){

        learnProgram decimalToBinary = new decimalToBinary();
        learnProgram decimalToHexa = new decimalToHexa();
        learnProgram decimalTo2Complement = new decimalTo2Complement();
        learnProgram decimalToFloat = new decimalToFloat();

        boolean notFinished = true;
        while (notFinished){

            int choice = askUser();
            switch (choice){
                case 0 -> notFinished = false;
                case 1 -> decimalToBinary.mainProgram();
                case 2 -> decimalToHexa.mainProgram();
                case 3 -> decimalTo2Complement.mainProgram();
                case 4 -> decimalToFloat.mainProgram();
                default -> System.out.println("Please enter a valid command");
            }
        }
    }

    private int askUser() {

        System.out.println("----------------------------------------------------");
        System.out.println("What do you want to learn (type the number)");
        System.out.println("0 --> To quit");
        System.out.println("1 --> Decimal to Binary");
        System.out.println("2 --> Decimal to Hexadecimal");
        System.out.println("3 --> Decimal to 2-complement hexa string");
        System.out.println("4 --> Decimal to 32 bit float");
        System.out.print("Your answer: ");
        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }


}
