import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        // create a new linked list
        LinkedList<String> linkedList = new LinkedList<String>();

        // add elements to the linked list
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.addFirst("L");
        linkedList.addLast("9k");
        linkedList.add(2, "CERES");
        linkedList.remove(1);
        // print the linked list
        System.out.println(linkedList);
//    }

        CircularLinkedList myList = new CircularLinkedList();
        myList.addNodeToHead(75);
        myList.addNodeToTail(100);
        myList.addNodeToHead(50);
        myList.print();
        myList.addNodeToTail(1000);
        myList.addNodeToTail(23000);
        myList.print();
        myList.rotateElement();
        myList.print();
        myList.deleteNodeFromTail();
        myList.print();
        myList.deleteNodeFromHead();
        myList.print();
    }
}
