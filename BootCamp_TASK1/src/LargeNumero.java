import java.util.Arrays;

public class LargeNumero {
    //largeNumer
    public static int[] largoNumero(int[] array) {
        int resultado[] = {array[0], 0};
        for (int i = 1; i < array.length; i++) {
            if (resultado[0] < array[i]) {
                resultado[0] = array[i];
                resultado[1] = i + 1;

            }
        }
        return resultado;
    }

    public static void testLargoNumero() {
        if (!Test.assertEquals(Arrays.toString(new int[]{9, 4}), Arrays.toString(largoNumero(new int[]{3, 7, 2, 9})))) {
            System.err.println("Test Fail: For array {3, 7, 2, 9} mayor y posición should be 9 y 4");
            return;
        }
        if (!Test.assertEquals(Arrays.toString(new int[]{5, 5}), Arrays.toString(largoNumero(new int[]{1, 2, 3, 4, 5})))) {
            System.err.println("Test Fail: For array {1,2,3,4,5} mayor y posición should be 5 y 5");
            return;
        }
        System.out.println("All tests passed for Large Numero");

    }

}
