package com.Junit;

public class Calualtor {
	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub()
	{
		return 34-67;
	}
	public void multi(int y,int c)
	{
		System.out.println(y*c);
	}
	public void div()
	{
		System.out.println(78/2);
	}
	public String rever(String name)
	{
		String name1="";
		for(int i=name.length()-1;i>=0;i--)
		{
			name1=name1+name.charAt(i);
		}
		return name1;
	}

	

}
