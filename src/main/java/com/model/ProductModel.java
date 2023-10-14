package com.model;

import java.util.ArrayList;

public class ProductModel {
	private int psno;
	private String category;
	private String name;
	private String intro;
	private String image;
	private float quantity;
	private float price;
	private boolean stock;
	private float weight;
	private String description;
	public ProductModel(int psno, String category, String name, String intro, String image, float quantity, float price,
			boolean stock, float weight, String description) {
		super();
		this.psno = psno;
		this.category = category;
		this.name = name;
		this.intro = intro;
		this.image = image;
		this.quantity = quantity;
		this.price = price;
		this.stock = stock;
		this.weight = weight;
		this.description = description;
	}
	public int getPsno() {
		return psno;
	}
	public void setPsno(int psno) {
		this.psno = psno;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public boolean isStock() {
		return stock;
	}
	public void setStock(boolean stock) {
		this.stock = stock;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "ProductModel [psno=" + psno + ", category=" + category + ", name=" + name + ", intro=" + intro
				+ ", image=" + image + ", quantity=" + quantity + ", price=" + price + ", stock=" + stock + ", weight="
				+ weight + ", description=" + description + "]";
	}


}
