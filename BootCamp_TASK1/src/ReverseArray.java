import java.util.Arrays;

public class ReverseArray {

    public static int[] reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

    public static void testInvertirArray() {
        if (!Test.assertEquals(Arrays.toString(new int[]{4, 3, 2, 1}), Arrays.toString(reverseArray(new int[]{1, 2, 3, 4})))) {
            System.err.println("Test Fail: For array {1,2,3,4} Invertir should be {4, 3, 2, 1}");
            return;
        }
        if (!Test.assertEquals(Arrays.toString(new int[]{9, 8, 3, 2, 1}), Arrays.toString(reverseArray(new int[]{1, 2, 3, 8, 9})))) {
            System.err.println("Test Fail: For array {1,2,3,4,5} Invertir should be {4, 3, 2, 1}");
            return;
        }
        System.out.println("All tests passed for Invertir un array");

    }


}
