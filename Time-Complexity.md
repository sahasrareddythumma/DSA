# DSA – Time Complexity Notes

## 1. What is Time Complexity?

Time complexity is a measure of the **amount of time an algorithm takes to complete as the size of the input increases**.

It does not usually represent the exact execution time. Instead, it describes the **growth rate of the number of operations** performed by the algorithm.

Time complexity is generally expressed using **asymptotic notation**, especially **Big-O notation (O)**.

### Example

If an algorithm examines every element of an array of size `n`, its time complexity is:

`O(n)`

---

# 2. Why Do We Need Time Complexity?

Time complexity helps us:

* Compare different algorithms.
* Determine which algorithm is more efficient.
* Predict how an algorithm behaves for large inputs.
* Choose an appropriate algorithm for a problem.
* Understand the scalability of a solution.

An algorithm that works efficiently for a small input may become very slow when the input becomes very large.

---

# 3. Big-O Notation

Big-O notation describes the **upper bound of an algorithm's growth rate**.

It represents how the running time grows as the input size `n` increases.

For example:

* `O(1)` → Constant
* `O(log n)` → Logarithmic
* `O(n)` → Linear
* `O(n log n)` → Linearithmic
* `O(n²)` → Quadratic
* `O(n³)` → Cubic
* `O(2ⁿ)` → Exponential
* `O(n!)` → Factorial

---

# 4. O(1) – Constant Time

An algorithm has constant time complexity when the number of operations does not depend on the size of the input.

Even if the input size increases, the operation takes approximately the same amount of time.

### Example

Accessing an element of an array using its index.

### Complexity:

`O(1)`

---

# 5. O(log n) – Logarithmic Time

An algorithm has logarithmic complexity when the problem size is repeatedly reduced by a constant factor, usually by half.

The number of operations grows very slowly as the input size increases.

### Example:

Binary Search.

If the search space is divided into half at every step:

`n → n/2 → n/4 → n/8 → ...`

### Complexity:

`O(log n)`

Binary Search is efficient because it eliminates half of the remaining elements after every comparison.

---

# 6. O(n) – Linear Time

An algorithm has linear time complexity when the number of operations grows directly with the input size.

If the input size doubles, the number of operations approximately doubles.

### Example:

Searching for an element using Linear Search.

For an array containing `n` elements, we may need to check all `n` elements.

### Complexity:

`O(n)`

---

# 7. O(n log n) – Linearithmic Time

This complexity commonly occurs in efficient sorting algorithms.

The algorithm performs approximately `log n` levels of work for `n` elements.

### Examples:

* Merge Sort
* Heap Sort
* Average-case Quick Sort

### Complexity:

`O(n log n)`

It is generally considered efficient for sorting large datasets.

---

# 8. O(n²) – Quadratic Time

An algorithm has quadratic time complexity when the number of operations grows approximately as the square of the input size.

It commonly occurs when two loops are nested.

### Example:

Comparing every element with every other element.

For `n` elements, approximately:

`n × n = n²`

operations may be performed.

### Complexity:

`O(n²)`

Examples include:

* Bubble Sort
* Selection Sort
* Insertion Sort (average and worst case)

---

# 9. O(n³) – Cubic Time

An algorithm has cubic time complexity when the number of operations grows approximately as the cube of the input size.

It commonly occurs when three loops are nested.

### Complexity:

`O(n³)`

Such algorithms become inefficient quickly as `n` becomes large.

---

# 10. O(2ⁿ) – Exponential Time

Exponential complexity occurs when the number of operations approximately doubles for every increase in the input size.

It is commonly seen in certain recursive algorithms that generate multiple possibilities at every step.

### Complexity:

`O(2ⁿ)`

These algorithms become impractical for large input sizes.

---

# 11. O(n!) – Factorial Time

Factorial complexity is one of the fastest-growing complexity classes.

It commonly occurs when an algorithm generates all possible permutations of `n` elements.

The number of possibilities is:

`n!`

### Complexity:

`O(n!)`

Factorial algorithms become extremely slow even for relatively small values of `n`.

---

# 12. Order of Time Complexities

From generally more efficient to less efficient:

`O(1)`

↓

`O(log n)`

↓

`O(n)`

↓

`O(n log n)`

↓

`O(n²)`

↓

`O(n³)`

↓

`O(2ⁿ)`

↓

`O(n!)`

As the input size increases, algorithms with faster-growing complexity become significantly more expensive.

---

# 13. Best, Average and Worst Case

An algorithm can behave differently depending on the input.

### Best Case

The minimum amount of time required by the algorithm for a particular input.

### Average Case

The expected running time for a typical input.

### Worst Case

The maximum amount of time required by the algorithm for an input of size `n`.

Worst-case complexity is commonly used when analyzing algorithms because it provides an upper limit on the running time.

---

# 14. Space Complexity

Space complexity measures the **amount of memory required by an algorithm as the input size increases**.

It includes the extra memory used by the algorithm apart from the input itself.

### Examples:

* Using a few variables → `O(1)`
* Creating an additional array of size `n` → `O(n)`
* Creating a two-dimensional array of size `n × n` → `O(n²)`

---

# 15. Auxiliary Space

Auxiliary space refers specifically to the **extra memory used by an algorithm while executing**, excluding the memory occupied by the input.

For example, if an algorithm modifies the given array without creating another array, its auxiliary space may be:

`O(1)`

This is commonly referred to as an **in-place algorithm**.

---

# 16. In-Place Algorithm

An in-place algorithm modifies the original data structure instead of creating another data structure of proportional size.

### Advantages:

* Uses less memory.
* More memory efficient.
* Useful when memory is limited.

Example:

An algorithm that rearranges elements inside the same array using only a few variables has:

`O(1)` auxiliary space.

---

# 17. Time Complexity of Common DSA Operations

## Array

* Access → `O(1)`
* Search → `O(n)`
* Insertion → `O(n)` in general
* Deletion → `O(n)` in general

## Linked List

* Access → `O(n)`
* Search → `O(n)`
* Insertion at beginning → `O(1)`
* Deletion at beginning → `O(1)`

## Stack

* Push → `O(1)`
* Pop → `O(1)`
* Peek → `O(1)`
* Search → `O(n)`

## Queue

* Enqueue → `O(1)`
* Dequeue → `O(1)`
* Peek → `O(1)`
* Search → `O(n)`

## Binary Search Tree

Average case:

* Search → `O(log n)`
* Insertion → `O(log n)`
* Deletion → `O(log n)`

Worst case for an unbalanced BST:

* Search → `O(n)`
* Insertion → `O(n)`
* Deletion → `O(n)`

## Heap

* Access minimum/maximum → `O(1)`
* Insertion → `O(log n)`
* Deletion → `O(log n)`
* Build Heap → `O(n)`

---

# 18. Time Complexity of Common Sorting Algorithms

| Algorithm      | Best Case  | Average Case | Worst Case |
| -------------- | ---------- | ------------ | ---------- |
| Bubble Sort    | O(n)       | O(n²)        | O(n²)      |
| Selection Sort | O(n²)      | O(n²)        | O(n²)      |
| Insertion Sort | O(n)       | O(n²)        | O(n²)      |
| Merge Sort     | O(n log n) | O(n log n)   | O(n log n) |
| Quick Sort     | O(n log n) | O(n log n)   | O(n²)      |
| Heap Sort      | O(n log n) | O(n log n)   | O(n log n) |

---

# 19. Important Rules for Calculating Complexity

### Rule 1: Ignore constants

`O(2n)` becomes:

`O(n)`

`O(5n)` becomes:

`O(n)`

---

### Rule 2: Keep the highest-order term

`O(n² + n)` becomes:

`O(n²)`

`O(n³ + n² + n)` becomes:

`O(n³)`

---

### Rule 3: Sequential operations are added

If one operation takes `O(n)` and another takes `O(n²)`:

`O(n) + O(n²) = O(n²)`

---

### Rule 4: Nested operations are multiplied

If an `O(n)` operation is performed inside another `O(n)` operation:

`O(n) × O(n) = O(n²)`

---

# 20. Key Takeaways

* Time complexity measures how an algorithm's running time grows with input size.
* Space complexity measures how memory requirements grow with input size.
* Big-O notation is commonly used to describe complexity.
* `O(1)` is constant time.
* `O(log n)` is logarithmic time.
* `O(n)` is linear time.
* `O(n log n)` is common in efficient sorting.
* `O(n²)` commonly occurs with nested loops.
* `O(2ⁿ)` and `O(n!)` become impractical quickly.
* Lower growth rate generally means better scalability.
* In-place algorithms generally use `O(1)` auxiliary space.
