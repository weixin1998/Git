/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author hp
 */
public interface BinaryTree {
    final String []mode={"preOrder","inOrder","postOrder","levelOrder"};
    void createBTree(String gt);
    boolean isEmpty();
    void traverseBTree(String s);
    Object findBTree(Object obj);
    int depthBTree();
    int countBTree();
    void printBTree();
    void clearBTree();
}
