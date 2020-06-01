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

    public int getMax() {
        return getMax(root);
    }

    public int getMax(AvlNode node) {
        return node.getKey();
    }

    public void siftUp(AvlNode node) {
        if (node.getParent() != null && node.getParent().getKey() < node.getKey()) {
            int aux = node.getParent().getKey();
            node.getParent().setKey(node.getKey());
            node.setKey(aux);
            siftUp(node.getParent());
        }
    }

    public void siftDown(AvlNode node) {
        if (node.hasChild()) {
            AvlNode largerChild = node.getLargerChild();
            if (largerChild.getKey() > node.getKey()) {
                int aux = largerChild.getKey();
                largerChild.setKey(node.getKey());
                node.setKey(aux);
                siftDown(largerChild);
            }
        }
    }


}
