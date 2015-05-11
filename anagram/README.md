# Anagrams

Given an array of strings, return all groups of strings that are anagrams.

Note: All inputs will be in lower-case.

# Ideas

To constructed an anagram, every letter must be used, with exactly the same number of occurrences.

To determine if two words are anagrams, we could simply use a HashMap with the alphabets as the keys and the occurences of each alphabet as the values. Thus we can create a frequency map of letters in a single word and compare the occurrences.

However, this might not be an optimal solution if we are looking for groups of anagrams as we have to consider how to group the input words as pairs.

Another idea is that we could sort letters in each word in alphabetical order to produce a sorted word. All those anagrams of this words should be able to produce the same sorted word after this operation. We can again use a HashMap to store this ** sorted word ** as the key and keep a list of anagrams as values.

The time complexity in this case would be O(nklogk) where n is the number of input words and k is the length of the word. The sorting operation would normally take O(klogk) if you choose your sorting algorithms carefully.

The space complexity is O(nk), which is the size of this HashMap we have created.
