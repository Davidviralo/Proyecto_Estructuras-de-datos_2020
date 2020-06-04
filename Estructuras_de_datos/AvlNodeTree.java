package Estructuras_de_datos;

import java.io.Serializable;

public class AvlNodeTree<T extends Comparable<T>> implements Serializable {

    private AvlNode<T> root;

    public AvlNodeTree(AvlNode<T> root) {
        this.root = root;
    }

    public AvlNodeTree() {
    }

    public AvlNode<T> root() {
        return root;
    }

    public void setRoot(AvlNode<T> root) {
        this.root = root;
    }

    public void makeEmpty() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public boolean contains(T x) {
        return contains(x, root);
    }

    public boolean contains(T x, AvlNode<T> root) {
        if (root == null)
            return false;
        if (x.compareTo(root.getItem()) < 0)
            return contains(x, root.getLeft());
        else if (x.compareTo(root.getItem()) > 0)
            return contains(x, root.getRight());
        else
            return true;
    }

    public T findMin() {
        if (isEmpty())
            throw new RuntimeException("The tree is empty");
        else
            return findMin(this.root).getItem();
    }

    public AvlNode<T> findMin(AvlNode<T> node) {
        if (node == null)
            return null;
        else if (node.getLeft() == null)
            return node;
        return findMin(node.getLeft());
    }

    public T findMax() {
        if (isEmpty())
            throw new RuntimeException("The tree is empty");
        else
            return findMax(this.root).getItem();
    }

    public AvlNode<T> findMax(AvlNode<T> node) {
        if (node == null)
            return null;
        else if (node.getRight() == null)
            return node;
        return findMax(node.getRight());
    }

    public int size(){
        return size(root);
    }

    public int size(AvlNode<T> node) {
        if (node == null)
            return 0;
        else
            return 1 + size(node.getLeft()) + size(node.getRight());
    }

    public AvlNode<T> find(T k) {
        return find(k, root);
    }

    public AvlNode<T> find(T k, AvlNode<T> root) {
        if (root.getItem().compareTo(k) > 0) {
            if (root.getLeft() != null)
                return find(k, root.getLeft());
        } else {
            if (root.getRight() != null)
                return find(k, root.getRight());
        }
        return root;
    }

    public AvlNode<T> leftDescendant(AvlNode<T> node) {
        if (node.getLeft() == null)
            return node;
        else
            return leftDescendant(node.getLeft());
    }

    public AvlNode<T> rightAncestor(AvlNode<T> node) {
        if (node.getItem().compareTo(node.getParent().getItem()) < 0)
            return node.getParent();
        else
            return rightAncestor(node.getParent());
    }

    public AvlNode<T> next(AvlNode<T> node) {
        if (node.getRight() != null)
            return leftDescendant(node.getRight());
        else
            return rightAncestor(node);
    }

    public MyArrayList<AvlNode<T>> rangeSearch(T x, T y, AvlNode<T> root) {
        MyArrayList<AvlNode<T>> list = new MyArrayList<>();
        AvlNode<T> node = new AvlNode<T>();
        node = find(x, root);
        while (node.getItem().compareTo(y) <= 0) {
            if (node.getItem().compareTo(x) >= 0)
                list.pushBack(node);
            node = next(node);
        }
        return list;
    }

    public void insert(T k, AvlNode<T> root) {
        AvlNode<T> node = find(k, root);
        if (k.compareTo(node.getItem()) < 0) {
            AvlNode<T> child = new AvlNode<T>(k);
            node.setLeft(child);
            child.setParent(node);
        } else if (k.compareTo(node.getItem()) > 0) {
            AvlNode<T> child = new AvlNode<>(k);
            node.setRight(child);
            child.setParent(node);
        }
    }

    public void delete(AvlNode<T> node) {
        if (node.getRight() == null)
            node = node.getLeft();
        else {
            AvlNode<T> x = next(node);
            node = x;
            x.setParent(x.getRight());
        }
    }

    public void remove(T x) {
        root = remove(x, root);
    }

    public AvlNode<T> remove (T x, AvlNode<T> node) {
        if (node == null)
            return null;
        if (x.compareTo(node.getItem()) < 0)
            node.setLeft(remove(x, node.getLeft()));
        else if (x.compareTo(node.getItem()) > 0)
            node.setRight(remove(x, node.getRight()));
        else if (node.getLeft() != null && node.getRight() != null) {
            node.setItem(findMin(node.getRight()).getItem());
            node.setRight(remove(node.getItem(),node.getRight()));
        } else {
            if (node.getLeft() != null)
                node = node.getLeft();
            else
                node = node.getRight();
        }
        return node;
    }

    public int height(AvlNode<T> node) {
        if (node == null)
            return -1;
        else
            return 1+ Math.max(height(node.getLeft()), height(node.getRight()));
    }

    public void rotateRight(AvlNode<T> x) {
        AvlNode<T> p = x.getParent();
        AvlNode<T> y = x.getLeft();
        AvlNode<T> b = y.getRight();
        y.setParent(p);
        if (y.getItem().compareTo(p.getItem()) < 0)
            p.setLeft(y);
        else
            p.setRight(y);
        x.setParent(y);
        y.setRight(x);
        b.setParent(x);
        x.setLeft(b);
    }

    public void preOrder(AvlNode<T> node) {
        if (node != null) {
            System.out.print(node.getItem() + " ");
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }

    public void postOrder(AvlNode<T> node) {
        if (node != null) {
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.print(node.getItem() + " ");
        }
    }

    public void inOrder(AvlNode<T> node) {
        if (node != null) {
            inOrder(node.getLeft());
            System.out.print(node.getItem() + " ");
            inOrder(node.getRight());
        }
    }

    public void levels(AvlNode<T> node) {
        if (node != null) {
            ArrayQueue<AvlNode<T>> nodeQueue = new ArrayQueue<>();
            AvlNode<T> aux = new AvlNode<T>();
            nodeQueue.enqueue(node);
            while (!nodeQueue.empty()) {
                aux = nodeQueue.dequeue();
                System.out.println(aux.getItem());
                if (aux.getLeft() != null)
                    nodeQueue.enqueue(aux.getLeft());
                if (aux.getRight() != null)
                    nodeQueue.enqueue(aux.getRight());
            }
        }
    }
}
