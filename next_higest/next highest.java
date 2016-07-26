/**
 * Created by alexona on 7/25/16.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class NextHighest {
    public static void main(String[] args){
        System.out.printf("Actual: %d, Expected: %d\n",nxtHigh(1508),8510);
    }
    public static int nxtHigh(int n){
        String[] nStrArr = String.valueOf(n).split("");
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for(String s : nStrArr){
            list.add(Integer.parseInt(s));
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer int1, Integer int2) {
                return (int1 > int2 ? -1 : (int1 == int2 ? 0 : 1));
            }
        });

        for(int m : list){
            sb.append(m);
        }

        return Integer.parseInt(sb.toString());
    }
}
