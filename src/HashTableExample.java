import  java.util.*;
import java.lang.*;
import java.io.*;
public class HashTableExample {
    public static void main( String[] args) {
        // create a new hash table to tore library books by id and subject
        Hashtable libraryBooks = new Hashtable();
        // (a) store books in a library by code and subject area
        libraryBooks.put("748.5", "Stained Glass");
        libraryBooks.put("553.8", "Gems");
        libraryBooks.put("363.739", "Air Pollution");

        // (b) retrieve a book by its id
//        System.out.println("Retrieve book by id 748.5: " + libraryBooks.get("748.5"));
//        System.out.println("Retrieve book by id 300.8: " + libraryBooks.get("300.8"));

        // (c) check to see if id exists
//        System.out.println("If id 553.8 exists: " + libraryBooks.containsKey("553.8"));
//        System.out.println("if id 448.7 exists:" + libraryBooks.containsKey("448.7"));

        //(d) check to see if a subject exists
//        System.out.println("If subject Gems exists:" + libraryBooks.containsValue("Gems"));

        //(e) print out all the values contained in the hash table
        Enumeration enumeration = libraryBooks.elements();
//        while (enumeration.hasMoreElements()) {
//            System.out.println("hashtable values: "+ enumeration.nextElement());
//        }
        //(f) find the size of the hash table
//        System.out.println("Size of hashtable in Java: " + libraryBooks.size());
        //(g) clear the hash table
        libraryBooks.clear();
        //(h) check to see if hash table is empty
//        System.out.println("Is hash table empty?" + libraryBooks.isEmpty());

        libraryBooks.put("567.2", "grassland");
        libraryBooks.put("597.2", "waterland");
        libraryBooks.put("507.2", "rockland");
        System.out.println("If id wheat grass exists : " + libraryBooks.containsValue("wheat grass exists"));
        System.out.println("if id 448.7 exists: " + libraryBooks.containsKey("349.78"));

        while (enumeration.hasMoreElements()) {
            System.out.println("hashtable values: " + enumeration.nextElement());
        }


    }
}
