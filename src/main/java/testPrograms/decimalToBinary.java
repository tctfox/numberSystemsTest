package testPrograms;

public class decimalToBinary extends learnProgram {


    @Override
    protected void programLogic() {

        long number = randomGenerator.nextLong(255);
        System.out.println("Convert this Number to a binary string: " + number);
        System.out.print("Your answer: ");
        String userInput = scanner.next();

        if (userInput.equals("quit")) {
            System.out.println("-------------------------------------------");
            System.out.println();
            notFinished = false;
        }

        String answer = Long.toBinaryString(number);
        if(userInput.equals(answer)){
            System.out.println("Right answer!");
        }
        else
            System.out.println("Wrong answer. The right answer is: " + answer);
        System.out.println("-------------------------------------------");
    }
}
