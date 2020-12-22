package com.resource.book;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.resource.book.entity.User;
import com.resource.book.mapper.UserMapper;

@SpringBootTest
class BookApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        User entity = new User();
        entity.setName("abc");
        entity.setStatus(1);
        entity.setType(1);
        entity.setTopTenantId(0);
        entity.setTenantId(0);
        entity.setIsDeleted(0);
        int id = userMapper.insert(entity);

        System.err.println(id);

        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
        List<User> selectList = userMapper.selectList(queryWrapper);
        selectList.forEach(System.err::println);
    }

}
