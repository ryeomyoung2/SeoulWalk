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
	public List<OtherCourse> test2(String pram){
		return this.othercourseRepository.search03(pram);
	}
	public List<OtherCourse> test3(String pram){
		return this.othercourseRepository.search04(pram);
	}
	public List<OtherCourse> test4(String pram){
		return this.othercourseRepository.search05(pram);
	}
	public List<OtherCourse> test5(String pram){
		return this.othercourseRepository.search06(pram);
	}
	public List<OtherCourse> test6(String pram){
		return this.othercourseRepository.search07(pram);
	}
	public List<OtherCourse> test7(String pram){
		return this.othercourseRepository.search08(pram);
	}
	public List<OtherCourse> test8(String pram){
		return this.othercourseRepository.search09(pram);
	}
	public List<OtherCourse> test9(String pram){
		return this.othercourseRepository.search10(pram);
	}
	public List<OtherCourse> test10(String pram){
		return this.othercourseRepository.search11(pram);
	}
	public List<OtherCourse> test11(String pram){
		return this.othercourseRepository.search12(pram);
	}
	public List<OtherCourse> test12(String pram){
		return this.othercourseRepository.search13(pram);
	}
	public List<OtherCourse> test13(String pram){
		return this.othercourseRepository.search14(pram);
	}
	public List<OtherCourse> test14(String pram){
		return this.othercourseRepository.search15(pram);
	}
	public List<OtherCourse> test15(String pram){
		return this.othercourseRepository.search16(pram);
	}
	public List<OtherCourse> test16(String pram){
		return this.othercourseRepository.search17(pram);
	}
	public List<OtherCourse> test17(String pram){
		return this.othercourseRepository.search18(pram);
	}
	public List<OtherCourse> test18(String pram){
		return this.othercourseRepository.search19(pram);
	}
	public List<OtherCourse> test19(String pram){
		return this.othercourseRepository.search20(pram);
	}
	public List<OtherCourse> test20(String pram){
		return this.othercourseRepository.search21(pram);
	}
	public List<OtherCourse> test21(String pram){
		return this.othercourseRepository.search22(pram);
	}
	public List<OtherCourse> test22(String pram){
		return this.othercourseRepository.search23(pram);
	}
	public List<OtherCourse> test23(String pram){
		return this.othercourseRepository.search24(pram);
	}
	public List<OtherCourse> test24(String pram){
		return this.othercourseRepository.search25(pram);
	}
	public List<OtherCourse> test25(String pram){
		return this.othercourseRepository.search26(pram);
	}
	public List<OtherCourse> test26(String pram){
		return this.othercourseRepository.search27(pram);
	}
	
	
	
	
	
	public List<OtherCourse> test27(String pram){
		return this.othercourseRepository.search28(pram);
	}
	public List<OtherCourse> test28(String pram){
		return this.othercourseRepository.search29(pram);
	}
	public List<OtherCourse> test29(String pram){
		return this.othercourseRepository.search30(pram);
	}
	public List<OtherCourse> test30(String pram){
		return this.othercourseRepository.search31(pram);
	}
	public List<OtherCourse> test31(String pram){
		return this.othercourseRepository.search32(pram);
	}
	public List<OtherCourse> test32(String pram){
		return this.othercourseRepository.search33(pram);
	}
	public List<OtherCourse> test33(String pram){
		return this.othercourseRepository.search34(pram);
	}
	public List<OtherCourse> test34(String pram){
		return this.othercourseRepository.search35(pram);
	}
	public List<OtherCourse> test35(String pram){
		return this.othercourseRepository.search36(pram);
	}
	public List<OtherCourse> test36(String pram){
		return this.othercourseRepository.search37(pram);
	}
	public List<OtherCourse> test37(String pram){
		return this.othercourseRepository.search38(pram);
	}
	public List<OtherCourse> test38(String pram){
		return this.othercourseRepository.search39(pram);
	}
	public List<OtherCourse> test39(String pram){
		return this.othercourseRepository.search40(pram);
	}
	public List<OtherCourse> test40(String pram){
		return this.othercourseRepository.search41(pram);
	}
	public List<OtherCourse> test41(String pram){
		return this.othercourseRepository.search42(pram);
	}
	public List<OtherCourse> test42(String pram){
		return this.othercourseRepository.search43(pram);
	}
	public List<OtherCourse> test43(String pram){
		return this.othercourseRepository.search44(pram);
	}
	public List<OtherCourse> test44(String pram){
		return this.othercourseRepository.search45(pram);
	}
	public List<OtherCourse> test45(String pram){
		return this.othercourseRepository.search46(pram);
	}
	public List<OtherCourse> test46(String pram){
		return this.othercourseRepository.search47(pram);
	}
	public List<OtherCourse> test47(String pram){
		return this.othercourseRepository.search48(pram);
	}
	public List<OtherCourse> test48(String pram){
		return this.othercourseRepository.search49(pram);
	}
	public List<OtherCourse> test49(String pram){
		return this.othercourseRepository.search50(pram);
	}
	public List<OtherCourse> test50(String pram){
		return this.othercourseRepository.search51(pram);
	}
	public List<OtherCourse> test51(String pram){
		return this.othercourseRepository.search52(pram);
	}
	public List<OtherCourse> test52(String pram){
		return this.othercourseRepository.search53(pram);
	}
	public List<OtherCourse> test53(String pram){
		return this.othercourseRepository.search54(pram);
	}
	
	
	
	
	
	public List<OtherCourse> test54(String pram){
		return this.othercourseRepository.search55(pram);
	}
	public List<OtherCourse> test55(String pram){
		return this.othercourseRepository.search56(pram);
	}
	public List<OtherCourse> test56(String pram){
		return this.othercourseRepository.search57(pram);
	}
	public List<OtherCourse> test57(String pram){
		return this.othercourseRepository.search58(pram);
	}
	public List<OtherCourse> test58(String pram){
		return this.othercourseRepository.search59(pram);
	}
	public List<OtherCourse> test59(String pram){
		return this.othercourseRepository.search60(pram);
	}
	public List<OtherCourse> test60(String pram){
		return this.othercourseRepository.search61(pram);
	}
	public List<OtherCourse> test61(String pram){
		return this.othercourseRepository.search62(pram);
	}
	public List<OtherCourse> test62(String pram){
		return this.othercourseRepository.search63(pram);
	}
	public List<OtherCourse> test63(String pram){
		return this.othercourseRepository.search64(pram);
	}
	public List<OtherCourse> test64(String pram){
		return this.othercourseRepository.search65(pram);
	}
	public List<OtherCourse> test65(String pram){
		return this.othercourseRepository.search66(pram);
	}
	public List<OtherCourse> test66(String pram){
		return this.othercourseRepository.search67(pram);
	}
	public List<OtherCourse> test67(String pram){
		return this.othercourseRepository.search68(pram);
	}
	public List<OtherCourse> test68(String pram){
		return this.othercourseRepository.search69(pram);
	}
	public List<OtherCourse> test69(String pram){
		return this.othercourseRepository.search70(pram);
	}
	public List<OtherCourse> test70(String pram){
		return this.othercourseRepository.search71(pram);
	}
	public List<OtherCourse> test71(String pram){
		return this.othercourseRepository.search72(pram);
	}
	public List<OtherCourse> test72(String pram){
		return this.othercourseRepository.search73(pram);
	}
	public List<OtherCourse> test73(String pram){
		return this.othercourseRepository.search74(pram);
	}
	public List<OtherCourse> test74(String pram){
		return this.othercourseRepository.search75(pram);
	}
	public List<OtherCourse> test75(String pram){
		return this.othercourseRepository.search76(pram);
	}
	public List<OtherCourse> test76(String pram){
		return this.othercourseRepository.search77(pram);
	}
	public List<OtherCourse> test77(String pram){
		return this.othercourseRepository.search78(pram);
	}
	public List<OtherCourse> test78(String pram){
		return this.othercourseRepository.search79(pram);
	}
	public List<OtherCourse> test79(String pram){
		return this.othercourseRepository.search80(pram);
	}
	public List<OtherCourse> test80(String pram){
		return this.othercourseRepository.search81(pram);
	}
	
	
	
	
	
	public List<OtherCourse> test81(String pram){
		return this.othercourseRepository.search82(pram);
	}
	public List<OtherCourse> test82(String pram){
		return this.othercourseRepository.search83(pram);
	}
	public List<OtherCourse> test83(String pram){
		return this.othercourseRepository.search84(pram);
	}
	public List<OtherCourse> test84(String pram){
		return this.othercourseRepository.search85(pram);
	}
	public List<OtherCourse> test85(String pram){
		return this.othercourseRepository.search86(pram);
	}
	public List<OtherCourse> test86(String pram){
		return this.othercourseRepository.search87(pram);
	}
	public List<OtherCourse> test87(String pram){
		return this.othercourseRepository.search88(pram);
	}
	public List<OtherCourse> test88(String pram){
		return this.othercourseRepository.search89(pram);
	}
	public List<OtherCourse> test89(String pram){
		return this.othercourseRepository.search90(pram);
	}
	public List<OtherCourse> test90(String pram){
		return this.othercourseRepository.search91(pram);
	}
	public List<OtherCourse> test91(String pram){
		return this.othercourseRepository.search92(pram);
	}
	public List<OtherCourse> test92(String pram){
		return this.othercourseRepository.search93(pram);
	}
	public List<OtherCourse> test93(String pram){
		return this.othercourseRepository.search94(pram);
	}
	public List<OtherCourse> test94(String pram){
		return this.othercourseRepository.search95(pram);
	}
	public List<OtherCourse> test95(String pram){
		return this.othercourseRepository.search96(pram);
	}
	public List<OtherCourse> test96(String pram){
		return this.othercourseRepository.search97(pram);
	}
	public List<OtherCourse> test97(String pram){
		return this.othercourseRepository.search98(pram);
	}
	public List<OtherCourse> test98(String pram){
		return this.othercourseRepository.search99(pram);
	}
	public List<OtherCourse> test99(String pram){
		return this.othercourseRepository.search100(pram);
	}
	public List<OtherCourse> test100(String pram){
		return this.othercourseRepository.search101(pram);
	}
	public List<OtherCourse> test101(String pram){
		return this.othercourseRepository.search102(pram);
	}
	public List<OtherCourse> test102(String pram){
		return this.othercourseRepository.search103(pram);
	}
	public List<OtherCourse> test103(String pram){
		return this.othercourseRepository.search104(pram);
	}
	public List<OtherCourse> test104(String pram){
		return this.othercourseRepository.search105(pram);
	}
	public List<OtherCourse> test105(String pram){
		return this.othercourseRepository.search106(pram);
	}
	public List<OtherCourse> test106(String pram){
		return this.othercourseRepository.search107(pram);
	}
	public List<OtherCourse> test107(String pram){
		return this.othercourseRepository.search108(pram);
	}
	
	
	
	
	
	public List<OtherCourse> test108(String pram){
		return this.othercourseRepository.search109(pram);
	}
	public List<OtherCourse> test109(String pram){
		return this.othercourseRepository.search110(pram);
	}
	public List<OtherCourse> test110(String pram){
		return this.othercourseRepository.search111(pram);
	}
	public List<OtherCourse> test111(String pram){
		return this.othercourseRepository.search112(pram);
	}
	public List<OtherCourse> test112(String pram){
		return this.othercourseRepository.search113(pram);
	}
	public List<OtherCourse> test113(String pram){
		return this.othercourseRepository.search114(pram);
	}
	public List<OtherCourse> test114(String pram){
		return this.othercourseRepository.search115(pram);
	}
	public List<OtherCourse> test115(String pram){
		return this.othercourseRepository.search116(pram);
	}
	public List<OtherCourse> test116(String pram){
		return this.othercourseRepository.search117(pram);
	}
	public List<OtherCourse> test117(String pram){
		return this.othercourseRepository.search118(pram);
	}
	public List<OtherCourse> test118(String pram){
		return this.othercourseRepository.search119(pram);
	}
	public List<OtherCourse> test119(String pram){
		return this.othercourseRepository.search120(pram);
	}
	public List<OtherCourse> test120(String pram){
		return this.othercourseRepository.search121(pram);
	}
	public List<OtherCourse> test121(String pram){
		return this.othercourseRepository.search122(pram);
	}
	public List<OtherCourse> test122(String pram){
		return this.othercourseRepository.search123(pram);
	}
	public List<OtherCourse> test123(String pram){
		return this.othercourseRepository.search124(pram);
	}
	public List<OtherCourse> test124(String pram){
		return this.othercourseRepository.search125(pram);
	}
	public List<OtherCourse> test125(String pram){
		return this.othercourseRepository.search126(pram);
	}
	public List<OtherCourse> test126(String pram){
		return this.othercourseRepository.search127(pram);
	}
	public List<OtherCourse> test127(String pram){
		return this.othercourseRepository.search128(pram);
	}
	public List<OtherCourse> test128(String pram){
		return this.othercourseRepository.search129(pram);
	}
	public List<OtherCourse> test129(String pram){
		return this.othercourseRepository.search130(pram);
	}
	public List<OtherCourse> test130(String pram){
		return this.othercourseRepository.search131(pram);
	}
	public List<OtherCourse> test131(String pram){
		return this.othercourseRepository.search132(pram);
	}
	public List<OtherCourse> test132(String pram){
		return this.othercourseRepository.search133(pram);
	}
	public List<OtherCourse> test133(String pram){
		return this.othercourseRepository.search134(pram);
	}
	public List<OtherCourse> test134(String pram){
		return this.othercourseRepository.search135(pram);
	}
	
	
	
	
	
	public List<OtherCourse> test135(String pram){
		return this.othercourseRepository.search136(pram);
	}
	public List<OtherCourse> test136(String pram){
		return this.othercourseRepository.search137(pram);
	}
	public List<OtherCourse> test137(String pram){
		return this.othercourseRepository.search138(pram);
	}
	public List<OtherCourse> test138(String pram){
		return this.othercourseRepository.search139(pram);
	}
	public List<OtherCourse> test139(String pram){
		return this.othercourseRepository.search140(pram);
	}
	public List<OtherCourse> test140(String pram){
		return this.othercourseRepository.search141(pram);
	}
	public List<OtherCourse> test141(String pram){
		return this.othercourseRepository.search142(pram);
	}
	public List<OtherCourse> test142(String pram){
		return this.othercourseRepository.search143(pram);
	}
	public List<OtherCourse> test143(String pram){
		return this.othercourseRepository.search144(pram);
	}
	public List<OtherCourse> test144(String pram){
		return this.othercourseRepository.search145(pram);
	}
	public List<OtherCourse> test145(String pram){
		return this.othercourseRepository.search146(pram);
	}
	public List<OtherCourse> test146(String pram){
		return this.othercourseRepository.search147(pram);
	}
	public List<OtherCourse> test147(String pram){
		return this.othercourseRepository.search148(pram);
	}
	public List<OtherCourse> test148(String pram){
		return this.othercourseRepository.search149(pram);
	}
	public List<OtherCourse> test149(String pram){
		return this.othercourseRepository.search150(pram);
	}
	public List<OtherCourse> test150(String pram){
		return this.othercourseRepository.search151(pram);
	}
	public List<OtherCourse> test151(String pram){
		return this.othercourseRepository.search152(pram);
	}
	public List<OtherCourse> test152(String pram){
		return this.othercourseRepository.search153(pram);
	}
	public List<OtherCourse> test153(String pram){
		return this.othercourseRepository.search154(pram);
	}
	public List<OtherCourse> test154(String pram){
		return this.othercourseRepository.search155(pram);
	}
	public List<OtherCourse> test155(String pram){
		return this.othercourseRepository.search156(pram);
	}
	public List<OtherCourse> test156(String pram){
		return this.othercourseRepository.search157(pram);
	}
	public List<OtherCourse> test157(String pram){
		return this.othercourseRepository.search158(pram);
	}
	public List<OtherCourse> test158(String pram){
		return this.othercourseRepository.search159(pram);
	}
	public List<OtherCourse> test159(String pram){
		return this.othercourseRepository.search160(pram);
	}
	public List<OtherCourse> test160(String pram){
		return this.othercourseRepository.search161(pram);
	}
	public List<OtherCourse> test161(String pram){
		return this.othercourseRepository.search162(pram);
	}
	
	
	
	
	
	public List<OtherCourse> test162(String pram){
		return this.othercourseRepository.search163(pram);
	}
	public List<OtherCourse> test163(String pram){
		return this.othercourseRepository.search164(pram);
	}
	public List<OtherCourse> test164(String pram){
		return this.othercourseRepository.search165(pram);
	}
	public List<OtherCourse> test165(String pram){
		return this.othercourseRepository.search166(pram);
	}
	public List<OtherCourse> test166(String pram){
		return this.othercourseRepository.search167(pram);
	}
	public List<OtherCourse> test167(String pram){
		return this.othercourseRepository.search168(pram);
	}
	public List<OtherCourse> test168(String pram){
		return this.othercourseRepository.search169(pram);
	}
	public List<OtherCourse> test169(String pram){
		return this.othercourseRepository.search170(pram);
	}
	public List<OtherCourse> test170(String pram){
		return this.othercourseRepository.search171(pram);
	}
	public List<OtherCourse> test171(String pram){
		return this.othercourseRepository.search172(pram);
	}
	public List<OtherCourse> test172(String pram){
		return this.othercourseRepository.search173(pram);
	}
	public List<OtherCourse> test173(String pram){
		return this.othercourseRepository.search174(pram);
	}
	public List<OtherCourse> test174(String pram){
		return this.othercourseRepository.search175(pram);
	}
	public List<OtherCourse> test175(String pram){
		return this.othercourseRepository.search176(pram);
	}
	public List<OtherCourse> test176(String pram){
		return this.othercourseRepository.search177(pram);
	}
	public List<OtherCourse> test177(String pram){
		return this.othercourseRepository.search178(pram);
	}
	public List<OtherCourse> test178(String pram){
		return this.othercourseRepository.search179(pram);
	}
	public List<OtherCourse> test179(String pram){
		return this.othercourseRepository.search180(pram);
	}
	public List<OtherCourse> test180(String pram){
		return this.othercourseRepository.search181(pram);
	}
	public List<OtherCourse> test181(String pram){
		return this.othercourseRepository.search182(pram);
	}
	public List<OtherCourse> test182(String pram){
		return this.othercourseRepository.search183(pram);
	}
	public List<OtherCourse> test183(String pram){
		return this.othercourseRepository.search184(pram);
	}
	public List<OtherCourse> test184(String pram){
		return this.othercourseRepository.search185(pram);
	}
	public List<OtherCourse> test185(String pram){
		return this.othercourseRepository.search186(pram);
	}
	public List<OtherCourse> test186(String pram){
		return this.othercourseRepository.search187(pram);
	}
	public List<OtherCourse> test187(String pram){
		return this.othercourseRepository.search188(pram);
	}
	public List<OtherCourse> test188(String pram){
		return this.othercourseRepository.search189(pram);
	}
	
	
	
	
	
	public List<OtherCourse> test189(String pram){
		return this.othercourseRepository.search190(pram);
	}
	public List<OtherCourse> test190(String pram){
		return this.othercourseRepository.search191(pram);
	}
	public List<OtherCourse> test191(String pram){
		return this.othercourseRepository.search192(pram);
	}
	public List<OtherCourse> test192(String pram){
		return this.othercourseRepository.search193(pram);
	}
	public List<OtherCourse> test193(String pram){
		return this.othercourseRepository.search194(pram);
	}
	public List<OtherCourse> test194(String pram){
		return this.othercourseRepository.search195(pram);
	}
	public List<OtherCourse> test195(String pram){
		return this.othercourseRepository.search196(pram);
	}
	public List<OtherCourse> test196(String pram){
		return this.othercourseRepository.search197(pram);
	}
	public List<OtherCourse> test197(String pram){
		return this.othercourseRepository.search198(pram);
	}
	public List<OtherCourse> test198(String pram){
		return this.othercourseRepository.search199(pram);
	}
	public List<OtherCourse> test199(String pram){
		return this.othercourseRepository.search200(pram);
	}
	public List<OtherCourse> test200(String pram){
		return this.othercourseRepository.search201(pram);
	}
	public List<OtherCourse> test201(String pram){
		return this.othercourseRepository.search202(pram);
	}
	public List<OtherCourse> test202(String pram){
		return this.othercourseRepository.search203(pram);
	}
	public List<OtherCourse> test203(String pram){
		return this.othercourseRepository.search204(pram);
	}
	public List<OtherCourse> test204(String pram){
		return this.othercourseRepository.search205(pram);
	}
	public List<OtherCourse> test205(String pram){
		return this.othercourseRepository.search206(pram);
	}
	public List<OtherCourse> test206(String pram){
		return this.othercourseRepository.search207(pram);
	}
	public List<OtherCourse> test207(String pram){
		return this.othercourseRepository.search208(pram);
	}
	public List<OtherCourse> test208(String pram){
		return this.othercourseRepository.search209(pram);
	}
	public List<OtherCourse> test209(String pram){
		return this.othercourseRepository.search210(pram);
	}
	public List<OtherCourse> test210(String pram){
		return this.othercourseRepository.search211(pram);
	}
	public List<OtherCourse> test211(String pram){
		return this.othercourseRepository.search212(pram);
	}
	public List<OtherCourse> test212(String pram){
		return this.othercourseRepository.search213(pram);
	}
	public List<OtherCourse> test213(String pram){
		return this.othercourseRepository.search214(pram);
	}
	public List<OtherCourse> test214(String pram){
		return this.othercourseRepository.search215(pram);
	}
	public List<OtherCourse> test215(String pram){
		return this.othercourseRepository.search216(pram);
	}
	
	
	
	
	
	public List<OtherCourse> test216(String pram){
		return this.othercourseRepository.search217(pram);
	}
	public List<OtherCourse> test217(String pram){
		return this.othercourseRepository.search218(pram);
	}
	public List<OtherCourse> test218(String pram){
		return this.othercourseRepository.search219(pram);
	}
	public List<OtherCourse> test219(String pram){
		return this.othercourseRepository.search220(pram);
	}
	public List<OtherCourse> test220(String pram){
		return this.othercourseRepository.search221(pram);
	}
	public List<OtherCourse> test221(String pram){
		return this.othercourseRepository.search222(pram);
	}
	public List<OtherCourse> test222(String pram){
		return this.othercourseRepository.search223(pram);
	}
	public List<OtherCourse> test223(String pram){
		return this.othercourseRepository.search224(pram);
	}
	public List<OtherCourse> test224(String pram){
		return this.othercourseRepository.search225(pram);
	}
	public List<OtherCourse> test225(String pram){
		return this.othercourseRepository.search226(pram);
	}
	public List<OtherCourse> test226(String pram){
		return this.othercourseRepository.search227(pram);
	}
	public List<OtherCourse> test227(String pram){
		return this.othercourseRepository.search228(pram);
	}
	public List<OtherCourse> test228(String pram){
		return this.othercourseRepository.search229(pram);
	}
	public List<OtherCourse> test229(String pram){
		return this.othercourseRepository.search230(pram);
	}
	public List<OtherCourse> test230(String pram){
		return this.othercourseRepository.search231(pram);
	}
	public List<OtherCourse> test231(String pram){
		return this.othercourseRepository.search232(pram);
	}
	public List<OtherCourse> test232(String pram){
		return this.othercourseRepository.search233(pram);
	}
	public List<OtherCourse> test233(String pram){
		return this.othercourseRepository.search234(pram);
	}
	public List<OtherCourse> test234(String pram){
		return this.othercourseRepository.search235(pram);
	}
	public List<OtherCourse> test235(String pram){
		return this.othercourseRepository.search236(pram);
	}
	public List<OtherCourse> test236(String pram){
		return this.othercourseRepository.search237(pram);
	}
	public List<OtherCourse> test237(String pram){
		return this.othercourseRepository.search238(pram);
	}
	public List<OtherCourse> test238(String pram){
		return this.othercourseRepository.search239(pram);
	}
	public List<OtherCourse> test239(String pram){
		return this.othercourseRepository.search240(pram);
	}
	public List<OtherCourse> test240(String pram){
		return this.othercourseRepository.search241(pram);
	}
	public List<OtherCourse> test241(String pram){
		return this.othercourseRepository.search242(pram);
	}
	public List<OtherCourse> test242(String pram){
		return this.othercourseRepository.search243(pram);
	}
	
	
	
	
	
	public List<OtherCourse> test243(String pram){
		return this.othercourseRepository.search244(pram);
	}
	public List<OtherCourse> test244(String pram){
		return this.othercourseRepository.search245(pram);
	}
	public List<OtherCourse> test245(String pram){
		return this.othercourseRepository.search246(pram);
	}
	public List<OtherCourse> test246(String pram){
		return this.othercourseRepository.search247(pram);
	}
	public List<OtherCourse> test247(String pram){
		return this.othercourseRepository.search248(pram);
	}
	public List<OtherCourse> test248(String pram){
		return this.othercourseRepository.search249(pram);
	}
	public List<OtherCourse> test249(String pram){
		return this.othercourseRepository.search250(pram);
	}
	public List<OtherCourse> test250(String pram){
		return this.othercourseRepository.search251(pram);
	}
	public List<OtherCourse> test251(String pram){
		return this.othercourseRepository.search252(pram);
	}
	public List<OtherCourse> test252(String pram){
		return this.othercourseRepository.search253(pram);
	}
	public List<OtherCourse> test253(String pram){
		return this.othercourseRepository.search254(pram);
	}
	public List<OtherCourse> test254(String pram){
		return this.othercourseRepository.search255(pram);
	}
	public List<OtherCourse> test255(String pram){
		return this.othercourseRepository.search256(pram);
	}
	public List<OtherCourse> test256(String pram){
		return this.othercourseRepository.search257(pram);
	}
	public List<OtherCourse> test257(String pram){
		return this.othercourseRepository.search258(pram);
	}
	public List<OtherCourse> test258(String pram){
		return this.othercourseRepository.search259(pram);
	}
	public List<OtherCourse> test259(String pram){
		return this.othercourseRepository.search260(pram);
	}
	public List<OtherCourse> test260(String pram){
		return this.othercourseRepository.search261(pram);
	}
	public List<OtherCourse> test261(String pram){
		return this.othercourseRepository.search262(pram);
	}
	public List<OtherCourse> test262(String pram){
		return this.othercourseRepository.search263(pram);
	}
	public List<OtherCourse> test263(String pram){
		return this.othercourseRepository.search264(pram);
	}
	public List<OtherCourse> test264(String pram){
		return this.othercourseRepository.search265(pram);
	}
	public List<OtherCourse> test265(String pram){
		return this.othercourseRepository.search266(pram);
	}
	public List<OtherCourse> test266(String pram){
		return this.othercourseRepository.search267(pram);
	}
	public List<OtherCourse> test267(String pram){
		return this.othercourseRepository.search268(pram);
	}
	public List<OtherCourse> test268(String pram){
		return this.othercourseRepository.search269(pram);
	}
	public List<OtherCourse> test269(String pram){
		return this.othercourseRepository.search270(pram);
	}
	
	
	
	
	
	public List<OtherCourse> test270(String pram){
		return this.othercourseRepository.search271(pram);
	}
	public List<OtherCourse> test271(String pram){
		return this.othercourseRepository.search272(pram);
	}
	public List<OtherCourse> test272(String pram){
		return this.othercourseRepository.search273(pram);
	}
	public List<OtherCourse> test273(String pram){
		return this.othercourseRepository.search274(pram);
	}
	public List<OtherCourse> test274(String pram){
		return this.othercourseRepository.search275(pram);
	}
	public List<OtherCourse> test275(String pram){
		return this.othercourseRepository.search276(pram);
	}
	public List<OtherCourse> test276(String pram){
		return this.othercourseRepository.search277(pram);
	}
	public List<OtherCourse> test277(String pram){
		return this.othercourseRepository.search278(pram);
	}
	public List<OtherCourse> test278(String pram){
		return this.othercourseRepository.search279(pram);
	}
	public List<OtherCourse> test279(String pram){
		return this.othercourseRepository.search280(pram);
	}
	public List<OtherCourse> test280(String pram){
		return this.othercourseRepository.search281(pram);
	}
	public List<OtherCourse> test281(String pram){
		return this.othercourseRepository.search282(pram);
	}
	public List<OtherCourse> test282(String pram){
		return this.othercourseRepository.search283(pram);
	}
	public List<OtherCourse> test283(String pram){
		return this.othercourseRepository.search284(pram);
	}
	public List<OtherCourse> test284(String pram){
		return this.othercourseRepository.search285(pram);
	}
	public List<OtherCourse> test285(String pram){
		return this.othercourseRepository.search286(pram);
	}
	public List<OtherCourse> test286(String pram){
		return this.othercourseRepository.search287(pram);
	}
	public List<OtherCourse> test287(String pram){
		return this.othercourseRepository.search288(pram);
	}
	public List<OtherCourse> test288(String pram){
		return this.othercourseRepository.search289(pram);
	}
	public List<OtherCourse> test289(String pram){
		return this.othercourseRepository.search290(pram);
	}
	public List<OtherCourse> test290(String pram){
		return this.othercourseRepository.search291(pram);
	}
	public List<OtherCourse> test291(String pram){
		return this.othercourseRepository.search292(pram);
	}
	public List<OtherCourse> test292(String pram){
		return this.othercourseRepository.search293(pram);
	}
	public List<OtherCourse> test293(String pram){
		return this.othercourseRepository.search294(pram);
	}
	public List<OtherCourse> test294(String pram){
		return this.othercourseRepository.search295(pram);
	}
	public List<OtherCourse> test295(String pram){
		return this.othercourseRepository.search296(pram);
	}
	public List<OtherCourse> test296(String pram){
		return this.othercourseRepository.search297(pram);
	}
	
	
	
	
	
	public List<OtherCourse> test297(String pram){
		return this.othercourseRepository.search298(pram);
	}
	public List<OtherCourse> test298(String pram){
		return this.othercourseRepository.search299(pram);
	}
	public List<OtherCourse> test299(String pram){
		return this.othercourseRepository.search300(pram);
	}
	public List<OtherCourse> test300(String pram){
		return this.othercourseRepository.search301(pram);
	}
	public List<OtherCourse> test301(String pram){
		return this.othercourseRepository.search302(pram);
	}
	public List<OtherCourse> test302(String pram){
		return this.othercourseRepository.search303(pram);
	}
	public List<OtherCourse> test303(String pram){
		return this.othercourseRepository.search304(pram);
	}
	public List<OtherCourse> test304(String pram){
		return this.othercourseRepository.search305(pram);
	}
	public List<OtherCourse> test305(String pram){
		return this.othercourseRepository.search306(pram);
	}
	public List<OtherCourse> test306(String pram){
		return this.othercourseRepository.search307(pram);
	}
	public List<OtherCourse> test307(String pram){
		return this.othercourseRepository.search308(pram);
	}
	public List<OtherCourse> test308(String pram){
		return this.othercourseRepository.search309(pram);
	}
	public List<OtherCourse> test309(String pram){
		return this.othercourseRepository.search310(pram);
	}
	public List<OtherCourse> test310(String pram){
		return this.othercourseRepository.search311(pram);
	}
	public List<OtherCourse> test311(String pram){
		return this.othercourseRepository.search312(pram);
	}
	public List<OtherCourse> test312(String pram){
		return this.othercourseRepository.search313(pram);
	}
	public List<OtherCourse> test313(String pram){
		return this.othercourseRepository.search314(pram);
	}
	public List<OtherCourse> test314(String pram){
		return this.othercourseRepository.search315(pram);
	}
	public List<OtherCourse> test315(String pram){
		return this.othercourseRepository.search316(pram);
	}
	public List<OtherCourse> test316(String pram){
		return this.othercourseRepository.search317(pram);
	}
	public List<OtherCourse> test317(String pram){
		return this.othercourseRepository.search318(pram);
	}
	public List<OtherCourse> test318(String pram){
		return this.othercourseRepository.search319(pram);
	}
	public List<OtherCourse> test319(String pram){
		return this.othercourseRepository.search320(pram);
	}
	public List<OtherCourse> test320(String pram){
		return this.othercourseRepository.search321(pram);
	}
	public List<OtherCourse> test321(String pram){
		return this.othercourseRepository.search322(pram);
	}
	public List<OtherCourse> test322(String pram){
		return this.othercourseRepository.search323(pram);
	}
	public List<OtherCourse> test323(String pram){
		return this.othercourseRepository.search324(pram);
	}
	
	
	
	
	
	public List<OtherCourse> test324(String pram){
		return this.othercourseRepository.search325(pram);
	}
	public List<OtherCourse> test325(String pram){
		return this.othercourseRepository.search326(pram);
	}
	public List<OtherCourse> test326(String pram){
		return this.othercourseRepository.search327(pram);
	}
	public List<OtherCourse> test327(String pram){
		return this.othercourseRepository.search328(pram);
	}
	public List<OtherCourse> test328(String pram){
		return this.othercourseRepository.search329(pram);
	}
	public List<OtherCourse> test329(String pram){
		return this.othercourseRepository.search330(pram);
	}
	public List<OtherCourse> test330(String pram){
		return this.othercourseRepository.search331(pram);
	}
	public List<OtherCourse> test331(String pram){
		return this.othercourseRepository.search332(pram);
	}
	public List<OtherCourse> test332(String pram){
		return this.othercourseRepository.search333(pram);
	}
	public List<OtherCourse> test333(String pram){
		return this.othercourseRepository.search334(pram);
	}
	public List<OtherCourse> test334(String pram){
		return this.othercourseRepository.search335(pram);
	}
	public List<OtherCourse> test335(String pram){
		return this.othercourseRepository.search336(pram);
	}
	public List<OtherCourse> test336(String pram){
		return this.othercourseRepository.search337(pram);
	}
	public List<OtherCourse> test337(String pram){
		return this.othercourseRepository.search338(pram);
	}
	public List<OtherCourse> test338(String pram){
		return this.othercourseRepository.search339(pram);
	}
	public List<OtherCourse> test339(String pram){
		return this.othercourseRepository.search340(pram);
	}
	public List<OtherCourse> test340(String pram){
		return this.othercourseRepository.search341(pram);
	}
	public List<OtherCourse> test341(String pram){
		return this.othercourseRepository.search342(pram);
	}
	public List<OtherCourse> test342(String pram){
		return this.othercourseRepository.search343(pram);
	}
	public List<OtherCourse> test343(String pram){
		return this.othercourseRepository.search344(pram);
	}
	public List<OtherCourse> test344(String pram){
		return this.othercourseRepository.search345(pram);
	}
	public List<OtherCourse> test345(String pram){
		return this.othercourseRepository.search346(pram);
	}
	public List<OtherCourse> test346(String pram){
		return this.othercourseRepository.search347(pram);
	}
	public List<OtherCourse> test347(String pram){
		return this.othercourseRepository.search348(pram);
	}
	public List<OtherCourse> test348(String pram){
		return this.othercourseRepository.search349(pram);
	}
	public List<OtherCourse> test349(String pram){
		return this.othercourseRepository.search350(pram);
	}
	public List<OtherCourse> test350(String pram){
		return this.othercourseRepository.search351(pram);
	}
	
	
	
	
	
	
	
	public List<OtherCourse> test351(String pram){
		return this.othercourseRepository.search352(pram);
	}
	public List<OtherCourse> test352(String pram){
		return this.othercourseRepository.search353(pram);
	}
	public List<OtherCourse> test353(String pram){
		return this.othercourseRepository.search354(pram);
	}
	public List<OtherCourse> test354(String pram){
		return this.othercourseRepository.search355(pram);
	}
	public List<OtherCourse> test355(String pram){
		return this.othercourseRepository.search356(pram);
	}
	public List<OtherCourse> test356(String pram){
		return this.othercourseRepository.search357(pram);
	}
	public List<OtherCourse> test357(String pram){
		return this.othercourseRepository.search358(pram);
	}
	public List<OtherCourse> test358(String pram){
		return this.othercourseRepository.search359(pram);
	}
	public List<OtherCourse> test359(String pram){
		return this.othercourseRepository.search360(pram);
	}
	public List<OtherCourse> test360(String pram){
		return this.othercourseRepository.search361(pram);
	}
	public List<OtherCourse> test361(String pram){
		return this.othercourseRepository.search362(pram);
	}
	public List<OtherCourse> test362(String pram){
		return this.othercourseRepository.search363(pram);
	}
	public List<OtherCourse> test363(String pram){
		return this.othercourseRepository.search364(pram);
	}
	public List<OtherCourse> test364(String pram){
		return this.othercourseRepository.search365(pram);
	}
	public List<OtherCourse> test365(String pram){
		return this.othercourseRepository.search366(pram);
	}
	public List<OtherCourse> test366(String pram){
		return this.othercourseRepository.search367(pram);
	}
	public List<OtherCourse> test367(String pram){
		return this.othercourseRepository.search368(pram);
	}
	public List<OtherCourse> test368(String pram){
		return this.othercourseRepository.search369(pram);
	}
	public List<OtherCourse> test369(String pram){
		return this.othercourseRepository.search370(pram);
	}
	public List<OtherCourse> test370(String pram){
		return this.othercourseRepository.search371(pram);
	}
	public List<OtherCourse> test371(String pram){
		return this.othercourseRepository.search372(pram);
	}
	public List<OtherCourse> test372(String pram){
		return this.othercourseRepository.search373(pram);
	}
	public List<OtherCourse> test373(String pram){
		return this.othercourseRepository.search374(pram);
	}
	public List<OtherCourse> test374(String pram){
		return this.othercourseRepository.search375(pram);
	}
	public List<OtherCourse> test375(String pram){
		return this.othercourseRepository.search376(pram);
	}
	public List<OtherCourse> test376(String pram){
		return this.othercourseRepository.search377(pram);
	}
	public List<OtherCourse> test377(String pram){
		return this.othercourseRepository.search378(pram);
	}
	
	
	
	
	
	public List<OtherCourse> test378(String pram){
		return this.othercourseRepository.search379(pram);
	}
	public List<OtherCourse> test379(String pram){
		return this.othercourseRepository.search380(pram);
	}
	public List<OtherCourse> test380(String pram){
		return this.othercourseRepository.search381(pram);
	}
	public List<OtherCourse> test381(String pram){
		return this.othercourseRepository.search382(pram);
	}
	public List<OtherCourse> test382(String pram){
		return this.othercourseRepository.search383(pram);
	}
	public List<OtherCourse> test383(String pram){
		return this.othercourseRepository.search384(pram);
	}
	public List<OtherCourse> test384(String pram){
		return this.othercourseRepository.search385(pram);
	}
	public List<OtherCourse> test385(String pram){
		return this.othercourseRepository.search386(pram);
	}
	public List<OtherCourse> test386(String pram){
		return this.othercourseRepository.search387(pram);
	}
	public List<OtherCourse> test387(String pram){
		return this.othercourseRepository.search388(pram);
	}
	public List<OtherCourse> test388(String pram){
		return this.othercourseRepository.search389(pram);
	}
	public List<OtherCourse> test389(String pram){
		return this.othercourseRepository.search390(pram);
	}
	public List<OtherCourse> test390(String pram){
		return this.othercourseRepository.search391(pram);
	}
	public List<OtherCourse> test391(String pram){
		return this.othercourseRepository.search392(pram);
	}
	public List<OtherCourse> test392(String pram){
		return this.othercourseRepository.search393(pram);
	}
	public List<OtherCourse> test393(String pram){
		return this.othercourseRepository.search394(pram);
	}
	public List<OtherCourse> test394(String pram){
		return this.othercourseRepository.search395(pram);
	}
	public List<OtherCourse> test395(String pram){
		return this.othercourseRepository.search396(pram);
	}
	public List<OtherCourse> test396(String pram){
		return this.othercourseRepository.search397(pram);
	}
	public List<OtherCourse> test397(String pram){
		return this.othercourseRepository.search398(pram);
	}
	public List<OtherCourse> test398(String pram){
		return this.othercourseRepository.search399(pram);
	}
	public List<OtherCourse> test399(String pram){
		return this.othercourseRepository.search400(pram);
	}
	public List<OtherCourse> test400(String pram){
		return this.othercourseRepository.search401(pram);
	}
	public List<OtherCourse> test401(String pram){
		return this.othercourseRepository.search402(pram);
	}
	public List<OtherCourse> test402(String pram){
		return this.othercourseRepository.search403(pram);
	}
	public List<OtherCourse> test403(String pram){
		return this.othercourseRepository.search404(pram);
	}
	public List<OtherCourse> test404(String pram){
		return this.othercourseRepository.search405(pram);
	}
	
	
	
	
	
	
	public List<OtherCourse> test405(String pram){
		return this.othercourseRepository.search406(pram);
	}
	public List<OtherCourse> test406(String pram){
		return this.othercourseRepository.search407(pram);
	}
	public List<OtherCourse> test407(String pram){
		return this.othercourseRepository.search408(pram);
	}
	public List<OtherCourse> test408(String pram){
		return this.othercourseRepository.search409(pram);
	}
	public List<OtherCourse> test409(String pram){
		return this.othercourseRepository.search410(pram);
	}
	public List<OtherCourse> test410(String pram){
		return this.othercourseRepository.search411(pram);
	}
	public List<OtherCourse> test411(String pram){
		return this.othercourseRepository.search412(pram);
	}
	public List<OtherCourse> test412(String pram){
		return this.othercourseRepository.search413(pram);
	}
	public List<OtherCourse> test413(String pram){
		return this.othercourseRepository.search414(pram);
	}
	public List<OtherCourse> test414(String pram){
		return this.othercourseRepository.search415(pram);
	}
	public List<OtherCourse> test415(String pram){
		return this.othercourseRepository.search416(pram);
	}
	public List<OtherCourse> test416(String pram){
		return this.othercourseRepository.search417(pram);
	}
	public List<OtherCourse> test417(String pram){
		return this.othercourseRepository.search418(pram);
	}
	public List<OtherCourse> test418(String pram){
		return this.othercourseRepository.search419(pram);
	}
	public List<OtherCourse> test419(String pram){
		return this.othercourseRepository.search420(pram);
	}
	public List<OtherCourse> test420(String pram){
		return this.othercourseRepository.search421(pram);
	}
	public List<OtherCourse> test421(String pram){
		return this.othercourseRepository.search422(pram);
	}
	public List<OtherCourse> test422(String pram){
		return this.othercourseRepository.search423(pram);
	}
	public List<OtherCourse> test423(String pram){
		return this.othercourseRepository.search424(pram);
	}
	public List<OtherCourse> test424(String pram){
		return this.othercourseRepository.search425(pram);
	}
	public List<OtherCourse> test425(String pram){
		return this.othercourseRepository.search426(pram);
	}
	public List<OtherCourse> test426(String pram){
		return this.othercourseRepository.search427(pram);
	}
	public List<OtherCourse> test427(String pram){
		return this.othercourseRepository.search428(pram);
	}
	public List<OtherCourse> test428(String pram){
		return this.othercourseRepository.search429(pram);
	}
	public List<OtherCourse> test429(String pram){
		return this.othercourseRepository.search430(pram);
	}
	public List<OtherCourse> test430(String pram){
		return this.othercourseRepository.search431(pram);
	}
	public List<OtherCourse> test431(String pram){
		return this.othercourseRepository.search432(pram);
	}
	
	
	
	
	
	
	public List<OtherCourse> test432(String pram){
		return this.othercourseRepository.search433(pram);
	}
	public List<OtherCourse> test433(String pram){
		return this.othercourseRepository.search434(pram);
	}
	public List<OtherCourse> test434(String pram){
		return this.othercourseRepository.search435(pram);
	}
	public List<OtherCourse> test435(String pram){
		return this.othercourseRepository.search436(pram);
	}
	public List<OtherCourse> test436(String pram){
		return this.othercourseRepository.search437(pram);
	}
	public List<OtherCourse> test437(String pram){
		return this.othercourseRepository.search438(pram);
	}
	public List<OtherCourse> test438(String pram){
		return this.othercourseRepository.search439(pram);
	}
	public List<OtherCourse> test439(String pram){
		return this.othercourseRepository.search440(pram);
	}
	public List<OtherCourse> test440(String pram){
		return this.othercourseRepository.search441(pram);
	}
	public List<OtherCourse> test441(String pram){
		return this.othercourseRepository.search442(pram);
	}
	public List<OtherCourse> test442(String pram){
		return this.othercourseRepository.search443(pram);
	}
	public List<OtherCourse> test443(String pram){
		return this.othercourseRepository.search444(pram);
	}
	public List<OtherCourse> test444(String pram){
		return this.othercourseRepository.search445(pram);
	}
	public List<OtherCourse> test445(String pram){
		return this.othercourseRepository.search446(pram);
	}
	public List<OtherCourse> test446(String pram){
		return this.othercourseRepository.search447(pram);
	}
	public List<OtherCourse> test447(String pram){
		return this.othercourseRepository.search448(pram);
	}
	public List<OtherCourse> test448(String pram){
		return this.othercourseRepository.search449(pram);
	}
	public List<OtherCourse> test449(String pram){
		return this.othercourseRepository.search450(pram);
	}
	public List<OtherCourse> test450(String pram){
		return this.othercourseRepository.search451(pram);
	}
	public List<OtherCourse> test451(String pram){
		return this.othercourseRepository.search452(pram);
	}
	public List<OtherCourse> test452(String pram){
		return this.othercourseRepository.search453(pram);
	}
	public List<OtherCourse> test453(String pram){
		return this.othercourseRepository.search454(pram);
	}
	public List<OtherCourse> test454(String pram){
		return this.othercourseRepository.search455(pram);
	}
	public List<OtherCourse> test455(String pram){
		return this.othercourseRepository.search456(pram);
	}
	public List<OtherCourse> test456(String pram){
		return this.othercourseRepository.search457(pram);
	}
	public List<OtherCourse> test457(String pram){
		return this.othercourseRepository.search458(pram);
	}
	public List<OtherCourse> test458(String pram){
		return this.othercourseRepository.search459(pram);
	}
	
	
	
	
	
	
	public List<OtherCourse> test459(String pram){
		return this.othercourseRepository.search460(pram);
	}
	public List<OtherCourse> test460(String pram){
		return this.othercourseRepository.search461(pram);
	}
	public List<OtherCourse> test461(String pram){
		return this.othercourseRepository.search462(pram);
	}
	public List<OtherCourse> test462(String pram){
		return this.othercourseRepository.search463(pram);
	}
	public List<OtherCourse> test463(String pram){
		return this.othercourseRepository.search464(pram);
	}
	public List<OtherCourse> test464(String pram){
		return this.othercourseRepository.search465(pram);
	}
	public List<OtherCourse> test465(String pram){
		return this.othercourseRepository.search466(pram);
	}
	public List<OtherCourse> test466(String pram){
		return this.othercourseRepository.search467(pram);
	}
	public List<OtherCourse> test467(String pram){
		return this.othercourseRepository.search468(pram);
	}
	public List<OtherCourse> test468(String pram){
		return this.othercourseRepository.search469(pram);
	}
	public List<OtherCourse> test469(String pram){
		return this.othercourseRepository.search470(pram);
	}
	public List<OtherCourse> test470(String pram){
		return this.othercourseRepository.search471(pram);
	}
	public List<OtherCourse> test471(String pram){
		return this.othercourseRepository.search472(pram);
	}
	public List<OtherCourse> test472(String pram){
		return this.othercourseRepository.search473(pram);
	}
	public List<OtherCourse> test473(String pram){
		return this.othercourseRepository.search474(pram);
	}
	public List<OtherCourse> test474(String pram){
		return this.othercourseRepository.search475(pram);
	}
	public List<OtherCourse> test475(String pram){
		return this.othercourseRepository.search476(pram);
	}
	public List<OtherCourse> test476(String pram){
		return this.othercourseRepository.search477(pram);
	}
	public List<OtherCourse> test477(String pram){
		return this.othercourseRepository.search478(pram);
	}
	public List<OtherCourse> test478(String pram){
		return this.othercourseRepository.search479(pram);
	}
	public List<OtherCourse> test479(String pram){
		return this.othercourseRepository.search480(pram);
	}
	public List<OtherCourse> test480(String pram){
		return this.othercourseRepository.search481(pram);
	}
	public List<OtherCourse> test481(String pram){
		return this.othercourseRepository.search482(pram);
	}
	public List<OtherCourse> test482(String pram){
		return this.othercourseRepository.search483(pram);
	}
	public List<OtherCourse> test483(String pram){
		return this.othercourseRepository.search484(pram);
	}
	public List<OtherCourse> test484(String pram){
		return this.othercourseRepository.search485(pram);
	}
	public List<OtherCourse> test485(String pram){
		return this.othercourseRepository.search486(pram);
	}
	
	
	
	
	
	
	public List<OtherCourse> test486(String pram){
		return this.othercourseRepository.search487(pram);
	}
	public List<OtherCourse> test487(String pram){
		return this.othercourseRepository.search488(pram);
	}
	public List<OtherCourse> test488(String pram){
		return this.othercourseRepository.search489(pram);
	}
	public List<OtherCourse> test489(String pram){
		return this.othercourseRepository.search490(pram);
	}
	public List<OtherCourse> test490(String pram){
		return this.othercourseRepository.search491(pram);
	}
	public List<OtherCourse> test491(String pram){
		return this.othercourseRepository.search492(pram);
	}
	public List<OtherCourse> test492(String pram){
		return this.othercourseRepository.search493(pram);
	}
	public List<OtherCourse> test493(String pram){
		return this.othercourseRepository.search494(pram);
	}
	public List<OtherCourse> test494(String pram){
		return this.othercourseRepository.search495(pram);
	}
	public List<OtherCourse> test495(String pram){
		return this.othercourseRepository.search496(pram);
	}
	public List<OtherCourse> test496(String pram){
		return this.othercourseRepository.search497(pram);
	}
	public List<OtherCourse> test497(String pram){
		return this.othercourseRepository.search498(pram);
	}
	public List<OtherCourse> test498(String pram){
		return this.othercourseRepository.search499(pram);
	}
	public List<OtherCourse> test499(String pram){
		return this.othercourseRepository.search500(pram);
	}
	public List<OtherCourse> test500(String pram){
		return this.othercourseRepository.search501(pram);
	}
	public List<OtherCourse> test501(String pram){
		return this.othercourseRepository.search502(pram);
	}
	public List<OtherCourse> test502(String pram){
		return this.othercourseRepository.search503(pram);
	}
	public List<OtherCourse> test503(String pram){
		return this.othercourseRepository.search504(pram);
	}
	public List<OtherCourse> test504(String pram){
		return this.othercourseRepository.search505(pram);
	}
	public List<OtherCourse> test505(String pram){
		return this.othercourseRepository.search506(pram);
	}
	public List<OtherCourse> test506(String pram){
		return this.othercourseRepository.search507(pram);
	}
	public List<OtherCourse> test507(String pram){
		return this.othercourseRepository.search508(pram);
	}
	public List<OtherCourse> test508(String pram){
		return this.othercourseRepository.search509(pram);
	}
	public List<OtherCourse> test509(String pram){
		return this.othercourseRepository.search510(pram);
	}
	public List<OtherCourse> test510(String pram){
		return this.othercourseRepository.search511(pram);
	}
	public List<OtherCourse> test511(String pram){
		return this.othercourseRepository.search512(pram);
	}
	public List<OtherCourse> test512(String pram){
		return this.othercourseRepository.search513(pram);
	}
	
	
	
	
	
	
	public List<OtherCourse> test513(String pram){
		return this.othercourseRepository.search514(pram);
	}
	public List<OtherCourse> test514(String pram){
		return this.othercourseRepository.search515(pram);
	}
	public List<OtherCourse> test515(String pram){
		return this.othercourseRepository.search516(pram);
	}
	public List<OtherCourse> test516(String pram){
		return this.othercourseRepository.search517(pram);
	}
	public List<OtherCourse> test517(String pram){
		return this.othercourseRepository.search518(pram);
	}
	public List<OtherCourse> test518(String pram){
		return this.othercourseRepository.search519(pram);
	}
	public List<OtherCourse> test519(String pram){
		return this.othercourseRepository.search520(pram);
	}
	public List<OtherCourse> test520(String pram){
		return this.othercourseRepository.search521(pram);
	}
	public List<OtherCourse> test521(String pram){
		return this.othercourseRepository.search522(pram);
	}
	public List<OtherCourse> test522(String pram){
		return this.othercourseRepository.search523(pram);
	}
	public List<OtherCourse> test523(String pram){
		return this.othercourseRepository.search524(pram);
	}
	public List<OtherCourse> test524(String pram){
		return this.othercourseRepository.search525(pram);
	}
	public List<OtherCourse> test525(String pram){
		return this.othercourseRepository.search526(pram);
	}
	public List<OtherCourse> test526(String pram){
		return this.othercourseRepository.search527(pram);
	}
	public List<OtherCourse> test527(String pram){
		return this.othercourseRepository.search528(pram);
	}
	public List<OtherCourse> test528(String pram){
		return this.othercourseRepository.search529(pram);
	}
	public List<OtherCourse> test529(String pram){
		return this.othercourseRepository.search530(pram);
	}
	public List<OtherCourse> test530(String pram){
		return this.othercourseRepository.search531(pram);
	}
	public List<OtherCourse> test531(String pram){
		return this.othercourseRepository.search532(pram);
	}
	public List<OtherCourse> test532(String pram){
		return this.othercourseRepository.search533(pram);
	}
	public List<OtherCourse> test533(String pram){
		return this.othercourseRepository.search534(pram);
	}
	public List<OtherCourse> test534(String pram){
		return this.othercourseRepository.search535(pram);
	}
	public List<OtherCourse> test535(String pram){
		return this.othercourseRepository.search536(pram);
	}
	public List<OtherCourse> test536(String pram){
		return this.othercourseRepository.search537(pram);
	}
	public List<OtherCourse> test537(String pram){
		return this.othercourseRepository.search538(pram);
	}
	public List<OtherCourse> test538(String pram){
		return this.othercourseRepository.search539(pram);
	}
	public List<OtherCourse> test539(String pram){
		return this.othercourseRepository.search540(pram);
	}
	
	
	
	
	
	
	public List<OtherCourse> test540(String pram){
		return this.othercourseRepository.search541(pram);
	}
	public List<OtherCourse> test541(String pram){
		return this.othercourseRepository.search542(pram);
	}
	public List<OtherCourse> test542(String pram){
		return this.othercourseRepository.search543(pram);
	}
	public List<OtherCourse> test543(String pram){
		return this.othercourseRepository.search544(pram);
	}
	public List<OtherCourse> test544(String pram){
		return this.othercourseRepository.search545(pram);
	}
	public List<OtherCourse> test545(String pram){
		return this.othercourseRepository.search546(pram);
	}
	public List<OtherCourse> test546(String pram){
		return this.othercourseRepository.search547(pram);
	}
	public List<OtherCourse> test547(String pram){
		return this.othercourseRepository.search548(pram);
	}
	public List<OtherCourse> test548(String pram){
		return this.othercourseRepository.search549(pram);
	}
	public List<OtherCourse> test549(String pram){
		return this.othercourseRepository.search550(pram);
	}
	public List<OtherCourse> test550(String pram){
		return this.othercourseRepository.search551(pram);
	}
	public List<OtherCourse> test551(String pram){
		return this.othercourseRepository.search552(pram);
	}
	public List<OtherCourse> test552(String pram){
		return this.othercourseRepository.search553(pram);
	}
	public List<OtherCourse> test553(String pram){
		return this.othercourseRepository.search554(pram);
	}
	public List<OtherCourse> test554(String pram){
		return this.othercourseRepository.search555(pram);
	}
	public List<OtherCourse> test555(String pram){
		return this.othercourseRepository.search556(pram);
	}
	public List<OtherCourse> test556(String pram){
		return this.othercourseRepository.search557(pram);
	}
	public List<OtherCourse> test557(String pram){
		return this.othercourseRepository.search558(pram);
	}
	public List<OtherCourse> test558(String pram){
		return this.othercourseRepository.search559(pram);
	}
	public List<OtherCourse> test559(String pram){
		return this.othercourseRepository.search560(pram);
	}
	public List<OtherCourse> test560(String pram){
		return this.othercourseRepository.search561(pram);
	}
	public List<OtherCourse> test561(String pram){
		return this.othercourseRepository.search562(pram);
	}
	public List<OtherCourse> test562(String pram){
		return this.othercourseRepository.search563(pram);
	}
	public List<OtherCourse> test563(String pram){
		return this.othercourseRepository.search564(pram);
	}
	public List<OtherCourse> test564(String pram){
		return this.othercourseRepository.search565(pram);
	}
	public List<OtherCourse> test565(String pram){
		return this.othercourseRepository.search566(pram);
	}
	public List<OtherCourse> test566(String pram){
		return this.othercourseRepository.search567(pram);
	}
	
	
	
	
	
	
	public List<OtherCourse> test567(String pram){
		return this.othercourseRepository.search568(pram);
	}
	public List<OtherCourse> test568(String pram){
		return this.othercourseRepository.search569(pram);
	}
	public List<OtherCourse> test569(String pram){
		return this.othercourseRepository.search570(pram);
	}
	public List<OtherCourse> test570(String pram){
		return this.othercourseRepository.search571(pram);
	}
	public List<OtherCourse> test571(String pram){
		return this.othercourseRepository.search572(pram);
	}
	public List<OtherCourse> test572(String pram){
		return this.othercourseRepository.search573(pram);
	}
	public List<OtherCourse> test573(String pram){
		return this.othercourseRepository.search574(pram);
	}
	public List<OtherCourse> test574(String pram){
		return this.othercourseRepository.search575(pram);
	}
	public List<OtherCourse> test575(String pram){
		return this.othercourseRepository.search576(pram);
	}
	public List<OtherCourse> test576(String pram){
		return this.othercourseRepository.search577(pram);
	}
	public List<OtherCourse> test577(String pram){
		return this.othercourseRepository.search578(pram);
	}
	public List<OtherCourse> test578(String pram){
		return this.othercourseRepository.search579(pram);
	}
	public List<OtherCourse> test579(String pram){
		return this.othercourseRepository.search580(pram);
	}
	public List<OtherCourse> test580(String pram){
		return this.othercourseRepository.search581(pram);
	}
	public List<OtherCourse> test581(String pram){
		return this.othercourseRepository.search582(pram);
	}
	public List<OtherCourse> test582(String pram){
		return this.othercourseRepository.search583(pram);
	}
	public List<OtherCourse> test583(String pram){
		return this.othercourseRepository.search584(pram);
	}
	public List<OtherCourse> test584(String pram){
		return this.othercourseRepository.search585(pram);
	}
	public List<OtherCourse> test585(String pram){
		return this.othercourseRepository.search586(pram);
	}
	public List<OtherCourse> test586(String pram){
		return this.othercourseRepository.search587(pram);
	}
	public List<OtherCourse> test587(String pram){
		return this.othercourseRepository.search588(pram);
	}
	public List<OtherCourse> test588(String pram){
		return this.othercourseRepository.search589(pram);
	}
	public List<OtherCourse> test589(String pram){
		return this.othercourseRepository.search590(pram);
	}
	public List<OtherCourse> test590(String pram){
		return this.othercourseRepository.search591(pram);
	}
	public List<OtherCourse> test591(String pram){
		return this.othercourseRepository.search592(pram);
	}
	public List<OtherCourse> test592(String pram){
		return this.othercourseRepository.search593(pram);
	}
	public List<OtherCourse> test593(String pram){
		return this.othercourseRepository.search594(pram);
	}
	
	
	
	
	
	
	public List<OtherCourse> test594(String pram){
		return this.othercourseRepository.search595(pram);
	}
	public List<OtherCourse> test595(String pram){
		return this.othercourseRepository.search596(pram);
	}
	public List<OtherCourse> test596(String pram){
		return this.othercourseRepository.search597(pram);
	}
	public List<OtherCourse> test597(String pram){
		return this.othercourseRepository.search598(pram);
	}
	public List<OtherCourse> test598(String pram){
		return this.othercourseRepository.search599(pram);
	}
	public List<OtherCourse> test599(String pram){
		return this.othercourseRepository.search600(pram);
	}
	public List<OtherCourse> test600(String pram){
		return this.othercourseRepository.search601(pram);
	}
	public List<OtherCourse> test601(String pram){
		return this.othercourseRepository.search602(pram);
	}
	public List<OtherCourse> test602(String pram){
		return this.othercourseRepository.search603(pram);
	}
	public List<OtherCourse> test603(String pram){
		return this.othercourseRepository.search604(pram);
	}
	public List<OtherCourse> test604(String pram){
		return this.othercourseRepository.search605(pram);
	}
	public List<OtherCourse> test605(String pram){
		return this.othercourseRepository.search606(pram);
	}
	public List<OtherCourse> test606(String pram){
		return this.othercourseRepository.search607(pram);
	}
	public List<OtherCourse> test607(String pram){
		return this.othercourseRepository.search608(pram);
	}
	public List<OtherCourse> test608(String pram){
		return this.othercourseRepository.search609(pram);
	}
	public List<OtherCourse> test609(String pram){
		return this.othercourseRepository.search610(pram);
	}
	public List<OtherCourse> test610(String pram){
		return this.othercourseRepository.search611(pram);
	}
	public List<OtherCourse> test611(String pram){
		return this.othercourseRepository.search612(pram);
	}
	public List<OtherCourse> test612(String pram){
		return this.othercourseRepository.search613(pram);
	}
	public List<OtherCourse> test613(String pram){
		return this.othercourseRepository.search614(pram);
	}
	public List<OtherCourse> test614(String pram){
		return this.othercourseRepository.search615(pram);
	}
	public List<OtherCourse> test615(String pram){
		return this.othercourseRepository.search616(pram);
	}
	public List<OtherCourse> test616(String pram){
		return this.othercourseRepository.search617(pram);
	}
	public List<OtherCourse> test617(String pram){
		return this.othercourseRepository.search618(pram);
	}
	public List<OtherCourse> test618(String pram){
		return this.othercourseRepository.search619(pram);
	}
	public List<OtherCourse> test619(String pram){
		return this.othercourseRepository.search620(pram);
	}
	public List<OtherCourse> test620(String pram){
		return this.othercourseRepository.search621(pram);
	}
	
	
	
	
	
	
	
	public List<OtherCourse> test621(String pram){
		return this.othercourseRepository.search622(pram);
	}
	public List<OtherCourse> test622(String pram){
		return this.othercourseRepository.search623(pram);
	}
	public List<OtherCourse> test623(String pram){
		return this.othercourseRepository.search624(pram);
	}
	public List<OtherCourse> test624(String pram){
		return this.othercourseRepository.search625(pram);
	}
	public List<OtherCourse> test625(String pram){
		return this.othercourseRepository.search626(pram);
	}
	public List<OtherCourse> test626(String pram){
		return this.othercourseRepository.search627(pram);
	}
	public List<OtherCourse> test627(String pram){
		return this.othercourseRepository.search628(pram);
	}
	public List<OtherCourse> test628(String pram){
		return this.othercourseRepository.search629(pram);
	}
	public List<OtherCourse> test629(String pram){
		return this.othercourseRepository.search630(pram);
	}
	public List<OtherCourse> test630(String pram){
		return this.othercourseRepository.search631(pram);
	}
	public List<OtherCourse> test631(String pram){
		return this.othercourseRepository.search632(pram);
	}
	public List<OtherCourse> test632(String pram){
		return this.othercourseRepository.search633(pram);
	}
	public List<OtherCourse> test633(String pram){
		return this.othercourseRepository.search634(pram);
	}
	public List<OtherCourse> test634(String pram){
		return this.othercourseRepository.search635(pram);
	}
	public List<OtherCourse> test635(String pram){
		return this.othercourseRepository.search636(pram);
	}
	public List<OtherCourse> test636(String pram){
		return this.othercourseRepository.search637(pram);
	}
	public List<OtherCourse> test637(String pram){
		return this.othercourseRepository.search638(pram);
	}
	public List<OtherCourse> test638(String pram){
		return this.othercourseRepository.search639(pram);
	}
	public List<OtherCourse> test639(String pram){
		return this.othercourseRepository.search640(pram);
	}
	public List<OtherCourse> test640(String pram){
		return this.othercourseRepository.search641(pram);
	}
	public List<OtherCourse> test641(String pram){
		return this.othercourseRepository.search642(pram);
	}
	public List<OtherCourse> test642(String pram){
		return this.othercourseRepository.search643(pram);
	}
	public List<OtherCourse> test643(String pram){
		return this.othercourseRepository.search644(pram);
	}
	public List<OtherCourse> test644(String pram){
		return this.othercourseRepository.search645(pram);
	}
	public List<OtherCourse> test645(String pram){
		return this.othercourseRepository.search646(pram);
	}
	public List<OtherCourse> test646(String pram){
		return this.othercourseRepository.search647(pram);
	}
	public List<OtherCourse> test647(String pram){
		return this.othercourseRepository.search648(pram);
	}
	
	
	
	
	
	
	public List<OtherCourse> test648(String pram){
		return this.othercourseRepository.search649(pram);
	}
	public List<OtherCourse> test649(String pram){
		return this.othercourseRepository.search650(pram);
	}
	public List<OtherCourse> test650(String pram){
		return this.othercourseRepository.search651(pram);
	}
	public List<OtherCourse> test651(String pram){
		return this.othercourseRepository.search652(pram);
	}
	public List<OtherCourse> test652(String pram){
		return this.othercourseRepository.search653(pram);
	}
	public List<OtherCourse> test653(String pram){
		return this.othercourseRepository.search654(pram);
	}
	public List<OtherCourse> test654(String pram){
		return this.othercourseRepository.search655(pram);
	}
	public List<OtherCourse> test655(String pram){
		return this.othercourseRepository.search656(pram);
	}
	public List<OtherCourse> test656(String pram){
		return this.othercourseRepository.search657(pram);
	}
	public List<OtherCourse> test657(String pram){
		return this.othercourseRepository.search658(pram);
	}
	public List<OtherCourse> test658(String pram){
		return this.othercourseRepository.search659(pram);
	}
	public List<OtherCourse> test659(String pram){
		return this.othercourseRepository.search660(pram);
	}
	public List<OtherCourse> test660(String pram){
		return this.othercourseRepository.search661(pram);
	}
	public List<OtherCourse> test661(String pram){
		return this.othercourseRepository.search662(pram);
	}
	public List<OtherCourse> test662(String pram){
		return this.othercourseRepository.search663(pram);
	}
	public List<OtherCourse> test663(String pram){
		return this.othercourseRepository.search664(pram);
	}
	public List<OtherCourse> test664(String pram){
		return this.othercourseRepository.search665(pram);
	}
	public List<OtherCourse> test665(String pram){
		return this.othercourseRepository.search666(pram);
	}
	public List<OtherCourse> test666(String pram){
		return this.othercourseRepository.search667(pram);
	}
	public List<OtherCourse> test667(String pram){
		return this.othercourseRepository.search668(pram);
	}
	public List<OtherCourse> test668(String pram){
		return this.othercourseRepository.search669(pram);
	}
	public List<OtherCourse> test669(String pram){
		return this.othercourseRepository.search670(pram);
	}
	public List<OtherCourse> test670(String pram){
		return this.othercourseRepository.search671(pram);
	}
	public List<OtherCourse> test671(String pram){
		return this.othercourseRepository.search672(pram);
	}
	public List<OtherCourse> test672(String pram){
		return this.othercourseRepository.search673(pram);
	}
	public List<OtherCourse> test673(String pram){
		return this.othercourseRepository.search674(pram);
	}
	public List<OtherCourse> test674(String pram){
		return this.othercourseRepository.search675(pram);
	}
	/* 추가된코드 */
	
	
}

