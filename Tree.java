package Binary_Search_Tree;

class Node {

    public Object data;
    public Node left;
    public Node right;

}

public class Tree {

    private Node root;

    public Tree() {
        root = null;
    }

    //returns the largest data member in the tree
    public Object findLargest() {
        Node current = root;
        if(current != null) {
            while(current.right != null) {
                current = current.right;
            } return current.data;
        }
        else
            return null;
    }

    //returns the smallest data member in the tree
    public Object findSmallest() {
        Node current = root;
        if(current != null) {
            while(current.left != null) {
                current = current.left;
            } return current.data;
        }
        else
            return null;
    }

}