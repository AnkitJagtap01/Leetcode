class Solution:
    def isPalindrome(self, x: int) -> bool:
        """
        Check if an integer is a palindrome.

        Args:
        x (int): The integer to check.

        Returns:
        bool: True if x is a palindrome, False otherwise.
        """
        # Convert the integer to string to check for palindrome
        s = str(x)
        # Compare the string with its reverse
        return s == s[::-1]

sol = Solution()
