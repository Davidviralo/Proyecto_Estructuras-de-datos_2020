package Estructuras_de_datos;

import java.io.Serializable;

import static java.lang.Math.floor;

public class AvlArrayTree implements Serializable {

    private int maxSize;
    private int size;
    private int[] H;

    public AvlArrayTree(int maxSize) {
        maxSize ++;
        this.maxSize = maxSize;
        this.H = new int[maxSize];
        this.size = 0;
    }

    public int parent(int index){
        return index/2;
    }

    public int left(int index) {
        return 2*index;
    }

    public int right(int index) {
        return (2*index) + 1;
    }

    public void siftUp(int index) {
        while (index > 1 && H[parent(index)] < H[index]) {
            int aux = H[parent(index)];
            H[parent(index)] = H[index];
            H[index] = aux;
            index = parent(index);
        }
    }

    public void siftDown(int index) {
        int maxIndex = index;
        int leftIndex = left(index);
        if (leftIndex <= size && H[leftIndex] > H[maxIndex])
            maxIndex = leftIndex;
        int rightIndex = right(index);
        if (rightIndex <= size && H[rightIndex] > H[maxIndex])
            maxIndex = rightIndex;
        if (index != maxIndex){
            int aux = H[index];
            H[index] = H[maxIndex];
            H[maxIndex] = aux;
            siftDown(maxIndex);
        }
    }

    public void insert(int x) {
        if (size == maxSize)
            throw new RuntimeException("The heap is full");
        else {
            size++;
            H[size] = x;
            siftUp(size);
        }
    }

    public int extractMax() {
        int result = H[1];
        H[1] = H[size];
        size--;
        siftDown(1);
        return result;
    }

    public void remove(int index) {
        H[index] = 2147483647;
        siftUp(index);
        extractMax();
    }

    public void changePriority(int index, int newPriority) {
        int oldPriority =  H[index];
        H[index] = newPriority;
        if (newPriority > oldPriority)
            siftUp(index);
        else
            siftDown(index);
    }

    public void heapSort(int[] array) {
        int size = array.length;
        AvlArrayTree arrayTree = new AvlArrayTree(size);
        for (int i = 0; i < size; i++)
            arrayTree.insert(array[i]);
        for (int i = size-1; i>=0; i--)
            array[i] = extractMax();
    }

    public AvlArrayTree buildHeap(int[] array) {
        int size = array.length;
        AvlArrayTree heap = new AvlArrayTree(size);
        for (int i = 0; i < size; i++)
            heap.H[i+1] = array[i];
        for (int i = heap.maxSize/2; i >= 1; i--)
            heap.siftDown(i);
        return heap;
    }

    public int[] inPlaceHeapSort(int[] array) {
        AvlArrayTree A = buildHeap(array);
        for (int i = 0; i < array.length - 1; i++){
            int aux = A.H[1];
            A.H[1] = A.H[A.size];
            A.H[A.size] = aux;
            A.size--;
            A.siftDown(1);
        }
        return A.H;
    }
}
