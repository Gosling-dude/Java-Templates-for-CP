
class DSU {

    int[] parent;

    // Initialize: each element is its own parent (own set)
    public DSU(int n) {
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    // Find root of x (no path compression)
    // Each find call can be O(N) in the worst case → too slow for large N.
    public int find(int x) {
        while (parent[x] != x) {
            x = parent[x];
        }
        return x;
    }

    // Union by making root of b point to root of a
    public void union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);
        if (rootA != rootB) {
            parent[rootB] = rootA;
        }
    }
}

// -> Optimizations for Nearly‑O(1) Time
// 1. Path Compression (during find)
// 2. Union by Rank / Size (attach smaller tree under larger)
// 1 - > Path Compression
// Every time we find(x), we make parent[x] point directly to the root.

/* 
 public int find(int x) {
    if (parent[x] != x) {
        parent[x] = find(parent[x]);  // recursion compresses path
    }
    return parent[x];
}
 */
// 2 - > Union by Rank (or Size)
// Maintain a rank[] (approximate tree height) or size[]. Always attach the smaller under the larger:

/*
int[] parent, rank;

public DSU(int n) {
    parent = new int[n];
    rank   = new int[n];
    for (int i = 0; i < n; i++) {
        parent[i] = i;
        rank[i]   = 0;         // initial tree height = 0
    }
}

public int find(int x) {            // with path compression
    if (parent[x] != x) {
        parent[x] = find(parent[x]);
    }
    return parent[x];
}

public void union(int a, int b) {
    int ra = find(a), rb = find(b);
    if (ra == rb) return;          // already in same set

    // attach smaller rank tree under larger rank tree
    if (rank[ra] < rank[rb]) {
        parent[ra] = rb;
    } else if (rank[ra] > rank[rb]) {
        parent[rb] = ra;
    } else {
        parent[rb] = ra;
        rank[ra]++;                // increase height if equal
    }
}
*/
