package Basics;

import java.util.Arrays;

/**
 * @author zjq
 * @version 1.0
 * @date 2022/4/12 22:34
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arry = new int[]{1, 10, 2, 22, 54, 76, 76878, 7, 9, 12};
        Arrays.sort(arry);
        boolean isfind = find(0, arry);
        System.out.println(isfind);
    }

    public static boolean find(int key, int[] arry) {
        //左右指针
        int left = 0;
        int right = arry.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (key < arry[mid]) {
                right = mid - 1;
            } else if (key > arry[mid]) {
                left = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
