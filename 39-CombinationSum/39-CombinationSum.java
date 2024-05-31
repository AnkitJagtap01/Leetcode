            }
                current.remove(current.size() - 1);
                backtrack(candidates, target - candidates[i], i, current, result);
                current.add(candidates[i]);
            if (candidates[i] <= target) {
        for (int i = start; i < candidates.length; i++) {

        }
            return;
            result.add(new ArrayList<>(current));
        if (target == 0) {
    private void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {

    }
        }
    }
}
        return result;
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
class Solution {
[
