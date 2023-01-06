package com.human.seoulroad.othercourse;

import java.util.List;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.human.seoulroad.user.SiteUser;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.JoinType;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.RequiredArgsConstructor;



@RequiredArgsConstructor
@Service
public class OtherCourseService {

    private final OtherCourseRepository othercourseRepository;

	public List<OtherCourse> getList() {
	
		return this.othercourseRepository.findAll();
	}
	
	/* 추가된코드 */
	// 파라미터(강북)을 받아서 othercourseRepository의 searchGangbok이라는 이름의 db검색 메서드를 호출
	public List<OtherCourse> test(String pram){
		return this.othercourseRepository.search01(pram);
	}
	public List<OtherCourse> test1(String pram){
		return this.othercourseRepository.search02(pram);
	}



	
	/* 추가된코드 */
	
	
	
}

