public class FizzBuzz {
    public void fizzBuzz(int num) {
        for (int i = 1; i <= num; i++) {
            String result =
                    (i % 3 == 0) ? "Fizz" :
                            (i % 5 == 0) ? "Buzz" :
                                    (i % 3 == 0 && i % 5 == 0) ? "FizzBuzz" :
                                    String.valueOf(i);
            System.out.print(result + (i < num ? "," : ""));
        }
    }
}
