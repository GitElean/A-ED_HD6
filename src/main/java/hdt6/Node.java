package hdt6;

import java.util.ArrayList;

public class Node {
    private int dato;
    private String value;
    private Node root;
    private ArrayList<Node> child;

    public Node(int dato, String value, Node root, Node child) {
        this.dato = dato;
        this.value = value;
        this.root = root;
        this.child.add(child);
    }



    public ArrayList<Node> getChild() {
        return child;
    }

    public void addChild(Node child) {
        this.child.add(child);
    }

    public String getValue() {
        return value;
    }
}
