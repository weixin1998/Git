/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

/**
 *
 * @author hp
 */
public class EdgeElement {
    int fromvex;
    int endvex;
    int weight;
    public EdgeElement(int v1,int v2){
        fromvex=v1;endvex=v2;weight=1;
    }
    public EdgeElement(int v1,int v2,int wgt){
        fromvex=v1;endvex=v2;weight=wgt;
    }
}
