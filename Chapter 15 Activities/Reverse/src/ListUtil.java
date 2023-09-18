import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
    /**
     * Reverses the elements in a linked list
     *
     * @param strings the linked list to reverse
    */
    public static void reverse(LinkedList<String> strings)
    {
        ListIterator <String> iterator = strings.listIterator(strings.size()); 
    
    
        int end = strings.size(); 
        int count = 0; 
        int end2 = strings.size()-1; 
       
        while(end2 != 0)
        {
             

            String holder = iterator.previous(); //DHRT 
            iterator.remove();
            iterator = strings.listIterator(count); //|DHRT
            iterator.add(holder);  
           //T|DHR

            end2--; //2
            iterator = strings.listIterator(end); //TDHR|
            count++;  //1
            
    
          
            
        }
    }
}