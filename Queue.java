package Lap4_DS_HomeWork.src;

public interface Queue<E>{
    boolean isEmpty();
    int size();
    void enqueue(E element);
    E dequeue();
    E top();
}
