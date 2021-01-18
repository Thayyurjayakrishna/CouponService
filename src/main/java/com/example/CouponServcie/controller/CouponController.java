package com.example.CouponServcie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CouponServcie.model.Coupon;
import com.example.CouponServcie.repo.CouponRepo;

@RestController
@RequestMapping(value = "/couponApi")
public class CouponController {
	
	@Autowired
	private CouponRepo repo;

	@PostMapping("/coupons")
	public Coupon create(@RequestBody Coupon c) {
		
		return repo.save(c);
		
	}
	
	@GetMapping("/coupon/{code}")
	public Coupon getCoupon(@PathVariable String code) {
		return repo.findByCode(code);
	}

}
