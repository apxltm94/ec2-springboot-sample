package me.sample.core.sample;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class SampleController {

    private final RedisTemplate<String, Object> redisTemplate;

    @GetMapping("/")
    public String sample() {
        redisTemplate.opsForValue().set("abc", "def");
        return "sample";
    }

}
