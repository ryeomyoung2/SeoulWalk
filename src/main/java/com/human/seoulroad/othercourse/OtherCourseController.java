package com.human.seoulroad.othercourse;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class OtherCourseController {
	
	private final OtherCourseService othercourseService;
	
	@RequestMapping("/home/other")
	public String other() {
		return "other";
	}
	
	// url의 파라미터를 받는 방법중의 하나 : @RequestParam
	// 변수명은 other.html의 name과 똑같이 맞춰줘야함
	// 각 변수명에는 value값이 들어옴
	// ex) 강남을 체크하고 검색을 보내면 addressKindU = a 이런 형식으로 값이 설정됨
	@GetMapping("/home/form-action")
	public String list( @RequestParam String addressKindU,
						@RequestParam String addressKindD,
						@RequestParam String distance,
						@RequestParam String duration,
						@RequestParam String difficulty,
						Model model) {
		
		
		
		// 값 검사하여 db에 전달
		if ((addressKindU.equals("a")&&(addressKindD.equals("노원구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) { // 여명님이 강북 value=a로 해놨으므로 문자열 a와 비교를 하였음
			// sql에 like 쿼리를 보내기위한 문자열을 새로 만듬 
			String todb = "강북";		
			// othercourseService를 통해 othercourseRepository 접근
			List<OtherCourse> ocList = othercourseService.test(todb);	
			// 결과를 모델에 담음
			model.addAttribute("ocList",ocList);
			return "other_course";
			
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("노원구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test1(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("노원구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test2(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("노원구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test3(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("노원구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test4(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("노원구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test5(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("노원구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test6(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("노원구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test7(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("노원구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test8(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("노원구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test9(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("노원구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test10(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("노원구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test11(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("노원구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test12(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("노원구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test13(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("노원구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test14(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("노원구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test15(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("노원구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test16(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("노원구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test17(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("노원구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test18(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("노원구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test19(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("노원구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test20(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("노원구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test21(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("노원구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test22(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("노원구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test23(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("노원구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test24(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("노원구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test25(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("노원구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test26(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		
		
		
		
		
		else if ((addressKindU.equals("a")&&(addressKindD.equals("도봉구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) { 
			String todb = "강북";		
			List<OtherCourse> ocList = othercourseService.test27(todb);	
			model.addAttribute("ocList",ocList);
			return "other_course";
			
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("도봉구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test28(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("도봉구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test29(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("도봉구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test30(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("도봉구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test31(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("도봉구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test32(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("도봉구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test33(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("도봉구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test34(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("도봉구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test35(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("도봉구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test36(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("도봉구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test37(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("도봉구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test38(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("도봉구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test39(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("도봉구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test40(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("도봉구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test41(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("도봉구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test42(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("도봉구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test43(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("도봉구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test44(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("도봉구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test45(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("도봉구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test46(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("도봉구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test47(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("도봉구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test48(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("도봉구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test49(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("도봉구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test50(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("도봉구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test51(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("도봉구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test52(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("도봉구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test53(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		
		
		
		
		
		else if ((addressKindU.equals("a")&&(addressKindD.equals("강북구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) { 
			String todb = "강북";		
			List<OtherCourse> ocList = othercourseService.test54(todb);	
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("강북구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test55(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("강북구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test56(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("강북구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test57(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("강북구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test58(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("강북구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test59(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("강북구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test60(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("강북구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test61(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("강북구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test62(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("강북구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test63(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("강북구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test64(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("강북구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test65(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("강북구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test66(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("강북구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test67(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("강북구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test68(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("강북구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test69(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("강북구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test70(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("강북구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test71(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("강북구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test72(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("강북구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test73(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("강북구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test74(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("강북구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test75(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("강북구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test76(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("강북구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test77(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("강북구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test78(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("강북구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test79(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("강북구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test80(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		
		
		
		
		
		else if ((addressKindU.equals("a")&&(addressKindD.equals("광진구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) { 
			String todb = "강북";		
			List<OtherCourse> ocList = othercourseService.test81(todb);	
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("광진구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test82(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("광진구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test83(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("광진구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test84(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("광진구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test85(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("광진구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test86(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("광진구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test87(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("광진구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test88(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("광진구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test89(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("광진구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test90(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("광진구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test91(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("광진구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test92(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("광진구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test93(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("광진구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test94(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("광진구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test95(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("광진구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test96(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("광진구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test97(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("광진구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test98(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("광진구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test99(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("광진구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test100(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("광진구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test101(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("광진구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test102(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("광진구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test103(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("광진구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test104(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("광진구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test105(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("광진구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test106(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("광진구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test107(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		
		
		
		
		
		else if ((addressKindU.equals("a")&&(addressKindD.equals("동대문구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) { 
			String todb = "강북";		
			List<OtherCourse> ocList = othercourseService.test108(todb);	
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("동대문구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test109(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("동대문구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test110(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("동대문구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test111(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("동대문구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test112(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("동대문구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test113(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("동대문구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test114(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("동대문구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test115(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("동대문구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test116(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("동대문구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test117(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("동대문구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test118(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("동대문구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test119(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("동대문구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test120(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("동대문구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test121(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("동대문구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test122(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("동대문구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test123(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("동대문구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test124(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("동대문구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test125(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("동대문구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test126(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("동대문구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test127(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("동대문구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test128(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("동대문구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test129(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("동대문구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test130(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("동대문구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test131(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("동대문구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test132(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("동대문구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test133(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("동대문구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test134(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		
		
		
		
		
		else if ((addressKindU.equals("a")&&(addressKindD.equals("마포구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) { 
			String todb = "강북";		
			List<OtherCourse> ocList = othercourseService.test135(todb);	
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("마포구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test136(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("마포구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test137(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("마포구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test138(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("마포구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test139(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("마포구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test140(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("마포구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test141(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("마포구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test142(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("마포구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test143(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("마포구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test144(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("마포구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test145(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("마포구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test146(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("마포구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test147(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("마포구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test148(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("마포구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test149(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("마포구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test150(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("마포구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test151(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("마포구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test152(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("마포구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test153(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("마포구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test154(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("마포구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test155(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("마포구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test156(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("마포구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test157(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("마포구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test158(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("마포구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test159(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("마포구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test160(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("마포구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test161(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		
		
		
		
		
		else if ((addressKindU.equals("a")&&(addressKindD.equals("서대문구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) { 
			String todb = "강북";		
			List<OtherCourse> ocList = othercourseService.test162(todb);	
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("서대문구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test163(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("서대문구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test164(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("서대문구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test165(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("서대문구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test166(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("서대문구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test167(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("서대문구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test168(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("서대문구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test169(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("서대문구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test170(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("서대문구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test171(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("서대문구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test172(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("서대문구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test173(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("서대문구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test174(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("서대문구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test175(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("서대문구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test176(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("서대문구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test177(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("서대문구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test178(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("서대문구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test179(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("서대문구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test180(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("서대문구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test181(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("서대문구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test182(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("서대문구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test183(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("서대문구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test184(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("서대문구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test185(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("서대문구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test186(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("서대문구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test187(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("서대문구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test188(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		
		
		
		
		
		
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성동구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) { 
			String todb = "강북";		
			List<OtherCourse> ocList = othercourseService.test189(todb);	
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성동구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test190(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성동구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test191(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성동구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test192(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성동구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test193(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성동구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test194(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성동구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test195(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성동구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test196(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성동구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test197(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성동구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test198(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성동구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test199(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성동구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test200(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성동구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test201(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성동구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test202(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성동구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test203(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성동구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test204(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성동구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test205(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성동구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test206(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성동구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test207(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성동구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test208(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성동구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test209(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성동구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test210(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성동구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test211(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성동구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test212(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성동구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test213(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성동구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test214(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성동구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test215(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		
		
		
		
		
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성북구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) { 
			String todb = "강북";		
			List<OtherCourse> ocList = othercourseService.test216(todb);	
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성북구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test217(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성북구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test218(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성북구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test219(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성북구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test220(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성북구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test221(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성북구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test222(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성북구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test223(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성북구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test224(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성북구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test225(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성북구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test226(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성북구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test227(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성북구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test228(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성북구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test229(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성북구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test230(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성북구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test231(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성북구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test232(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성북구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test233(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성북구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test234(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성북구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test235(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성북구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test236(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성북구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test237(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성북구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test238(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성북구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test239(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성북구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test240(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성북구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test241(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("성북구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test242(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		
		
		
		
		
		else if ((addressKindU.equals("a")&&(addressKindD.equals("용산구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) { 
			String todb = "강북";		
			List<OtherCourse> ocList = othercourseService.test243(todb);	
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("용산구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test244(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("용산구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test245(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("용산구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test246(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("용산구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test247(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("용산구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test248(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("용산구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test249(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("용산구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test250(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("용산구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test251(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("용산구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test252(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("용산구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test253(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("용산구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test254(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("용산구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test255(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("용산구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test256(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("용산구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test257(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("용산구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test258(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("용산구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test259(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("용산구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test260(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("용산구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test261(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("용산구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test262(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("용산구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test263(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("용산구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test264(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("용산구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test265(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("용산구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test266(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("용산구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test267(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("용산구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test268(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("용산구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test269(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}


		
		
		
		
		else if ((addressKindU.equals("a")&&(addressKindD.equals("은평구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) { 
			String todb = "강북";		
			List<OtherCourse> ocList = othercourseService.test270(todb);	
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("은평구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test271(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("은평구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test272(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("은평구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test273(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("은평구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test274(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("은평구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test275(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("은평구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test276(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("은평구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test277(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("은평구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test278(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("은평구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test279(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("은평구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test280(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("은평구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test281(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("은평구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test282(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("은평구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test283(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("은평구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test284(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("은평구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test285(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("은평구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test286(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("은평구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test287(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("은평구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test288(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("은평구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test289(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("은평구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test290(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("은평구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test291(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("은평구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test292(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("은평구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test293(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("은평구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test294(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("은평구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test295(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("은평구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test296(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		
		
		
		
		
		else if ((addressKindU.equals("a")&&(addressKindD.equals("종로구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) { 
			String todb = "강북";		
			List<OtherCourse> ocList = othercourseService.test297(todb);	
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("종로구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test298(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("종로구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test299(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("종로구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test300(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("종로구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test301(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("종로구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test302(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("종로구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test303(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("종로구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test304(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("종로구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test305(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("종로구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test306(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("종로구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test307(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("종로구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test308(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("종로구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test309(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("종로구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test310(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("종로구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test311(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("종로구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test312(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("종로구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test313(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("종로구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test314(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("종로구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test315(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("종로구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test316(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("종로구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test317(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("종로구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test318(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("종로구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test319(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("종로구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test320(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("종로구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test321(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("종로구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test322(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("종로구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test323(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		
		
		
		
		
		
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) { 
			String todb = "강북";		
			List<OtherCourse> ocList = othercourseService.test324(todb);	
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test325(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test326(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test327(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test328(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test329(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test330(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test331(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test332(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test333(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test334(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test335(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test336(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test337(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test338(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test339(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test340(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test341(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test342(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test343(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test344(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test345(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test346(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test347(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test348(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test349(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test350(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		
		
		
		
		
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중랑구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) { 
			String todb = "강북";		
			List<OtherCourse> ocList = othercourseService.test351(todb);	
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중랑구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test352(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중랑구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test353(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중랑구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test354(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중랑구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test355(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중랑구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test356(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중랑구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test357(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중랑구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test358(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중랑구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test359(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중랑구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test360(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중랑구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test361(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중랑구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test362(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중랑구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test363(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중랑구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test364(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중랑구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test365(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중랑구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test366(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중랑구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test367(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중랑구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test368(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중랑구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test369(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중랑구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test370(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중랑구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test371(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중랑구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test372(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중랑구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test373(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중랑구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test374(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중랑구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test375(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중랑구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test376(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("a")&&(addressKindD.equals("중랑구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb = "강북";
			List<OtherCourse> ocList = othercourseService.test377(todb);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		
		
		
		
		
		
		
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강남구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) { 
			String todb2 = "강남";		
			List<OtherCourse> ocList = othercourseService.test378(todb2);	
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강남구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test379(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강남구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test380(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강남구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test381(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강남구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test382(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강남구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test383(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강남구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test384(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강남구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test385(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강남구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test386(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강남구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test387(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강남구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test388(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강남구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test389(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강남구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test390(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강남구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test391(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강남구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test392(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강남구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test393(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강남구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test394(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강남구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test395(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강남구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test396(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강남구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test397(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강남구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test398(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강남구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test399(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강남구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test400(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강남구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test401(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강남구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test402(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강남구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test403(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강남구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test404(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		
		
		
		
		
		
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강동구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) { 
			String todb2 = "강남";		
			List<OtherCourse> ocList = othercourseService.test405(todb2);	
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강동구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test406(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강동구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test407(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강동구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test408(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강동구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test409(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강동구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test410(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강동구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test411(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강동구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test412(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강동구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test413(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강동구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test414(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강동구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test415(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강동구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test416(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강동구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test417(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강동구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test418(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강동구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test419(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강동구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test420(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강동구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test421(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강동구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test422(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강동구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test423(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강동구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test424(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강동구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test425(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강동구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test426(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강동구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test427(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강동구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test428(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강동구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test429(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강동구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test430(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강동구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test431(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		
		
		
		
		
		
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강서구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) { 
			String todb2 = "강남";		
			List<OtherCourse> ocList = othercourseService.test432(todb2);	
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강서구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test433(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강서구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test434(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강서구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test435(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강서구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test436(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강서구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test437(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강서구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test438(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강서구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test439(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강서구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test440(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강서구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test441(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강서구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test442(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강서구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test443(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강서구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test444(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강서구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test445(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강서구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test446(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강서구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test447(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강서구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test448(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강서구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test449(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강서구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test450(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강서구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test451(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강서구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test452(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강서구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test453(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강서구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test454(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강서구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test455(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강서구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test456(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강서구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test457(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("강서구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test458(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		
		
		
		
		
		
		
		else if ((addressKindU.equals("b")&&(addressKindD.equals("관악구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) { 
			String todb2 = "강남";		
			List<OtherCourse> ocList = othercourseService.test459(todb2);	
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("관악구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test460(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("관악구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test461(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("관악구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test462(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("관악구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test463(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("관악구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test464(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("관악구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test465(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("관악구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test466(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("관악구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test467(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("관악구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test468(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("관악구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test469(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("관악구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test470(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("관악구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test471(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("관악구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test472(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("관악구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test473(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("관악구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test474(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("관악구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test475(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("관악구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test476(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("관악구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test477(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("관악구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test478(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("관악구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test479(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("관악구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test480(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("관악구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test481(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("관악구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test482(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("관악구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test483(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("관악구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test484(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("관악구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test485(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		
		
		
		
		
		
		else if ((addressKindU.equals("b")&&(addressKindD.equals("구로구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) { 
			String todb2 = "강남";		
			List<OtherCourse> ocList = othercourseService.test486(todb2);	
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("구로구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test487(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("구로구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test488(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("구로구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test489(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("구로구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test490(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("구로구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test491(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("구로구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test492(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("구로구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test493(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("구로구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test494(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("구로구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test495(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("구로구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test496(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("구로구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test497(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("구로구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test498(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("구로구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test499(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("구로구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test500(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("구로구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test501(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("구로구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test502(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("구로구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test503(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("구로구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test504(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("구로구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test505(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("구로구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test506(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("구로구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test507(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("구로구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test508(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("구로구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test509(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("구로구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test510(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("구로구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test511(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("구로구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test512(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		
		
		
		
		
		
		else if ((addressKindU.equals("b")&&(addressKindD.equals("금천구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) { 
			String todb2 = "강남";		
			List<OtherCourse> ocList = othercourseService.test513(todb2);	
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("금천구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test514(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("금천구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test515(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("금천구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test516(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("금천구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test517(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("금천구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test518(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("금천구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test519(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("금천구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test520(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("금천구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test521(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("금천구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test522(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("금천구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test523(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("금천구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test524(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("금천구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test525(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("금천구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test526(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("금천구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test527(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("금천구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test528(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("금천구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test529(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("금천구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test530(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("금천구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test531(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("금천구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test532(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("금천구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test533(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("금천구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test534(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("금천구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test535(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("금천구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test536(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("금천구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test537(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("금천구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test538(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("금천구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test539(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		
		
		
		
		
		
		
		else if ((addressKindU.equals("b")&&(addressKindD.equals("동작구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) { 
			String todb2 = "강남";		
			List<OtherCourse> ocList = othercourseService.test540(todb2);	
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("동작구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test541(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("동작구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test542(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("동작구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test543(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("동작구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test544(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("동작구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test545(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("동작구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test546(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("동작구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test547(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("동작구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test548(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("동작구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test549(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("동작구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test550(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("동작구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test551(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("동작구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test552(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("동작구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test553(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("동작구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test554(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("동작구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test555(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("동작구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test556(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("동작구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test557(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("동작구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test558(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("동작구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test559(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("동작구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test560(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("동작구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test561(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("동작구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test562(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("동작구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test563(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("동작구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test564(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("동작구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test565(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("동작구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test566(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		
		
		
		
		
		
		else if ((addressKindU.equals("b")&&(addressKindD.equals("서초구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) { 
			String todb2 = "강남";		
			List<OtherCourse> ocList = othercourseService.test567(todb2);	
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("서초구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test568(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("서초구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test569(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("서초구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test570(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("서초구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test571(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("서초구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test572(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("서초구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test573(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("서초구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test574(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("서초구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test575(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("서초구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test576(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("서초구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test577(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("서초구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test578(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("서초구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test579(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("서초구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test580(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("서초구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test581(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("서초구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test582(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("서초구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test583(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("서초구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test584(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("서초구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test585(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("서초구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test586(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("서초구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test587(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("서초구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test588(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("서초구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test589(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("서초구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test590(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("서초구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test591(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("서초구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test592(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("서초구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test593(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		
		
		
		
		
		
		else if ((addressKindU.equals("b")&&(addressKindD.equals("송파구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) { 
			String todb2 = "강남";		
			List<OtherCourse> ocList = othercourseService.test594(todb2);	
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("송파구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test595(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("송파구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test596(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("송파구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test597(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("송파구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test598(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("송파구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test599(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("송파구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test600(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("송파구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test601(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("송파구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test602(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("송파구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test603(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("송파구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test604(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("송파구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test605(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("송파구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test606(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("송파구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test607(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("송파구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test608(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("송파구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test609(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("송파구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test610(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("송파구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test611(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("송파구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test612(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("송파구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test613(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("송파구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test614(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("송파구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test615(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("송파구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test616(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("송파구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test617(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("송파구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test618(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("송파구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test619(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("송파구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test620(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		
		
		
		
		
		
		else if ((addressKindU.equals("b")&&(addressKindD.equals("양천구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) { 
			String todb2 = "강남";		
			List<OtherCourse> ocList = othercourseService.test621(todb2);	
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("양천구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test622(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("양천구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test623(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("양천구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test624(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("양천구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test625(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("양천구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test626(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("양천구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test627(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("양천구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test628(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("양천구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test629(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("양천구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test630(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("양천구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test631(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("양천구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test632(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("양천구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test633(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("양천구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test634(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("양천구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test635(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("양천구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test636(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("양천구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test637(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("양천구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test638(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("양천구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test639(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("양천구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test640(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("양천구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test641(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("양천구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test642(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("양천구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test643(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("양천구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test644(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("양천구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test645(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("양천구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test646(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("양천구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test647(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		
		
		
		
		
		
		
		else if ((addressKindU.equals("b")&&(addressKindD.equals("영등포구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) { 
			String todb2 = "강남";		
			List<OtherCourse> ocList = othercourseService.test648(todb2);	
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("영등포구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test649(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("영등포구")&&(distance.equals("5under")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test650(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("영등포구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test651(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("영등포구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test652(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("영등포구")&&(distance.equals("5under")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test653(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("영등포구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test654(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("영등포구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test655(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("영등포구")&&(distance.equals("5under")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test656(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("영등포구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test657(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("영등포구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test658(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("영등포구")&&(distance.equals("5between10")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test659(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("영등포구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test660(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("영등포구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test661(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("영등포구")&&(distance.equals("5between10")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test662(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("영등포구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test663(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("영등포구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test664(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("영등포구")&&(distance.equals("5between10")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test665(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("영등포구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test666(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("영등포구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test667(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("영등포구")&&(distance.equals("10over")&&(duration.equals("2under"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test668(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("영등포구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test669(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("영등포구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test670(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("영등포구")&&(distance.equals("10over")&&(duration.equals("2between4"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test671(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("영등포구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("easy")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test672(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("영등포구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("normal")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test673(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		else if ((addressKindU.equals("b")&&(addressKindD.equals("영등포구")&&(distance.equals("10over")&&(duration.equals("4over"))&&(difficulty.equals("hard")))))) {
			String todb2 = "강남";
			List<OtherCourse> ocList = othercourseService.test674(todb2);
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
		
		
		
		
		else { // 강남을 골랐을 시 그냥 전부를 보여주게 함 - 이전에 테스트용으로 완성시켜놨던 코드
			// test - select all
			List<OtherCourse> ocList = this.othercourseService.getList();
			model.addAttribute("ocList",ocList);
			return "other_course";
		}
	
	}
	
	
}

