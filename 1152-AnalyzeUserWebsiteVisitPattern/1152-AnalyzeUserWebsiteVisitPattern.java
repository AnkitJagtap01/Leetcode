import java.util.*;

public class Solution {
    public List<String> mostVisitedPattern(String[] username, int[] timestamp, String[] website) {
        // Data structure to hold the visit information: Map<Username, List<Visit>>
        Map<String, List<Visit>> userVisitsMap = new HashMap<>();
        for (int i = 0; i < username.length; i++) {
            userVisitsMap.putIfAbsent(username[i], new ArrayList<>());
            userVisitsMap.get(username[i]).add(new Visit(timestamp[i], website[i]));
        }

        // Map to count frequency of each sequence: Map<Sequence, Set<Username>>
        Map<List<String>, Set<String>> sequenceUserMap = new HashMap<>();

        for (Map.Entry<String, List<Visit>> entry : userVisitsMap.entrySet()) {
            String user = entry.getKey();
            List<Visit> visits = entry.getValue();
            // Sort the visits by timestamp
            visits.sort(Comparator.comparingInt(v -> v.timestamp));

            // Find all 3-sequence combinations for this user
            Set<List<String>> sequences = generate3Sequences(visits);
            for (List<String> seq : sequences) {
                sequenceUserMap.putIfAbsent(seq, new HashSet<>());
                sequenceUserMap.get(seq).add(user);
            }
        }

        // Find the sequence with the maximum unique users
        int maxCount = 0;
        List<String> result = new ArrayList<>();
        for (Map.Entry<List<String>, Set<String>> entry : sequenceUserMap.entrySet()) {
            if (entry.getValue().size() > maxCount) {
            maxCount = entry.getValue().size();
            result = entry.getKey();
        } else if (entry.getValue().size() == maxCount) {
            if (result.isEmpty() || entry.getKey().toString().compareTo(result.toString()) < 0) {
            result = entry.getKey();
        }
    }
}

        return result;
    }

    // Helper class to store visit information
    private static class Visit {
        int timestamp;
        String website;
        Visit(int t, String w) {
            timestamp = t;
            website = w;
        }
    }

    // Helper method to generate all 3-sequences from a user's visits
    private Set<List<String>> generate3Sequences(List<Visit> visits) {
        Set<List<String>> sequences = new HashSet<>();
        int n = visits.size();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    sequences.add(Arrays.asList(visits.get(i).website, visits.get(j).website, visits.get(k).website));
                }
            }
        }
        return sequences;
    }
}
