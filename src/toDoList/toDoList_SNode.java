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
public class toDoList_SNode <E>{
    private E element;
    private toDoList_SNode next;
    
    //constructor of toDoList_SNode
    public toDoList_SNode(E element, toDoList_SNode next){
        this.element = element;
        this.next = next;
    }

    /**
     * @return the element
     */
    public E getElement() {
        return element;
    }

    /**
     * @param element the element to set
     */
    public void setElement(E element) {
        this.element = element;
    }

    /**
     * @return the next
     */
    public toDoList_SNode getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(toDoList_SNode next) {
        this.next = next;
    }
}
