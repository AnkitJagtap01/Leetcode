public class TwoSum {
    private Map<Integer, Integer> numCounts;

    /** Initialize data structure. */
    public TwoSum() {
        numCounts = new HashMap<>();
    }

    /** Add the number to an internal data structure. */
    public void add(int number) {
        numCounts.put(number, numCounts.getOrDefault(number, 0) + 1);
    }

    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
        for (Map.Entry<Integer, Integer> entry : numCounts.entrySet()) {
            int num = entry.getKey();
            int complement = value - num;
            if (complement != num) {
["TwoSum","add","add","add","find","find"]
