import java.util.Scanner;
import java.util.Stack;

/**
 * Class for reversing the order of a sentence.
*/
public class SentenceReverser
{
    /**
     * Reverses the given sentence.
     *
     * @param sentence Sentence to be reversed.
     * @return reversed sentence.
    */
    public static String reverse(String sentence)
    {
    	Scanner scanner = new Scanner(sentence);
    	
        // Complete this method. Use a Stack.
        Stack <String> sentences = new Stack<>();
        String reverse = "";
        while(scanner.hasNext())
        {
            sentences.push(scanner.next());
            if (sentences.peek().charAt(sentences.peek().length()-1) == '.'){
                String holder = sentences.peek().substring(0,sentences.pop().length()-1); 
                sentences.push(holder);
                Integer n = sentences.size(); 
                for(int i = sentences.size(); i > 0; i--){
    
                    if (i == 1)
                    {
                        reverse += sentences.pop().toLowerCase();
                    }
                    else if(i == n){
                        reverse += sentences.peek().substring(0,1).toUpperCase()+sentences.pop().toLowerCase().substring(1)+" ";
                    }
                    else{
                        reverse += sentences.pop().toLowerCase() + " ";
                    }
                    
                }
                reverse +=". ";
                
            }
            {
                
            }
        }

        return reverse;







    }
}
