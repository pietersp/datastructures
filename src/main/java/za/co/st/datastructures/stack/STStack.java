package za.co.st.datastructures.stack;

import za.co.st.datastructures.linkedlist.STLinkedList;

/**
 * Created by stevy on 2017/10/22.
 */
public class STStack {

    private STLinkedList linkedList;

    public STStack() {
        this.linkedList = new STLinkedList();
    }

    public boolean isEmpty() {
        return this.linkedList.isEmpty();
    }

    public void push(int value) {
        this.linkedList.append(value);
    }

    public void pop() {
        this.linkedList.deleteHead();
    }

    public int size() {
        return this.linkedList.size();
    }
}
