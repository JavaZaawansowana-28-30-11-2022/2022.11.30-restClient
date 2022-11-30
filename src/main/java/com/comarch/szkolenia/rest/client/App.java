package com.comarch.szkolenia.rest.client;

import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        String url = "http://localhost:8081/rest";
        User user = restTemplate.getForObject(url, User.class, new HashMap<>());
        System.out.println(user);

        Cos cos = new Cos();
        cos.setA(345);
        cos.setB("kasuhdgfkhjass");
        cos.setC(2342342);

        String url2 = "http://localhost:8081/rest2";
        User user2 = restTemplate.postForObject(url2, cos, User.class, new HashMap<>());

        System.out.println(user2);
    }
}
