package Interview_Problems;
import java.util.*;

public class _1971_Find_if_Path_Exists_in_Graph {
    public List<List<Integer>> make_graph(int n, int[][] edges){
        List<List<Integer>> graph =  new ArrayList<>();
        for(int i = 0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);

        }
        return graph;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = make_graph(n,edges);
        boolean visited[] = new boolean[n];
        // Queue<Integer> queue = new LinkedList<>();
        // queue.offer(source);
        // while(!queue.isEmpty()){
        //     int c = queue.poll();
        //     if(c == destination) return false;
        //     visited[c]= true;
        //     for(int next : graph.get(c)){
        //         if(!visited[next]){
        //             queue.offer(next);
        //         }
        //     }
        // }
        return haspath(graph,visited,source,destination);
    }
    private boolean haspath(List<List<Integer>> graph,boolean[] visited, int s,int d){
        if(s == d){
            return true;
        }
        visited[s] = true;
        for(int next:graph.get(s)){
            if(visited[next]) continue;
            if(haspath(graph,visited,next,d)) return true;
        }
        return false;
    }
}
