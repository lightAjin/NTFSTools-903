package com.nt.banking;

import java.util.Random;

public class netBanking {

	public String netBanking(String name,double amount) {
		return "Bank name: "+name+"and Amount sended :"+amount;
	}
	public double checkBalance(String upiId) {
		return new Random().nextInt(12000);
	}
}
