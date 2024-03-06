package com.shop.repostiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.entity.shop;

public interface ShopRepository  extends JpaRepository<shop, Integer>{

}
