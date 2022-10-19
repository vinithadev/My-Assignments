package org.system;

public class Desktop extends Computer{
	
	public void desktopSize() {
		
		System.out.println(" Desktop Size : 20inch ");
	}

	public static void main(String[] args) {
		Desktop no=new Desktop();
		no.computerModel();
		no.desktopSize();
		
	}

}
