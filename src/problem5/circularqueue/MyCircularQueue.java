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
public class
MyCircularQueue<E> implements CircularQueueADT<E> {
    private Node<E> rear;
    private int size;

    @Override
    public void enqueue(E data) {
        Node node = new Node(data);
        if (isEmpty()) {
            rear = node;
            size++;
            node.setNext(node);
        } else {
            node.setNext(rear.getNext());
            rear.setNext(node);
            rear = node;
            size++;
        }
    }

    @Override
    public E dequeue() {
        Node<E> response = null;
        E data = null;
        if (!isEmpty()) {

            response = rear.getNext();
            data = response.getData();
            size--;
            if (rear.getNext() == rear) {
                rear = null;
            } else {
                rear.setNext(response.getNext());
            }
        }
        return data;
    }

    @Override
    public E peek() {
        Node<E> node = rear.getNext();
        E data = node.getData();
        return data;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int getSize() {
        return size;
    }
}
