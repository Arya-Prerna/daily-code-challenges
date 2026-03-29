word = input("Enter the string: ")
if word == word[::-1]:
    print("Palindrome")
else:
    print("Not a palindrome")
print()

vowels = {"a", "e", "i", "o", "u"}
count = 0
for ch in word:
    if ch.lower() in vowels:
        count += 1
print(f"The number of vowels is {count}")
print()

print(f"The reversed String is: {word[::-1]}")
print()

shift = int(input("Enter the shift value for caesar_cipher: "))
ans = ""
for i in word:
    newChar =  chr(ord(i) + shift)
    ans += newChar
print(f"The new String is: {ans}")
print()

word2 = input("Enter the other string to check for anagram: ")
s1 = word.lower()
s2 = word2.lower()
if len(s1) != len(s2):
    print(f"{s1} and {s2} are Not anagrams!")
elif sorted(s1) == sorted(s2):
    print(f"{s1} and {s2} are Anangrams!")
else:
    print(f"{s1} and {s2} are Not anagrams!")
        