/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author hp
 */
public interface Queue {
    void enter(Object obj);
    Object leave();
    Object peek();
    boolean isEmpty();
    void clear();
}
