# Haris Sort 🚀  
Haris Sort is a stable sorting algorithm that improves upon Bubble Sort and Selection Sort by swapping elements immediately instead of waiting for the smallest one.  

## 📌 Features  
- ✅ **More efficient than Bubble Sort** (fewer swaps).  
- ✅ **More stable than Selection Sort** (preserves order of equal elements).  
- ✅ **Easy to implement and understand.**  

## 📜 Algorithm  
1. Iterate through the array with an **outer loop (`i`)**.  
2. Compare `arr[i]` with all elements ahead (`j = i + 1` to `n-1`).  
3. **Swap immediately** if a smaller value is found.  
4. Repeat until sorted.  

Complexity Analysis
Case	Time Complexity
Best Case (Already Sorted)	O(n²)
Average Case	O(n²)
Worst Case (Reversed Order)	O(n²)
Comparisons: O(n^2)O(n 
2
 ) (like Bubble and Selection Sort)
Swaps: Fewer than Bubble Sort but more than Selection Sort
Stable? ✅ Yes! (It does not swap equal elements in a different order)
In-Place? ✅ Yes! (Uses no extra memory)
Why Haris Sort?
✅ More stable than Selection Sort
✅ More efficient than Bubble Sort (fewer swaps)
✅ Easier to implement
