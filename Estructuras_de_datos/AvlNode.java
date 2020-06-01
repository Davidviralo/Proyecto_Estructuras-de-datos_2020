package Estructuras_de_datos;

import java.io.Serializable;

public class AvlNode implements Serializable {

    private int key;
    private AvlNode parent;
    private AvlNode left;
    private AvlNode right;
    private int height;

    public AvlNode(int key, AvlNode parent, AvlNode left, AvlNode right, int height) {
        this.key = key;
        this.parent = parent;
        this.left = left;
        this.right = right;
        this.height = height;
    }

    public AvlNode(int key) {
        this.key = key;
    }

    public AvlNode() {
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public AvlNode getParent() {
        return parent;
    }

    public void setParent(AvlNode parent) {
        this.parent = parent;
    }

    public AvlNode getLeft() {
        return left;
    }

    public void setLeft(AvlNode left) {
        this.left = left;
    }

    public AvlNode getRight() {
        return right;
    }

    public void setRight(AvlNode right) {
        this.right = right;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
