package com.project.restcontroller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.aspectj.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.project.bean.Product_type;
import com.project.bean.Products;
import com.project.dao.Product_type_DAO;
import com.project.dao.Products_DAO;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class admin_managent_product {
	@Autowired
	HttpServletRequest request;
	@Autowired
	Products_DAO prodao;
	@Autowired
	Product_type_DAO pro_type_dao;

	@PostMapping("/admin/api/createproduct")
	public ResponseEntity<Products> createproduct(@RequestBody Products products) {
		if (products.getIdProduct() != null) {
			if (prodao.findById(products.getIdProduct()).isEmpty()) {
				try {
					prodao.save(products);
				} catch (Exception e) {
					ResponseEntity.ok(e);
				}
			} else {
//			return ResponseEntity.ok("Sản phẩm đã tồn tại");
			}
		} else {
//		return ResponseEntity.ok("Vui lòng điền thông tin");
		}
		return ResponseEntity.ok(products);
	}

	@PostMapping("/admin/api/updateproduct")
	public ResponseEntity<Products> updateproduct(@RequestBody Products products) {
		try {
			System.out.println(products);
			System.out.println(products.getProduct_type());
			prodao.save(products);
		} catch (Exception e) {
//			 return ResponseEntity.ok(e); 
		}
		return ResponseEntity.ok(products);
	}

	@PostMapping("/admin/api/deleteproduct")
	public ResponseEntity<Products> deleteproduct(@RequestBody Products products) {
		try {
			prodao.delete_Product(products.getIdProduct());
		} catch (Exception e) {
			ResponseEntity.ok(e);
		}
		return ResponseEntity.ok(products);
	}

	@PostMapping("/admin/api/restoreproduct")
	public ResponseEntity<Products> restoreproduct(@RequestBody Products products) {
		try {
			prodao.restore_Product(products.getIdProduct());
		} catch (Exception e) {
			ResponseEntity.ok(e);
		}
		return ResponseEntity.ok(products);
	}

	@PostMapping("/admin/api/uploadfile")
	public static ResponseEntity<String> FileUpload(@RequestParam("file") MultipartFile file) {
		
		
		try {
			// Đường dẫn tương đối đến thư mục 'img' trong thư mục 'static/Admin'
			String relativePath = "src/main/resources/static/Admin/img/";

			// Lấy đường dẫn gốc của ứng dụng
//         Cách 1
//			String appPath = System.getProperty("user.dir");
//      Cách 2
     	File appPath = new File("");
//      String appPath= s.getAbsolutePath();

			// Kết hợp đường dẫn gốc và đường dẫn tương đối
			String fullPath = Paths.get(appPath.getAbsolutePath(), relativePath).toString();
			
			// Tạo thư mục nếu chưa tồn tại
			File directory = new File(fullPath);
			if (!directory.exists()) {
				directory.mkdirs();
			}

			// Lưu trữ file
			Path targetPath = Paths.get(fullPath, file.getOriginalFilename());
			Files.copy(file.getInputStream(), targetPath);

			return ResponseEntity.ok(fullPath);
		} catch (IOException e) {
			e.printStackTrace();
			return ResponseEntity.status(500).body("Failed");
		}
	}

	@GetMapping("/admin/api/loadproducttype")
	public List<Product_type> loadproductype() {
		return pro_type_dao.findAll();
	}

	@GetMapping("/admin/api/loadproduct")
	public List<Products> loadproduct() {
		return prodao.getAllProduct();
	}

	@GetMapping("/admin/api/loadproduct_delete")
	public List<Products> loadproduct_delete() {
		return prodao.getAllProduct_delete();
	}
}
