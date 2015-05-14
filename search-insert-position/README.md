# Search Insert Position

Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0

# Ideas

This uses a similar idea from search for a target range problem.

I used a modified binary search algorithm that search the leftmost target value, and if the target value does not exist, the start index will point to the insert position perfectly. There is however one case where start index could be negative (-1) if we want to insert before the first element, we then correct it to be 0.
