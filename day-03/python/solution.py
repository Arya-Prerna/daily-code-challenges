print("------------------- FIZZBUZZ ------------------")
num = 0.0
num = float(input("Enter a number between 1 to 100: "))
if num < 1 or num > 100:
    print("Number must be between 1 and 100.")
else:
    if num % 15 == 0:
        print("FIZZBUZZ")
    elif num % 5 == 0:
        print("BUZZ")
    elif num % 3 == 0:
        print("FIZZ")
    else:
        print(num)
        
print("------------- MULTIPLICATION TABLE ------------")
for i in range(1, 13): 
    for j in range(1, 13):
        product = i * j
        print(f"{product:4}", end="") 
    print()
    
print("-------------- PATTERN ------------------------")
print("1.Right Triangle 2.Pyramid 3.Diamond")
choice = int(input("Enter the number: "))
rows = int(input("How many rows? "))
if choice == 1:
    for r in range(1, rows + 1):
        print("*" * r)
elif choice == 2:
    for r in range(1, rows + 1):
        spaces = " " * (rows - r)
        stars = "*" * (2 * r - 1)
        print(spaces + stars)
elif choice == 3:
    for r in range(1, rows + 1):
        spaces = " " * (rows - r)
        stars = "*" * (2 * r - 1)
        print(spaces + stars)
    for r in range(rows - 1, 0, -1):
        spaces = " " * (rows - r)
        stars = "*" * (2 * r - 1)
        print(spaces + stars)
else:
    print("Invalid choice. Enter 1, 2, or 3.")