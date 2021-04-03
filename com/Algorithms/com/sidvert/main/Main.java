package com.sidvert.main;

import com.sidvert.main.Stopwatch;
import com.sidvert.main.Threesome;
import com.sidvert.util.StdIn;

public class Main {

	public static void main(String[] args) {
		Threesome threesum = new Threesome();
		int N = StdIn.readInt();
		int a[] = new int[N];
		Stopwatch stopwatch = new Stopwatch();
		for(int i = 0; i < N; ++i)
			a[i] = StdIn.readInt();
		System.out.println(threesum.count(a));
		double time = stopwatch.elapsedTime();
		System.out.println("Elapsed time: " + time);
	}
}
