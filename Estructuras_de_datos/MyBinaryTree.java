package Estructuras_de_datos;

import java.io.Serializable;

public class MyBinaryTree implements Serializable {

    private BinaryNode root;

    public MyBinaryTree() {
        root = null;
    }

    public MyBinaryTree(BinaryNode root) {
        this.root = root;
    }

    public BinaryNode root(){
        return root;
    }

    public void makeEmpty() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public boolean contains(int x) {
        return contains(x, root);
    }

    public boolean contains(int x, BinaryNode root) {
        if (root == null)
            return false;
        if (x < root.getKey())
            return contains(x, root.getLeft());
        else if (x > root.getKey())
            return contains(x, root.getRight());
        else
            return true;
    }

    public BinaryNode find(int k) {
        return find(k, root);
    }

    public BinaryNode find(int k, BinaryNode root) {
        if (root.getKey() > k) {
            if (root.getLeft() != null)
                return find(k, root.getLeft());
        } else {
            if (root.getRight() != null)
                return find(k, root.getRight());
        }
        return root;
    }

    public BinaryNode leftDescendant(BinaryNode node) {
        if (node.getLeft() == null)
            return node;
        else
            return leftDescendant(node.getLeft());
    }

    public BinaryNode rightAncestor(BinaryNode node) {
        if (node.getKey() < node.getParent().getKey())
            return node.getParent();
        else
            return rightAncestor(node.getParent());
    }

    public BinaryNode next(BinaryNode node) {
        if (node.getRight() != null)
            return leftDescendant(node.getRight());
        else
            return rightAncestor(node);
    }

    public MyArrayList<BinaryNode> rangeSearch(int x, int y, BinaryNode root) {
        MyArrayList<BinaryNode> list = new MyArrayList<>();
        BinaryNode node = new BinaryNode();
        node = find(x, root);
        while (node.getKey() <= y) {
            if (node.getKey() >= x)
                list.pushBack(node);
            node = next(node);
        }
        return list;
    }

    public void insert(int k, BinaryNode root) {
        BinaryNode node = find(k, root);
        if (k < node.getKey()) {
            BinaryNode child = new BinaryNode(k);
            node.setLeft(child);
            child.setParent(node);
        } else if (k > node.getKey()) {
            BinaryNode child = new BinaryNode(k);
            node.setRight(child);
            child.setParent(node);
        }
    }

    public void delete(BinaryNode node) {
        if (node.getRight() == null)
            node = node.getLeft();
        else {
            BinaryNode x = next(node);
            node = x;

        }
    }

    public void preorder(BinaryNode node) {
        if (node != null) {
            System.out.print(node.getKey() + " ");
            preorder(node.getLeft());
            preorder(node.getRight());
        }
    }

    public void postorder(BinaryNode node) {
        if (node != null) {
            postorder(node.getLeft());
            postorder(node.getRight());
            System.out.print(node.getKey() + " ");
        }
    }

    public void inorder(BinaryNode node) {
        if (node != null) {
            postorder(node.getLeft());
            System.out.print(node.getKey() + " ");
            postorder(node.getRight());
        }
    }

    public void levels(BinaryNode node) {
        ArrayQueue<BinaryNode> nodeQueue = new ArrayQueue<>();
        BinaryNode aux = new BinaryNode();
        nodeQueue.enqueue(node);
        while (!nodeQueue.empty()) {
            aux = nodeQueue.dequeue();
            System.out.println(aux.getKey());
            if (aux.getLeft() != null)
                nodeQueue.enqueue(aux.getLeft());
            if (aux.getRight() != null)
                nodeQueue.enqueue(aux.getRight());
        }
    }
}
