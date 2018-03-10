import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();
        map.put(3,"Libin");
        map.put(4,"Liri");
        map.put(2,"cheeran");

        map.forEach((k,v) -> System.out.println(""+k+" -> "+v));

        List<Integer> integers = List.of(1, 2, 3, 4, 5);


        integers.stream()
                .parallel()
                .map(e -> e+10)
                .forEach(System.out::println);

        System.out.println(System.nanoTime());
    }
}
