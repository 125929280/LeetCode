class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int[] fa = new int[edges.length+1];
        for(int i = 1;i <= edges.length;i ++) fa[i] = i;
        for(int[] i : edges) {
            if(!join(fa, i[0], i[1])) return new int[]{i[0], i[1]};
        }
        return new int[0];
    }

    public int find(int[] fa, int x) {
        return fa[x] == x ? x : find(fa, fa[x]);
    }

    public boolean join(int[] fa, int x, int y) {
        int fx = find(fa, x), fy = find(fa, y);
        if(fx != fy) {
            fa[fx] = fy;
            return true;
        }
        return false;
    }
}