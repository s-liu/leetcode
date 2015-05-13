# Gas Station

There are N gas stations along a circular route, where the amount of gas at station i is gas[i].

You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from station i to its next station (i+1). You begin the journey with an empty tank at one of the gas stations.

Return the starting gas station's index if you can travel around the circuit once, otherwise return -1.

Note:
The solution is guaranteed to be unique.

# Ideas

There are two process in solving this problem.

It is easy to tell that if the sum of all gas minus the sum of all costs is less than 0, it is impossible to complete the trip because there is simply not enough fuel to cover the cost.

This can be done in linearly travsering through the two arrays and find the sum and then substract them.

However, the second part is that, if we know that there is just enough fuel to complete the trip, where shall we start the trip. This is in fact similar to the first part. Note that if that gas[i..j] - cost[i..j] < 0, we know for sure the start index is not within range i to j. So we want to find a sequence that yields a positive sum and return the first index in that sequence.
