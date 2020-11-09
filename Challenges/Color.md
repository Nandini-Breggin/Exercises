# **Color**
Each of the shades red, green, and blue are stored as integers in the range 0-255, with 0 meaning none of that shade contributes to the final color, and 255 meaning the maximum amount of that shade.


# **Create and test a Color class that allows you to create colors using red, green, and blue values.**

# **Colors should be able to:**

* Be created with a random color by default
* Be created with provided red, green, and blue values instead too
* A color can be randomized later at any time
* Show a summary of the rgb numbers of the color, for example [0, 125, 58]
* Darken and lighten an existing color by a given percentage
* The individual shades of the color can be accessed and changed outside the class
* The r, g, and b values should never be allowed to be outside the range 0-255. Clamp any illegal number to the max or min, whichever is closest.

# **Other Rules:**
* All testing code should be in a separate file with its own class (for example ColorTester.java) and only has a main function
* Do not write any static functions in the Color class

# **Extra Credit:**
* Colors can be created with a hex code String as well
* By providing a different color, give back the color created by blending the current color and the other one