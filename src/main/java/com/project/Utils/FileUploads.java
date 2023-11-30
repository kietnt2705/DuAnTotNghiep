package com.project.Utils;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.springframework.core.io.AbstractFileResolvingResource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import jakarta.annotation.Resource;

public class FileUploads {
	public static String path = "src\\main\\resources\\static\\Admin\\img";
	
	public static ResponseEntity<File[]> FileUpload(@RequestParam("file") MultipartFile file) {
		File s = new File(path);
		return ResponseEntity.ok(s.listFiles());
	}
	
	public static Boolean FileIsEmpty(String filename) {
		File directory = new File(path);

        if (Arrays.stream(directory.listFiles())
                  .anyMatch(file -> file.isFile() && file.getName().equals(filename))) {
//        	Trả về true nếu file đã tồn tại
            return true;
        } else {
//        	Trả về false nếu file chưa tồn tại
            return false;
        }
	}
	
	public static String getStaticImgPath() {
        ClassPathResource s = new ClassPathResource("static/Admin/img/");
		System.out.println(s);
		return path;
    }
}
