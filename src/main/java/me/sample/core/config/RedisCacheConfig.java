package me.sample.core.config;

import java.time.Duration;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext.SerializationPair;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
@EnableCaching // Spring Boot의 캐싱 설정 활성화
public class RedisCacheConfig {

    @Bean
    public CacheManager boardCacheManager(RedisConnectionFactory redisConnectionFactory) {
        RedisCacheConfiguration redisCacheConfiguration = RedisCacheConfiguration.defaultCacheConfig()
            // Redis에 Key를 저장할 때 String으로 직렬화(변환)해서 저장
            .serializeKeysWith(
                SerializationPair.fromSerializer(
                    new StringRedisSerializer()
                )
            )
            // Redis에 Value를 저장할 때 Json으로 직렬화(변환)해서 저장
            .serializeValuesWith(
                SerializationPair.fromSerializer(
                    new Jackson2JsonRedisSerializer<Object>(Object.class)
                )
            )
            // 데이터의 만료기간(TTL)
            .entryTtl(Duration.ofMinutes(1L));

        return RedisCacheManager
            .RedisCacheManagerBuilder
            .fromConnectionFactory(redisConnectionFactory)
            .cacheDefaults(redisCacheConfiguration)
            .build();
    }

}
