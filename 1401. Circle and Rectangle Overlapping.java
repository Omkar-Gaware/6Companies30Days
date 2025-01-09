class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        // Fined Nearest points
        int nearx = Math.max(x1, Math.min(xCenter, x2));
        int neary = Math.max(y1, Math.min(yCenter, y2));

        // Once You found nearest points calculate distance
        int dist =  (nearx - xCenter)*(nearx - xCenter) + (neary - yCenter)*(neary - yCenter);

        return dist <= radius*radius;
    }
}