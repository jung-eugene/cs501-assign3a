# CS 501 Individual Assignment 3 Question 1

## Goal
- Build a screen with a `Row` where one section takes 25% width and the other 75% width.
- Inside the larger section, use a `Column` with 3 weighted children of different proportions (e.g., 2:3:5).
- Add colors and text labels to visualize space usage.

## Implementation
- Outer layout: `Row(Modifier.fillMaxSize())`
- Left pane (25%): `Modifier.weight(1f).fillMaxHeight()`
- Right pane (75%): `Modifier.weight(3f).fillMaxHeight()` with a `Column`
- Inside the right `Column`: three `Box`es using `.weight(2f)`, `.weight(3f)`, `.weight(5f)`, each with a background color and centered label
