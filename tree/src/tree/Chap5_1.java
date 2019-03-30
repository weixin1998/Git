/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author hp
 */
public class Chap5_1 {
    public static void main(String[] args){
        BinaryTree bt=new linkBinaryTree();
        String s="a(b(c),d(e(f,g),h(,i)))";
        bt.createBTree(s);
        System.out.print("bt二叉树的广义表形式:");bt.printBTree();
        System.out.print("前序:");bt.traverseBTree("preOrder");
        System.out.print("中序:");bt.traverseBTree("inOrder");
        System.out.print("后序:");bt.traverseBTree("postOrder");
        System.out.print("按层:");bt.traverseBTree("levelOrder");
        System.out.println("深度:"+bt.depthBTree());
        System.out.println("结点数:"+bt.countBTree());
        System.out.println("查找结点:"+bt.findBTree('g')+" "+bt.findBTree('G'));
        BTreeNode p=((linkBinaryTree)bt).getRoot();
        System.out.println("根结点值"+p.element);
        bt.clearBTree();
    }
}
