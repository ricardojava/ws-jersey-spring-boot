package com.avianca.asl.service;

import com.avianca.asl.domain.Authorization;

/**
 * 
 * @author CBYK - Ricardo Almeida
 * @since 16/06/2016
 * @version 1.0.0
 */
public interface LoginService {
	
	public Authorization logar(String user,String pwd) throws Exception;
	public Authorization loginTest(String user,String pwd)throws Exception;

}
