package graph;


public class sequenceQueue implements Queue {
    final int maxSize=10;
    private Object queueArray[];
    private int front,rear;
    public sequenceQueue() {
        front=rear=0;
        queueArray=new Object[maxSize];
        
    }
    public sequenceQueue(int n)
    {
        if(n<=0) {
            System.out.println("数组长度要大于0,否则退出程序运行!");
            System.exit(1);
            
        }
        front=rear=0;
        queueArray=new Object[n];
    }
    public void enter(Object obj) {
        if ((rear+1)%queueArray.length==front)
        {
            Object[] p=new Object[queueArray.length*2];
            if(rear==queueArray.length-1)
            {
                for(int i=1;i<=rear;i++) p[i]=queueArray[i];
                
            }
            else {
                int i,j=1;
                for(i=front+1;i<queueArray.length;i++,j++)
                    p[j]=queueArray[i];
                for(i=0;i<=rear;i++,j++)
                    p[j]=queueArray[i];
                front=0;rear=queueArray.length-1;
                
        }
            queueArray=p;
    }
        rear=(rear+1)%queueArray.length;
        queueArray[rear]=obj;
    }
    public Object leave () {
        if(front==rear) {
            System.out.println("队列已空,无法删除元素,返回空!");
            return null;
        }
        front =(front+1)%queueArray.length;
        return queueArray[front];
    }
    public Object peek() {
        if(front==rear) {
            System.out.println("队列已空,无法读取元素,返回空!");
            return null;
        }
        return queueArray[(front+1)%queueArray.length];
    }
    public boolean isEmpty() {
        return front==rear;
    }
    public void clear() {
        front=rear=0;
    }
}
