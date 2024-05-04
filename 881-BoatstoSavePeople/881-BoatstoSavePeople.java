}
    }
        return boats;

        int boats = 0;

        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i++;  // person i can pair with person j, so move the lighter person pointer
            }
            j--;  // always move the heavier person pointer
            boats++;  // we used one boat, whether it's a pair or a single person
        }
        int i = 0, j = people.length - 1;
        Arrays.sort(people);
    public int numRescueBoats(int[] people, int limit) {
public class Solution {

[
