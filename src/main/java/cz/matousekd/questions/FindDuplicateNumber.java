package cz.matousekd.questions;

import java.util.HashMap;

/**
 * Created by David.Matousek on 26.8.2015.
 */
public class FindDuplicateNumber {

    private static final int[] intArr = new int[]{1, 2, 3, 4, 5, 3};

    public static void main(String[]  args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : intArr) {
            if(map.containsKey(i)) {
                System.out.println(i);
                break;
            }
            map.put(i,0);
        }

    }
}
