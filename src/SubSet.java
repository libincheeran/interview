import java.util.*;

public class SubSet {


    public List<List<Integer>> subset(List<Integer> ele, int index){

        List<List<Integer>> res = new ArrayList<List<Integer>>();

        if(ele.size() == index){
            List<Integer> entry = new ArrayList<>();
            res.add(entry);
            return res;
        }

        List<List<Integer>> intermediateRes = subset(ele,index+1);
        int item = ele.get(index);
        List<List<Integer>> tempList = new ArrayList<List<Integer>>();
        for(List<Integer> record : intermediateRes){
            List<Integer> newVal = new ArrayList<>(record);
            newVal.add(item);
            tempList.add(newVal);
        }
        res.addAll(intermediateRes);
        res.addAll(tempList);

        return res;

    }

    public static void main(String[] args) {

        /*SubSet s = new SubSet();
        List<Integer> newL = Arrays.asList(8,4,9);
        newL.sort((a,b) -> a-b);
        newL.forEach(System.out::println);
        s.subset(List.of(1,2,3,4),0).forEach(System.out::println);*/


        /*List<Integer> values = Arrays.asList(3,4,5,8);
        for(int i=0; i <values.size(); i++){
            //values.get(8);
            System.out.println("value "+values.get(8));
        }*/

        String l = "libin";
        String li = "";
        System.out.println(l.contains(li));
        List<Integer> values = null;
    }
}
