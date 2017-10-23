package za.co.st.datastructures.queue;

import za.co.st.datastructures.linkedlist.STLinkedList;

/**
 * Created by stevy on 2017/10/22.
 */
public class STQueue {

    private STLinkedList linkedList;

    public STQueue() {
        this.linkedList = new STLinkedList();
    }

    public boolean isEmpty() {
        return this.linkedList.isEmpty();
    }

    public void enqueue(int value) {
        this.linkedList.append(value);
    }

    public void dequeue() {
        this.linkedList.deleteTail();
    }

    public int size() {
        return this.linkedList.size();
    }
}
