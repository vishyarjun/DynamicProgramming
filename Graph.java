/* Author: Arjun Viswanathan
   Date: 02/01/2017
*/

import java.util.*;

/* we are representing this Graph Class using adjacency list technique. Other Commonly used technique is Adjacency Matrix */
public class Graph {
int ver;
LinkedList<Integer> adj[];
//constructor for the class
Graph(int v)
    {
        ver = v;
        adj = new LinkedList[v];
        for(int i=0;i<v;i++)
            adj[i] = new LinkedList();
    }
    //method to add a new vertex
    void addEdge(int v,int w)
    {
        adj[v].add(w);
    }
//This method performs the actual BF Search and print out the elements based on the root given. To avoid loops , we keep track of visited nodes
public void BFS(int s)
    {
        Boolean[] visited = new Boolean[ver];
        LinkedList<Integer> queue = new LinkedList();
        visited[s]=true;
        queue.add(s);
        while(queue.size()!=0)
            {
                s = queue.poll();
                System.out.print(s + " ");
                Iterator<Integer> i = adj[s].listIterator();
                while(i.hasNext())
                    {
                        int n = i.next();
                        if(visited[n]==null)
                            {
                                visited[n]=true;
                                queue.add(n);
                            }

                    }
            }
    }

public static void main(String[] args)
    {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");
 
        g.BFS(2);
    }


}