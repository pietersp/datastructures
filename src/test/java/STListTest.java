import org.junit.Assert;
import org.junit.Test;
import za.co.st.datastructures.linkedlist.STLinkedList;
import za.co.st.datastructures.queue.STQueue;
import za.co.st.datastructures.stack.STStack;

/**
 * Created by stevy on 2017/10/22.
 */
public class STListTest {

    @Test
    public void linkedListTest() {
        STLinkedList linkedList = new STLinkedList();

        int value1 = 1;
        int value2 = 2;
        int value3 = 3;

        Assert.assertFalse(linkedList.contains(value1));
        Assert.assertTrue(linkedList.isEmpty());

        linkedList.append(value1);

        Assert.assertTrue(linkedList.contains(value1));
        Assert.assertFalse(linkedList.contains(value2));
        Assert.assertEquals(1, linkedList.size());
        Assert.assertFalse(linkedList.isEmpty());

        linkedList.append(value2);

        Assert.assertTrue(linkedList.contains(value2));
        Assert.assertFalse(linkedList.contains(value3));
        Assert.assertEquals(2, linkedList.size());
        Assert.assertFalse(linkedList.isEmpty());

        linkedList.append(value3);
        Assert.assertTrue(linkedList.contains(value3));
        Assert.assertEquals(3, linkedList.size());
        Assert.assertFalse(linkedList.isEmpty());

        linkedList.delete(value1);

        Assert.assertFalse(linkedList.contains(value1));
        Assert.assertTrue(linkedList.contains(value2));
        Assert.assertTrue(linkedList.contains(value3));
        Assert.assertEquals(2, linkedList.size());
        Assert.assertFalse(linkedList.isEmpty());

        linkedList.prepend(value1);

        Assert.assertTrue(linkedList.contains(value1));
        Assert.assertTrue(linkedList.contains(value2));
        Assert.assertTrue(linkedList.contains(value3));
        Assert.assertEquals(3, linkedList.size());
        Assert.assertFalse(linkedList.isEmpty());

        linkedList.delete(value2);

        Assert.assertTrue(linkedList.contains(value1));
        Assert.assertFalse(linkedList.contains(value2));
        Assert.assertTrue(linkedList.contains(value3));
        Assert.assertEquals(2, linkedList.size());
        Assert.assertFalse(linkedList.isEmpty());

    }

    @Test
    public void queueTest() {
        STQueue queue = new STQueue();

        int value1 = 1;
        int value2 = 2;
        int value3 = 3;

        Assert.assertTrue(queue.isEmpty());

        queue.enqueue(value1);

        Assert.assertEquals(1, queue.size());

        queue.enqueue(value2);

        Assert.assertEquals(2, queue.size());

        queue.enqueue(value3);

        Assert.assertEquals(3, queue.size());

        queue.dequeue();

        Assert.assertEquals(2, queue.size());

        queue.dequeue();

        Assert.assertEquals(1, queue.size());
    }

    @Test
    public void stackTest() {
        STStack stack = new STStack();

        int value1 = 1;
        int value2 = 2;
        int value3 = 3;

        Assert.assertTrue(stack.isEmpty());

        stack.push(value1);

        Assert.assertEquals(1, stack.size());

        stack.push(value2);

        Assert.assertEquals(2, stack.size());

        stack.push(value3);

        Assert.assertEquals(3, stack.size());

        stack.pop();

        Assert.assertEquals(2, stack.size());

        stack.pop();

        Assert.assertEquals(1, stack.size());
    }
}
