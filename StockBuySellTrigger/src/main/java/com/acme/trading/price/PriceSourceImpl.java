package com.acme.trading.price;

import java.util.HashMap;

public class PriceSourceImpl implements PriceSource {

	private PriceListener listener;
	private HashMap<String,Double> stock = new HashMap<>();
	private Double price;
	private boolean priceChanged;
	private String security;
	@Override
	public void addPriceListener(PriceListener listener) {
		
		this.listener = listener;
	}

	@Override
	public void removePriceListener(PriceListener listener) {
		this.listener = null;
	}
	
	
	public void notifyPriceListener(){
		if(!priceChanged )
			return;
		if(!priceChanged && security == "IBM"){
			this.priceChanged = false;
			listener.priceUpdate(security, stock.get(security));
		}	
	}
	
	public void priceChangeEvent(String security,double price){
		if(stock.containsKey(security)){
			stock.put(security, price);
		//this.price = price;
		//this.security = security;
		this.priceChanged = true;
		notifyPriceListener();
		}
	}
	
	

	public PriceListener getListener() {
		return listener;
	}

	public void setListener(PriceListener listener) {
		this.listener = listener;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public boolean isPriceHitThreshold() {
		return priceChanged;
	}

	public void setPriceHitThreshold(boolean priceChanged) {
		this.priceChanged = priceChanged;
	}

	public String getSecurity() {
		return security;
	}

	public void setSecurity(String security) {
		this.security = security;
	}

}
