package com.project.restcontroller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.bean.Voucher;
import com.project.dao.VoucherDAO;

@RestController
public class admin_managent_voucher {
	@Autowired
	VoucherDAO dao;
	
	@GetMapping("/admin/api/getallvoucherdeleted")
	public List<Voucher> getallvoucherdeleted(){
		return dao.getallvouche_delete();
	}
	
	@GetMapping("/admin/api/getallvoucher")
	public List<Voucher> getallvoucher(){
		return dao.getallvoucher();
	}
	
	@PostMapping("/admin/api/savevoucher")
	public ResponseEntity<Voucher> save(@RequestBody Voucher voucher){
		voucher.setStartvoucher(formatdate(voucher.getStartvoucher()));
		voucher.setEndvoucher(formatdate(voucher.getEndvoucher()));
		try {
			dao.save(voucher);
		} catch (Exception e) {
			ResponseEntity.ok(e);
		}
		return ResponseEntity.ok(voucher);
	}
	
	@PostMapping("/admin/api/deletevoucher")
	public ResponseEntity<Voucher> deleteproduct(@RequestBody Voucher Voucher) {
		try {
			dao.delete_Voucher(Voucher.getId());
		} catch (Exception e) {
			ResponseEntity.ok(e);
		}
		return ResponseEntity.ok(Voucher);
	}

	@PostMapping("/admin/api/restorevoucher")
	public ResponseEntity<Voucher> restore(@RequestBody Voucher Voucher) {
		System.out.println("so/l "+Voucher+"");
		dao.restore_Voucher2(Voucher.getId());
		return ResponseEntity.ok(Voucher);
	}
	
	public Date formatdate(java.util.Date date) {
		Date s = new Date(date.getYear(),date.getMonth(),date.getDate());
		System.out.println(s);
		return s;
	}
}
