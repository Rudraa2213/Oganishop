package com.model;

public class Review {

	private String userImage;
	private String userName;
	private String feedback;
	private float rate;
	
	public String getUserImage() {
		return userImage;
	}
	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	
	public Review(String userImage, String userName, String feedback, float rate) {
		super();
		this.userImage = userImage;
		this.userName = userName;
		this.feedback = feedback;
		this.rate = rate;
	}
}
