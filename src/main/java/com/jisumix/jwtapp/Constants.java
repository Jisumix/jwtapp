package com.jisumix.jwtapp;

public class Constants {
	public static final String SECRET = "ThisIsASecret";
	public static final String USER = "ADMIN";
	public static final long EXPIRATIONTIME = 864_000_000; // 10 days

	public static final String TOKEN_PREFIX = "Bearer";
	public static final String HEADER_STRING = "Authorization";
}
