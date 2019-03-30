/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author hp
 */
public class Node {
    Object element;
    Node next;
    public Node(Node nextval) {
        next=nextval;
    } 
    public Node(Object obj,Node nextval){
        element=obj;next=nextval;
    }
}
