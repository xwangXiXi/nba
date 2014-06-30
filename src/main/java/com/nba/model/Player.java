package com.nba.model;

import java.io.Serializable;

public class Player implements Serializable{
	
	/**
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private int team_id;
	private String play_name;
	private String play_stature;
	private String play_age;
	private String play_position;
	private double play_salary;
	private int play_state;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTeam_id() {
		return team_id;
	}
	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}
	public String getPlay_name() {
		return play_name;
	}
	public void setPlay_name(String play_name) {
		this.play_name = play_name;
	}
	public String getPlay_stature() {
		return play_stature;
	}
	public void setPlay_stature(String play_stature) {
		this.play_stature = play_stature;
	}
	public String getPlay_age() {
		return play_age;
	}
	public void setPlay_age(String play_age) {
		this.play_age = play_age;
	}
	public String getPlay_position() {
		return play_position;
	}
	public void setPlay_position(String play_position) {
		this.play_position = play_position;
	}
	public double getPlay_salary() {
		return play_salary;
	}
	public void setPlay_salary(double play_salary) {
		this.play_salary = play_salary;
	}
	public int getPlay_state() {
		return play_state;
	}
	public void setPlay_state(int play_state) {
		this.play_state = play_state;
	}

}
