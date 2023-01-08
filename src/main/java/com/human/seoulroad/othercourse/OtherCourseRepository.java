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
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%노원구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search01(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%노원구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search02(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%노원구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search03(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%노원구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search04(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%노원구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search05(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%노원구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search06(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%노원구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search07(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%노원구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search08(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%노원구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search09(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%노원구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search10(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%노원구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search11(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%노원구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search12(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%노원구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search13(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%노원구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search14(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%노원구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search15(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%노원구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search16(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%노원구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search17(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%노원구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search18(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%노원구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search19(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%노원구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search20(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%노원구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search21(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%노원구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search22(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%노원구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search23(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%노원구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search24(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%노원구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search25(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%노원구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search26(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%노원구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search27(@Param("todb")String todb);
	
	
	
	
	
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%도봉구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search28(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%도봉구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search29(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%도봉구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search30(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%도봉구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search31(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%도봉구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search32(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%도봉구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search33(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%도봉구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search34(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%도봉구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search35(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%도봉구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search36(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%도봉구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search37(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%도봉구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search38(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%도봉구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search39(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%도봉구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search40(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%도봉구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search41(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%도봉구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search42(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%도봉구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search43(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%도봉구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search44(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%도봉구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search45(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%도봉구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search46(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%도봉구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search47(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%도봉구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search48(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%도봉구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search49(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%도봉구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search50(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%도봉구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search51(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%도봉구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search52(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%도봉구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search53(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%도봉구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search54(@Param("todb")String todb);
	
	
	
	
	
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%강북구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search55(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%강북구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search56(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%강북구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search57(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%강북구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search58(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%강북구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search59(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%강북구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search60(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%강북구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search61(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%강북구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search62(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%강북구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search63(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%강북구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search64(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%강북구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search65(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%강북구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search66(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%강북구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search67(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%강북구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search68(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%강북구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search69(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%강북구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search70(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%강북구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search71(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%강북구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search72(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%강북구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search73(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%강북구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search74(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%강북구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search75(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%강북구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search76(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%강북구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search77(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%강북구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search78(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%강북구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search79(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%강북구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search80(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%강북구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search81(@Param("todb")String todb);
	
	
	
	
	
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%광진구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search82(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%광진구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search83(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%광진구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search84(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%광진구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search85(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%광진구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search86(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%광진구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search87(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%광진구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search88(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%광진구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search89(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%광진구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search90(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%광진구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search91(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%광진구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search92(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%광진구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search93(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%광진구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search94(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%광진구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search95(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%광진구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search96(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%광진구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search97(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%광진구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search98(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%광진구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search99(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%광진구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search100(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%광진구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search101(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%광진구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search102(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%광진구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search103(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%광진구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search104(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%광진구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search105(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%광진구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search106(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%광진구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search107(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%광진구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search108(@Param("todb")String todb);
	
	
	
	
	
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%동대문구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search109(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%동대문구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search110(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%동대문구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search111(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%동대문구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search112(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%동대문구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search113(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%동대문구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search114(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%동대문구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search115(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%동대문구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search116(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%동대문구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search117(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%동대문구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search118(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%동대문구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search119(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%동대문구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search120(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%동대문구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search121(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%동대문구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search122(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%동대문구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search123(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%동대문구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search124(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%동대문구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search125(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%동대문구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search126(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%동대문구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search127(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%동대문구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search128(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%동대문구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search129(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%동대문구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search130(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%동대문구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search131(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%동대문구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search132(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%동대문구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search133(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%동대문구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search134(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%동대문구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search135(@Param("todb")String todb);
	
	
	
	
	
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%마포구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search136(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%마포구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search137(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%마포구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search138(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%마포구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search139(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%마포구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search140(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%마포구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search141(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%마포구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search142(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%마포구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search143(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%마포구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search144(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%마포구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search145(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%마포구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search146(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%마포구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search147(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%마포구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search148(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%마포구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search149(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%마포구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search150(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%마포구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search151(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%마포구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search152(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%마포구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search153(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%마포구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search154(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%마포구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search155(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%마포구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search156(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%마포구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search157(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%마포구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search158(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%마포구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search159(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%마포구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search160(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%마포구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search161(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%마포구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search162(@Param("todb")String todb);
	
	
	
	
	
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%서대문구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search163(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%서대문구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search164(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%서대문구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search165(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%서대문구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search166(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%서대문구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search167(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%서대문구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search168(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%서대문구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search169(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%서대문구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search170(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%서대문구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search171(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%서대문구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search172(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%서대문구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search173(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%서대문구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search174(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%서대문구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search175(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%서대문구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search176(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%서대문구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search177(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%서대문구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search178(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%서대문구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search179(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%서대문구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search180(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%서대문구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search181(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%서대문구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search182(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%서대문구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search183(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%서대문구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search184(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%서대문구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search185(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%서대문구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search186(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%서대문구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search187(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%서대문구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search188(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%서대문구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search189(@Param("todb")String todb);
	
	
	
	
	
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성동구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search190(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성동구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search191(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성동구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search192(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성동구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search193(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성동구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search194(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성동구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search195(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성동구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search196(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성동구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search197(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성동구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search198(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성동구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search199(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성동구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search200(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성동구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search201(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성동구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search202(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성동구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search203(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성동구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search204(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성동구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search205(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성동구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search206(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성동구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search207(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성동구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search208(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성동구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search209(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성동구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search210(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성동구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search211(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성동구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search212(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성동구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search213(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성동구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search214(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성동구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search215(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성동구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search216(@Param("todb")String todb);
	
	
	
	
	
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성북구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search217(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성북구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search218(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성북구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search219(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성북구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search220(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성북구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search221(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성북구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search222(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성북구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search223(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성북구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search224(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성북구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search225(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성북구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search226(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성북구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search227(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성북구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search228(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성북구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search229(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성북구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search230(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성북구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search231(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성북구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search232(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성북구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search233(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성북구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search234(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성북구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search235(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성북구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search236(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성북구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search237(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성북구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search238(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성북구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search239(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성북구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search240(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성북구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search241(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성북구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search242(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%성북구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search243(@Param("todb")String todb);
	
	
	
	
	
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%용산구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search244(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%용산구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search245(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%용산구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search246(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%용산구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search247(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%용산구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search248(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%용산구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search249(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%용산구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search250(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%용산구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search251(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%용산구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search252(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%용산구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search253(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%용산구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search254(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%용산구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search255(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%용산구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search256(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%용산구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search257(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%용산구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search258(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%용산구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search259(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%용산구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search260(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%용산구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search261(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%용산구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search262(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%용산구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search263(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%용산구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search264(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%용산구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search265(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%용산구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search266(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%용산구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search267(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%용산구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search268(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%용산구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search269(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%용산구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search270(@Param("todb")String todb);
	
	
	
	
	
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%은평구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search271(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%은평구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search272(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%은평구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search273(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%은평구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search274(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%은평구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search275(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%은평구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search276(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%은평구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search277(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%은평구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search278(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%은평구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search279(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%은평구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search280(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%은평구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search281(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%은평구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search282(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%은평구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search283(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%은평구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search284(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%은평구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search285(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%은평구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search286(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%은평구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search287(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%은평구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search288(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%은평구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search289(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%은평구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search290(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%은평구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search291(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%은평구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search292(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%은평구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search293(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%은평구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search294(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%은평구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search295(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%은평구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search296(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%은평구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search297(@Param("todb")String todb);
	
	
	
	
	
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%종로구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search298(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%종로구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search299(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%종로구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search300(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%종로구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search301(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%종로구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search302(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%종로구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search303(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%종로구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search304(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%종로구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search305(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%종로구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search306(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%종로구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search307(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%종로구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search308(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%종로구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search309(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%종로구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search310(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%종로구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search311(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%종로구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search312(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%종로구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search313(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%종로구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search314(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%종로구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search315(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%종로구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search316(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%종로구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search317(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%종로구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search318(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%종로구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search319(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%종로구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search320(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%종로구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search321(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%종로구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search322(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%종로구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search323(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%종로구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search324(@Param("todb")String todb);
	
	
	
	
	
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search325(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search326(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search327(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search328(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search329(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search330(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search331(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search332(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search333(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search334(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search335(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search336(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search337(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search338(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search339(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search340(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search341(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search342(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search343(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search344(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search345(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search346(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search347(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search348(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search349(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search350(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search351(@Param("todb")String todb);
	
	
	
	
	
	
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중랑구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search352(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중랑구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search353(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중랑구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search354(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중랑구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search355(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중랑구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search356(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중랑구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search357(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중랑구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search358(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중랑구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search359(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중랑구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search360(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중랑구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search361(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중랑구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search362(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중랑구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search363(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중랑구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search364(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중랑구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search365(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중랑구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search366(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중랑구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search367(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중랑구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search368(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중랑구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search369(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중랑구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search370(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중랑구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search371(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중랑구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search372(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중랑구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search373(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중랑구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search374(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중랑구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search375(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중랑구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search376(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중랑구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search377(@Param("todb")String todb);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb% and COURSE_BOROUGH LIKE '%중랑구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search378(@Param("todb")String todb);
	
	
	
	
	
	
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강남구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search379(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강남구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search380(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강남구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search381(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강남구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search382(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강남구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search383(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강남구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search384(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강남구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search385(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강남구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search386(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강남구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search387(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강남구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search388(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강남구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search389(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강남구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search390(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강남구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search391(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강남구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search392(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강남구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search393(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강남구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search394(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강남구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search395(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강남구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search396(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강남구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search397(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강남구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search398(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강남구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search399(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강남구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search400(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강남구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search401(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강남구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search402(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강남구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search403(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강남구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search404(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강남구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search405(@Param("todb2")String todb2);
	
	
	
	
	
	
	
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강동구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search406(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강동구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search407(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강동구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search408(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강동구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search409(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강동구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search410(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강동구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search411(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강동구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search412(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강동구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search413(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강동구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search414(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강동구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search415(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강동구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search416(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강동구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search417(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강동구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search418(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강동구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search419(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강동구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search420(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강동구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search421(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강동구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search422(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강동구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search423(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강동구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search424(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강동구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search425(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강동구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search426(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강동구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search427(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강동구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search428(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강동구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search429(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강동구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search430(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강동구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search431(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강동구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search432(@Param("todb2")String todb2);
	
	
	
	
	
	
	
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강서구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search433(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강서구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search434(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강서구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search435(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강서구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search436(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강서구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search437(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강서구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search438(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강서구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search439(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강서구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search440(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강서구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search441(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강서구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search442(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강서구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search443(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강서구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search444(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강서구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search445(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강서구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search446(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강서구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search447(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강서구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search448(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강서구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search449(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강서구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search450(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강서구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search451(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강서구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search452(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강서구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search453(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강서구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search454(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강서구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search455(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강서구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search456(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강서구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search457(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강서구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search458(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%강서구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search459(@Param("todb2")String todb2);
	
	
	
	
	
	
	
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%관악구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search460(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%관악구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search461(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%관악구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search462(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%관악구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search463(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%관악구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search464(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%관악구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search465(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%관악구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search466(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%관악구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search467(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%관악구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search468(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%관악구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search469(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%관악구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search470(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%관악구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search471(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%관악구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search472(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%관악구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search473(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%관악구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search474(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%관악구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search475(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%관악구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search476(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%관악구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search477(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%관악구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search478(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%관악구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search479(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%관악구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search480(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%관악구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search481(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%관악구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search482(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%관악구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search483(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%관악구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search484(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%관악구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search485(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%관악구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search486(@Param("todb2")String todb2);
	
	
	
	
	
	
	
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%구로구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search487(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%구로구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search488(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%구로구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search489(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%구로구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search490(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%구로구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search491(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%구로구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search492(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%구로구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search493(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%구로구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search494(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%구로구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search495(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%구로구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search496(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%구로구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search497(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%구로구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search498(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%구로구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search499(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%구로구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search500(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%구로구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search501(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%구로구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search502(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%구로구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search503(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%구로구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search504(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%구로구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search505(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%구로구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search506(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%구로구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search507(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%구로구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search508(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%구로구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search509(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%구로구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search510(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%구로구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search511(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%구로구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search512(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%구로구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search513(@Param("todb2")String todb2);
	
	
	
	
	
	
	
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%금천구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search514(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%금천구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search515(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%금천구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search516(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%금천구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search517(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%금천구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search518(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%금천구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search519(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%금천구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search520(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%금천구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search521(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%금천구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search522(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%금천구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search523(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%금천구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search524(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%금천구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search525(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%금천구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search526(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%금천구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search527(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%금천구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search528(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%금천구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search529(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%금천구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search530(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%금천구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search531(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%금천구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search532(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%금천구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search533(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%금천구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search534(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%금천구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search535(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%금천구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search536(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%금천구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search537(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%금천구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search538(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%금천구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search539(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%금천구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search540(@Param("todb2")String todb2);
	
	
	
	
	
	
	
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%동작구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search541(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%동작구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search542(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%동작구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search543(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%동작구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search544(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%동작구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search545(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%동작구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search546(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%동작구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search547(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%동작구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search548(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%동작구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search549(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%동작구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search550(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%동작구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search551(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%동작구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search552(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%동작구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search553(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%동작구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search554(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%동작구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search555(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%동작구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search556(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%동작구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search557(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%동작구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search558(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%동작구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search559(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%동작구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search560(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%동작구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search561(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%동작구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search562(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%동작구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search563(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%동작구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search564(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%동작구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search565(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%동작구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search566(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%동작구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search567(@Param("todb2")String todb2);
	
	
	
	
	
	
	
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%서초구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search568(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%서초구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search569(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%서초구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search570(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%서초구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search571(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%서초구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search572(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%서초구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search573(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%서초구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search574(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%서초구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search575(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%서초구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search576(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%서초구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search577(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%서초구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search578(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%서초구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search579(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%서초구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search580(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%서초구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search581(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%서초구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search582(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%서초구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search583(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%서초구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search584(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%서초구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search585(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%서초구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search586(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%서초구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search587(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%서초구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search588(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%서초구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search589(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%서초구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search590(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%서초구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search591(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%서초구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search592(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%서초구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search593(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%서초구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search594(@Param("todb2")String todb2);
	
	
	
	
	
	
	
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%송파구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search595(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%송파구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search596(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%송파구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search597(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%송파구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search598(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%송파구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search599(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%송파구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search600(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%송파구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search601(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%송파구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search602(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%송파구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search603(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%송파구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search604(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%송파구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search605(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%송파구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search606(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%송파구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search607(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%송파구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search608(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%송파구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search609(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%송파구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search610(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%송파구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search611(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%송파구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search612(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%송파구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search613(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%송파구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search614(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%송파구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search615(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%송파구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search616(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%송파구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search617(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%송파구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search618(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%송파구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search619(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%송파구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search620(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%송파구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search621(@Param("todb2")String todb2);
	
	
	
	
	
	
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%양천구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search622(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%양천구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search623(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%양천구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search624(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%양천구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search625(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%양천구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search626(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%양천구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search627(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%양천구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search628(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%양천구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search629(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%양천구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search630(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%양천구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search631(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%양천구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search632(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%양천구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search633(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%양천구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search634(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%양천구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search635(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%양천구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search636(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%양천구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search637(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%양천구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search638(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%양천구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search639(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%양천구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search640(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%양천구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search641(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%양천구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search642(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%양천구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search643(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%양천구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search644(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%양천구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search645(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%양천구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search646(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%양천구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search647(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%양천구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search648(@Param("todb2")String todb2);
	
	
	
	
	
	
	
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%영등포구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search649(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%영등포구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search650(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%영등포구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search651(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%영등포구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search652(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%영등포구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search653(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%영등포구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search654(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%영등포구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search655(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%영등포구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search656(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%영등포구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 0.0 and 4.9) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search657(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%영등포구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search658(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%영등포구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search659(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%영등포구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search660(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%영등포구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search661(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%영등포구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search662(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%영등포구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search663(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%영등포구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search664(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%영등포구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search665(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%영등포구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 5.0 and 10.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search666(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%영등포구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search667(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%영등포구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search668(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%영등포구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 0 and 119) ", nativeQuery = true)
	public List<OtherCourse> search669(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%영등포구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search670(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%영등포구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search671(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%영등포구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 120 and 240) ", nativeQuery = true)
	public List<OtherCourse> search672(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%영등포구%' and COURSE_DIFFICULTY LIKE '%초급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search673(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%영등포구%' and COURSE_DIFFICULTY LIKE '%중급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search674(@Param("todb2")String todb2);
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE (COURSE_DIVISION LIKE %:todb2% and COURSE_BOROUGH LIKE '%영등포구%' and COURSE_DIFFICULTY LIKE '%고급%') and (COURSE_DISTANCE between 10.1 and 50.0) and (ESTIMATED_DURATION between 241 and 480) ", nativeQuery = true)
	public List<OtherCourse> search675(@Param("todb2")String todb2);
/* 추가된코드 */
	
}