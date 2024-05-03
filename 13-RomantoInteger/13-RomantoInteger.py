class Solution:
    def romanToInt(self, s: str) -> int:
        """
        Convert a Roman numeral string to an integer.

        Args:
        s (str): The Roman numeral string.

        Returns:
        int: The integer representation of the Roman numeral.
        """
        # Mapping Roman numerals to their integer values
        roman_to_int = {
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000
        }
        
        total = 0
        prev_value = 0
        
        # Iterate over each character in the Roman numeral string
        for char in reversed(s):
            # Get the integer value of the current Roman numeral
            value = roman_to_int[char]
            # If the previous value is greater than the current value, subtract it
            # Otherwise, add it
            if value < prev_value:
                total -= value
            else:
                total += value
            prev_value = value
        
        return total

sol = Solution()
