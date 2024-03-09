        // Determine the sign
        if (numerator < 0 ^ denominator < 0) result.append("-");
        
        // Convert to long to avoid overflow
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);
        
        // Append the integer part
        result.append(num / den);
        long remainder = num % den;
        if (remainder == 0) return result.toString(); // No fractional part
        
        // Append the decimal point
        result.append(".");
        
        // Map to store remainders and their positions
        Map<Long, Integer> map = new HashMap<>();
        while (remainder != 0) {
            if (map.containsKey(remainder)) {
                // Found a repeating remainder, insert parentheses
                result.insert(map.get(remainder), "(");
                result.append(")");
                break;
            }
            map.put(remainder, result.length());
            remainder *= 10;
            result.append(remainder / den);
            remainder %= den;
        }
        
        return result.toString();
    }
        StringBuilder result = new StringBuilder();
        
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";
public class Solution {
1
