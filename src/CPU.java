import java.util.*;

public class CPU {

    public int leastInterval(char[] tasks, int n) {

        Map<Character,Integer> map = new HashMap<Character,Integer>();

        for(char c : tasks){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        PriorityQueue<Map.Entry<Character,Integer>> queue = new PriorityQueue<>(
                (a,b) -> b.getValue() - a.getValue()
        );

        queue.addAll(map.entrySet());
        int count =0;

        while(!queue.isEmpty()){
            List<Map.Entry<Character,Integer>> list = new ArrayList<>();

            int slots = 0;

            while(!queue.isEmpty() && slots<=n){
                Map.Entry<Character,Integer> entry = queue.poll();
                int value = entry.getValue()-1;
                entry.setValue(value);
                if( value > 0){
                    list.add(entry);
                }
                slots++;
                count++;
            }

            for(int i = slots; i <= n && !list.isEmpty(); i++){
                count++;
            }

            queue.addAll(list);

        }

        return count;
    }

    public static void main(String[] args) {
        CPU cpu = new CPU();
        char[] c = {'A','A','A','A','A','A','B','C','D','E','F','G'};
        System.out.println(cpu.leastInterval(c,2));
    }
}
