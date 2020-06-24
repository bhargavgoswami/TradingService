package com.acme.trading.strategy;

import com.acme.trading.price.PriceListener;
import com.acme.trading.price.PriceListenerImpl;
import com.acme.trading.price.PriceSource;
import com.acme.trading.price.PriceSourceImpl;

public class TradingServiceStrategy {

	public static void main(String[] args) {
		PriceSourceImpl source = new PriceSourceImpl();
		
		PriceListener listener = new PriceListenerImpl();
		
		source.addPriceListener(listener);
		
		
		source.priceChangeEvent("IBM",67.00);
	}

}
