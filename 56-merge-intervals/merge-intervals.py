class Solution(object):
    def merge(self, intervals):
        """
        :type intervals: List[List[int]]
        :rtype: List[List[int]]
        """
        intervals.sort(key = lambda l: l[0])
        res = []

        slow = 0
        fast = 0

        while fast < len(intervals):
            startInterval = intervals[slow][0]
            endInterval = intervals[slow][1]

            while fast < len(intervals) and intervals[fast][0] <= endInterval:
                if intervals[fast][1] >= endInterval:
                    endInterval = intervals[fast][1]
                    
                fast += 1

            res.append([startInterval, endInterval])
            slow = fast

        return res
        