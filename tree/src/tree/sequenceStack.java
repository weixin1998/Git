/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author hp
 */
public class sequenceStack implements Stack {
    final int maxSize=10;
    private Object[] stackArray;
    private int top;
    public sequenceStack(){
        top=-1;
        stackArray=new Object[maxSize];
    }
    public sequenceStack(int n){
        if(n<=0){
            System.out.println("数组长度要大于0,否则退出程序运行!");
            System.exit(1);
        }
        top=-1;
        stackArray=new Object[n];
    }
    public void push(Object obj){
        if(top==stackArray.length-1){
            Object[] p=new Object[top*2+2];
            for(int i=0;i<=top;i++)
                p[i]=stackArray=p;
        }
        top++;
        stackArray[top]=obj;
    }
    public Object pop(){
        if(top==-1){
            System.out.println("数据栈已空,无法删除元素!");
            return null;
        }
        top--;
        return stackArray[top+1];
    }
    public Object peek(){
        if(top==-1){
            System.out.println("数据栈已空,无法读取元素!");
            return null;
        }
        return stackArray[top];
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public void clear(){
        top=-1;
    }
}
