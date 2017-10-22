package za.co.st.datastructures.linkedlist;

/**
 * Created by stevy on 2017/10/22.
 */
public class STNode {
    private int value;
    private STNode next;
    private STNode previous;

    public STNode(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void setNext(STNode next) {
        this.next = next;
    }

    public STNode next() {
        return this.next;
    }

    public void setPrevious(STNode previous) {
        this.previous = previous;
    }

    public STNode previous() {
        return this.previous;
    }
}
