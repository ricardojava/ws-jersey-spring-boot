package com.avianca.asl.domain;

import java.io.Serializable;
/**
 * 
 * @author CBYK - Ricardo Almeida
 * @since 16/06/2016
 * @version 1.0.0
 */
public class Authorization implements Serializable {

	private static final long serialVersionUID = 1L;
	private Token token;
	private Session session;

	public Authorization(Token token, Session session) {
		super();
		this.token = token;
		this.session = session;
	}

	public Token getToken() {
		return token;
	}

	public void setToken(Token token) {
		this.token = token;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

}
