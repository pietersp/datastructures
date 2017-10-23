package za.co.st.datastructures.linkedlist;

/**
 * Created by stevy on 2017/10/22.
 */
public class STLinkedList {
    private STNode headNode;
    private STNode tailNode;

    public STNode append(int value) {
        STNode newNode = new STNode(value);
        if (headNode == null) {
            headNode = newNode;
            tailNode = newNode;
            return newNode;
        }

        tailNode.setNext(newNode);
        newNode.setPrevious(tailNode);
        tailNode = newNode;
        return newNode;
    }

    public STNode prepend(int value) {
        STNode newNode = new STNode(value);
        if (headNode == null) {
            headNode = newNode;
        } else {
            newNode.setNext(headNode);
            headNode.setPrevious(newNode);
            headNode = newNode;
        }
        return newNode;
    }

    public boolean isEmpty() {
        return this.headNode == null ? true : false;
    }

    public void delete(int value) {
        if (headNode == null) return;

        STNode beforeNode = null;
        STNode currentNode = headNode;

        // Searching for the node that contains `value`
        while (currentNode != null) {
            if (currentNode.getValue() == value) {
                break;
            } else {
                beforeNode = currentNode;
                currentNode = currentNode.next();
            }
        }

        // Delete node
        if (beforeNode == null) { // We know head is the node to delete
            this.deleteHead();
        } else {
            beforeNode.setNext(currentNode.next());
        }
    }

    public void deleteHead() {
        if (headNode == null) return;

        headNode = headNode.next();
    }

    public void deleteTail() {
        if (tailNode == null) return;

        tailNode = tailNode.previous();
        tailNode.setNext(null);
    }

    public int size() {
        int i = 0;
        if (headNode == null) return i;

        STNode current = headNode;
        while (current != null) {
            i++;
            current = current.next();
        }

        return i;
    }

    public boolean contains(int value) {
        if (headNode == null) return false;

        STNode currentNode = headNode;

        // Searching for the node that contains `value`
        while (currentNode != null) {
            if (currentNode.getValue() == value) {
                return true;
            }
            currentNode = currentNode.next();
        }

        return false;
    }
}
