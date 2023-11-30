package com.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.bean.Voucher;

public interface VoucherDAO extends JpaRepository<Voucher, Integer>{
	@Query(value = "SELECT       Voucher.*\r\n"
			+ "FROM            Voucher\r\n"
			+ "WHERE        (DeleteStatus = 0)",nativeQuery = true)
	public List<Voucher> getallvoucher();
	
	@Query(value = "SELECT       Voucher.*\r\n"
			+ "FROM            Voucher\r\n"
			+ "WHERE        (DeleteStatus = 1)",nativeQuery = true)
	public List<Voucher> getallvouche_delete();
	
	@Query(value = "UPDATE      Voucher\r\n"
			+ "SET                DeleteStatus = 1\r\n"
			+ "WHERE        (Id = ?1)",nativeQuery = true)
	public void delete_Voucher(Integer voucherid);
	
	@Query(value = "UPDATE      Voucher\r\n"
			+ "SET                DeleteStatus = 0\r\n"
			+ "WHERE        (Id = ?1)",nativeQuery = true)
	public void restore_Voucher2(Integer voucherid);
	
}
