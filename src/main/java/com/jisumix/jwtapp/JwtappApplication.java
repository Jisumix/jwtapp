package com.jisumix.jwtapp;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@SpringBootApplication
public class JwtappApplication {

	public static void main(String[] args) {
		Map<String, Object> claims = new HashMap<String, Object>();
		
		claims.put("ROLE", "admin");
		claims.put("PERMISSION", "power");
		for(int i=0;i<10;i++){
			claims.put("key"+i, "value"+i);
		}
		
		String JWT = Jwts.builder().setSubject(Constants.USER).setClaims(claims)
				.setExpiration(new Date(System.currentTimeMillis() + Constants.EXPIRATIONTIME))
				.signWith(SignatureAlgorithm.HS512, Constants.SECRET).compact();

		System.out.println(JWT);
		System.out.println("Done!");

		// SpringApplication.run(JwtappApplication.class, args);
	}
}
