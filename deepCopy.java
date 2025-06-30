int[][] deepCopy(int[][] mat) {
    int[][] copy = new int[mat.length][];
    for (int i = 0; i < mat.length; i++) {
        copy[i] = Arrays.copyOf(mat[i], mat[i].length);
    }
    return copy;
}
