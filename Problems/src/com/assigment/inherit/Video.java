package com.assigment.inherit;

public class Video extends Medialteam {
	private String director;
	private String genre;
	private int year;

	public Video(int identification_number, int num_of_copies, String director, String genre, int year) {
		super(identification_number, num_of_copies);
		this.director = director;
		this.genre = genre;
		this.year = year;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public void print() {
		System.out.println("video");
	}

	@Override
	public void checkIn() {
		System.out.println("the video is released on " + this.year);
	}

	@Override
	public void checkOut() {
		System.out.println("the video is checked out of video");
	}

	@Override
	public void addItem() {
		System.out.println("the item is added of video");
	}

}