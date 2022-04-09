numlist = list(input('Enter the list separated by comma ').split(","))
firstname = numlist[0]
lastname = numlist[-1]
if (firstname==lastname) :
    print(True)
else :
    print(False)