/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toDoList;

/**
 *
 * @author ADMIN
 */
public class toDoList_SList <E>{
    private toDoList_SNode<E> head, tail;
    private int size;


    public toDoList_SList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size <= 0;
    }

    public toDoList_SNode first() {
        return head;
    }

    public toDoList_SNode last() {
        return tail;
    }
    public int size() {
        return size;
    }
    public void addFirst(toDoList_SNode newNode) {
        newNode.setNext(head);
        head = newNode;
        if (isEmpty()) {
            tail = newNode;
            head.setNext(tail);
        }
        size++;
    }


    public void addLast(toDoList_SNode newNode) {
        tail.setNext(newNode);
        tail = newNode;
        size++;
    }
    

    public toDoList_SNode removeFirst(){
        toDoList_SNode<E> tempNode = head;
        head = head.getNext();
        tempNode.setNext(null);
        size--;
        return tempNode;
    }

    public void showList() {
       
        toDoList_SNode temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print("Task : " + temp.getElement()+"\n");
            temp = temp.getNext();
        }
    }
}
