package com.Bank.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Bank.Entity.Bank;

public interface Bank_Repo extends JpaRepository<Bank, Integer> {
	@Query(value = "select branch from bank.bank_details where ifsc_code = ?", nativeQuery = true)
	public String get_branch(String a);

}
