import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
/**
 * Write a program that checks whether a sequence of HTML tags
 * is properly nested. For each opening tag, such as <p>, there
 * must be a closing tag </p>. A tag such as <p> may have other
 * tags inside, for example <p> <ul> <li> </li> </ul> <a> </a> </p>
 * <p>
 * The inner tags must be closed before the outer ones.
 * Your program should process a file containing tags.
 * For simplicity, assume that the tags are separated by
 * spaces, and that there is no text inside the tags.
*/
public class HTMLChecker
{
    public static void main(String[] args)
    {
        String filename = "Chapter 15 Activities/HTMLChecker/src/TagSample3.html";

        try (Scanner in = new Scanner(new File(filename)))
        {
            // Your code goes here 
            Stack <String> tags = new Stack<>(); 
            Stack <String> miniStack = new Stack<>();
          
            String HTML = "";
            String HTML2 = "";
            
            String HTML3 = ""; 
            String HTML4 = ""; 
            
            while(in.hasNext())
            {
                tags.push(in.next()); 
            }

            for (int j = 0; j < tags.size(); j++)
            {
                String currentTag = tags.pop(); 
                for (int i = 0; i < currentTag.length(); i++)
                {
                    if (currentTag.substring(i, i+1) != "<" && currentTag.substring(i, i+1) != ">" && currentTag.substring(i, i+1) != "/")
                    {
                        HTML2 += currentTag.substring(i, i+1); 

                    }
                }
                for(int k = 0; k < tags.size(); k++)
                {
                    String nextTag = tags.pop();
                    miniStack.push(nextTag); 
                    for (int i = 0; i < currentTag.length(); i++)
                    {
                        if (nextTag.substring(i, i+1) != "<" && currentTag.substring(i, i+1) != ">" && currentTag.substring(i, i+1) != "/")
                        {
                            HTML += nextTag.substring(i, i+1); 

                        }
                        if (HTML2.equals(HTML))
                        {
                        break; 
                        }

                    }


                    
                }
            }
            
            


        \} 
        catch (FileNotFoundException e)
        {
            System.out.println("Cannot open: " + filename);
        }

    }
    
}


