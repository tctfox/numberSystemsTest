package testPrograms;

public class decimalToHexa extends learnProgram {

    @Override
    protected void programLogic() {

        long number = randomGenerator.nextLong(255);
        System.out.println("Convert this Number to a hexadecimal string: " + number);
        System.out.print("Your answer: ");
        String userInput = scanner.next();
        userInput = userInput.toLowerCase();

        if (userInput.equals("quit")) {
            System.out.println(spacer);
            System.out.println();
            notFinished = false;
        }

        String answer = Long.toHexString(number);
        if(userInput.equals(answer)){
            System.out.println(ANSI_GREEN + "Right answer!" + ANSI_RESET);
        }
        else
            System.out.println(ANSI_RED + "Wrong answer. The right answer is: " + answer + ANSI_RESET);
        System.out.println(spacer);
    }
}
