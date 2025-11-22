package com.nt.netBanking;

import java.util.Random;

public class netBankingService {

	public String openAccount(String aadhar,double initialAmot,String type) {
		return "Account is open with acc number "+new Random().nextLong(50000000000000L);
	}


	
	public String closeAccount() {
		return "Account is closed";
	}
	public String withdraw(long accno,double amt) {
		return amt+" is withdrawn from a/c number::"+accno;
	}
	public String deposit(long accno,double amt) {
		return amt+" is deposit from a/c number::"+accno;
	}

	public String transferMonry(long srcAccno,long descAccno,double amt) {
		
		return "Transferring"+ amt +"from "+srcAccno+" to "+descAccno;

	}
	

}

