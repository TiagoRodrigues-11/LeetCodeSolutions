class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> res = new ArrayList<>();

        int slow = 0;
        int fast = 0;

        while(fast < intervals.length) {
            int startInterval = intervals[slow][0];
            int endInterval = intervals[slow][1];

            while (fast < intervals.length && intervals[fast][0] <= endInterval) {
                if (intervals[fast][1] >= endInterval) {
                    endInterval = intervals[fast][1];
                }

                fast++;
            }

            res.add(new int[]{startInterval, endInterval});
            slow = fast;
        }

        
        return res.toArray(new int[res.size()][]);

    }
}