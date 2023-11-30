package com.project.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.bean.Accounts;
import com.project.bean.Products;
import com.project.dao.Account_DAO;

@RestController
public class admin_managent_user {
	@Autowired
	Account_DAO ac_dao;
	
	@PostMapping("/admin/api/updateaccount")
	public ResponseEntity<Accounts> updateaccount(@RequestBody Accounts account )  {
			try {
				ac_dao.save(account);
			} catch (Exception e) {
//				 return ResponseEntity.ok(e); 
			}
		return ResponseEntity.ok(account);
	}
	
	@PostMapping("/admin/api/deleteaccount")
	public ResponseEntity<Accounts> deleteaccount(@RequestBody Accounts account) {
		try {
			ac_dao.delete_Account(account.getIdAccount());
		} catch (Exception e) {
			ResponseEntity.ok(e);
		}
		return ResponseEntity.ok(account);
	}
	
	@PostMapping("/admin/api/restoreaccount")
	public ResponseEntity<Accounts> restoreaccount(@RequestBody Accounts account) {
		try {
			ac_dao.restore_Account(account.getIdAccount());
		} catch (Exception e) {
			ResponseEntity.ok(e);
		}
		return ResponseEntity.ok(account);
	}
	
	@GetMapping("/admin/api/loadaccount")
	public List<Accounts> loadproduct() {
		return ac_dao.getAllAccounts();
	}
	
	@GetMapping("/admin/api/loadaccount_delete")
	public List<Accounts> loadproduct_delete() {
		return ac_dao.getAllAccounts_delete();
	}
}
