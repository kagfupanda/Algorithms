package com.sidvert.main;

public class QuickUnionUF extends UnionFind{
	private int[] rootid;

	//ctor
	public QuickUnionUF(int N) {
		rootid = new int[N];
		for(int i = 0; i < N; ++i)
			rootid[i] = i;
	}

	//calculate rootid of an id[p]
	private int root(int p) {
		while(p != rootid[p]) p = rootid[p];
			return p;
	}

	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}

	public void union(int p, int q) {
		int p_root = root(p);
		int q_root = root(q);
		rootid[p_root] = q_root;
	}

	public void dumpArray() {
		for(int i = 0; i < rootid.length; ++i)
			System.out.format("%d ", rootid[i]);
		System.out.format("%n");
	}
}
