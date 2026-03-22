# CONCEPT: Python is Dynamically Typed.
# You don't need to declare the type of a variable. 
# The interpreter determines the type at runtime based on the value assigned.

name = ""
age = 0
height = 0.0

name = input("What is your name? ")
age = int(input("What is your age? "))
height = float(input("What is your height? "))

print(f"Hello, {name}! You are {age} years old and {height} meters tall.")

print("-------------- Temp Converter ----------------")
temp = float(input("Enter the temperature in Celsius: "))
fahrenheit = (temp * 9/5) + 32
kelvin = temp + 273.15
print(f"The temperature in Fahrenheit is {fahrenheit} and in Kelvin is {kelvin}")

