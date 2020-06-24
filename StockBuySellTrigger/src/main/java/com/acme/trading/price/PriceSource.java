package com.acme.trading.price;

public interface PriceSource {
	void addPriceListener(PriceListener listener);
    void removePriceListener(PriceListener listener);

}
