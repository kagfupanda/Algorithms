package com.sidvert.main;

public abstract class UnionFind {
	public abstract boolean connected(int p, int q);
	public abstract void union(int p, int q);
	public abstract void dumpArray();
}
