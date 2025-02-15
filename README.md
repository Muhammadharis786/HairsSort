# Haris Sort 🚀  
Haris Sort is a **stable sorting algorithm** that improves upon Bubble Sort and Selection Sort by swapping elements **immediately** instead of waiting for the smallest one.  

## 📌 Features  
- ✅ **More efficient than Bubble Sort** (fewer swaps).  
- ✅ **More stable than Selection Sort** (preserves order of equal elements).  
- ✅ **Easy to implement and understand.**  

---

## 📜 Algorithm  
1️⃣ Iterate through the array with an **outer loop (`i`)**.  
2️⃣ Compare `arr[i]` with all elements ahead (`j = i + 1` to `n-1`).  
3️⃣ **Swap immediately** if a smaller value is found.  
4️⃣ Repeat until sorted.  

---

## 💻 Code Implementation  
```java
public class HarisSort {
    public static void harisSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // Swap if a smaller element is found
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 24, 5, 2};
        harisSort(arr);

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
```

---

## 📊 Complexity Analysis  

| Case | Time Complexity |
|------|---------------|
| **Best Case (Already Sorted)** | **O(n²)** |
| **Average Case** | **O(n²)** |
| **Worst Case (Reversed Order)** | **O(n²)** |

| **Metric** | **Complexity** |
|-----------|---------------|
| **Comparisons** | **O(n²)** (Similar to Bubble and Selection Sort) |
| **Swaps** | **Fewer than Bubble Sort, more than Selection Sort** |
| **Stable?** | ✅ **Yes** (Does not swap equal elements in a different order) |
| **In-Place?** | ✅ **Yes** (Uses no extra memory) |

---

## 🔥 Why Haris Sort?  
| Feature | ✅ Advantage |
|---------|------------|
| **Stability** | ✅ **Yes** (Preserves order of equal elements) |
| **Efficiency** | ✅ **Faster than Bubble Sort** (fewer swaps) |
| **Ease of Implementation** | ✅ **More intuitive than Selection Sort** |
| **Memory Usage** | ✅ **In-place algorithm (No extra memory required)** |

---

## 🏆 Conclusion  
Haris Sort is a **stable, efficient, and easy-to-implement sorting algorithm** that balances between **Bubble Sort and Selection Sort**. While it still has **O(n²) time complexity**, it reduces unnecessary swaps, making it **more optimized and stable** for real-world scenarios.

---

## 📌 Future Improvements  
🔹 Optimize to reduce unnecessary comparisons.  
🔹 Implement a hybrid version with Insertion Sort for better performance.  
🔹 Analyze performance on larger datasets.  

---

## 🤝 Contribute  
If you have ideas to improve **Haris Sort**, feel free to **fork the repository** and submit a **pull request!** 🚀  

---

## 📬 Contact  
📧 **Email:** [hariskhatrijee@gmail.com](mailto:hariskhatrijee@gmail.com)  
🐙 **GitHub:** [https://github.com/Muhammadharis786)  

---

🔥 **If you found this useful, don't forget to ⭐ star this repository!** 🔥  
