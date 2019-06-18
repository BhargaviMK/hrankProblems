package com.bannusb.firstapp.hello;

 class static_use  {

	static int x;
	static int y;
	void add(int a, int b) {
		x=a+b;
		y=x+b;
		
	}
}

 public class static_out{
	public static void main(String[] args) {
		static_use o1 = new static_use();
		static_use o2 = new static_use();
		int a=2;
		o1.add(a,a+1);
		o2.add(5, a);
		System.out.println(o1.x + "" + o2.y);
	}
}
