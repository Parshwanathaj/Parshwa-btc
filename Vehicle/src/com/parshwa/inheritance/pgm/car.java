package com.parshwa.inheritance.pgm;

public class car extends vechicles
{
private String musicSystem;
public void paly()
{
	System.out.println("car have the music system");
}
public String getMusicSystem() {
	return musicSystem;
}
public void setMusicSystem(String musicSystem) {
	this.musicSystem = musicSystem;
}}