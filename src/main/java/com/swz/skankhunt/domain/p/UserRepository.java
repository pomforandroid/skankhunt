package com.swz.skankhunt.domain.p;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@CacheConfig(cacheNames = "users")
public interface UserRepository extends JpaRepository<User, Long> {

    //这就是Spring-data-jpa的一大特性：通过解析方法名创建查询。
//    @Cacheable  //配置了findByName函数的返回值将被加入缓存。同时在查询时，会先从缓存中获取，若不存在才再发起对数据库的访问
//    User findByName(String name);
    @Cacheable(key = "#p0")
    User findByName(String name);

    @CachePut(key = "#p0.name")
    User save(User user);

    User findByNameAndAge(String name, Integer age);

    //也提供通过使用@Query 注解来创建查询
    @Query("from User u where u.name=:name")
    User findUser(@Param("name") String name);


}