package com.Bank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Bank.entity.Bank;

public interface BankRepository  extends JpaRepository<Bank, Integer>{
	@Query(value="select branch from bank where ifsc=?",nativeQuery=true)
	public String getall(String a);

	public void save(String a1);
	
	

}
