class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            boolean divisibleBy3 = (i % 3 == 0);
            boolean divisibleBy5 = (i % 5 == 0);

            if (divisibleBy3 && divisibleBy5) {
                // Divisible by both 3 and 5, add "FizzBuzz"
                result.add("FizzBuzz");
            } else if (divisibleBy3) {
                // Divisible by 3, add "Fizz"
                result.add("Fizz");
            } else if (divisibleBy5) {
                // Divisible by 5, add "Buzz"
                result.add("Buzz");
            } else {
                // Not divisible by 3 or 5, add the number itself
                result.add(Integer.toString(i));
            }
        }

        return result;
    }
}
