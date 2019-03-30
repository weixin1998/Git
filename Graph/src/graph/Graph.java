/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

/**
 *
 * @author hp
 */
public interface Graph {
    void createGraph(EdgeElement[]d);
    int graphType();
    int vertices();
    int edges();
    boolean find(int i,int j);
    void putEdge(EdgeElement theEdge);
    void removeEdge(int i,int j);
    int degree(int i);
    int inDegree(int i);
    int outDegree(int i);
    void output();
    void depthFirstSearch(int v);
    void breadthFirstSearch(int v);
}
