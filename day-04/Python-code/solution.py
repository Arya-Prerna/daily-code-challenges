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

# Password Strength Checker (score: 0–100, 20 points per criterion)
import re

password = input("Enter the password: ")
score = 0
issues = []

if len(password) < 8:
    issues.append("Password is too short (use at least 8 characters)")
elif len(password) > 16:
    issues.append("Password is too long (use at most 16 characters)")
else:
    score += 20

if re.search(r"[A-Z]", password):
    score += 20
else:
    issues.append("Password should contain at least one uppercase letter")

if re.search(r"[a-z]", password):
    score += 20
else:
    issues.append("Password should contain at least one lowercase letter")

if re.search(r"[0-9]", password):
    score += 20
else:
    issues.append("Password should contain at least one digit")

if re.search(r"[!@#$%^&*()_+\-=[\]{}|;:,.<>?]", password):
    score += 20
else:
    issues.append("Password should contain at least one special character")

for msg in issues:
    print(msg)

if score <= 39:
    label = "Weak"
elif score <= 59:
    label = "Fair"
elif score <= 79:
    label = "Good"
else:
    label = "Strong"

print(f"Strength score: {score}/100 — {label}")
if score == 100 and not issues:
    print("Password meets all rules.")
