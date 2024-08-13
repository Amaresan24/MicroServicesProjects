package com.Bank.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Bank.Entity.Bank;
import com.Bank.Repo.Bank_Repo;


@Repository
public class Bank_Dao {
	@Autowired
	Bank_Repo br;

	public String post_bank(List<Bank> a) {
		// TODO Auto-generated method stub
		br.saveAll(a);
		return "----- your bank details saved succesfully on our databse ----";
	}

	public List<Bank> get_bank() {
		// TODO Auto-generated method stub
		return br.findAll();
	}

	public String get_branch(String a) {
		// TODO Auto-generated method stub
		return br.get_branch(a);
	}

	

}
