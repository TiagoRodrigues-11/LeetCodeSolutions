class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1){
            return x;
        }
        long left = 1;
        long right = x;

        while (right - left > 1) {
            long mid = left + (right - left) / 2;
            long squaredMid = mid * mid;
            System.out.println(left + " - " + mid + " - " + right + ": " + squaredMid);
            if (squaredMid == x) {
                return (int)mid;
            } else if (squaredMid > x) {
                right = mid-1;
            } else {
                left = mid;
            }

        }
        if (right*right < x) {
            return (int) right;
        }
        System.out.println(left + " - " + right);

        return (int)left;
    }
}