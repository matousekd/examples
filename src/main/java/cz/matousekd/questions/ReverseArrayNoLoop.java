package cz.matousekd.questions;

import java.util.Arrays;

/**
 * Created by David.Matousek on 24.7.2015.
 */
public class ReverseArrayNoLoop {

    private static Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6};

    public static void main(String[] args) {

        swap(0, arr.length - 1, arr);

        System.out.println(Arrays.toString(arr));


    }

    private static void swap(int a, int b, Integer[] array) {

        int tmp = array[b];
        array[b] = array[a];
        array[a] = tmp;

        if ((a + 1) * 2 < array.length) {
            swap(a + 1, b - 1, array);
        } else {
            return;
        }

    }
}
