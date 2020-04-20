package Estructuras_de_datos;

public class QueueArrayGeneric<T> {

    private int size = 10;
    private int front, rear , numberOfElements;
    private T[] qarray;

    public QueueArrayGeneric(){
        front = rear = numberOfElements = 0;
        qarray = (T[]) new Object[size];
    }

    public boolean empty(){
        return numberOfElements <=0;
    }

    public boolean full(){
        return numberOfElements >= size;
    }

    public void enqueue(T item){
        if (full()) {
            T[] newQarray = (T[]) new Object[size * 2];
            int count = 0;
            if (front > rear) {
                for (int i = front; i < size; i++) {
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
            rear = size - 1;
            size = size * 2;
            qarray = newQarray;
        }
        rear = (rear + 1) % size;
        qarray[rear] = item;
        numberOfElements++;
    }

    public T dequeue(){
        if (empty())
            throw new RuntimeException("Nothing to dequeue, the queue is empty.");
        else {
            T item = qarray[front];
            qarray[front] = null;
            front = (front + 1) % size;
            numberOfElements--;
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