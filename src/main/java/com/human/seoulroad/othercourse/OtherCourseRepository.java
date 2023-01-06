package com.human.seoulroad.othercourse;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

//create table seoul_trails as select * from csvread('C:\Users\h\Desktop\g\SeoulWalk\src\main\resources\서울 두드림길 정보.csv');


@Repository
public interface OtherCourseRepository extends JpaRepository<OtherCourse, String>{
	
	@Query(value = "SELECT * FROM SEOUL_TRAILS", nativeQuery = true)
	List<OtherCourse> findAll();
}
