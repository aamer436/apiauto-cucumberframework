package com.paypal.base;

public class Items {
public Items(String name, String description, String quantity, String 
price, String tax, String sku,
String currency) {
this.name = name;
this.description = description;
this.quantity = quantity;
this.price = price;
this.tax = tax;
this.sku = sku;
this.currency = currency;
}
//
public Items() {
}
//
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getDescription() {
return description;
}
public void setDescription(String description) {
this.description = description;
}
public String getQuantity() {
return quantity;
}
public void setQuantity(String quantity) {
this.quantity = quantity;
}
public String getPrice() {
return price;
}
public void setPrice(String price) {
this.price = price;
}
public String getTax() {
return tax;
}
public void setTax(String tax) {
this.tax = tax;
}
public String getSku() {
return sku;
}
public void setSku(String sku) {
this.sku = sku;
}
public String getCurrency() {
return currency;
}
public void setCurrency(String currency) {
this.currency = currency;
}
private String name;
private String description;
private String quantity;
private String price;
private String tax;
private String sku;
private String currency;
}
