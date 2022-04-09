def calsum(numbers) :
    sum =0
    for number in numbers :
        sum = sum + number
    return sum
#numlist = list(input("Enter the list separated by comma ").split(","))
numlist = [10,20,30]
result = calsum(numlist)
print("Sum is " + str(result))
