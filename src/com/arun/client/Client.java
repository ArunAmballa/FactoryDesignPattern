package com.arun.client;
import com.arun.phone.*;

public class Client {
	
	public static void main(String args[])
	{
		OSFactory obj=new OSFactory();
		OS android=obj.getInstance("Android");
		android.spec();
	}

}
