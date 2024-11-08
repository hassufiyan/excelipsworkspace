package com.emids.interview;

public class Consturctor_methodDemo {
	int n;

	public Consturctor_methodDemo(int num) {
		n = num;
	}

	public  boolean caluclate() {

		for (int i = 2; i < n; i++) {

			if (n % i == 0) {
				System.out.println("The number is not a prime number:" + n);
				return false;

			}

		}
		System.out.println("The number is a prime number:" + n);
		return true;
		
	}

	public static void main(String[] args) {

		Consturctor_methodDemo c = new Consturctor_methodDemo(14);

		
		System.out.println(c.caluclate());
	}

}
