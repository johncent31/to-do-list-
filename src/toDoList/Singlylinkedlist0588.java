/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toDoList;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author ADMIN
 */
public class Singlylinkedlist0588 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int retry=1;
        toDoList_SList<String> sList = new toDoList_SList<>();
        for(int i = 0; i < retry; i++){
        String userChoice = JOptionPane.showInputDialog("> To Do List <\n\n"+
                                                  "! Type the letter of your choice !\n"+
                                                  "> A = Add Task\n"+
                                                  "> B = Remove Task\n"+
                                                  "> C = Exit\n"+
                                                  "Enter letter : ");
        
        if(userChoice.contains("A")||userChoice.contains("a"))
        {   
            
            String task = JOptionPane.showInputDialog("Enter Task : ");
        toDoList_SNode<String> node1 = new toDoList_SNode<>(task, null);
         if(sList.isEmpty())
         {
        sList.addFirst(node1);}
         
         else if(sList.size() != 0)
         {
        sList.addLast(node1);}
        sList.showList();
        }
        else if(userChoice.contains("B")||userChoice.contains("b")){
            String task = JOptionPane.showInputDialog("Type (first) if you want to remove task!\n"+"Enter Task : ");
            if(task.contains("first"))
            {
            sList.removeFirst();
            }
            sList.showList();
        }
        else if(userChoice.contains("C")||userChoice.contains("c")){
        System.exit(0);
        }
        retry++;
        }
    }
    
}
