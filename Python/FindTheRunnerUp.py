
'''
Question:

Given the participants' score sheet for your University Sports Day, you are required to find the runner-up score. You are given  scores. Store them in a list and find the score of the runner-up.

Input Format

The first line contains . The second line contains an array   of  integers each separated by a space.

Constraints

Output Format

Print the runner-up score.

Sample Input 0

5
2 3 6 6 5
Sample Output 0

5
'''
'''




Pseudo Code: 

1. Sort the array
2. Remove Duplicates 
3. Reverse the array
4. Print the last but one number



'''
# Code

if __name__ == '__main__':
    n = int(input())
    arr = list(set(map(int, input().split())))
    
    arr.sort(reverse = True)
    
    print (arr[1])