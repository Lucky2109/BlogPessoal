package com.generation.blog02.security;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.generation.blog02.model.Usuario;

public class UserDetailsImpl implements UserDetails {
	private static final long serialVersionUID = 1L;
	private String userName; //user(email0
	private String password;//senha
	private List<GrantedAuthority> authorities;
	//essa classe consegue passar os niveis de acesso de um usuario

	public UserDetailsImpl(Usuario user) {
		this.userName = user.getUsuario();
		this.password = user.getSenha();
						
	}
	public UserDetailsImpl() {
		
	}
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
