package com.capgemini.repo;

import com.capgemini.bean.Customer;

public interface WalletRepoInterface {

	boolean save(Customer Customer);

	Customer findOne(String mobileNo);

}