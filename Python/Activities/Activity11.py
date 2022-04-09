fruit_shop = {
    "apple" : 10,
    "banana" : 5,
    "orange" : 7,
    "cherry" :9

}
key_to_chk = input("What you are looking for ").lower()
if (key_to_chk in fruit_shop):
    print("Yes it's available")
else :
    print("It is not available")
