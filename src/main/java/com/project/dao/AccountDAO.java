package com.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.bean.Accounts;

public interface AccountDAO extends JpaRepository<Accounts, Integer>{
	@Query(value = "SELECT       Accounts.*\r\n"
			+ "FROM            Accounts\r\n"
			+ "WHERE        (DeleteStatus = 0)",nativeQuery = true)
	public List<Accounts> getAllAccounts();
	
	@Query(value = "SELECT       Accounts.*\r\n"
			+ "FROM            Accounts\r\n"
			+ "WHERE        (DeleteStatus = 1)",nativeQuery = true)
	public List<Accounts> getAllAccounts_delete();
	
	@Query(value = "UPDATE      Accounts\r\n"
			+ "SET                DeleteStatus = 1\r\n"
			+ "WHERE        (id = ?1)",nativeQuery = true)
	public void delete_Account(Integer AccountId);
	
	@Query(value = "UPDATE      Accounts\r\n"
			+ "SET                DeleteStatus = 0\r\n"
			+ "WHERE        (id = ?1)",nativeQuery = true)
	public void restore_Account(Integer AccountId);
	
	@Query(value = "SELECT COUNT(id) as count_accounts\r\n"
			+ "FROM Accounts",nativeQuery = true)
	public Integer get_count_accounts();
}
