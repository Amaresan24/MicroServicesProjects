package com.ImageDataBase;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ImageService {
	@Autowired
	private ImageRepo imageRepository;

	public ImageEntity saveImage(MultipartFile file) throws IOException {
		ImageEntity image = new ImageEntity();
		image.setName(file.getOriginalFilename());
		image.setData(file.getBytes());
		return imageRepository.save(image);
	}

	public ImageEntity getImage(Long id) {
		return imageRepository.findById(id).orElse(null);
	}
}
