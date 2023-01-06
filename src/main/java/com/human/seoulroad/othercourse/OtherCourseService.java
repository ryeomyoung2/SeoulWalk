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

    private Specification<OtherCourse> search(String kw) {
        return new Specification<>() {
            private static final long serialVersionUID = 1L;
            @Override
            public Predicate toPredicate(Root<OtherCourse> q, CriteriaQuery<?> query, CriteriaBuilder cb) {
                query.distinct(true);  // 중복을 제거 
                
                return cb.or(cb.like(q.get("courseDivision"), "%" + kw + "%"), // 제목 
                        cb.like(q.get("courseBorough"), "%" + kw + "%"));     // 내용    
            }
        };
    }
	
	
}
