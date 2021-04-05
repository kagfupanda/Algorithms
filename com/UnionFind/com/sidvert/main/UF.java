package com.sidvert.main;

public class UF extends UnionFind{
	private int[] connections;
	
	public UF(int N) {
		connections = new int[N];
		for(int i = 0; i < N; ++i) {
			connections[i] = i; // i is connected to i: reflexive
		}
	}

	public boolean connected(int p, int q) {
		// is p connected to q?
		return connections[p] == connections[q];
	}

	public void union(int p, int q) {
		int p_cnx = connections[p];
		int q_cnx = connections[q];
		for(int i = 0; i < connections.length; ++i) {
			if (connections[i] == p_cnx)
				connections[i] = q_cnx;
		}
	}

	public void dumpArray() {
		for(int i = 0; i < connections.length; ++i) {
			System.out.format("%d ", connections[i]);
		}
		System.out.format("%n");
	}

}
