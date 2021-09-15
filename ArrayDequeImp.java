package collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeImp {
    public static void main(String[] args) {  
        Deque<String> deque = new ArrayDeque<String>();  
        deque.offer("Sakshi");  
        deque.offer("Rajat");  
        deque.add("Riya");  
        deque.offerFirst("Adhira");  
        System.out.println("After using offerFirst method");  

        Iterator<String> itr = deque.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        deque.pollLast();  
        System.out.println("After using pollLast() method");  

        Iterator<String> itr1 = deque.iterator();
        while(itr1.hasNext()) {
            System.out.println(itr1.next());
        }
    }
}
