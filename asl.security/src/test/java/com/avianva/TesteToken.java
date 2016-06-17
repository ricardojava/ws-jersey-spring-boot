package com.avianva;

import java.security.SecureRandom;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSObject;
import com.nimbusds.jose.Payload;
import com.nimbusds.jose.crypto.MACSigner;

public class TesteToken {
	
	public static void main(String[] args) {
		JWSObject jwsObject = new JWSObject(new JWSHeader(JWSAlgorithm.HS256),new Payload("ricardo"+"123456"));
        byte[] sharedKey = new byte[32];
        new SecureRandom().nextBytes(sharedKey);		
		try {
			jwsObject.sign(new MACSigner(sharedKey));
			System.out.println(jwsObject.serialize());
			
			
		} catch (JOSEException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
//eyJhbGciOiJIUzI1NiJ9.cmljYXJkbzEyMzQ1Ng.-CFcV6O9xlBBcroErMBtB0CvP655_rRJJeDMpg5WfZY
//eyJhbGciOiJIUzI1NiJ9.cmljYXJkbzEyMzQ1Ng.k0k_u5R9mkpD0KSW66kGA9VHQ9PmCxc3yrTHZOIV5as
