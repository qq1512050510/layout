package com.chiang.spring.learn.utils;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.chiang.spring.learn.ehcacheTestI;

@Service
public class ehcacheTest implements ehcacheTestI {

    @Cacheable(value="cacheTest",key="#param")
    public String getTimestamp(String param) {
        Long timestamp = System.currentTimeMillis();
        return timestamp.toString();
    }

}

