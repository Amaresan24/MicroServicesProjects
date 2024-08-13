package com.Bank.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Bank.Dao.Bank_Dao;
import com.Bank.Entity.Bank;

@Service
public class Bank_Service {
	@Autowired
	Bank_Dao bd;

	public String post_bank(List<Bank> a) {
		// TODO Auto-generated method stub
		return bd.post_bank(a);
	}

	public List<Bank> get_bank() {
		// TODO Auto-generated method stub
		return bd.get_bank();	}

	public String get_branch(String a) {
		// TODO Auto-generated method stub
//		List<Bank> de = bd.get_bank();
//		List<String> branch =   de.stream().filter(X ->X.getIfsc_code().equals(a)).map(X ->X.getBranch()).collect(Collectors.toList());
//		return branch;
//		
		return bd.get_branch(a);
		
	}



}
