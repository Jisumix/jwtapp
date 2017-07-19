package com.jisumix.jwtapp;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

public class JWTParser {

	public static void main(String[] args) {
		String token = "eyJhbGciOiJIUzUxMiJ9.eyJST0xFIjoiYWRtaW4iLCJQRVJNSVNTSU9OIjoicG93ZXIiLCJleHAiOjE1MDEzMTcyMjR9.Ed3GTu_LlJtXigmnMgeoT6j1R-ny94IHoqJoQHO1L3dY04nQGw2HFa-BfkoqbpDZCXYCLBwPasKi-pSQm3AocQ";

		String user = Jwts.parser().setSigningKey(Constants.SECRET).parseClaimsJws(token).getBody().getSubject();
		Claims claims = Jwts.parser().setSigningKey(Constants.SECRET).parseClaimsJws(token).getBody();

		String role = (String) claims.get("ROLE");
		String permission = (String) claims.get("PERMISSION");
		
		System.out.println("User: " + user);
		System.out.println("role: " + role);
		System.out.println("permission: " + permission);

	}
}
