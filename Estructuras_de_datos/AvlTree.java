package Estructuras_de_datos;

public class AvlTree {

    private AvlNode root;

    public AvlTree(AvlNode root) {
        this.root = root;
    }

    public AvlTree() {
    }

    public AvlNode getRoot() {
        return root;
    }

    public void setRoot(AvlNode root) {
        this.root = root;
    }

    public int getMax() {
        return getMax(root);
    }

    public int getMax(AvlNode node) {
        return node.getKey();
    }
}
