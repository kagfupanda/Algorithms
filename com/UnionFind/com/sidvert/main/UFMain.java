package com.sidvert.main;

import com.sidvert.util.StdIn;
import com.sidvert.main.UF;
import com.sidvert.main.QuickUnionUF;

public class UFMain {
	
	public static void main(String[] args) {
		UnionFind uf = null;
		if (args.length == 0) {
			System.out.println("Usage: java.UFMain <1, 2, 3> ; 1 -> UnionFind.java, 2 -> QuickUnionUF, 3 -> WeightedQuickUnionUF");
			System.exit(1);
		}
			int N = StdIn.readInt();
		if(Integer.parseInt(args[0]) == 1) {
			System.out.println("Using UF class");
			uf = new UF(N);
		}
		else if (Integer.parseInt(args[0]) == 2) {
			System.out.println("Using QuickUnionUF class");
			uf = new QuickUnionUF(N);
		}
		else if (Integer.parseInt(args[0]) == 3) {
			System.out.println("Using WeightedQuickUnionUF class");
			uf = new WeightedQuickUnionUF(N);
		} else {
			System.out.println("Usage: java.UFMain <1, 2, 3> ; 1 -> UnionFind.java, 2 -> QuickUnionUF, 3 -> WeightedQuickUnionUF");
			System.exit(1);
		}
			while (!StdIn.isEmpty()) {
				int p = StdIn.readInt();
				int q = StdIn.readInt();
				if(!uf.connected(p,q)) {
					uf.union(p, q);
					System.out.println(p + " " + q);
				} else  {
					System.out.format("%d is connected to %d %n", p, q);
				}
				uf.dumpArray();
			}
	}
}
