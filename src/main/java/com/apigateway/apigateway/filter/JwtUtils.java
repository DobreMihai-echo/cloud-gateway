package com.apigateway.apigateway.filter;

import io.jsonwebtoken.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.security.Key;
import java.util.Date;



@Component
public class JwtUtils {
    private static final Logger logger = LoggerFactory.getLogger(JwtUtils.class);

    @Value("${app.jwtSecret}")
    private String jwtSecret;

    private Key key;

//    @PostConstruct
//    public void init(){
//        this.key = Keys.hmacShaKeyFor(secret.getBytes());
//    }
//
//    public Claims getAllClaimsFromToken(String token) {
//        return Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token).getBody();
//    }

//    private boolean isTokenExpired(String token) {
//        return this.getAllClaimsFromToken(token).getExpiration().before(new Date());
//    }

//    public boolean isInvalid(String token) {
//        return this.isTokenExpired(token);
//    }
}

