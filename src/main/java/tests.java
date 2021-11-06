import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class tests {

    Random randomGenerator = new Random();
    Scanner scanner = new Scanner(System.in);

    public void decimalToBinary(){
        System.out.println("To quit type quit");

        while (true) {

            long number = randomGenerator.nextLong(255);
            System.out.println("Convert this Number to a binary string: " + number);
            System.out.print("Your answer: ");
            String userInput = scanner.next();

            if (userInput.equals("quit")) {
                System.out.println("-------------------------------------------");
                System.out.println();
                break;
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


    public void decimalToHexa(){
        System.out.println("To quit type quit");

        while (true) {

            long number = randomGenerator.nextLong(255);
            System.out.println("Convert this Number to a hexadecimal string: " + number);
            System.out.print("Your answer: ");
            String userInput = scanner.next();
            userInput = userInput.toLowerCase();


            if (userInput.equals("quit")) {
                System.out.println("-------------------------------------------");
                System.out.println();
                break;
            }

            String answer = Long.toHexString(number);
            if(userInput.equals(answer)){
                System.out.println("Right answer!");
            }
            else
                System.out.println("Wrong answer. The right answer is: " + answer);
            System.out.println("-------------------------------------------");
        }
    }

    public void decimalTo2Complement(){
        System.out.println("To quit type quit");

        while (true) {

            int number = randomGenerator.nextInt(126) * -1;
            System.out.println("Convert this Number to a 2-complement string: " + number);
            System.out.print("Your answer: ");
            String userInput = scanner.next();
            userInput = userInput.toLowerCase();


            if (userInput.equals("quit")) {
                System.out.println("-------------------------------------------");
                System.out.println();
                break;
            }

            String answer = Integer.toHexString(number);
            if(userInput.equals(answer)){
                System.out.println("Right answer!");
            }

            else
                System.out.println("Wrong answer. The right answer is: " + answer);
            System.out.println("-------------------------------------------");
        }
    }


    public void testProgram(){
        while(true) {

            System.out.println("What do you want to learn (type the number. quit to quit)");
            System.out.println("1 Decimal to Binary");
            System.out.println("2 Decimal to Hexadecimal");
            System.out.println("3 Decimal to 2-complement hexa string");

            System.out.println();
            String userInput = scanner.next();
            System.out.println();

            if (userInput.equals("1")){
                decimalToBinary();
            }

            else if (userInput.equals("2")){
                decimalToHexa();
            }

            else if (userInput.equals("3")){
                decimalTo2Complement();
            }

            else if(userInput.equals("quit")) {
                System.out.println("Program finished");
                break;
            }
        }
    }



}
