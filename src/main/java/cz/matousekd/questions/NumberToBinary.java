package cz.matousekd.questions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by David.Matousek on 27.8.2015.
 */
public class NumberToBinary {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        int number = 4;
        String result = "";


        while (number != 0) {
            int num = number % 2;
            list.add(num);
            number /= 2;

        }

        for (Integer i : list) {
            System.out.println(i);
            result = result + i;
        }
        System.out.println(result);

    }
}
