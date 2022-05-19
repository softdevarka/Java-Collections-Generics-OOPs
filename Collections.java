
/**
 * Collection
 */

// Collection and Generics
// Collection was introduced in Java 1.2 and further Generics were introduced in
// Java 1.5
// Dynamic Sized Array
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collections {

    public static void main(String[] args) {

        // int values[] = new int[4];
        // Object values1[] = new Object[4];
        /*
         * here we can here say that we can add anything of any data type as an
         * object. But it is a fixed sized array and so we cannnot add or resize it.
         * So here comes collection interface where we can implement dynamically sized
         * arrays.
         */

        // values1[0] = "Arka";
        // values1[1] = 10;
        // values1[2] = 20;

        /*
         * The Collection interface is the root interface of the Java collections
         * framework.
         * 
         * There is no direct implementation of this interface. However, it is
         * implemented through its subinterfaces like List, Set, and Queue.
         * 
         * For example, the ArrayList class implements the List interface which is a
         * subinterface of the Collection Interface.
         */

        Collection values = new ArrayList<>();
        /*
         * mentioning particular datatype in list where u specify what type of data to
         * be there in the list is known as generics
         */
        values.add(3);
        values.add("Arka");
        values.add(5);

        /*
         * There are certain classes available in Collection framework. We used three
         * terms with Collection, we used Collection as a framework, we use Collection
         * as a class, we use Collection as an interface, this Collection is a interface
         * here.
         */

        // interator
        // enhanced for loop
        // for fetching the value from the collection

        // Iterator i = values.iterator(); //while(i.hasNext());
        // System.out.println(i.next()); //then we use one sout;
        // System.out.println(i.next());
        // System.out.println(i.next());

        for (Object i : values) { // enhanced for loop
            System.out.println(i);
        }
    }
}
