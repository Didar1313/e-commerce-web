package com.sheryians.major.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.sheryians.major.model.CustomUserDetail;
import com.sheryians.major.model.User;
import com.sheryians.major.repository.UserRepository;
import java.util.Optional;

public class CustomUserDetailService implements UserDetailsService{
	@Autowired
	UserRepository userRepository; 
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Optional<User>user=userRepository.findUserByEmail(email);
		user.orElseThrow(() -> new UsernameNotFoundException("user nai haha"));
		return user.map(CustomUserDetail::new).get();
	}

}
