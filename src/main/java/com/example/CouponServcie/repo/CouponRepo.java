package com.example.CouponServcie.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CouponServcie.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long>{

	Coupon findByCode(String code);

}
