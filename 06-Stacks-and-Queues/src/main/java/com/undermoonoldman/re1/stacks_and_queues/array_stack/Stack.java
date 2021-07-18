package com.undermoonoldman.re1.stacks_and_queues.array_stack;

/**
 * @author arthurmeng
 */
public interface Stack<E> {

    /***
     * 获取栈内元素数量
     * javadoc
     * @return
     */
    int getSize();

    /***
     * 判断栈是否为空
     * javadoc
     * @return
     */
    boolean isEmpty();

    /***
     * 元素入栈
     * javadoc
     * @param e
     */
    void push(E e);

    /***
     * 元素出栈
     * javadoc
     * @return
     */
    E pop();

    /***
     * 获取栈顶元素
     * javadoc
     * @return
     */
    E peek();
}
