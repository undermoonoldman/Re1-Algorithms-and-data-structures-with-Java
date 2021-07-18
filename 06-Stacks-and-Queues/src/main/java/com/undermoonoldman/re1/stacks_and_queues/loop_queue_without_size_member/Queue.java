package com.undermoonoldman.re1.stacks_and_queues.loop_queue_without_size_member;

/**
 * @author arthurmeng
 */
public interface Queue<E> {

    /***
     * 获取队列中元素个数
     * javadoc
     * @return
     */
    int getSize();

    /***
     * 判断队列是否为空
     * javadoc
     * @return
     */
    boolean isEmpty();

    /***
     * 元素入队
     * javadoc
     * @param e
     */
    void enqueue(E e);

    /***
     * 元素出队
     * javadoc
     * @return
     */
    E dequeue();

    /***
     * 获取队首元素
     * javadoc
     * @return
     */
    E getFront();
}
