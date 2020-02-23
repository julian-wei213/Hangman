
public class HangingMan {
    
    private int numWrongGuesses;
 
    String[] HangmanImage = {"+----+\n"+
                                "|\n"+
                                "|\n"+
                                "|\n"+
                                "/\\\n",

                                "+----+\n"+
                                "|    O\n"+
                                "|\n"+
                                "|\n"+
                                "/\\\n",
                            
                                "+----+\n"+
                                "|    O\n"+
                                "|    +\n"+
                                "|\n"+
                                "/\\\n",
                            
                                "+----+\n"+
                                "|    O\n"+
                                "|    +-\n"+
                                "|\n"+
                                "/\\\n",
                                
                                
                                "+----+\n"+
                                "|    O\n"+
                                "|   -+-\n"+
                                "|\n"+
                                "/\\\n",
                                
                                
                                "+----+\n"+
                                "|    O\n"+
                                "|   -+-\n"+
                                "|   / \n"+
                                "/\\\n",
                                
                                
                                "+----+\n"+
                                "|    O\n"+
                                "|   -+-\n"+
                                "|   / \\\n"+
                                "/\\\n",
                            };
                            
    HangingMan(){
        numWrongGuesses = 0;
    }
    
    public boolean isntDead(){
       if(numWrongGuesses+1 >= HangmanImage.length){
           return false;
        }
        
       return true;
    } 
    
    public void show(){
        System.out.println(HangmanImage[numWrongGuesses]);
    }
    
    public void dieSomeMore(){
        numWrongGuesses++;
    }
}
