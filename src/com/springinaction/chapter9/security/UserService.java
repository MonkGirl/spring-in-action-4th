package com.springinaction.chapter9.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.springinaction.chapter5.spittr.entity.Spitter;
import com.springinaction.chapter9.data.SpitterRepository;

public class UserService implements UserDetailsService{
	
	private final SpitterRepository spitterRepository;
	
	public UserService(SpitterRepository spitterRepository) {
		this.spitterRepository = spitterRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Spitter spitter = spitterRepository.findByUsername(username);
		if(spitter != null) {
			List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
			//创建权限列表
			authorities.add(new SimpleGrantedAuthority("ROLE_SPITTER"));
			return new User(spitter.getUsername(), spitter.getPassword(), authorities);
		}
		throw new UsernameNotFoundException("User '" + username + "' not found");
	}

}
