package com.paypal.base;

import java.util.List;

public class PayPal_PaymentObj {


public PayPal_PaymentObj(String intent, Payer payer, List<Transactions> 
transactions, String note_to_payer,
Redirect_urls redirect_urls) {

this.intent = intent;
this.payer = payer;
this.transactions = transactions;
this.note_to_payer = note_to_payer;
this.redirect_urls = redirect_urls;
}
public PayPal_PaymentObj() {
// TODO Auto-generated constructor stub
}
public String getIntent() {
return intent;
}
public void setIntent(String intent) {
this.intent = intent;
}
public Payer getPayer() {
return payer;
}
public void setPayer(Payer payer) {
this.payer = payer;
}
public List<Transactions> getTransactions() {
return transactions;
}
public void setTransactions(List<Transactions> transactions) {
this.transactions = transactions;
}
public String getNote_to_payer() {
return note_to_payer;
}
public void setNote_to_payer(String note_to_payer) {
this.note_to_payer = note_to_payer;
}
public Redirect_urls getRedirect_urls() {
return redirect_urls;
}
public void setRedirect_urls(Redirect_urls redirect_urls) {
this.redirect_urls = redirect_urls;
}
private String intent;
private Payer payer;
private List<Transactions> transactions;
private String note_to_payer;
private Redirect_urls redirect_urls;

//response vars
private String create_time;
public String getCreate_time() {
return create_time;
}
public void setCreate_time(String create_time) {
this.create_time = create_time;
}
public String getId() {
return id;
}
public void setId(String id) {
this.id = id;
}
public String getState() {
return state;
}
public void setState(String state) {
this.state = state;
}
public List<Links> getLinks() {
return links;
}
public void setLinks(List<Links> links) {
this.links = links;
}
private String id;
private String state;
private List<Links> links;

}
