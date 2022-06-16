package com.parshwa.inheritance.pgm;

public class VehicleMain 
{
public static void main(String [] args)
{
	bus b =new bus();
	b.setCapacity(60);
	System.out.println(b.getCapacity());
	b.regno="12345";
	b.name="Benz";
	System.out.println(b.regno);
	System.out.println(b.name);
	
	car c = new car();
	c.paly();
	c.setMusicSystem("JBL music system");
	System.out.println(c.getMusicSystem());
	//System.out.println(c.regno);
	//System.out.println(c.name);
	
	bike b1=new bike();
	b1.acclerate();
}
}