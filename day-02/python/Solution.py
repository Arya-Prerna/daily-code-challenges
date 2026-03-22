import random

marks = 0.0
while True:
    marks = float(input("Enter your marks: "))
    if marks >= 0 and marks <= 100:
        break
    print("Invalid marks")

if marks >= 90:
    print("A+")
elif marks >= 80:
    print("A")
elif marks >= 70:
    print("A-")
elif marks >= 60:
    print("B+")
elif marks >= 50:
    print("B")
elif marks >= 40:
    print("B-")
elif marks >= 30:
    print("C+")
elif marks >= 20:
    print("C")
elif marks >= 10:
    print("C-")
else:
    print("F")

print("------------ ROCK PAPER SCISSOR ------------- \n")
options = ["Rock", "Paper", "Scissors"]
computer = random.choice(options)
user = input("Enter Rock Paper or Scissors: ").strip().title()
wins_against = {"Rock": "Scissors", "Scissors": "Paper", "Paper": "Rock"}

if user not in options:
    print("Invalid choice.")
elif user == computer:
    print("Tie!")
elif wins_against[user] == computer:
    print("You win!")
else:
    print("You lose!")
print(f"Computer chose: {computer}")