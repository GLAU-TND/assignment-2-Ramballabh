/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.adt.QueueADT;
import problem3.node.Node;

public class MyPriorityQueue<E> implements QueueADT<E> {
    private int size = 0;
    private Node<E> front;
    private Node<E> rear;

    private void sortedAdd(E data) {


    }

    @Override
    public void add(E data) {
        if (size == 0) {
            Node<E> node = new Node<E>(data, null);
            front = node;
            rear = node;
            size++;
        } else {
            sortedAdd(data);
        }
    }

    @Override
    public E remove() {
        E data = front.getData();
        front = front.getNext();
        size--;
        return data;
    }

    @Override
    public E peek() {
        E data = front.getData();
        return data;
    }
}

