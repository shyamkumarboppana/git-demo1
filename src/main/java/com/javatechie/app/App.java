package com.javatechie.app;

public class App {
	
	public void addData(String name) {
		System.out.println("name: " + name);
		if (name.equals(Constant.APP_DATA)) {
			System.out.println("welcome");
		}
	}
	
	public void newMethod(String data)
	{
		System.out.println("data: " + data);
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World");
	}

}
