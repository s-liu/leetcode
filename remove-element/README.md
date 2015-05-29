# Remove Element

Given an array and a value, remove all instances of that value in place and return the new length.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

# Ideas

I used two pointers to solve this problem. My solution takes advantage of the fact the the order of elements could be changed and swaps the first element that needs to be removed with the last element that we want to keep in the array. So all the elements that we want to remove will be swapped to the end of the array while the ones we want to keep will stay at the front. 
