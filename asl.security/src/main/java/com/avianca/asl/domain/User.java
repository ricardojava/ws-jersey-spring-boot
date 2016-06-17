package com.avianca.asl.domain;

import java.io.Serializable;
/**
 * 
 * @author CBYK - Ricardo Almeida
 * @since 16/06/2016
 * @version 1.0.0 Classe de dominio para retornar informações do usuário
 */
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private String user;
	private String password;
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
