#Narcissistic Numbers

Problem Statement
------------------
In recreational number theory, a narcissistic number is a number that is the sum of its own digits each raised to the power of the number of digits. The formal definition is as follows:

Let n=d(k), d(k-1), .., d(1) where k is the number of digits in n and d(k) is a function that maps to the k-th digit of n. Then

n = d(k)^k + d(k-1)^k + ... + d(1)^k
For the number 153, k equals 3 since the length of 153 is 3. d(3)=1, d(2)=5 and d(1)=3. So for 153:

n = 1^3 + 5^3 + 3^3
Write a program that determines if a number is a narcissistic number.

Input Format
----------------
You will be given a list of numbers.

Output Format
---------------
You need to write output True of False on its own line.
