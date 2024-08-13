package com.ImageDataBase;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/images")
public class ImageController {
	@Autowired
	private ImageService imageService;

	@PostMapping("/upload")
	public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file) {
		try {
			ImageEntity image = imageService.saveImage(file);
			return ResponseEntity.ok("Image uploaded successfully Image id =" + image.getId());
		} catch (IOException e) {
			return ResponseEntity.status(500).body("Failed to upload image");
		}
	}

	
	
	@GetMapping("/{id}")
	public ResponseEntity<byte[]> getImage(@PathVariable Long id) {
		ImageEntity image = imageService.getImage(id);
		if (image == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().contentType(org.springframework.http.MediaType.IMAGE_JPEG).body(image.getData());
	}
}
