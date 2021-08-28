package solution.offer.bytedance;

/**
 * Main  TODO
 *
 * @author Anjude
 * @date 2021/7/26 20:54
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<List<Integer>> all = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(4);
        a.add(19);
        List<Integer> b = new ArrayList<>();
        b.add(2);
        b.add(3);
        b.add(11);
        List<Integer> c = new ArrayList<>();
        c.add(3);
        c.add(10);
        c.add(12);
        all.add(a);
        all.add(b);
        all.add(c);
        int allLen = all.size();
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < allLen - 1; i++){
            res = sortList(all.get(i), all.get(i - 1));
        }
        res.forEach(val->{
            System.out.println(val + " ");
        });
    }
    static private List sortList(List<Integer> a,List<Integer> b){
        List<Integer> res = new ArrayList<>();
        int aLen = a.size();
        int bLen = b.size();
        int i = 0, j = 0;
        while(i < aLen && j < bLen){
            if(a.get(i) < b.get(j)){
                res.add(a.get(i));
                i++;
            }else{
                res.add(b.get(j));
                j++;
            }
        }
        if(i < aLen){
            for(int z = i; i < aLen; z++){
                res.add(a.get(z));
            }
        }else{
            for(int z = j; j < aLen; z++){
                res.add(b.get(z));
            }
        }
        return res;
    }
}
