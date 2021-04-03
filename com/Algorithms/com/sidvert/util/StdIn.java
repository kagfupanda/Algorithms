package com.sidvert.util;

import java.util.Scanner;

public final class StdIn {
	static Scanner scanner = null;

	static {
		scanner = new Scanner(System.in);
	}

	private StdIn() {} // private ctor

	public static int readInt()  {
		return scanner.nextInt();
		
	}

	public static boolean isEmpty() {
		return !scanner.hasNext();
	}

	public static void main(String[] args) {
		if(!StdIn.isEmpty())
			System.out.println(StdIn.readInt());
	}

}
