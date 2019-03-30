/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

/**
 *
 * @author hp
 */
public class AdjacencyGraph implements Graph{
    private final int MaxValue=1000;
    private int n;
    private int e;
    private int type;
    private int [][]a;
    public int MaxValue(){
        return MaxValue;
    }
    public int[][]getArray(){
        return a;
    }
    public AdjacencyGraph(int n,int t){
        if(n<1||t<0||t>3){
            System.out.println("初始化图的参数值错，退出运行！");
            System.exit(1);
        }
        this.n=n;e=0;
        type=t;
        a=new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++){
                if(i==j) a[i][j]=0;
                else if(type==0||type==2)
                    a[i][j]=0;
                else a[i][j]=MaxValue;
            }
    }
    public void createGraph(EdgeElement[] d){
        int i;
        for(i=0;i<d.length;i++){
            if(d[i]==null) break;
            int v1,v2;
            v1=d[i].fromvex;v2=d[i].endvex;
            if(v1<0||v1>n-1||v2<0||v2>n-1||v1==v2){
                System.out.println("边的顶点序号无效，退出运行!");
                System.exit(1);
            }
            if(type==0)
                a[v1][v2]=a[v2][v1]=1;
            else if(type==1)
                a[v1][v2]=a[v2][v1]=d[i].weight;
            else if(type==2)
                a[v1][v2]=1;
            else
                a[v1][v2]=d[i].weight;
        }
        e=i;
    }
    public int graphType() {return type;}
    public int vertices() {return n;}
    public int edges() {return e;}

    public boolean find(int i,int j) {
        if(i<0||i>n-1||j<0||j>n-1||i==j){
            System.out.println("边的顶点序号无效，推出运行!");
            System.exit(1);
        }
        if(a[i][j]!=0&&a[i][j]!=MaxValue)
            return true;
        else return false;
    }

    public void putEdge(EdgeElement theEdge) {
        int v1,v2;
        v1=theEdge.fromvex;
        v2=theEdge.endvex;
        if(v1<0||v1>n-1||v2<0||v2>n-1||v1==v2){
            System.out.println("边的顶点序号无效，推出运行!");
            System.exit(1);
        }
        if(a[v1][v2]==0||a[v1][v2]==MaxValue)
            e++;
        if(type==0||type==1){
            if(type==0)
            a[v1][v2]=a[v2][v1]=1;
            else a[v1][v2]=a[v2][v1]=theEdge.weight;
        }
        else{
            if(type==2)
                a[v1][v2]=1;
            else a[v1][v2]=theEdge.weight;
        }
    }

    @Override
    public void removeEdge(int i, int j) {
         if(i<0||i>n-1||j<0||j>n-1||i==j) {
            System.out.println("边的顶点序号无效,退出运行!");
            System.exit(1);
         }
         if(a[i][j]==0||a[i][j]==MaxValue) {
             System.out.println("要删除的边不存在,退出运行!");
             System.exit(1);
         }
         if(type==0) a[i][j]=a[j][i]=0;
         else if(type==1) a[i][j]=a[j][i]=MaxValue;
         else if(type==2) a[i][j]=0;
         else a[i][j]=MaxValue;
         e--;
    }

    @Override
    public int degree(int i) {
        if(i<0||i>n-1) {
            System.out.println("参数的顶点序号值无效,退出运行!");
            System.exit(1);
        }
        int k=0;
        if(type==0||type==1) {
            for (int j=0;j<n;j++)
                if(a[i][j]!=0&&a[j][i]!=MaxValue) k++;
            return k;
        }
        else return inDegree(i)+outDegree(i);
    }

    @Override
    public int inDegree(int i) {
        if(i<0||i>n-1) {
            System.out.println("参数的顶点序号值无效,退出运行!");
            System.exit(1);
        }
         if (type==0||type==1) return -1;
         int k=0;
         for(int j=0;j<n;j++)
             if(a[j][i]!=0&&a[j][i]!=MaxValue) k++;
         return k;
    }

    @Override
    public int outDegree(int i) {
        if(i<0||i>n-1) {
            System.out.println("参数的顶点序号值无效,退出运行!");
                    System.exit(1); 
        }
         if (type==0||type==1) return -1;
         int k=0;
         for(int j=0;j<n;j++)
             if(a[i][j]!=0&&a[i][j]!=MaxValue) k++;
         return k;
    }

    @Override
    public void output() {
        int i,j;
        System.out.print("V={");
        for(i=0;i<n-1;i++) System.out.print(i+",");
        System.out.println(n-1+"}");
        System.out.print("E={");
        if(type==0||type==2) {
            for(i=0;i<n;i++)
                for(j=0;j<n;j++)
                    if(a[i][j]!=0&&a[i][j]!=MaxValue)
                        if(type==0) {
                            if(i<j) System.out.print("("+i+","+j+"),");
                        }
                        else
                        System.out.print("<"+i+","+j+">,");
        }
        else {
            for(i=0;i<n;i++)
                for(j=0;j<n;j++)
                    if(a[i][j]!=0&&a[i][j]!=MaxValue)
                        if(type==1) {
                            if(i<j) System.out.print("("+i+","+j+")"+a[i][j]+",");
                        }
                        else
                            System.out.print("<"+i+","+j+">"+a[i][j]+",");
        }
        System.out.println("}");
    }

    @Override
    public void depthFirstSearch(int v) {
        boolean []visited=new boolean[n];
        for(int i=0;i<n;i++) visited[i]=false;
        dfs(v,visited);
        System.out.println();
    }

    @Override
    public void breadthFirstSearch(int v) {
        boolean []visited=new boolean[n];
        for(int i=0;i<n;i++) visited[i]=false;
        bfs(v,visited);
        System.out.println();
    }
    public void dfs(int i,boolean[] visited) {
        System.out.print(i+" ");
        visited[i]=true;
        for(int j=0;j<n;j++)
            if(a[i][j]!=0&&a[i][j]!=MaxValue&&!visited[j])
                dfs(j,visited);
    }
    private void bfs(int i,boolean[] visited) {
        sequenceQueue q=new sequenceQueue();
        System.out.print(i+" ");
        visited[i]=true;
        q.enter(i);
        while(!q.isEmpty()) {
            int k=(Integer)q.leave();
            for(int j=0;j<n;j++) {
                if(a[k][j]!=0&&a[k][j]!=MaxValue&&!visited[j]) {
                    System.out.print(j+" ");
                    visited[j]=true;
                    q.enter(j);
                }
            }
        }   
    }
}