# Maximum Subarray

Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
the contiguous subarray [4,−1,2,1] has the largest sum = 6.

More practice:
If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.

# Ideas

This is a typical dynamic programming problem and I think there is a algorithm on this problem but I haven't had a chance to look at.

So I used an additional array to keep track of the results from my subproblems. The subproblem that I'm aiming to solve is that what is the best max value I can achieve if I have to include my current element.

I separated this subproblem into two scenarios, the answer from the previous element is either 1) negative or 2) negative.

If the max value from previous element is negative, and the current element happen to be larger than that max value, we will definitely want to get rid of what's before the current and set the starting point to be current. If however, the current element is even smaller than the previous negative, we will want to avoid the current element and we use the previous result as our answer.

If the max value from previous element turns out to be positive, we don't have to care about this current element being positive or not. We will simply become greedy and pick up all elements as possible and find the largest max value by another traversal on the values at the end.


EDIT: There is a much neater way of solving this problem without using extra spaces.

Use a max variable to keep track as you iterate through the array, and another sum variable to accumulate elements along the way.

If the sum turns out to be negative, clear the sum because adding anything to a negative sum will only yield a lower sum. If the sum is greater than the max, update the max.

LATER EDIT: Looked up online and found the Kadane's Algorithm. Added to the solution as well.
