import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Permutation {


    public List<String> permutation(String input) {

        List<String> res = new ArrayList<>();
        permutation("",input,res);
        String[] arr = new String[res.size()];
        res.toArray(arr);
        for(String val : arr){
            System.out.println("val = " + val);
        }
        System.out.println(" size "+arr.length);
        return  res;

    }

    private void permutation(String prefix, String remaining, List<String> res) {

        if(remaining.length() == 0) {
            res.add(prefix);
        }

        for(int i=0; i <remaining.length(); i++){
            String subPrefix = prefix+remaining.charAt(i);
            StringBuilder sb = new StringBuilder();
            for(int j=0; j < remaining.length(); j++){
                if(j == i) continue;
                sb.append(remaining.charAt(j));
            }
            permutation(subPrefix,sb.toString(),res);
        }


    }

    public static void main(String[] args) {

        Map.of("Libin","Cheeran").forEach((k,v) -> System.out.println(""+k+" : "+v));
    }
}
