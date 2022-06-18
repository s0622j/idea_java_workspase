package hsp.chapter12_Exception.exception_01;

/**
 * @author shenjie
 * @version 1.0
 */
public class ArrayIndexOutOfBoundsException_04 {
    public static void main(String[] args) {
        int[] arr = {1,2,4};
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
