package testPrograms;

public class decimalToFloat extends learnProgram {

    @Override
    protected void programLogic() {

        System.out.print("What number do you want to learn with: ");
        String userNumberString = scanner.next();

        if (userNumberString.equals("quit")){
            System.out.println(spacer);
            notFinished = false;
        }


        float userNumber = Float.parseFloat(userNumberString);
        int number = Float.floatToIntBits(userNumber);
        System.out.print("Your answer: ");
        String userInput = scanner.next();
        userInput = userInput.toLowerCase();


        if (userInput.equals("quit")) {
            System.out.println(spacer);
            System.out.println();
            notFinished = false;
        }

        if (userInput.equals(Integer.toBinaryString(number)) || userInput.equals(Integer.toHexString(number)))
            System.out.println(ANSI_GREEN + "Right answer!" + ANSI_RESET);

        else {
            System.out.println(ANSI_RED + "Wrong answer. The right answers are: " + ANSI_RESET);
            System.out.println(Integer.toBinaryString(number));
            System.out.println(Integer.toHexString(number));
        }

        System.out.println(spacer);
    }
}
