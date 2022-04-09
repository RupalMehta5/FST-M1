#firstnumlist = list(input('Enter the firsst list separated by comma ').split(","))
#secondnumlist = list(input('Enter the second list separated by comma ').split(","))
firstnumlist = [10,15,29]
secondnumlist = [67,34,55]
thirdlist = []
for num in firstnumlist:
    if (num % 2 != 0):
        thirdlist.append(num)

for num in secondnumlist:
    if (num % 2 == 0):
        thirdlist.append(num)

print(thirdlist)


