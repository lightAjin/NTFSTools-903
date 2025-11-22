package com.nt.upi;

import java.util.Random;

public class upiPayment {

	public String doUpiPayment(String upiId,double amount) {
		return "UPI Payment for amount "+amount +"is done";
	}
	
	public double checkBalance(String upiId) {
		return new Random().nextInt(12000);
	}
}
