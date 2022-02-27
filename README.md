# Ten Thousand

This is a java command line program for playing the dice game 10k.

## Base rules

10k is a dice rolling dice with 6 dice, where the player has two possible actions: Roll, or pass. 
If you make a roll and get no points, you lose all points of that turn. 
If you pass, you save your points for that turn. 
If a dice has given you points, it's locked until you get points with all 6 dice.
If you get points with all 6 dice, you can choose to roll all again,
adding to the already gained points.

## Default scoring rules

You get points for rolling the following:

1 (100 points)

5 (50 points)

Three or more of a kind:
* 3 of a kind: The number on the dice * 100 points, **or** 1000 points if it's 1s.
* For each consecutive dice of the same kind, double the score.

Three pairs - 1500

Straight (1, 2, 3, 4, 5, 6) - 1500 points
