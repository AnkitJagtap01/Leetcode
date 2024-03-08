
        return year + "-" + month + "-" + day;
    }

    private static String convertMonth(String month) {
        switch (month) {
            case "Jan": return "01";
            case "Feb": return "02";
            case "Mar": return "03";
            case "Apr": return "04";
            case "May": return "05";
            case "Jun": return "06";
            case "Jul": return "07";
            case "Aug": return "08";
            case "Sep": return "09";
            case "Oct": return "10";
            case "Nov": return "11";
            case "Dec": return "12";
            default: return "00"; // Default case should never hit due to problem constraints
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        }
        if (day.length() == 1) {
            day = "0" + day;

        // Ensure day is in two-digit format
        String day = dateParts[0].replaceAll("[^0-9]", ""); // Remove non-numeric characters
        String month = convertMonth(dateParts[1]); // Convert month to numeric
        String year = dateParts[2]; // Year is ready to use

public class Solution {
    public static String reformatDate(String date) {
        String[] dateParts = date.split(" ");
import java.util.*;
"20th Oct 2052"
