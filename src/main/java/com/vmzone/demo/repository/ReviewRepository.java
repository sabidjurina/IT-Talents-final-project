package com.vmzone.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vmzone.demo.models.Product;
import com.vmzone.demo.models.Review;
import com.vmzone.demo.models.User;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
	Review findById(long id);
}
