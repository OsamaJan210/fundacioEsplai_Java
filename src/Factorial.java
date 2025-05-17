public class Factorial {

    public static int factorialFor(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static int factorialRecursivo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursivo(n - 1);
    }

    public static void testRecursivo() {
        if (!Test.assertEquals("1", String.valueOf(factorialRecursivo(0)))) {
            System.err.println("Test Fail: factorialRecursivo(0) should be 1");
            return;
        }

        if (!Test.assertEquals("1", String.valueOf(factorialRecursivo(1)))) {
            System.err.println("Test Fail: factorialRecursivo(1) should be 1");
            return;
        }

        if (!Test.assertEquals("2", String.valueOf(factorialRecursivo(2)))) {
            System.err.println("Test Fail: factorialRecursivo(2) should be 2");
            return;
        }

        if (!Test.assertEquals("6", String.valueOf(factorialRecursivo(3)))) {
            System.err.println("Test Fail: factorialRecursivo(3) should be 6");
            return;
        }

        if (!Test.assertEquals("120", String.valueOf(factorialRecursivo(5)))) {
            System.err.println("Test Fail: factorialRecursivo(5) should be 120");
            return;
        }

        System.out.println("All tests passed for factorialRecursivo");
    }

    public static void testFor() {
        if (!Test.assertEquals("1", String.valueOf(factorialFor(0)))) {
            System.err.println("Test Fail: factorialFor(0) should be 1");
            return;
        }

        if (!Test.assertEquals("1", String.valueOf(factorialFor(1)))) {
            System.err.println("Test Fail: factorialFor(1) should be 1");
            return;
        }

        if (!Test.assertEquals("2", String.valueOf(factorialFor(2)))) {
            System.err.println("Test Fail: factorialFor(2) should be 2");
            return;
        }

        if (!Test.assertEquals("6", String.valueOf(factorialFor(3)))) {
            System.err.println("Test Fail: factorialFor(3) should be 6");
            return;
        }

        if (!Test.assertEquals("24", String.valueOf(factorialFor(4)))) {
            System.err.println("Test Fail: factorialFor(4) should be 24");
            return;
        }

        if (!Test.assertEquals("120", String.valueOf(factorialFor(5)))) {
            System.err.println("Test Fail: factorialFor(5) should be 120");
            return;
        }

        if (!Test.assertEquals("720", String.valueOf(factorialFor(6)))) {
            System.err.println("Test Fail: factorialFor(6) should be 720");
            return;
        }

        System.out.println("All tests passed for factorialFor");
    }
}
