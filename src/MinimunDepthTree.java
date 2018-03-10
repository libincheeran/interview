import java.util.*;

public class MinimunDepthTree {

    public static void main(String[] args) {

        int[][] edges = {{0,3},{1,3},{2,3},{4,3},{5,4}};
        new MinimunDepthTree().findMinHeightTrees(edges.length,edges);
    }

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {

        Map<Integer,Set<Integer>> map = new HashMap<>();

        for(int i = 0 ; i < n; i++){
            int node1 = edges[i][0];
            int node2 = edges[i][1];
            Set<Integer> set1 = map.getOrDefault(node1, new HashSet<>());
            set1.add(node2);
            map.put(node1,set1);
            Set<Integer> set2 = map.getOrDefault(node2, new HashSet<>());
            set2.add(node1);
            map.put(node2,set2);

        }
        map.forEach((k,v) -> System.out.println(""+k+"->"+v));

        while(map.size()>2){
            List<Integer> leaves = new ArrayList<>();
            for(Map.Entry<Integer,Set<Integer>> entry: map.entrySet()){

                if(entry.getValue().size()< 2)
                    map.remove(entry.getKey());
            }

            for(Integer item: leaves){
                for(Set<Integer> set : map.values()) {
                    set.remove(item);
                    set.iterator().next();
                }
            }
        }
        System.out.println(" final List :");
        map.forEach((k,v) -> System.out.println(""+k+"->"+v));
        List<Integer> res = new ArrayList<>();
        map.forEach((k,v)-> res.add(k));
        return res;
    }
}
