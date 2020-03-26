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
    @Override
    public void add(E data) {
        if (size == 0) {
            Node<E> node = new Node<E>(data, null);
            front = node;
            rear = node;
            size++;
        } else {
            Node<E> node = new Node<E>(data, rear.getNext());
            rear.setNext(node);
            rear = node;
            size++;
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

    @Override
    public void sort() {
        Node<E> current = front;
        Node<E> index = null;
        E temp;

        if (front == null) {
            return;
        } else {
            while (current != null) {
                //Node index will point to node next to current
                index = current.getNext();

                while (index != null) {
                    //If current node's data is greater than index's node data, swap the data between them
                    if ((current.getData()).equals(index.getData())) {
                        temp = (E) current.getData();
                        current.setData(index.getData());
                        index.setData(temp);
                    }
                    index = index.getNext();
                }
                current = current.getNext();
            }
        }
    }
}

