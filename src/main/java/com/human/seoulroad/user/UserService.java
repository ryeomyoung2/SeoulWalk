package com.human.seoulroad.user;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {
	
	private final UserRepository userRepository;
	//private final PasswordEncoder passwordEncoder;
	
	// 회원 데이터 생성 메서드
	public SiteUser create(String nickname, String email) {
		SiteUser user = new SiteUser();
		user.setNickname(nickname);
		user.setEmail(email);
		
		// 
		this.userRepository.save(user);
		return user;
	}

}
