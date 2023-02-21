import java.util.Random;
import java.util.Scanner;
public class Tree {
    //Class Node to store data and the children nodes
class Node {
        int data;
        Node leftChild;
        Node rightChild;

        Node(int data){
            this.data = data;
            leftChild = rightChild = null;
        }
    }

    Node root;

    //Tree class constructor
    public Tree () {
        root = null;
    }

    //Accessible insert method to call the recursive one
    public void insert(int data) {
        root = insertNode(root, data);
    }

    //Recursive insert method to define the nodes
    public Node insertNode(Node node, int key) {
        if(node == null) {
            node = new Node(key);
            return node;
        }

        if(key <= node.data) {
            node.leftChild = insertNode(node.leftChild, key);
        } else if (key > node.data) {
            node.rightChild = insertNode(node.rightChild, key);
        }
        return node;
    }

    //Accessible find method to call the recursive one
    public Node find(int data) {
        Node node = findNode(root, data);
        return node;
    }

    private Node findNode(Node node, int data) {
        if (node == null)
            return null;

        if(data == node.data) {
            return node;
        }

        if(data <= node.data) {
            return findNode(node.leftChild, data);
        } else {
            return  findNode(node.rightChild, data);
        }
    }

    private void printInOrder(Node node) {
        if(node == null)
            return;

        printInOrder(node.leftChild);
        System.out.print(node.data + ' ');
        printInOrder(node.rightChild);
    }

    public void print () {
        System.out.println("Tree In-Order");
        printInOrder(root);
        System.out.println();
        System.out.println("Tree Pre-Order");
        printPreOrder(root);
        System.out.println();
        System.out.println("Tree Post-Order");
        printPostOder(root);
    }
    public void printPreOrder (Node node) {
        if (node == null)
            return;
        System.out.print(node.data + ' ');
        printPreOrder(node.leftChild);
        printPreOrder(node.rightChild);
    }
    public void printPostOder (Node node) {
        if (node == null)
            return;
        printPostOder(node.leftChild);
        printPostOder(node.rightChild);
        System.out.print(node.data + ' ');
    }

    public static void main(String[] args) {
        int [] data = {1,2,3,4,5,6,7,8,9,10};
        Tree binaryTree = new Tree();

        for (int datum : data) {
            binaryTree.insert(datum);
            System.out.println(binaryTree.toString());
        }

        Random ran = new Random();
        int [] randomData = new int[10];
        System.out.println("Random Array");

        for( int dataElement: data) {
            dataElement = ran.nextInt(100);
            System.out.print(dataElement);
            System.out.print(' ');
        }
        System.out.println("Tree In Order");
        binaryTree.print();

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Type a number to search: ");
        int item = scanner.nextInt();
        Node findItem = binaryTree.find(item);
        if (findItem == null)
            System.out.println("Item Not Found");
        else
            System.out.print("Item " + findItem.data + " Found");

    }
}
