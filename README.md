# CS 501 Individual Assignment 3 Question 1

## Explanation
- Demonstrates Jetpack Compose **weight-based layout**.
- Screen is a `Row` split **25% / 75%**; the right side is a `Column` with **2:3:5** weighted blocks.
- Colors and labels make each area’s proportion easy to see.

## How to Use
1. Open in Android Studio and run on an emulator/device (or use the `@Preview`).
2. Observe: left pane ≈25% width; right pane shows three stacked blocks (2, 3, 5).
3. Rotate/rescale: ratios stay the same because sizes are weight-driven.

## Implementation
- Outer: `Row(Modifier.fillMaxSize())`
- Left (25%): `Modifier.weight(1f).fillMaxHeight()`
- Right (75%): `Modifier.weight(3f).fillMaxHeight()` + `Column`
- Inside right `Column`: three `Box`es with `.weight(2f)`, `.weight(3f)`, `.weight(5f)` + centered labels
