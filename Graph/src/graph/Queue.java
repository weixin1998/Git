package graph;


public interface Queue {
    void enter(Object obj);
    Object leave();
    Object peek();
    boolean isEmpty();
    void clear();
            
    
}
