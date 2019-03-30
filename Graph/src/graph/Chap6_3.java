/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

/**
 *
 * @author hp
 */
public class Chap6_3 {
    public static void main(String[] args){
        int n,t;
        AdjacencyGraph g=new AdjacencyGraph(5,3);
        int [][]a={{0,1,2},{0,2,3},{0,3,8},{1,3,12},{2,0,6},{2,3,6},{2,4,1},{3,4,4}};
        EdgeElement[]dd=new EdgeElement[a.length];
        for(int i=0;i<a.length;i++)
            dd[i]=new EdgeElement(a[i][0],a[i][1],a[i][2]);
        g.createGraph(dd);
        System.out.println("从初始点0开始按深度优先搜索得到的遍历序列:");
        g.depthFirstSearch(0);
        System.out.println("从初始点0开始按广度优先搜索得到的遍历序列:");
        g.breadthFirstSearch(0);
        g.output();
        System.out.print("顶点0的度、入度、出度:");
        System.out.println(g.degree(0)+" "+g.inDegree(0)+" "+g.outDegree(0));
        g.putEdge(new EdgeElement(4,1,5));
        g.removeEdge(0,2);
        System.out.println("边(3,4)存在否!"+g.find(3,4));
        g.output();
        System.out.print("图g的类型、顶点数、边数:");
        System.out.println(g.graphType()+" "+g.vertices()+" "+g.edges());
    }
}
