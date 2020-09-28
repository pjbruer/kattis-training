### kattis-training

## Problem A
There is a game in which you try not to repeat a word while your opponent tries to see if you have repeated one.

"THE RAIN IN SPAIN" has no repeats.

"IN THE RAIN AND THE SNOW" repeats THE.

"THE RAIN IN SPAIN IN THE PLAIN" repeats THE and IN.

Write a program to test a phrase.

### Input
Input is a line containing words separated by single spaces, where a word consists of one or more uppercase letters. A line contains no more than 80 characters.

### Output
The output is "yes" if no word is repeated, and "no" if one or more words repeat.

### Examples

> Sample Input > Sample Output
```
THE RAIN IN SPAIN > yes
```
```
IN THE RAIN AND THE SNOW > no
```
```
THE RAIN IN SPAIN IN THE PLAIN > no
```

# Solution
```
1. Convert input to lowercase to induce case-insensitivity.
2. Split words by whitespace into a new ArrayList of words.
3. Create a new HashSet of words based on previous list.
4. Compare the size of the list and the set.
5. If the list size is larger than the set size - removal of duplicate words has taken place.
```