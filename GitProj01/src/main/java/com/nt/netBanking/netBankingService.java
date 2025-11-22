package com.nt.netBanking;

import java.util.Random;

public class netBankingService {

	public String openAccount(String aadhar,double initialAmot,String type) {
		return "Account is open with acc number "+new Random().nextLong(50000000000000L);
	}
	
	
	public String closeAccount() {
		return "Account is closed";
	}
}
