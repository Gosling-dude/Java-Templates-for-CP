# 🚀 Competitive Programming in Java

 ### ⭐ If this repository helped you even a little, consider giving it a star!

 ---

This repository contains essential **data structures** and **algorithms** implemented in Java for competitive programming.

🔗 I'm `SumitXorY` / `sumit_chauhan` on coding platforms:  
[📘 Codeforces](https://codeforces.com/profile/SumitXorY) | [🍛 CodeChef](https://www.codechef.com/users/sumit_chauhan)

Feel free to use the codes — and if you find any bugs, don’t hesitate to report them!

---

## 📂 Contents

<details>
<summary><strong>🧱 Data Structures</strong></summary>

- [Next Smaller & Bigger Element using Stack (O(n))](https://github.com/Gosling-dude/Java-Templates-for-CP/blob/master/nextSmallerBigger.java)  
- [Disjoint Set (Union-Find)](https://github.com/Gosling-dude/Java-Templates-for-CP/blob/master/DisjointSet.java)  
- [Centroid Decomposition](https://github.com/Gosling-dude/Java-Templates-for-CP/blob/master/centroid.java)  
- [Lowest Common Ancestor (LCA)](https://github.com/Gosling-dude/Java-Templates-for-CP/blob/master/lca.java)  
- [Virtual Tree](https://github.com/Gosling-dude/Java-Templates-for-CP/blob/master/virtualTree.java)  
- [Fenwick Tree / Binary Indexed Tree (BIT)](https://github.com/Gosling-dude/Java-Templates-for-CP/blob/master/BIT.java)  
- [Segment Tree - Basic](https://github.com/Gosling-dude/Java-Templates-for-CP/blob/master/SegmentTree.java)  
- [Segment Tree - Range Updates (Add)](https://github.com/Gosling-dude/Java-Templates-for-CP/blob/master/SegmentTree_Lazy_add.java)  
- [Segment Tree - Range Updates (Assign)](https://github.com/Gosling-dude/Java-Templates-for-CP/blob/master/SegmentTree_Lazy_Assign.java)  
- [Kth Order Statistic on Subarray (No Updates)](https://github.com/Gosling-dude/Java-Templates-for-CP/blob/master/SegmentTree_KthOrder.java)

</details>

<details>
<summary><strong>📌 Algorithms</strong></summary>

- [Abstract Binary Search](https://github.com/Gosling-dude/Java-Templates-for-CP/blob/master/Absract_Binary_Search.java)  
- [Breadth-First Search (BFS)](https://github.com/Gosling-dude/Java-Templates-for-CP/blob/master/bfs.java)  
- [Depth-First Search (DFS)](https://github.com/Gosling-dude/Java-Templates-for-CP/blob/master/dfs.java)  
- [Kruskal's Algorithm using DSU](https://github.com/Gosling-dude/Java-Templates-for-CP/blob/master/kruskal_disjoint.java)  
- [Dijkstra's Algorithm using PriorityQueue](https://github.com/Gosling-dude/Java-Templates-for-CP/blob/master/Dijkstra.java)  
- [Floyd-Warshall (All-Pairs Shortest Path)](https://github.com/Gosling-dude/Java-Templates-for-CP/blob/master/all_pair.java)  
- [LIS (Longest Increasing Subsequence) - O(n log n)](https://github.com/Gosling-dude/Java-Templates-for-CP/blob/master/LIS.java)  
- [PIE (Principle of Inclusion-Exclusion)](https://github.com/Gosling-dude/Java-Templates-for-CP/blob/master/inclu_exclu.java)  

</details>

<details>
<summary><strong>🧵 Strings</strong></summary>

- [String Hashing - Rolling Polynomial Hash](https://github.com/Gosling-dude/Java-Templates-for-CP/blob/master/stringHash.java)

</details>

<details>
<summary><strong>🧮 Math</strong></summary>

- [Sieve of Eratosthenes (n ≤ 10⁷)](https://github.com/Gosling-dude/Java-Templates-for-CP/blob/master/sieve.java)  
- [Fraction Handling](https://github.com/Gosling-dude/Java-Templates-for-CP/blob/master/fractions.java)  
- [Rounding Doubles](https://github.com/Gosling-dude/Java-Templates-for-CP/blob/master/roundDouble.java)  
- [Geometry: Segments, Intersections, Polygon Area](https://github.com/Gosling-dude/Java-Templates-for-CP/blob/master/Geomtry.java)  
- [Closest Pair of Points](https://github.com/Gosling-dude/Java-Templates-for-CP/blob/master/closestPairPoints.java)  
- [nCr with Modulo](https://github.com/Gosling-dude/Java-Templates-for-CP/blob/master/nCr.java)  
- [Next Permutation](https://github.com/Gosling-dude/Java-Templates-for-CP/blob/master/next_permut.java)  
- [Selecting r Things from n Things](https://github.com/Gosling-dude/Java-Templates-for-CP/blob/master/select_r_things.java)  
- [Modular Power Function](https://github.com/Gosling-dude/Java-Templates-for-CP/blob/master/power.java)  
- [Matrix Exponentiation](https://github.com/Gosling-dude/Java-Templates-for-CP/blob/master/matrix_Exponentiation.java)

</details>

---

## 🧪 Miscellaneous

- [Stress Testing Utilities](https://github.com/Gosling-dude/Java-Templates-for-CP/blob/master/testing/)  
- [Java Template for Competitive Programming](https://github.com/Gosling-dude/Java-Templates-for-CP/blob/master/Main.java)

---

## ⚡ Fast I/O for Java: [Template](https://github.com/Gosling-dude/Java-Templates-for-CP/blob/master/Main.java)

Inspired by [uwi](https://codeforces.com/profile/uwi), this I/O template greatly improves Java input/output speed for contests.

### 🔧 Highlights
- Avoids slow `Scanner` and `BufferedReader`.
- No more TLE due to I/O after switching to this.
- Write your logic inside `solve()` — `main()` calls it.

---

## 📘 Template Documentation

### 🔹 Input Methods
```java
int x = ni();             // next int
long y = nl();            // next long
double d = nd();          // next double
String s = ns();          // next string
char c = nc();            // next char
int[] arr = na(n);        // array of size n
char[][] grid = nm(n, m); // character matrix
```

### 🔹 Output Methods
```java
pn(obj); // println
p(obj);  // print

```

### 🔹 Utilities
```java
int maxVal = max(arr);   // max from array
int minVal = min(arr);   // min from array
int g = gcd(x, y);       // gcd of two numbers
```
Includes a custom Pair class supporting hashing and sorting — usable in HashSets, HashMaps, and TreeMaps.
