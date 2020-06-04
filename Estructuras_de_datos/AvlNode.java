package Estructuras_de_datos;

import java.io.Serializable;

public class AvlNode<T extends Comparable<T>> implements Serializable {

    private T item;
    private AvlNode<T> parent ,left, right;
    private int height = 0;

    public AvlNode(T item, AvlNode<T> parent, AvlNode<T> left, AvlNode<T> right, int height) {
        this.item = item;
        this.parent = parent;
        this.left = left;
        this.right = right;
        this.height = height;
    }

    public AvlNode(T item) {
        this.item = item;
    }

    public AvlNode() {
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public AvlNode<T> getParent() {
        return parent;
    }

    public void setParent(AvlNode<T> parent) {
        this.parent = parent;
    }

    public AvlNode<T> getLeft() {
        return left;
    }

    public void setLeft(AvlNode<T> left) {
        this.left = left;
    }

    public AvlNode<T> getRight() {
        return right;
    }

    public void setRight(AvlNode<T> right) {
        this.right = right;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean hasChild() {
        return (this.left != null || this.right != null);
    }

    public AvlNode<T> getLargerChild() {
        if (left.getItem().compareTo(right.getItem()) > 0)
            return this.left;
        else
            return this.right;
    }
}
