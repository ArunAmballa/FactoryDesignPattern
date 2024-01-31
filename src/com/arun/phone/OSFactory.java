package com.arun.phone;

public class OSFactory {
	
	public OS getInstance(String str)
	{
		if (str.equals("Android"))
		{
			return new Android();
		}
		else
		{
			return new IOS();
		}
	
	}

}
