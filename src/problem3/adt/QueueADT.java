package problem3.adt;

public interface QueueADT<E> {

    // Add the element at rear

    void add(E data);

    //remove the element at front

    E remove();

    //extract the element without removing

    E peek();

    // sort the queue
}
