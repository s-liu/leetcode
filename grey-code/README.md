# Grey code

The gray code is a binary numeral system where two successive values differ in only one bit.

Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code. A gray code sequence must begin with 0.

For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:

00 - 0
01 - 1
11 - 3
10 - 2
Note:
For a given n, a gray code sequence is not uniquely defined.

For example, [0,2,3,1] is also a valid gray code sequence according to the above definition.

# Ideas

This problem is quite easy once you could discover the pattern within Grey code. I personally had to look it up on Wikipedia to find out about it.

```
The binary-reflected Gray code list for n bits can be generated recursively from the list for n − 1 bits by reflecting the list (i.e. listing the entries in reverse order), concatenating the original list with the reversed list, prefixing the entries in the original list with a binary 0, and then prefixing the entries in the reflected list with a binary 1. For example, generating the n = 3 list from the n = 2 list:

2-bit list:	00, 01, 11, 10	 
Reflected:	 	10, 11, 01, 00
Prefix old entries with 0:	000, 001, 011, 010,	 
Prefix new entries with 1:	 	110, 111, 101, 100
Concatenated:	000, 001, 011, 010,	110, 111, 101, 100

```

Once this pattern is clear, everything else is very easy to implement
