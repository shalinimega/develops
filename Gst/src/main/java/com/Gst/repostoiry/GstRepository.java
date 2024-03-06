package com.Gst.repostoiry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Gst.entity.Gst;

public interface GstRepository extends JpaRepository<Gst, Integer> {
	@Query(value="select percentage from gst where hsn=?",nativeQuery=true)
	public int findhsn(int s);

}
