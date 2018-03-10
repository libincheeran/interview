import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

class TreeNode{

    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class Tree {

    public List<Integer> largestValues(TreeNode root) {
        if(root == null) return new ArrayList<Integer>();

        List<PriorityQueue<Long>> values = new ArrayList<>();

        largestValues(root,0,values);

        List<Integer> result = new ArrayList<>();
        for(PriorityQueue<Long> queue: values){
            Integer value = queue.poll().intValue();
            result.add(value);
        }

        return result;
    }

    public void largestValues(TreeNode root, int level,List<PriorityQueue<Long>> list) {

        if(root == null){
            return;
        }
        if(list.size() == level){
            list.add(new PriorityQueue<Long>( (a,b) -> {
                Long l = b-a;
                if( l < 0) return -1;
                else if (l > 0 ) return 1;
                else return 0;

            }));
        }
        list.get(level).add(Integer.valueOf(root.val).longValue());
        largestValues(root.left,level+1,list);
        largestValues(root.right,level+1,list);
    }
}
