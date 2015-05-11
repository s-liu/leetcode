# Container With Most Water

Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container.

# Ideas

One thing to keep in mind is the Liebig's law, the area here is determined by the shorter height.

This is a typical two pointer problem - I used a left and right pointer at the beginning and the end of the array. I will always try to move the pointer that points shorter height towards the other to look for a higher height that may produce a better area.

The time complexity is just linear because we are moving two pointers towards each other and stop when they meet. There is no additional spaces used so the space complexity is simply O(1).
