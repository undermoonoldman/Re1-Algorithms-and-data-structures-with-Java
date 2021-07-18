package com.undermoonoldman.re1.stacks_and_queues.loop_queue_without_wasting_one_space;

public interface Queue<E> {

    int getSize();
    boolean isEmpty();
    void enqueue(E e);
    E dequeue();
    E getFront();
}
