#num_tuple = list(input('Enter the firsst list separated by comma ').split(","))
num_tuple = (10,20,34,56)
print(num_tuple)
for num in num_tuple:
    if (num % 5 == 0):
        print(num)
