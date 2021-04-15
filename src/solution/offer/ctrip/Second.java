package solution.offer.ctrip;

import java.util.*;

/**
 * Created by Anjude
 * Date: 2021/4/15 20:20
 */
public class Second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pack = in.nextInt();
        List<String[]> packList = new ArrayList<>();
        Set<String> changePack = new HashSet<>();
        Set<String> curHas = new HashSet<>();
        curHas.add(String.valueOf(pack));

        while (in.hasNextLine()) {
            String[] list = in.nextLine().split(",");
            if (list.length < 2) {
                continue;
            }
            packList.add(list);
        }
        int len = packList.size();
        for (int i = 0; i < len; i++) {
            String[] curPackList = packList.get(i);
            int listLen = curPackList.length;
            for (int j = 0; j < listLen; j++) {
                if(curHas.contains(curPackList[j])){
                    continue;
                }
                changePack.add(curPackList[j]);
            }
        }
    }
}
