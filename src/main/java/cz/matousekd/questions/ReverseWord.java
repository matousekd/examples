package cz.matousekd.questions;

/**
 * Created by David.Matousek on 23.7.2015.
 */
public class ReverseWord {

    private static String WORD = "abc";

    public static void main(String[] args) {

        char[] arr = WORD.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char swap = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = swap;
            if ((i + 1) * 2 >= arr.length) {
                break;
            }
        }


        System.out.println(new String(arr));

    }
}
