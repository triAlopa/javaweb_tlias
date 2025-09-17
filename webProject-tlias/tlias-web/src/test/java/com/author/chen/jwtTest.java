package com.author.chen;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class jwtTest {

    @Test
    public void setJwt(){
        //chen  base64 ------- Y2hlbg==
        Map<String, Object> dataMap=new HashMap<>();
        dataMap.put("id",1);
        dataMap.put("name","admin");
        String jwt = Jwts.builder().signWith(SignatureAlgorithm.HS256, "Y2hlbg==")//设置编码格式 和 密钥
                .addClaims(dataMap)//添加载荷内容 自定义
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60))
                .compact();
        System.out.println(jwt);
    }
    @Test
    public void parseJwt(){
        String parse="eyJhbGciOiJIUzI1NiJ9.eyJuYW1lIjoiYWRtaW4iLCJpZCI6MSwiZXhwIjoxNzU4MDk0MTg1fQ.MDrfCucUaxdesAOQu9eMUgedK6OkqOhHdJYGLsNKzwc";
        Claims claims = Jwts.parser()
                .setSigningKey("Y2hlbg==")//设置解密密钥
                .parseClaimsJwt(parse)//解析令牌
                .getBody();//获取自定义信息

        System.out.println(claims);
    }
}
