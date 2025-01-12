class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder columntitle = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // Adjust for 0-based indexing
            char currentChar = (char) ('A' + (columnNumber % 26));
            columntitle.append(currentChar);
            columnNumber /= 26;
        }

        return columntitle.reverse().toString();
    }
}