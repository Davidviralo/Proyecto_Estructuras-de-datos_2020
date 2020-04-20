package Estructuras_de_datos;

public class QueueArray<T> {

    private int capacity = 10;
    private int front, rear , size;
    private T[] qarray;

    public QueueArray(){
        front = rear = size = 0;
        qarray = (T[]) new Object[capacity];
    }

    public boolean empty(){
        return size <= 0;
    }

    public boolean full(){
        return size >= capacity;
    }

    public int getSize() {
        return size;
    }

    public void enqueue(T item){
        if (full()) {
            T[] newQarray = (T[]) new Object[capacity * 2];
            int count = 0;
            if (front > rear) {
                for (int i = front; i < capacity; i++) {
                    newQarray[count] = qarray[i];
                    count++;
                }
                for (int i = 0; i <= rear; i++){
                    newQarray[count] = qarray[i];
                    count++;
                }
            } else {
                for (int i = front; i <= rear; i++){
                    newQarray[count] = qarray[i];
                    count++;
                }
            }
            front = 0;
            rear = capacity - 1;
            capacity = capacity * 2;
            qarray = newQarray;
        }
        rear = (rear + 1) % capacity;
        qarray[rear] = item;
        size++;
    }

    public T dequeue(){
        if (empty())
            throw new RuntimeException("Nothing to dequeue, the queue is empty.");
        else {
            T item = qarray[front];
            qarray[front] = null;
            front = (front + 1) % capacity;
            size--;
            return item;
        }
    }

    public T getFront(){
        if (empty())
            return null;
        else
            return qarray[front];
    }

    public T getRear(){
        if (empty())
            return null;
        else
            return qarray[rear];
    }
}