        List<int[]> result = new ArrayList<>();
        int[] currentInterval = intervals[0];
        result.add(currentInterval);

        for (int[] interval : intervals) {
            int currentEnd = currentInterval[1];

            if (interval[0] <= currentEnd) { // Overlap, so we merge the intervals

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        // Sort the intervals based on the start time

        }
        if (intervals.length <= 1) {
            return intervals;
    public int[][] merge(int[][] intervals) {
class Solution {
                currentInterval[1] = Math.max(currentEnd, interval[1]);
            } else { // No overlap, add to results and move to the next
[
