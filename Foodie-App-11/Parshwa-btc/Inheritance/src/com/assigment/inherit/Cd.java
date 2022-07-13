package com.assigment.inherit;

public class Cd extends Medialteam {

	private String artist;
	private String genre;

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Cd(int identification_number, int num_of_copies, String artist, String genre) {
		super(identification_number, num_of_copies);
		this.artist = artist;
		this.genre = genre;
	}

	@Override
	public void print() {
		System.out.println("the cd is printed");
	}

	@Override
	public void checkIn() {
		System.out.println("cd check in");
	}

	@Override
	public void checkOut() {
		System.out.println("cd is checked out");
	}

	@Override
	public void addItem() {
		System.out.println("the cd is added");
	}

}
