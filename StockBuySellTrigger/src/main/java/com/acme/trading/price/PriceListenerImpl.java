package com.acme.trading.price;

import com.acme.trading.execution.BuyExecutionService;

public class PriceListenerImpl implements PriceListener {

	private String security;
	private PriceSource source;
	private double price;
	private BuyExecutionService exService;
	
	
	
	@Override
	public void priceUpdate(String security, double price) {
		
		this.security= security;
		this.price = price;
		
		if(this.price <50){
			exService.buy(security, price, 50);
			System.out.println("50 shares bought at price: "+price);
		}
		if(this.price >100){
			exService.sell(security, price, 50);
			System.out.println("50 shares sold at price: "+price);
		}	
		
	}
	
	
	public String getSecurity() {
		return security;
	}
	public void setSecurity(String security) {
		this.security = security;
	}
	public PriceSource getSource() {
		return source;
	}
	public void setSource(PriceSource source) {
		this.source = source;
	}

}
