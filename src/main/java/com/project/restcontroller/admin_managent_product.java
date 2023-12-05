package com.project.restcontroller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
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

import com.project.bean.Categories;
import com.project.bean.Products;
import com.project.dao.CategoriesDAO;
import com.project.dao.ProductsDAO;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class admin_managent_product {
	@Autowired
	ProductsDAO prodao;
	@Autowired
	CategoriesDAO pro_type_dao;

	@PostMapping("/admin/api/updateproduct")
	public ResponseEntity<Products> updateproduct(@RequestBody Products products) {
		try {
			prodao.save(products);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return ResponseEntity.ok(products);
	}

	@PostMapping("/admin/api/deleteproduct")
	public ResponseEntity<Products> deleteproduct(@RequestBody Products products) {
		try {
			prodao.delete_Product(products.getId());
		} catch (Exception e) {
			ResponseEntity.ok(e);
		}
		return ResponseEntity.ok(products);
	}

	@PostMapping("/admin/api/restoreproduct")
	public ResponseEntity<Products> restoreproduct(@RequestBody Products products) {
		try {
			prodao.restore_Product(products.getId());
		} catch (Exception e) {
			ResponseEntity.ok(e);
		}
		return ResponseEntity.ok(products);
	}

	@PostMapping("/admin/api/uploadfile")
	public static ResponseEntity<String> FileUpload(@RequestParam("file") MultipartFile file) {	
	    try {
	        // Đường dẫn tương đối đến thư mục 'img' trong thư mục 'static/Admin'
	        String relativePath = "src/main/resources/static/assets/img/";

	        // Lấy đường dẫn gốc của ứng dụng
	        File appPath = new File("");

	        // Kết hợp đường dẫn gốc và đường dẫn tương đối
	        String fullPath = Paths.get(appPath.getAbsolutePath(), relativePath).toString();
	        System.out.println(fullPath);
	        // Tạo thư mục nếu chưa tồn tại
	        File directory = new File(fullPath);
	        if (!directory.exists()) {
	            directory.mkdirs();
	        }

	        // Kiểm tra xem file đã tồn tại chưa
	        Path targetPath = Paths.get(fullPath, file.getOriginalFilename());
	        if (Files.exists(targetPath)) {
	            // File đã tồn tại, bỏ qua xử lý
	            return ResponseEntity.status(400).body("File already exists");
	        }

	        // Lưu trữ file
	        Files.copy(file.getInputStream(), targetPath);

	        return ResponseEntity.ok(fullPath);
	    } catch (IOException e) {
	        e.printStackTrace();
	        return ResponseEntity.status(500).body("Failed");
	    }
	}


	@GetMapping("/admin/api/loadproducttype")
	public List<Categories> loadproductype() {
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
