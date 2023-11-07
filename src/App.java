import java.util.List;
import java.util.Scanner;
/*
* Main method for FizzBuzz
* @author Schryll Schuch
*/

public class App {
   
    public static void main(String[] args) throws Exception { 
        Scanner scanner = new Scanner (System.in);

        InputOutput fizzBuzz = new InputOutput();
        System.out.println("Enter a Lower bound: ");
        int input1 = scanner.nextInt();
        System.out.println("Enter an Upper bound: ");
        int input2 = scanner.nextInt();
        
        List<String> fizz = fizzBuzz.generatorFizzBuzz(input1, input2);
        System.out.println(fizz);


    }
}

