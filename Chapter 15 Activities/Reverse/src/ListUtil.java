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
        ListIterator <String> iterator = strings.listIterator(); 
        int count = 0; 
        while(iterator.hasNext())
        {
            
            iterator = strings.listIterator(count); 
            String holder = iterator.next();
            iterator = strings.listIterator(strings.size()+count); 
            iterator.add(holder); 
            count++; 
    
          
            
        }
    }
}