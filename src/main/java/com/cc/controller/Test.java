package com.cc.controller;

import com.cc.dao.AuthorityMapper;
import com.cc.pojo.Authority;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.InetAddress;

/**
 * Created by cc on 2017/4/21.
 */
public class Test {


public static void main(String[] args) throws Exception{

    System.out.printf("a:aaaaasdasdasdasdasd");
    ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
    AuthorityMapper authorityMapper = (AuthorityMapper) context.getBean("authorityMapper");
    Authority authority = new Authority();
    authority.setToken("heqi");
    System.err.println(authorityMapper.selectAuthority(authority).getExpirationDate());


}
}
