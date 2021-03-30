package com.sidvert.main;

import com.sidvert.util.StdIn;
import com.sidvert.main.UF;
import com.sidvert.main.QuickUnionUF;

public class UFMain {
	
	public static void main(String[] args) {
		int N = StdIn.readInt();
		//UF uf = new UF(N);
		QuickUnionUF uf = new QuickUnionUF(N);

		while (!StdIn.isEmpty()) {
			int p = StdIn.readInt();
			int q = StdIn.readInt();
			if(!uf.connected(p,q)) {
				uf.union(p, q);
				System.out.println(p + " " + q);
			}
			uf.dumpArray();
		}


	}
}
