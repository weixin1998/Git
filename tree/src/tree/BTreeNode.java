/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author hp
 */
public class BTreeNode {
    Object element;
    BTreeNode left,right;
    public BTreeNode(Object obj){element=obj;left=right=null;}
    public BTreeNode(Object obj,BTreeNode lt,BTreeNode rt){
        element=obj;
        left=lt;
        right=rt;
    }
}
