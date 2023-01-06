package com.human.seoulroad.othercourse;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

//create table seoul_trails as select * from csvread('C:\Users\h\Desktop\g\SeoulWalk\src\main\resources\서울 두드림길 정보.csv');


@Repository
public interface OtherCourseRepository extends JpaRepository<OtherCourse, String>{
	
	// JPA 기본 메서드 (참고 : https://frogand.tistory.com/22)
	// 따라서 쿼리문을 짜주지 않아도 findAll이란 예약어를 통해 모든 데이터를 찾아서 보내줌
//	@Query(value = "SELECT * FROM SEOUL_TRAILS", nativeQuery = true)
	List<OtherCourse> findAll();
	
	
	/* 추가된코드 */
	// searchGangbok이란 이름의 메서드를 정의
	// 네이티브 쿼리 - Service를 통해 받아온 파라미터 todb(강북) 과 같은 문자열을 찾음 
//	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb%)", nativeQuery = true)
//	public List<OtherCourse> searchGangbokOrGangnam(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%노원구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 5.0) and (ESTIMATED_DURATION between 0 and 120) ", nativeQuery = true)
	public List<OtherCourse> search01(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%도봉구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 5.0) and (ESTIMATED_DURATION between 0 and 120) ", nativeQuery = true)
	public List<OtherCourse> search02(@Param("todb")String todb);
	/* 추가된코드 */
	
}