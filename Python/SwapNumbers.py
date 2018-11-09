#Write a Python Program to Swap given numbers

x = input("Enter the first number: ")
y = input("Enter the second number: ")

temp = x
x = y
y = temp

print("Swapped value of x is : {}".format(x))
print("Swapped value of y is : {}".format(y))