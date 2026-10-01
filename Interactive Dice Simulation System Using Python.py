import tkinter as tk
import random

def roll_dice():
    dice = ["\u2680", "\u2681", "\u2682", "\u2683", "\u2684", "\u2685"]  # Unicode dice faces
    roll = random.choice(dice)
    label.config(text=roll, font=('Helvetica', 200))
    result_label.config(text=f"You rolled a {dice.index(roll) + 1}")

root = tk.Tk()
root.title("Dice Rolling Simulator 🎲")

label = tk.Label(root, text="", font=('Helvetica', 200))
label.pack(pady=20)

result_label = tk.Label(root, text="", font=('Helvetica', 20))
result_label.pack()

roll_button = tk.Button(root, text="Roll Dice", command=roll_dice, font=('Helvetica', 16))
roll_button.pack(pady=20)

root.mainloop()
