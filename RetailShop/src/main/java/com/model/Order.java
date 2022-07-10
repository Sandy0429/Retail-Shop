package com.model;

 import javax.validation.constraints.Min;
 import javax.validation.constraints.NotBlank;
 import javax.validation.constraints.NotEmpty;

 
//pojo class with required attributes,getters and setters 
public class Order {
	
	@NotBlank
	@NotEmpty
	private String customerName;
	@NotEmpty
	@NotBlank
	private String contactNumber;
	
	@Min(value=1)
	private int couponCode;
	private String displayType;
	private String brandName;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public int getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(int couponCode) {
		this.couponCode = couponCode;
	}
	
	public String getDisplayType() {
		return displayType;
	}
	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	

}
