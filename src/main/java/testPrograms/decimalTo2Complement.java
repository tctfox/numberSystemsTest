package testPrograms;

public class decimalTo2Complement extends learnProgram {

    @Override
    protected void programLogic() {

        int number = randomGenerator.nextInt(126) * -1;
        System.out.println("Convert this Number to a 2-complement string: " + number);
        System.out.print("Your answer: ");
        String userInput = scanner.next();
        userInput = userInput.toLowerCase();


        if (userInput.equals("quit")) {
            System.out.println(spacer);
            System.out.println();
            notFinished = false;
        }

        String answer = Integer.toHexString(number);
        if(userInput.equals(answer)){
            System.out.println("Right answer!");
        }

        else
            System.out.println("Wrong answer. The right answer is: " + answer);
        System.out.println(spacer);
    }
}
