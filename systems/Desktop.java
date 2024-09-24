package org.systems;

public class Desktop extends Computer {
	public void desktopsize() {
		System.out.println("Linux");
	}

	public static void main(String[] args) {
		Desktop obj = new Desktop();
		obj.computermodel();
		obj.desktopsize();
	}

}


