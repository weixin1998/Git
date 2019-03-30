/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author hp
 */
public class linkBinaryTree implements BinaryTree {
    protected BTreeNode root;
    public linkBinaryTree(){
        root=null;
    }
    public BTreeNode getRoot(){
        return root;
    }

    public void createBTree(String gt) {
        Stack sck=new sequenceStack();
        root=null;
        BTreeNode p=null;
        int k=1;
        char []a=gt.toCharArray();
        for(int i=0;i<a.length;i++){
            switch(a[i]){
                case ' ':
                    break;
                case '(':
                    sck.push(p);
                    k=1;
                    break;
                case ')':
                    if(sck.isEmpty()){
                        System.out.println("二叉树广义表字符串错，退出运行!");
                        System.exit(1);
                    }
                    sck.pop();
                    break;
                case ',':
                    k=2;
                    break;
                default:
                    p=new BTreeNode(a[i]);
                    if(root==null)
                        root=p;
                    else{
                        if(k==1){
                            ((BTreeNode)sck.peek()).left=p;
                        }
                        else{
                            ((BTreeNode)sck.peek()).right=p;
                        }
                    }
            }
        }
    }

    public boolean isEmpty() {
        return root==null;
    }
     private Object findBTree(BTreeNode rt,Object x) {
        if(rt==null)
            return null;
        else{
            if(rt.element.equals(x)){
                return rt.element;
            }
            else{
                Object y;
                y=findBTree(rt.left,x);
                if(y!=null)
                    return y;
                y=findBTree(rt.right,x);
                if(y!=null)
                    return y;
                return null;
            }
        }
        
    }

    private int depthBTree(BTreeNode rt) {
        if(rt==null)
            return 0;
        else{
            int dep1=depthBTree(rt.left);
            int dep2=depthBTree(rt.right);
            if(dep1>dep2)
                return dep1+1;
            else
                return dep2+1;
        }
    }

    private int countBTree(BTreeNode rt) {
        if(rt==null)
            return 0;
        else
            return countBTree(rt.left)+countBTree(rt.right)+1;
    }

    private void printBTree(BTreeNode rt) {
        if(rt!=null){
            System.out.print(rt.element);
            if(rt.left!=null||rt.right!=null){
                System.out.print('(');
                printBTree(rt.left);
                if(rt.right!=null)
                    System.out.print(',');
                printBTree(rt.right);
                System.out.print(')');
            }
        }
    }

    public void traverseBTree(String s) {
        if(s.equals(mode[0]))
            preOrder(root);
        else if(s.equals(mode[1]))
            inOrder(root);
        else if(s.equals(mode[2]))
            postOrder(root);
        else if(s.equals(mode[3]))
            levelOrder(root);
        System.out.println();
    }

    public Object findBTree(Object obj) {
        return findBTree(root,obj);
    }

    public int depthBTree() {
       return depthBTree(root);
    }

    public int countBTree() {
        return countBTree(root);
    }

    public void printBTree() {
        printBTree(root);
        System.out.println();
    }

    public void clearBTree() {
        root=null;
    }
    private void preOrder(BTreeNode rt){
        if(rt!=null){
            System.out.print(rt.element+" ");
            preOrder(rt.left);
            preOrder(rt.right);
        }
    }
    private void inOrder(BTreeNode rt){
        if(rt!=null){
            inOrder(rt.left);
            System.out.print(rt.element+" ");
            inOrder(rt.right);
        }
    }
    private void postOrder(BTreeNode rt){
        if(rt!=null){
            postOrder(rt.left);
            postOrder(rt.right);
            System.out.print(rt.element+" ");
        }
    }
    private void levelOrder(BTreeNode rt){
        Queue que=new sequenceQueue();
        BTreeNode p=null;
        que.enter(rt);
        while(!que.isEmpty()){
            p=(BTreeNode)que.leave();
            System.out.print(p.element+" ");
            if(p.left!=null) que.enter(p.left);
            if(p.right!=null) que.enter(p.right);
        }
    }
}
