import java.util.*;


public class LinkedListExample {
    public static void main(String[] args) {

        /* Linked list declaration */
        LinkedList<String> linkedList= new LinkedList<String>();

        /*add(string element) is used for adding * the element to the linked list*/
        linkedList.add("Item1");
        linkedList.add("Item5");
        linkedList.add("Item3");
        linkedList.add("Item6");
        linkedList.add("Item2");

        /*Display Linked List Content*/
        System.out.println("Linked List Content: " +linkedlist);

        /*Add First and Last Element*/
        linkedlist.addFirst("First Item");
        linkedlist.addLast("last Item");
        System.out.println("Linkedlist Content after addition: " +linklist);

        /*Remove first and last element*/
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("Linkedlist after deletion of first and last element:" linkedlist");

                /* Add to a Position and remove from a position*/
                linkedlist.add(0, "Newly added item");
                linkedList.remove(2);
                 System.out.println("Final Content: " +linkedlist);
    }

    }

}
