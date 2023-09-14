import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This program demonstrates the LinkedList class
 * and ListIterator class.
*/
public class ListDemo
{
    public static void main(String[] args)
    {

        //The addLast method can be used to populate a list 
        LinkedList<String> staff = new LinkedList<>();
        staff.addLast("Diana");
        staff.addLast("Harry"); 
        staff.addLast("Romeo"); 
        staff.addLast("Tom");

        //The list is currently: DHRT
        /*
         * The listIterator method creates a new list iterator that is positioned at the head of the list. 
         * The "|" is used to represent the iterator position.
         */
        ListIterator<String> iterator = staff.listIterator(); // |DHRT

        
         //The next method advances the iterator to the next element in the list. 
        
        iterator.next(); // D|HRT

        /*The next method also returns the element that the iterator is passing */
        String name = iterator.next(); // DH|RT
        System.out.println(name); 
        System.out.print("Expected: Harry"); 

        /* The add method for iterators inserts an element at the iterator position. 
         * The iterator is then position after the element that was added. 
         */
        iterator.add("Juliet"); // DHJ|RT
        iterator.add("Nina"); // DHJN|RT

        /*The remove method removes the element returned the last call to next or previous. 
         * The remove method can ONLY be called once after calling next or previous. 
         * The remove method CANNOT be called after calling add. 
         */
        iterator.next(); // DHJNR|T
        iterator.remove(); // DHJN|T

        System.out.println("/n"+staff); 
        System.out.println("Expected: [Diana, Harry, Juliet, Nina, Tom]"); 

        /*The set method updates the element reutrned by the last call to next or previous. */

        iterator.previous(); // DHJ|NT
        iterator.set("Albert"); // DHJ|AT

        /* The hasNext method returns true if the list has another element.
         * It is often used in the condition of a while loop.
         */

         //doing this resets the iterator position
         iterator = staff.listIterator(); // | DHJAT 

         iterator = staff.listIterator(); // |DHJAT
         while (iterator.hasNext()) {
            String n = iterator.next(); 
            if (n.equals("Juliet"))
            {                      // DHJ|AT
                iterator.remove(); // DH|AT
            }                      // DHAT||

            // Enhanced for loop works with linked list
            for (String a: staff)
            {
                System.out.print(a+" ");
            }
            System.out.println("Expected: Dianna Harry Albert Tom"); 

            iterator = staff.listIterator(); 
            /* 
            ConcurrentModificationException YOU CANT MODIFY A LINKED LIST WHILE ALSO USING AN ITERATOR UNLESS YOU USE THE ITERATOR TO DO IT
            while(iterator.hasNext())
            {
                String b = iterator.next();
                if (b.equals("Harry"))
                {
                    staff.remove("Diana");
                } 
            }
            */
         }
    }
}
