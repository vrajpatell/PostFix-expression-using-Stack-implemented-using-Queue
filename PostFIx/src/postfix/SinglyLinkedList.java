/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postfix;

public class SinglyLinkedList<E>
{
    private static class Node<E>
    {
        private final E element;
        private final Node<E> next;

        public Node(E e, Node<E> n)
        {
            element = e;
            next = n;
        }

        public E getElement()
        {
            return element;
        }

        public Node<E> getNext()
        {
            return next;
        }       
    }

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public SinglyLinkedList()
    {

    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public void addFirst(E e)
    {
        head = new Node<>(e, head);

        if (size == 0)
        {
            tail = head;
        }
        size++;
    }

    public E removeFirst()
    {
        if (isEmpty())
        {
            return null;
        }
        E answer = head.getElement();
        head = head.getNext();
        size--;

        if (size == 0)
        {
            tail = null;
        }
        return answer;
    }
}