package Estructuras_de_datos;

public class BinaryArrayTree {

    private int maxSize;
    private int size;
    private int[] H;

    public BinaryArrayTree(int maxSize) {
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

    public void insert(int x) {
        if (size == maxSize)
            throw new RuntimeException("The heap is full");
        else {
            size++;
            H[size] = x;
        }
    }


    public void levels() {
        if (size >= 1) {
            ArrayQueue<Integer> queue = new ArrayQueue<>();
            int aux;
            queue.enqueue(1);
            while (!queue.empty()) {
                aux = queue.dequeue();
                System.out.println(H[aux]);
                if (H[left(aux)] != -1)
                    queue.enqueue(left(aux));
                if (H[right(aux)] != -1)
                    queue.enqueue(right(aux));
            }
        }
    }

}
