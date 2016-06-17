package com.avianca.asl.service;

import com.avianca.asl.domain.Authorization;
import com.avianca.asl.domain.Session;
import com.avianca.asl.domain.Token;
import com.avianca.asl.domain.User;

/**
 * 
 * @author CBYK - Ricardo Almeida
 * @since 16/06/2016
 * @version 1.0.0
 */
public class LoginServiceImpl implements LoginService{

	@Override
	public Authorization logar(String user,String pwd) throws Exception {
		// TODO Auto-generated method stub
		
		return null;
	}
    
	@Override
	/*
	 * (non-Javadoc)
	 * @see com.avianca.asl.service.Login#loginTest(com.avianca.asl.domain.User)
	 * Metodo que valida o usuário grava as informações do usuário
	 * gera log.
	 * Retorna uma autorização com uma sessão e um token, relacionado ao 
	 * usuario que se autenicou, gera um token pega a sessão.
	 */
	public Authorization loginTest(String user,String pwd) throws Exception {
		/*
		 * aqui chama o serviço que valida o usuário, cria e gerencia o token
		   gera a session, e devolve a autorização parausar o sistema
		   aqui toda logica de negocio
		*/
		
		Token token = new Token();
		token.setNumToken("lhafladhf21312312");
		
		Session session = new Session();
		session.setIdSession("123456789abcd");
		
		Authorization aut = new Authorization(token,session);		
		return aut;
	}

}
