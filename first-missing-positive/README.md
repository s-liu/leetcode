# First Missing Position

Given an unsorted integer array, find the first missing positive integer.

For example,
Given [1,2,0] return 3,
and [3,4,-1,1] return 2.

Your algorithm should run in O(n) time and uses constant space.

# Ideas

The tricky part about this problem is that we are only given constant space, so everything needs to be done in place.
At first I was thinking about counting sort and radix sort, but neither seems to satisfy the constraints here.

The basic idea is that we want to swap A[i] and A[A[i]] whenever A[i] != i so that the array is sorted from 1 to whatever. Then we iterate through the array and observe any discrepancies in the order and print the missing positive number.

When it comes to actual implementation, some minor details may become annoying. For example, I try to maintain that A[i] == i+1 so that the ordered array starts from 1 rather than 0 to better observe the missing positive, though starting from 0 is also do-able. One thing to keep in mind is that if the array appears sorted and complete, the returned result should be n+1.
