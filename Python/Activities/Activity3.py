user1 = input("Enter player1 name")
user2 = input("Enter player2 name")
user1_ans = input(user1 + "do you want to choose rock,paper or scissor ") 
user2_ans = input (user2 + "do you want to choose rock,papaer or scissor ")
if user1_ans == user2_ans :
    print("Its a tie")
elif user1_ans == 'rock' :
    if user2_ans == 'scissor' :
        print("Rock wins")
    else :
        print("Paper wins")
elif user1_ans == 'scissor' :
    if user2_ans =='paper' :
        print("Scissor wins")
    else :
        print("Rock wins")
elif user1_ans == 'paper' :
    if user2_ans == 'rock' :
        print("paper wins") 
    else :
        print("Scissor wins")
else :
    print("Invalid input ! You have not entered rock, paper or scissor try again")

    