package com.capgemini.main;

import java.math.BigDecimal;

import com.capgemini.bean.Customer;
import com.capgemini.bean.Wallet;
import com.capgemini.exception.DupicateMobileNumberException;
import com.capgemini.exception.InsufficientBalanceException;
import com.capgemini.exception.MobilenumberIsNotFoundException;
import com.capgemini.repo.*;
import com.capgemini.service.*;

public class MobileWallet {

	public static void main(String[] args) throws InsufficientBalanceException, DupicateMobileNumberException, MobilenumberIsNotFoundException {
		
		WalletRepoInterface walletRepo = new WalletRepoImpl();
		WalletService walletService = new WalletServiceImplement(walletRepo);
		
		BigDecimal amount1 = new BigDecimal(1000);
		Wallet wallet1 = new Wallet(amount1);
		
		System.out.println(walletService.createAccount("vaibhav", "9598016816", wallet1));
		
		BigDecimal amount2 = new BigDecimal(500);
		Wallet wallet2 = new Wallet(amount2);
		
		System.out.println(walletService.createAccount("himanshu", "9837210311", wallet2));
		
		BigDecimal transferAmount = new BigDecimal(500);
		System.out.println(walletService.fundTransfer("9837210311", "9598016816", transferAmount));


	}

}
