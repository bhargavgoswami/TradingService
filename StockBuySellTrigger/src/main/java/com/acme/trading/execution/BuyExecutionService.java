package com.acme.trading.execution;

public interface BuyExecutionService {
	void buy(String security, double price, int volume);
    void sell(String security, double price, int volume);

}
