import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class InputOutput {
   Scanner scanner = new Scanner(System.in);

   public List<String> generatorFizzBuzz(int lowerBoundary, int upperBoundary){
      
      List<String> spokenWords = new ArrayList<>();

      //checks if number is between lower or upper boundary
      //checks if lower number/s is divisible by 3 or 5 
      for(int i = lowerBoundary; i <= upperBoundary; i++){
         String word = "";
         if(i  % 3 == 0){
            word += "Fizz";
         }
         if (i % 5 == 0){
            word += "Buzz";
         }
         if (word.isEmpty()){
            word = String.valueOf(i);
         }
         spokenWords.add(word);
      }
      return spokenWords;
   }

}