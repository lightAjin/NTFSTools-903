package com.nt.main;

public class App {
	public int sum(int x,int y) {
		return x+y;
	}
    public static void main(String[] args) {
        System.out.println("Hello World!");
        App app=new App();
        System.out.println("Sum is amt11::"+app.sum(10, 20));
        //int x=sum(10,20);
    }
}
