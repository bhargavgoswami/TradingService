package com.acme.trading.price;

public interface PriceListener {
	void priceUpdate(String security, double price);
}
