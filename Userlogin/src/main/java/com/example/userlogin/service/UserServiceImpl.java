package com.example.userlogin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public boolean authenticate(String username, String password) {
        String sql = "SELECT COUNT(*) FROM users WHERE BINARY username = :username AND BINARY password = :password";

        Map<String, Object> params = new HashMap<>();
        params.put("username", username);
        params.put("password", password);

        int count = jdbcTemplate.queryForObject(sql, params, Integer.class);

        return count == 1;
    }
}
