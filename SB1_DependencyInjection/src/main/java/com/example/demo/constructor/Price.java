package com.example.demo.constructor;

import org.springframework.stereotype.Component;

@Component
public class Price {

	private int totalPrize;

	public int getTotalPrize() {
		return totalPrize;
	}

	public void setTotalPrize(int totalPrize) {
		this.totalPrize = totalPrize;
	}
	
	
}
