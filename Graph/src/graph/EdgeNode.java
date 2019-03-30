/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

/**
 *
 * @author hp
 */
public class EdgeNode {
    int adjvex;
    int weight;
    EdgeNode next;
    public EdgeNode(int adj,EdgeNode nt){
        adjvex=adj;next=nt;weight=1;
    }
    public EdgeNode(int adj,int wgt,EdgeNode nt){
        adjvex=adj;next=nt;weight=wgt;
    }
}
