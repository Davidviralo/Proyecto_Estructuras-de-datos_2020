package Estructuras_de_datos;

import java.io.Serializable;

public class AvlNodeTree implements Serializable {

    private AvlNode root;

    public AvlNodeTree(AvlNode root) {
        this.root = root;
    }

    public AvlNodeTree() {
    }

    public AvlNode getRoot() {
        return root;
    }

    public void setRoot(AvlNode root) {
        this.root = root;
    }
}
