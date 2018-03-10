import java.util.Map;
import java.util.PriorityQueue;

public class PriorityQueueTest {


    public void prioTest() {

        Map<Character,Integer> map = Map.of('A',3,'B',4,'C',10);
        PriorityQueue<Map.Entry<Character,Integer>> queue = new PriorityQueue<>(
                (a,b) -> -1 *(a.getValue() - b.getValue())
        );

        queue.addAll(map.entrySet());

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }

    public static void main(String[] args) {
        PriorityQueueTest p = new PriorityQueueTest();
        p.prioTest();
    }
}
