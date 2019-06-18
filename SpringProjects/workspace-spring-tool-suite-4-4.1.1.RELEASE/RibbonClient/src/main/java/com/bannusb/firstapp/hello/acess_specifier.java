package com.bannusb.firstapp.hello;

public class acess_specifier{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ac a =new ac();
		a.cal(2, 3);
		//System.out.println(a.x +"" +a.y);
		
	}

}

class ac{
	public int x;
	private int y;
	void cal(int a, int b)
	{
		x=a+1;
		y=b;
	}
}