def calcsum(n) :
    if n <= 1:
        return n
    else :
        return n + calcsum(n-1)

num = int(input('Enter the number '))
print("Sum is ", calcsum(10))
