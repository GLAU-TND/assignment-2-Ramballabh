/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem3.node.Node;
import problem5.adt.CircularQueueADT;

//to implement circular queue
public class MyCircularQueue<E> implements CircularQueueADT<E> {
    private Node<E> rear;
    private int size;

    @Override
    public void enqueue(E data) {

    }

    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }
}
