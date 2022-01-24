package testPrograms;

public class decimalTo2Complement extends learnProgram {

    @Override
    protected void programLogic() {

        int number = randomGenerator.nextInt(126) * -1;
        System.out.println("Convert this Number to a 2-complement string representing 2 bytes: " + number);
        System.out.print("Your answer: ");
        String userInput = scanner.next();
        userInput = userInput.toLowerCase();


        if (userInput.equals("quit")) {
            System.out.println(spacer);
            System.out.println();
            notFinished = false;
        }

        String answer = Integer.toHexString(number);
        answer = answer.substring(4);
        if(userInput.equals(answer)){
            System.out.println(ANSI_GREEN + "Right answer!" + ANSI_RESET);
        }

        else
            System.out.println(ANSI_RED + "Wrong answer. The right answer is: " + answer + ANSI_RESET);
        System.out.println(spacer);
    }
}
