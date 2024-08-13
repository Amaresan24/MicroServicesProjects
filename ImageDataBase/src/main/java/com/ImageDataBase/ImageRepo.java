package com.ImageDataBase;

import org.springframework.data.jpa.repository.JpaRepository;




public interface ImageRepo extends JpaRepository<ImageEntity, Long> {
}
