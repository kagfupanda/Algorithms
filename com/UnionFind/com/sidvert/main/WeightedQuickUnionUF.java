package com.sidvert.main;

public class WeightedQuickUnionUF extends UnionFind{
	private int[] rootid;
	private int[] sz;

	//ctor
	public WeightedQuickUnionUF(int N) {
		rootid = new int[N];
		sz = new int[N];
		for(int i = 0; i < N; ++i) {
			rootid[i] = i;
			sz[i] = i;
		}
	}

	//calculate rootid of an id[p]
	private int root(int p) {
		while(p != rootid[p]) {
			rootid[p] = rootid[rootid[p]];
			p = rootid[p];
		}
			return p;
	}

	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}

	public void union(int p, int q) {
		int p_root = root(p);
		int q_root = root(q);
		if (sz[p_root] < sz[q_root]) { rootid[p_root] = q_root; sz[q_root] += sz[p_root]; }
		else { rootid[q_root] = p_root; sz[p_root] += sz[q_root];}
	}

	public void dumpArray() {
		for(int i = 0; i < rootid.length; ++i)
			System.out.format("%d ", rootid[i]);
		System.out.format("%n");
	}
}
