# Search for a Range

Given a sorted array of integers, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

For example,
Given [5, 7, 7, 8, 8, 10] and target value 8,
return [3, 4].

# Ideas

This is essentially a modified binary search that looks for the leftmost and rightmost occurrences of the target value. So I broke it up into two parts: searchLeft and searchRight.

For a binary search, there are 3 situations that we want to consider:

1) target < array[mid]

In this case, no matter either we search to the left or right, we should always make *end = mid - 1* because we want to rule out the half that is definitely larger than the target. 

2) target > array[mid]

Same idea, we should always make *start = mid + 1* to rule out the other half, otherwise this is not a binary search.

3) target == array[mid]

Here is the important part: what do we do if we hit the target value?
It turns out to be really simple. If we are looking for the leftmost target, we should keep searching to the left half of the array and make sure that *end = mid - 1*. On the other hand, if we are looking for a rightmost target, we should keep looking to the right half by setting *start = mid + 1*. Everything should work out easily after this.
