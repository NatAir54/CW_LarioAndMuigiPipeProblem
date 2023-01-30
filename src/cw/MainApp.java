package cw;

import java.util.Arrays;

/* Looks like some hoodlum plumber and his brother has been running around and damaging your stages again.
* The pipes connecting your level's stages together need to be fixed before you receive any more complaints.
* Pipes list is correct when each pipe after the first index is greater (+1) than the previous one,
* and that there is no duplicates.
* Given the list of numbers, return a fixed list so that the values increment by 1 for each index
* from the minimum value up to the maximum value (both included).
*/

public class MainApp {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(pipeFix(new int[]{1, 2, 3, 5, 6, 8, 9})));
        System.out.println(Arrays.toString(pipeFix(new int[]{1, 2, 3, 12})));
        System.out.println(Arrays.toString(pipeFix(new int[]{6, 9})));
        System.out.println(Arrays.toString(pipeFix(new int[]{-1, 4})));
        System.out.println(Arrays.toString(pipeFix(new int[]{1, 2, 3})));
    }


    public static int[] pipeFix(int[] arr) {
        Arrays.sort(arr);
        int l = arr[arr.length - 1] - arr[0] + 1;

        int[] res = new int[l];
        res[0] = arr[0];

        for(int i = 1; i < l; i++) {
            res[i] = res[i - 1] + 1;
        }

        return res;
    }
}
