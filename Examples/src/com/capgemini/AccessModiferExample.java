package com.capgemini;

import testpackage.Test;

public class AccessModiferExample {
	
	static class parent {
		public String a;
		protected String b;
		String c;
		private String d;
		parent(String d) {
			a = "a";
			b = "b";
			c = "c";
			this.d = d;
		}
		
		public String getD() {
			return d;
		}
	}
	
	static class child extends parent {
		String e;
		child() {
			super("d");
			e = "e";
		}
	}
	
	
	public static void main(String[] args) {
		child c = new child();
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.c);
		System.out.println(c.getD());
		System.out.println(c.e);
		
		Test test = new Test();
		System.out.println(test.f);
		System.out.println(test.getG());
	}
}
