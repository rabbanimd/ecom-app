package com.cortes.spring.flipkart.model;

import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("products")
public class Product {

	@Id
	private String id;
	private String actual_price, average_rating, brand, category, crawled_at, description, discount;
	private List<String> images;
	private boolean out_of_stock;
	private String pid;
//	private ProductDetails product_details;
	private List<Map<String,String>> product_details;
	private String seller,selling_price,sub_category,title,url;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getActual_price() {
		return actual_price;
	}
	public void setActual_price(String actual_price) {
		this.actual_price = actual_price;
	}
	public String getAverage_rating() {
		return average_rating;
	}
	public void setAverage_rating(String average_rating) {
		this.average_rating = average_rating;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCrawled_at() {
		return crawled_at;
	}
	public void setCrawled_at(String crawled_at) {
		this.crawled_at = crawled_at;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public List<String> getImages() {
		return images;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}
	public boolean isOut_of_stock() {
		return out_of_stock;
	}
	public void setOut_of_stock(boolean out_of_stock) {
		this.out_of_stock = out_of_stock;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
//	public ProductDetails getProduct_details() {
//		return product_details;
//	}
//	public void setProduct_details(ProductDetails product_details) {
//		this.product_details = product_details;
//	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	public String getSelling_price() {
		return selling_price;
	}
	public void setSelling_price(String selling_price) {
		this.selling_price = selling_price;
	}
	public String getSub_category() {
		return sub_category;
	}
	public void setSub_category(String sub_category) {
		this.sub_category = sub_category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", actual_price=" + actual_price + ", average_rating=" + average_rating
				+ ", brand=" + brand + ", category=" + category + ", crawled_at=" + crawled_at + ", description="
				+ description + ", discount=" + discount + ", images=" + images + ", out_of_stock=" + out_of_stock
				+ ", pid=" + pid + ", seller=" + seller + ", selling_price="
				+ selling_price + ", sub_category=" + sub_category + ", title=" + title + ", url=" + url + "]";
	}
	
	
}
