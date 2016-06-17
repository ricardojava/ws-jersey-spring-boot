package com.avianca.asl.domain;
/**
 * 
 * @author CBYK - Ricardo Almeida
 * @since 16/06/2016
 * @version 1.0.0
 * 
 * 
HTTP/1.1 200 OK
Content-Type: application/json;charset=UTF-8
Cache-Control: no-store
Pragma: no-cache
{
  "access_token":"2YotnFZFEjr1zCsicMWpAA",
  "token_type":"example",
  "expires_in":3600,
  "example_parameter":"example_value"
}


 */
public class Token {

	private String numToken;

	public String getNumToken() {
		return numToken;
	}

	public void setNumToken(String numToken) {
		this.numToken = numToken;
	}
	
}
