import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle {
   private String word,guess;
   
   Puzzle(){
        try {
            File file = new File("words.txt");
            Scanner scanner = new Scanner(file);
            int i = 0;
            int n = (int)(Math.random());
            String line = "";
            while (i < n) {
                line = scanner.next();
                i++;
            }
            scanner.close();
            word = line.toUpperCase();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        guess = "";

   }
   
   public String getWord(){
       return this.word;
    }
    
   public boolean isUnsolved(){
       for (int i = 0; i < word.length(); i++) {
            if (!guess.contains(""+word.charAt(i))) {
                return true;
            }
        }
        return false;
        
   }
   
   public boolean makeGuess(String guess){
       guess = guess.toUpperCase();
       this.guess += guess;
       for(int i = 0; i<word.length();i++){
           if(word.substring(i,i+1).equals(guess)){
               return true;
            }
       }
       
       return false;
   }
    
   public void show(){
       for(int i = 0; i<word.length();i++){
           if(guess.contains(word.substring(i,i+1))){
               System.out.print(word.charAt(i));
            }else{
                System.out.print("_");
            }
        }
        
      System.out.println("Your Guesses " + guess);
   }
}
