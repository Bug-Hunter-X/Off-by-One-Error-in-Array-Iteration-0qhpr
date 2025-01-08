# Off-by-One Error in Array Iteration

This repository demonstrates a common off-by-one error in Java when iterating over an array. The bug causes an `ArrayIndexOutOfBoundsException` because the loop condition `i <= arr.length` attempts to access an element beyond the array's bounds. The corrected version uses `i < arr.length` to fix this issue.

## Bug Description
The buggy code iterates through an array using a `for` loop. The loop condition incorrectly uses `i <= arr.length`, resulting in an attempt to access `arr[5]` in an array of size 5 (valid indices are 0-4). This leads to an `ArrayIndexOutOfBoundsException`.

## Solution
The corrected code modifies the loop condition to `i < arr.length`. This ensures that the loop iterates only up to the last valid index of the array, preventing the `ArrayIndexOutOfBoundsException`.