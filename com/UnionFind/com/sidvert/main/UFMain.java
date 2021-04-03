package com.sidvert.main;

import com.sidvert.util.StdIn;
import com.sidvert.main.UF;
import com.sidvert.main.QuickUnionUF;

public class UFMain {
	
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Usage: java.UFMain <1, 2, 3> ; 1 -> UnionFind.java, 2 -> QuickUnionUF, 3 -> WeightedQuickUnionUF");
			System.exit(1);
		}
		
		if(Integer.parseInt(args[0]) == 1) {
			System.out.println("Using UF class");
			int N = StdIn.readInt();
			UF uf = new UF(N);
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
		else if (Integer.parseInt(args[0]) == 2) {
			System.out.println("Using QuickUnionUF class");
			int N = StdIn.readInt();
			QuickUnionUF uf = new QuickUnionUF(N);
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
		else if (Integer.parseInt(args[0]) == 3) {
			System.out.println("Using WeightedQuickUnionUF class");
			int N = StdIn.readInt();
			WeightedQuickUnionUF uf = new WeightedQuickUnionUF(N);
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
		} else {
			System.out.println("Usage: java.UFMain <1, 2, 3> ; 1 -> UnionFind.java, 2 -> QuickUnionUF, 3 -> WeightedQuickUnionUF");
			System.exit(1);
		}
	}
}
