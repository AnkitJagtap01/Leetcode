class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> outgoingCities = new HashSet<>();

        // Add all starting cities to the set
        for (List<String> path : paths) {
            outgoingCities.add(path.get(0));
        }

        // Check for the city that is not in the set of starting cities
        for (List<String> path : paths) {
            if (!outgoingCities.contains(path.get(1))) {
                return path.get(1);
            }
        }

        return null; // This line should never be reached as per the problem constraints
    }
}
