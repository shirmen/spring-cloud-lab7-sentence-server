package com.miga.springcloud.lab7sentenceserver.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.miga.springcloud.lab7sentenceserver.domain.Word;

@FeignClient("VERB")
public interface VerbClient {

    @GetMapping("/")
    public Word getWord();

}
