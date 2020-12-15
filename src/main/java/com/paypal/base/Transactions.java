package com.paypal.base;

public class Transactions {

public Transactions(Amount amount, String description, String custom, 
String invoice_number,
Payment_options payment_options, String soft_descriptor, Item_List 
item_list) {
this.amount = amount;
this.description = description;
this.custom = custom;
this.invoice_number = invoice_number;
this.payment_options = payment_options;
this.soft_descriptor = soft_descriptor;
this.item_list = item_list;
}
public Transactions() {

}
private Amount amount;
public Amount getAmount() {
return amount;
}
public void setAmount(Amount amount) {
this.amount = amount;
}
public String getDescription() {
return description;
}
public void setDescription(String description) {
this.description = description;
}
public String getCustom() {
return custom;
}
public void setCustom(String custom) {
this.custom = custom;
}
public String getInvoice_number() {
return invoice_number;
}
public void setInvoice_number(String invoice_number) {
this.invoice_number = invoice_number;
}
public Payment_options getPayment_options() {
return payment_options;
}
public void setPayment_options(Payment_options payment_options) {
this.payment_options = payment_options;
}
public String getSoft_descriptor() {
return soft_descriptor;
}
public void setSoft_descriptor(String soft_descriptor) {
this.soft_descriptor = soft_descriptor;
}
public Item_List getItem_list() {
return item_list;
}
public void setItem_list(Item_List item_list) {
this.item_list = item_list;
}
private String description;
private String custom;
private String invoice_number;
private Payment_options payment_options;
private String soft_descriptor;
private Item_List item_list;

//response vars
private String[] related_resources;
public String[] getRelated_resources() {
return related_resources;
}
public void setRelated_resources(String[] related_resources) {
this.related_resources = related_resources;
}

}
